package com.muchen.weiplus.features

import android.app.AlertDialog
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import io.github.libxposed.api.XposedModule

class GameCheatFeature : BaseFeature() {

    companion object { private const val TAG = "GameCheat" }
    override val key = "game_cheat"
    override val name = "Game Cheat"

    private val dq = "\""
    private lateinit var module: XposedModule
    private var classLoader: ClassLoader? = null
    private val mainHandler = Handler(Looper.getMainLooper())
    private var blockedChain: Any? = null
    private var blockedContent: String? = null
    private var blockedGameType = 0
    private var blockedArgsIdx = 0
    private var currentDialog: AlertDialog? = null
    private var lastClickTime = 0L

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module
        this.classLoader = classLoader
        hookViewClick()
        hookAllGameClasses(classLoader)
        module.log(Log.INFO, TAG, "OK")
    }

    // ========= Strategy: Hook ALL View clicks in emoji context =========

    private fun hookViewClick() {
        try {
            val m = View::class.java.getDeclaredMethod("performClick")
            module.hook(m).intercept { chain ->
                if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                val v = chain.thisObject as? View ?: return@intercept chain.proceed()
                val cn = v.javaClass.name
                // Only check views that could be emoji items
                val lc = cn.lowercase()
                val inEmoji = lc.contains("emoji") || lc.contains("sticker") || lc.contains("smiley")
                val ctxStr = v.context?.javaClass?.name?.lowercase() ?: ""
                val inEmojiCtx = ctxStr.contains("emoji") || ctxStr.contains("chatting") || ctxStr.contains("launcher")
                if (!inEmoji && !inEmojiCtx) return@intercept chain.proceed()

                // Try to get emoji info from the view
                val tag = try { v.tag } catch (_: Throwable) { null }
                val tagStr = tag?.toString() ?: ""
                // Also try getting contentDescription or text
                val cd = try { v.contentDescription?.toString() } catch (_: Throwable) { null } ?: ""

                val combined = "$tagStr $cd"
                val now = System.currentTimeMillis()

                // Log all emoji-related clicks for debugging
                if (combined.isNotEmpty()) {
                    module.log(Log.INFO, TAG, "CLICK $cn tag=${combined.take(120)}")
                } else {
                    val parent = try { (v.parent as? View)?.javaClass?.name } catch (_: Throwable) { "?" }
                    module.log(Log.INFO, TAG, "CLICK $cn parent=$parent")
                }

                // Check if this is a game emoji click
                val isGame = combined.lowercase().let { s ->
                    s.contains("jsb") || s.contains("dice") || s.contains("game") ||
                    s.contains("猜拳") || s.contains("骰子")
                }
                if (isGame) {
                    module.log(Log.INFO, TAG, "CLICK GAME DETECTED: $cn tag=${combined.take(200)}")
                    // Block the click, show dialog
                    blockedChain = chain
                    blockedContent = combined
                    blockedGameType = if (combined.lowercase().contains("dice") || combined.lowercase().contains("骰子")) 2 else 1
                    mainHandler.post { showPicker() }
                    return@intercept null
                }

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
            "com.tencent.mm.message.AppMessage",
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

    // ========= Core logic =========

    private fun isGameEmoji(c: String): Boolean {
        if (c.length < 30) return false
        val lc = c.lowercase()
        return (lc.contains("<emoji") || lc.contains("<gameext") || lc.contains("gamecontent")) &&
               (lc.contains("<msg") || lc.contains("fromusername") || lc.contains("tousername") || lc.contains("<emotion"))
    }

    private fun showPicker() {
        val ctx = tryGetActivity()
        if (ctx == null) {
            module.log(Log.WARN, TAG, "no activity, bypass")
            proceedBlocked()
            return
        }
        val gt = blockedGameType
        val title = if (gt == 2) "选择骰子点数" else "选择猜拳结果"
        val items = if (gt == 2)
            arrayOf("⚀ 1", "⚁ 2", "⚂ 3", "⚃ 4", "⚄ 5", "⚅ 6")
        else
            arrayOf("✊ 石头", "✌️ 剪刀", "🖐 布")

        currentDialog = AlertDialog.Builder(ctx)
            .setTitle(title)
            .setItems(items) { _, which ->
                val chosen = if (gt == 1)
                    when (which) { 0 -> 2; 1 -> 1; 2 -> 0; else -> 0 }
                else which + 1
                module.log(Log.INFO, TAG, "Chose: gt=$gt idx=$which val=$chosen")
                replaceContent(chosen, gt)
            }
            .setOnCancelListener { proceedBlocked() }
            .create()
        try {
            currentDialog?.window?.setType(android.view.WindowManager.LayoutParams.TYPE_APPLICATION)
        } catch (_: Throwable) {}
        currentDialog?.show()
        module.log(Log.INFO, TAG, "Dialog shown: gt=$gt")
    }

    private fun replaceContent(chosen: Int, gameType: Int) {
        try {
            val chain = blockedChain ?: run { proceedBlocked(); return }
            // First let the original click proceed to trigger WeChat's send
            proceedBlocked()
            // Then hook the send to modify content before it goes out
            // For now just proceed and accept that we intercepted the click
            module.log(Log.INFO, TAG, "Cheat: gt=$gameType v=$chosen")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "replace err: ${e.message}")
            proceedBlocked()
        }
    }

    private fun proceedBlocked() {
        try { blockedChain?.javaClass?.getMethod("proceed")?.invoke(blockedChain) } catch (_: Throwable) {}
        blockedChain = null; blockedContent = null
        currentDialog?.dismiss(); currentDialog = null
    }

    private fun tryGetActivity(): android.app.Activity? {
        return try {
            val c = Class.forName("android.app.ActivityThread")
            val am = c.getDeclaredMethod("currentActivityThread").invoke(null)
            val f = c.getDeclaredField("mActivities"); f.isAccessible = true
            @Suppress("UNCHECKED_CAST")
            val acts = f.get(am) as? Map<Any, Any>
            if (acts != null) for (rec in acts.values) {
                try {
                    val af = rec.javaClass.getDeclaredField("activity"); af.isAccessible = true
                    val a = af.get(rec)
                    if (a is android.app.Activity && !a.isFinishing) return a
                } catch (_: Throwable) {}
            }
            null
        } catch (_: Throwable) { null }
    }
}