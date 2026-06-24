package com.muchen.weiplus.features

import android.app.AlertDialog
import android.os.Handler
import android.os.Looper
import android.util.Log
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

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module
        this.classLoader = classLoader
        // Strategy 1: Hook WCDB insert (DB-level intercept)
        hookWcdbInsert(classLoader)
        // Strategy 2: Hook ChatFooter
        hookChatFooter(classLoader)
        // Strategy 3: Hook EmojiInfo dynamically
        hookEmojiInfo(classLoader)
        module.log(Log.INFO, TAG, "OK")
    }

    private fun hookWcdbInsert(cl: ClassLoader) {
        try {
            val wcdb = cl.loadClass("com.tencent.wcdb.database.SQLiteDatabase")
            for (m in wcdb.declaredMethods) {
                if (m.name == "insert" && m.parameterTypes.size >= 3) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                        try {
                            val table = chain.args.getOrNull(0)?.toString() ?: ""
                            if (!table.contains("message", ignoreCase = true)) return@intercept chain.proceed()
                            for (arg in chain.args) {
                                if (arg?.javaClass?.name?.contains("ContentValues") == true) {
                                    val getAsStr = arg.javaClass.getMethod("getAsString", String::class.java)
                                    val content = getAsStr.invoke(arg, "content") as? String ?: continue
                                    if (isGameEmoji(content)) {
                                        module.log(Log.INFO, TAG, "WCDB insert GAME: ${content.take(120)}")
                                        blockedChain = chain; blockedContent = content
                                        blockedGameType = if (content.lowercase().contains("dice")) 2 else 1
                                        mainHandler.post { showPicker() }
                                        return@intercept null // block insert until user picks
                                    }
                                }
                            }
                        } catch (_: Throwable) {}
                        chain.proceed()
                    }
                    module.log(Log.INFO, TAG, "WCDB insert hooked")
                    return
                }
            }
            module.log(Log.WARN, TAG, "WCDB insert not found")
        } catch (e: Throwable) { module.log(Log.ERROR, TAG, "WCDB: ${e.message}") }
    }

    private fun hookChatFooter(cl: ClassLoader) {
        try {
            val cf = cl.loadClass("com.tencent.mm.pluginsdk.ui.chat.ChatFooter")
            for (m in cf.declaredMethods) {
                if (m.parameterTypes.size in 0..3) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                        for (i in chain.args.indices) {
                            val a = chain.args[i]
                            if (a is String && isGameEmoji(a)) {
                                module.log(Log.INFO, TAG, "CF.${m.name} GAME: ${a.take(120)}")
                                blockedChain = chain; blockedContent = a
                                blockedGameType = if (a.lowercase().contains("dice")) 2 else 1
                                mainHandler.post { showPicker() }
                                return@intercept null
                            }
                        }
                        chain.proceed()
                    }
                }
            }
            module.log(Log.INFO, TAG, "CF hooked")
        } catch (_: Throwable) {}
    }

    private fun hookEmojiInfo(cl: ClassLoader) {
        try {
            val ei = cl.loadClass("com.tencent.mm.plugin.emoji.model.EmojiInfo")
            for (m in ei.declaredMethods) {
                if (m.parameterTypes.size == 1 && m.parameterTypes[0] == String::class.java) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                        val c = chain.args[0] as String
                        if (isGameEmoji(c)) {
                            module.log(Log.INFO, TAG, "EmojiInfo.${m.name} GAME: ${c.take(120)}")
                            blockedChain = chain; blockedContent = c
                            blockedGameType = if (c.lowercase().contains("dice")) 2 else 1
                            mainHandler.post { showPicker() }
                        } else chain.proceed()
                    }
                    module.log(Log.INFO, TAG, "EmojiInfo hooked")
                    return
                }
            }
        } catch (_: Throwable) {}
        try {
            val sei = cl.loadClass("com.tencent.mm.storage.emotion.EmojiInfo")
            for (m in sei.declaredMethods) {
                if (m.parameterTypes.size == 1 && m.parameterTypes[0] == String::class.java) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                        val c = chain.args[0] as String
                        if (isGameEmoji(c)) {
                            module.log(Log.INFO, TAG, "SEmojiInfo.${m.name} GAME: ${c.take(120)}")
                            blockedChain = chain; blockedContent = c
                            blockedGameType = if (c.lowercase().contains("dice")) 2 else 1
                            mainHandler.post { showPicker() }
                        } else chain.proceed()
                    }
                    module.log(Log.INFO, TAG, "SEmojiInfo hooked")
                    return
                }
            }
        } catch (_: Throwable) {}
    }

    private fun isGameEmoji(c: String): Boolean {
        if (c.length < 20) return false
        val lc = c.lowercase()
        return lc.contains("<emoji") || lc.contains("<gameext") || lc.contains("gamecontent")
    }

    private fun showPicker() {
        val ctx = tryGetActivity() ?: run { proceedBlocked(); return }
        val gt = blockedGameType
        val title = if (gt == 2) "Pick Dice (1-6)" else "Pick RPS"
        val items = if (gt == 2) arrayOf("1","2","3","4","5","6") else arrayOf("Rock","Scissors","Paper")
        AlertDialog.Builder(ctx).setTitle(title).setItems(items) { _, which ->
            val chosen = if (gt == 2) which + 1 else when (which) { 0 -> 2; 1 -> 1; 2 -> 0; else -> 0 }
            replaceContent(chosen, gt)
        }.setOnCancelListener { proceedBlocked() }.show()
    }

    private fun replaceContent(chosen: Int, gameType: Int) {
        try {
            val chain = blockedChain ?: return
            val c = blockedContent ?: return
            val newContent = if (gameType == 2)
                c.replace(Regex("content=${dq}\\d+${dq}"), "content=${dq}${chosen}${dq}")
            else
                c.replace(Regex("type=${dq}\\d+${dq}"), "type=${dq}${chosen}${dq}")
            try {
                val af = chain.javaClass.getDeclaredField("args"); af.isAccessible = true
                (af.get(chain) as Array<Any?>)[0] = newContent
                chain.javaClass.getMethod("proceed").invoke(chain)
            } catch (_: Throwable) { chain.javaClass.getMethod("proceed").invoke(chain) }
            module.log(Log.INFO, TAG, "Cheat: t=$gameType v=$chosen")
        } catch (e: Throwable) { module.log(Log.ERROR, TAG, "replace: ${e.message}"); proceedBlocked() }
        finally { blockedChain = null; blockedContent = null }
    }

    private fun proceedBlocked() {
        try { blockedChain?.javaClass?.getMethod("proceed")?.invoke(blockedChain) } catch (_: Throwable) {}
        blockedChain = null; blockedContent = null
    }

    private fun tryGetActivity(): android.app.Activity? {
        return try {
            val c = Class.forName("android.app.ActivityThread")
            val am = c.getDeclaredMethod("currentActivityThread").invoke(null)
            val f = c.getDeclaredField("mActivities"); f.isAccessible = true
            @Suppress("UNCHECKED_CAST")
            val acts = f.get(am) as? Map<Any, Any>
            if (acts != null) for (rec in acts.values) {
                val af = rec.javaClass.getDeclaredField("activity"); af.isAccessible = true
                val a = af.get(rec)
                if (a is android.app.Activity && !a.isFinishing) return a
            }
            null
        } catch (_: Throwable) { null }
    }
}