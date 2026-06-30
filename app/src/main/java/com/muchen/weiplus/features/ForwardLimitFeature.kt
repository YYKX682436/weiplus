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
    private val hookedClasses = HashSet<String>()

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module

        // Observe + boolean auto-intercept forwarding-related classes
        observeBools(classLoader, "com.tencent.mm.ui.contact.SelectContactUI")
        observeBools(classLoader, "com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI")
        observeBools(classLoader, "com.tencent.mm.pluginsdk.ui.MultiSelectContactView")
        observeBools(classLoader, "com.tencent.mm.ui.chatting.ChattingUI")
        observeBools(classLoader, "com.tencent.mm.ui.chatting.e")
        observeBools(classLoader, "com.tencent.mm.ui.chatting.d")
        observeBools(classLoader, "com.tencent.mm.ui.chatting.f")

        // Intercept Intent extras for max select count
        hookIntentBroadcast(classLoader)

        // Activity scanner for forwarding activities
        hookActivityCreate(classLoader)

        module.log(Log.INFO, TAG, "v6: bool interceptor only, NO int intercept, 7 classes")
    }

    private fun observeBools(classLoader: ClassLoader, clsName: String) {
        try {
            val clz = classLoader.loadClass(clsName)
            var boolCount = 0
            for (m in clz.declaredMethods) {
                if (m.returnType != Boolean::class.javaPrimitiveType) continue
                module.hook(m).intercept { chain ->
                    val result = chain.proceed()
                    if (FeatureConfig.forwardLimit && result as? Boolean == false) {
                        module.log(Log.INFO, TAG, "BOOL " + clsName.substringAfterLast('.') + "." + m.name + "() F\u2192T")
                        return@intercept true
                    }
                    result
                }
                boolCount++
            }
            if (boolCount > 0)
                module.log(Log.INFO, TAG, "  " + clsName.substringAfterLast('.') + " [" + clz.declaredMethods.size + "m, " + boolCount + "bool]")
            else
                module.log(Log.WARN, TAG, "  " + clsName.substringAfterLast('.') + " [" + clz.declaredMethods.size + "m, 0bool]")
        } catch (e: Throwable) {
            module.log(Log.WARN, TAG, "  " + clsName.substringAfterLast('.') + " NOT FOUND: " + (e.message ?: ""))
        }
    }

    private fun hookIntentBroadcast(classLoader: ClassLoader) {
        try {
            val intentClass = classLoader.loadClass("android.content.Intent")
            val getIntExtra = intentClass.getDeclaredMethod(
                "getIntExtra", String::class.java, Int::class.javaPrimitiveType!!
            )
            module.hook(getIntExtra).intercept { chain ->
                val key = chain.args[0] as? String ?: ""
                val result = chain.proceed() as Int
                if (FeatureConfig.forwardLimit && (key.contains("MAX_SELECT") || key.contains("max_select") || key.contains("maxSelect")) && result in 1..100) {
                    module.log(Log.INFO, TAG, "Intent.getIntExtra($key): $result \u2192 9999")
                    return@intercept 9999
                }
                result
            }
            module.log(Log.INFO, TAG, "  Intent.getIntExtra Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  Intent.getIntExtra FAIL: " + (e.message ?: ""))
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
                if ((lower.contains("forward") || lower.contains("transmit") ||
                     lower.contains("selectcontact") || lower.contains("selectconv") ||
                     lower.contains("multiselect") || lower.contains("sharehistory") ||
                     lower.contains("msgrecord")) && hookedClasses.add(clsName)) {
                    module.log(Log.INFO, TAG, "ACTIVITY: $clsName")
                    try { observeBools(classLoader, clsName) } catch (_: Throwable) {}
                }
                null
            }
            module.log(Log.INFO, TAG, "  Activity.onCreate Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "  Activity.onCreate FAIL: " + (e.message ?: ""))
        }
    }
}
