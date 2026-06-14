package com.muchen.weiplus.features

import com.muchen.weiplus.ui.MainActivity

/**
 * 定时任务 — 定时发送消息、朋友圈
 */
class TimedTaskFeature : BaseFeature() {
    override val key = MainActivity.KEY_TIMED_TASK
    override val name = "定时任务"
    override val description = "定时发送消息、朋友圈"

    override fun onEnable(classLoader: ClassLoader) {
        // TODO: 定时任务调度
    }
}
