package com.sunfusheng.marqueeview;

/**
 * Created by adamchang on 2021/2/8.
 */
public interface AnimationListener {
    /**
     * 增加动画start监听回调
     * position为当前进入item的索引
     * @param position
     */
    void onAnimationStart(int position);
    /**
     * 增加动画end监听回调
     * position为下一个要进入item的索引
     * @param position
     */
    void onAnimationEnd(int position);
}
