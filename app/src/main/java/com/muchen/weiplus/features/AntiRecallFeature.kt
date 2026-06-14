package com.muchen.weiplus.features

import com.muchen.weiplus.ui.MainActivity

/**
 * 防撤回 — 阻止好友撤回消息
 */
class AntiRecallFeature : BaseFeature() {
    override val key = MainActivity.KEY_ANTI_RECALL
    override val name = "防撤回"
    override val description = "防止好友撤回消息"

    override fun onEnable(classLoader: ClassLoader) {
        // TODO: Hook 消息撤回相关方法
    }
}
