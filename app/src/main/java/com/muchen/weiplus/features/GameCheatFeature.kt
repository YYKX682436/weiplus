package com.muchen.weiplus.features

import android.app.AlertDialog
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.ViewGroup
import io.github.libxposed.api.XposedModule

class GameCheatFeature : BaseFeature() {

    companion object { private const val TAG = "GameCheat" }
    override val key = "game_cheat"
    override val name = "Game Cheat"

    private lateinit var module: XposedModule
    private var classLoader: ClassLoader? = null
    private val mainHandler = Handler(Looper.getMainLooper())

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module
        this.classLoader = classLoader
        hookViewClick()
        hookAllGameClasses(classLoader)
        module.log(Log.INFO, TAG, "OK")
    }

    // ========= View.click hook - diagnostic mode =========

    private fun hookViewClick() {
        try {
            val m = View::class.java.getDeclaredMethod("performClick")
            module.hook(m).intercept { chain ->
                val v = chain.thisObject as? View ?: return@intercept chain.proceed()
                val cn = v.javaClass.name

                // Build parent chain
                var parentChain = ""
                var p: Any? = v.parent
                var d = 0
                while (p != null && d < 6) {
                    parentChain += " -> " + p.javaClass.name
                    p = (p as? ViewGroup)?.parent
                    d++
                }

                // Try getting text if TextView
                val txt = try { (v as? android.widget.TextView)?.text?.toString()?.take(30) ?: "" } catch (_: Throwable) { "" }
                val tag = try { v.tag?.toString()?.take(60) ?: "" } catch (_: Throwable) { "" }

                module.log(Log.INFO, TAG, "CLICK $cn txt=$txt tag=$tag parents=$parentChain")
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "View.click hooked")
        } catch (e: Throwable) { module.log(Log.ERROR, TAG, "View.click: ${e.message}") }
    }

    // ========= Diagnostic hooks =========

    private fun hookAllGameClasses(cl: ClassLoader) {
        val targets = listOf(
            "com.tencent.mm.storage.emotion.EmojiInfo",
            "com.tencent.mm.plugin.emoji.model.EmojiInfo",
            "com.tencent.mm.plugin.emoji.b.d",
        )
        for (cn in targets) {
            try {
                val cls = cl.loadClass(cn)
                for (m in cls.declaredMethods) {
                    if (m.parameterTypes.size in 0..6) {
                        module.hook(m).intercept { chain ->
                            if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                            val sb = StringBuilder()
                            for (i in chain.args.indices) {
                                val a = chain.args[i]
                                val s = if (a is String) a.take(80) else a?.toString()?.take(40) ?: "null"
                                if (s != "null" && s.isNotEmpty()) sb.append("a$i=$s | ")
                            }
                            val result = chain.proceed()
                            if (result is String && result.length > 5) sb.append("ret=${result.take(120)}")
                            if (sb.isNotEmpty()) module.log(Log.INFO, TAG, "$cn.${m.name}: $sb")
                            result
                        }
                    }
                }
                module.log(Log.INFO, TAG, "$cn hooked")
            } catch (_: Throwable) {}
        }
    }
}
