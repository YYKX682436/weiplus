package com.muchen.weiplus.features

import android.app.AlertDialog
import android.os.Handler
import android.os.Looper
import android.util.Log
import io.github.libxposed.api.XposedModule

class GameCheatFeature : BaseFeature() {

    companion object {
        private const val TAG = "GameCheat"
        private const val RPS_TYPE = 1
        private const val DICE_TYPE = 2
    }

    override val key = "game_cheat"
    override val name = "猜拳骰子作弊"

    private lateinit var module: XposedModule
    private var classLoader: ClassLoader? = null
    private val mainHandler = Handler(Looper.getMainLooper())
    private var blockedChain: Any? = null
    private var blockedContent: String? = null

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module
        this.classLoader = classLoader
        tryHookEmojiSend(classLoader)
    }

    private fun tryHookEmojiSend(cl: ClassLoader) {
        // Strategy 1: Hook ChatFooter send methods
        try {
            val cf = cl.loadClass("com.tencent.mm.pluginsdk.ui.chat.ChatFooter")
            for (m in cf.declaredMethods) {
                val p = m.parameterTypes
                if (p.isNotEmpty() && p[0] == String::class.java) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                        val content = chain.args[0] as? String
                        if (content != null && isGameEmoji(content)) {
                            interceptChain(chain, content, detectGameType(content))
                        } else chain.proceed()
                    }
                    module.log(Log.INFO, TAG, "ChatFooter hook: ${m.name}")
                    return
                }
            }
            module.log(Log.WARN, TAG, "ChatFooter no suitable method")
        } catch (e: Throwable) {
            module.log(Log.WARN, TAG, "ChatFooter: ${e.message}")
        }

        // Strategy 2: Hook EmojiInfo content
        try {
            val ei = cl.loadClass("com.tencent.mm.plugin.emoji.model.EmojiInfo")
            for (m in ei.declaredMethods) {
                val p = m.parameterTypes
                if (p.size == 1 && p[0] == String::class.java) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                        val content = chain.args[0] as String
                        if (isGameEmoji(content)) {
                            interceptChain(chain, content, detectGameType(content))
                        } else chain.proceed()
                    }
                    module.log(Log.INFO, TAG, "EmojiInfo hook: ${m.name}")
                    return
                }
            }
        } catch (e: Throwable) {
            module.log(Log.WARN, TAG, "EmojiInfo: ${e.message}")
        }

        // Strategy 3: Hook MessageInfo setContent
        try {
            val mi = cl.loadClass("com.tencent.mm.storage.bl")
            for (m in mi.declaredMethods) {
                val p = m.parameterTypes
                if (p.size == 1 && p[0] == String::class.java) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                        val content = chain.args[0] as String
                        if (isGameEmoji(content)) {
                            interceptChain(chain, content, detectGameType(content))
                        } else chain.proceed()
                    }
                    module.log(Log.INFO, TAG, "MessageInfo hook: ${m.name}")
                    return
                }
            }
            module.log(Log.WARN, TAG, "MessageInfo no suitable method")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "MessageInfo: ${e.message}")
        }

        module.log(Log.INFO, TAG, "All strategies attempted")
    }

    private fun isGameEmoji(content: String): Boolean {
        if (!content.contains("<emoji")) return false
        val hasGameExt = content.contains("<gameext") || content.contains("gamecontent")
        val hasRps = content.contains("type=\"$RPS_TYPE\"") || content.contains("猜拳") || content.contains("石头剪刀布")
        val hasDice = content.contains("type=\"$DICE_TYPE\"") || content.contains("dice") || content.contains("骰子")
        return hasGameExt || hasRps || hasDice
    }

    private fun detectGameType(content: String): Int {
        return if (content.contains("type=\"$DICE_TYPE\"") ||
                   content.contains("骰子") || content.contains("dice")) DICE_TYPE else RPS_TYPE
    }

    private fun interceptChain(chain: Any, content: String, gameType: Int) {
        blockedChain = chain
        blockedContent = content
        mainHandler.post { showGamePicker(gameType) }
    }

    private fun showGamePicker(gameType: Int) {
        val ctx = tryGetActivity() ?: run { proceedBlocked(); return }
        val items: Array<String>
        val title: String
        if (gameType == DICE_TYPE) {
            title = "选择骰子点数"
            items = arrayOf("⚀ 1点", "⚁ 2点", "⚂ 3点", "⚃ 4点", "⚄ 5点", "⚅ 6点")
        } else {
            title = "选择猜拳结果"
            items = arrayOf("✊ 石头", "✂️ 剪刀", "🖐 布")
        }
        AlertDialog.Builder(ctx)
            .setTitle(title)
            .setItems(items) { _, which ->
                val chosen = if (gameType == DICE_TYPE) which + 1
                             else when (which) { 0 -> 2; 1 -> 1; 2 -> 0; else -> 0 }
                replaceContent(chosen, gameType)
            }
            .setOnCancelListener { proceedBlocked() }
            .show()
    }

    private fun replaceContent(chosen: Int, gameType: Int) {
        try {
            val chain = blockedChain ?: return
            val content = blockedContent ?: return
            val newContent = if (gameType == DICE_TYPE) {
                content.replace(Regex("""content="\d+""""), "content=\"$chosen\"")
            } else {
                content.replace(Regex("""type="\d+"""), "type=\"$chosen\"")
            }
            val argsField = chain.javaClass.getDeclaredField("args")
            argsField.isAccessible = true
            val args = argsField.get(chain) as Array<Any?>
            args[0] = newContent
            chain.javaClass.getMethod("proceed").invoke(chain)
            module.log(Log.INFO, TAG, "Game cheat: type=$gameType chosen=$chosen")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "replace fail: ${e.message}")
            proceedBlocked()
        } finally {
            blockedChain = null
            blockedContent = null
        }
    }

    private fun proceedBlocked() {
        try {
            blockedChain?.javaClass?.getMethod("proceed")?.invoke(blockedChain)
        } catch (_: Throwable) {}
        blockedChain = null
        blockedContent = null
    }

    private fun tryGetActivity(): android.app.Activity? {
        return try {
            val c = Class.forName("android.app.ActivityThread")
            val am = c.getDeclaredMethod("currentActivityThread").invoke(null)
            val f = c.getDeclaredField("mActivities"); f.isAccessible = true
            @Suppress("UNCHECKED_CAST")
            val acts = f.get(am) as? Map<Any, Any> ?: return null
            for (rec in acts.values) {
                val af = rec.javaClass.getDeclaredField("activity"); af.isAccessible = true
                val a = af.get(rec)
                if (a is android.app.Activity && !a.isFinishing) return a
            }
            null
        } catch (_: Throwable) { null }
    }
}