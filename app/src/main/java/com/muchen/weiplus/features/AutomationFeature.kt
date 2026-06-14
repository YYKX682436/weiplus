package com.muchen.weiplus.features

import com.muchen.weiplus.ui.MainActivity

/**
 * 自动任务 — 定时消息、自动回复
 */
class AutomationFeature : BaseFeature() {
    override val key = MainActivity.KEY_AUTOMATION
    override val name = "自动任务"
    override val description = "定时消息、自动回复"

    override fun onEnable(classLoader: ClassLoader) {
        // TODO: Hook 消息发送相关方法
    }
}
