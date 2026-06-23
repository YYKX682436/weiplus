package com.muchen.weiplus.features

import android.util.Log
import io.github.libxposed.api.XposedModule

class FakeVoiceDurationFeature : BaseFeature() {

    companion object {
        private const val TAG = "FakeVoiceDur"
    }

    override val key = "fake_voice_duration"
    override val name = "Fake Voice Duration"

    private lateinit var module: XposedModule

    override fun onEnable(m: XposedModule, cl: ClassLoader) {
        module = m

        try {
            val yaClass = cl.loadClass("com.tencent.mm.ui.chatting.viewitems.ya")
            for (method in yaClass.declaredMethods) {
                if (method.name == "b" && method.parameterTypes.size == 4) {
                    val cField = yaClass.getDeclaredField("c")
                    cField.isAccessible = true

                    module.hook(method).intercept { chain ->
                        chain.proceed()
                        if (!FeatureConfig.fakeVoiceDuration) return@intercept null
                        try {
                            val tag = chain.thisObject
                            val textView = cField.get(tag) as? android.widget.TextView
                            val origText = textView?.text?.toString() ?: ""
                            // Extract number from duration text (e.g., "15"" -> 15)
                            val num = origText.replace(Regex("[^0-9]"), "").toIntOrNull()
                            if (num != null && num > 0) {
                                val fakeNum = (num * 2.5).toInt().coerceAtLeast(1)
                                textView?.text = "$fakeNum″"
                                module.log(Log.INFO, TAG, "Voice dur: $origText -> $fakeNum″")
                            }
                        } catch (e: Throwable) {
                            module.log(Log.ERROR, TAG, "err: ${e.message}")
                        }
                        null
                    }
                    module.log(Log.INFO, TAG, "ya.b Hook OK")
                    return
                }
            }
            module.log(Log.WARN, TAG, "ya.b not found")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook fail: ${e.message}")
        }
    }
}