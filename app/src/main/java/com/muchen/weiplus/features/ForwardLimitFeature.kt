package com.muchen.weiplus.features

import android.app.Activity
import android.util.Log
import io.github.libxposed.api.XposedModule

class ForwardLimitFeature : BaseFeature() {

    companion object {
        private const val TAG = "ForwardLimit"
    }

    override val key = "forward_limit"
    override val name = "\u89e3\u9664\u8f6c\u53d1\u9650\u5236"

    private lateinit var module: XposedModule

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module

        // Strategy 1: Hook onCreateContextMenu to find menu builder class
        hookContextMenu(classLoader)

        // Strategy 2: Hook Intent.putExtra(int) to find the max select key
        hookIntentPutExtra(classLoader)

        // Strategy 3: Activity scanner (keep from v6)
        hookActivityCreate(classLoader)

        module.log(Log.INFO, TAG, "v7: context menu + Intent discovery, no auto-intercept")
    }

    private fun hookContextMenu(classLoader: ClassLoader) {
        try {
            val clz = classLoader.loadClass("com.tencent.mm.ui.chatting.ChattingUI")
            val m = clz.getDeclaredMethod("onCreateContextMenu",
                classLoader.loadClass("android.view.ContextMenu"),
                classLoader.loadClass("android.view.View"),
                classLoader.loadClass("android.view.ContextMenu\$ContextMenuInfo"))
            module.hook(m).intercept { chain ->
                if (FeatureConfig.forwardLimit) {
                    val view = chain.args[1]
                    val info = chain.args[2]
                    module.log(Log.INFO, TAG, "CONTEXT_MENU ChattingUI view=" + (view?.javaClass?.simpleName ?: "null") + " info=" + (info?.javaClass?.simpleName ?: "null"))
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "  ChattingUI.onCreateContextMenu Hook OK")
        } catch (e: Throwable) {
            module.log(Log.WARN, TAG, "  ChattingUI.onCreateContextMenu: " + (e.message ?: ""))
        }
    }

    private fun hookIntentPutExtra(classLoader: ClassLoader) {
        try {
            val intentClass = classLoader.loadClass("android.content.Intent")
            val putExtraInt = intentClass.getDeclaredMethod("putExtra", String::class.java, Int::class.javaPrimitiveType!!)
            module.hook(putExtraInt).intercept { chain ->
                if (FeatureConfig.forwardLimit) {
                    val key = chain.args[0] as? String ?: ""
                    val value = (chain.args[1] as? Int) ?: 0
                    if (value in 1..1000) {
                        module.log(Log.INFO, TAG, "Intent.putExtra($key, $value)")
                    }
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "  Intent.putExtra(int) Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  Intent.putExtra FAIL: " + (e.message ?: ""))
        }
    }

    private fun hookActivityCreate(classLoader: ClassLoader) {
        try {
            val activityClass = classLoader.loadClass("android.app.Activity")
            val onCreateMethod = activityClass.getDeclaredMethod("onCreate", android.os.Bundle::class.java)
            module.hook(onCreateMethod).intercept { chain ->
                chain.proceed()
                val activity = chain.thisObject as? Activity ?: return@intercept null
                val clsName = activity.javaClass.name
                val lower = clsName.lowercase()
                if (lower.contains("forward") || lower.contains("transmit") ||
                    lower.contains("selectcontact") || lower.contains("selectconv") ||
                    lower.contains("multiselect") || lower.contains("sharehistory") ||
                    lower.contains("msgrecord")) {
                    module.log(Log.INFO, TAG, "ACTIVITY: $clsName")
                    // Log the intent extras
                    try {
                        val intent = activity.intent
                        if (intent != null) {
                            val extras = intent.extras
                            if (extras != null) {
                                for (key in extras.keySet()) {
                                    val v = extras.get(key)
                                    if (v is Number || v is String) {
                                        module.log(Log.INFO, TAG, "  EXTRA: $key = $v")
                                    }
                                }
                            }
                        }
                    } catch (_: Throwable) {}
                }
                null
            }
            module.log(Log.INFO, TAG, "  Activity.onCreate Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  Activity.onCreate FAIL: " + (e.message ?: ""))
        }
    }
}
