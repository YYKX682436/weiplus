package com.muchen.weiplus.features

import com.muchen.weiplus.ui.MainActivity

/**
 * 聊天增强 — 多选转发、长截图等
 */
class ChatEnhanceFeature : BaseFeature() {
    override val key = MainActivity.KEY_CHAT_ENHANCE
    override val name = "聊天增强"
    override val description = "多选转发、长截图等"

    override fun onEnable(classLoader: ClassLoader) {
        // TODO: Hook 聊天相关方法
    }
}
