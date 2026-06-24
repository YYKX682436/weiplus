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

    private fun q() = "\""
    private val dq get() = "\""

    private lateinit var module: XposedModule
    private var classLoader: ClassLoader? = null
    private val mainHandler = Handler(Looper.getMainLooper())
    private var blockedChain: Any? = null
    private var blockedContent: String? = null
    private var blockedGameType = 0

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module
        this.classLoader = classLoader
        hookClassLoader(classLoader)
        tryHookKnownTargets(classLoader)
        hookViewPerformClick()
        hookAdapterViewClick()
        module.log(Log.INFO, TAG, "OK")
    }

    private fun hookClassLoader(cl: ClassLoader) {
        try {
            val m = ClassLoader::class.java.getDeclaredMethod(
                "loadClass", String::class.java, java.lang.Boolean.TYPE)
            module.hook(m).intercept { chain ->
                val cn = chain.args[0] as? String ?: return@intercept chain.proceed()
                if (cn.startsWith("com.tencent.mm")) {
                    val lc = cn.lowercase()
                    if (lc.contains("emoji") || lc.contains("game") || lc.contains("sticker")) {
                        module.log(Log.INFO, TAG, "CLASS: $cn")
                    }
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "CL hooked")
        } catch (e: Throwable) { module.log(Log.ERROR, TAG, "CL: ${e.message}") }
    }

    private fun tryHookKnownTargets(cl: ClassLoader) {
        val cns = listOf(
            "com.tencent.mm.plugin.emoji.model.EmojiInfo",
            "com.tencent.mm.plugin.emoji.model.EmojiItem",
            "com.tencent.mm.storage.emotion.EmojiInfo",
            "com.tencent.mm.storage.emotion.EmojiGroupInfo",
            "com.tencent.mm.storage.bl",
            "com.tencent.mm.storage.br",
            "com.tencent.mm.storage.bs",
            "com.tencent.mm.plugin.emoji.mgr.EmojiMgr",
            "com.tencent.mm.plugin.emoji.b.d",
            "com.tencent.mm.plugin.game.luggage",
            "com.tencent.mm.plugin.game.ui.GameMessageUI",
            "com.tencent.mm.message.AppMessage",
        )
        for (cn in cns) {
            try {
                val cls = cl.loadClass(cn)
                for (m in cls.declaredMethods) {
                    if (m.parameterTypes.size == 1 && m.parameterTypes[0] == String::class.java) {
                        module.hook(m).intercept { chain ->
                            if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                            val c = chain.args[0] as String
                            if (isGameEmoji(c)) {
                                module.log(Log.INFO, TAG, "$cn.${m.name} GAME!")
                                interceptChain(chain, c)
                            } else chain.proceed()
                        }
                        module.log(Log.INFO, TAG, "$cn.${m.name} hooked")
                        break
                    }
                }
            } catch (_: Throwable) {}
        }
        try {
            val cf = cl.loadClass("com.tencent.mm.pluginsdk.ui.chat.ChatFooter")
            for (m in cf.declaredMethods) {
                if (m.parameterTypes.size in 0..3) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                        for (i in chain.args.indices) {
                            val a = chain.args[i]
                            if (a is String && isGameEmoji(a)) {
                                module.log(Log.INFO, TAG, "CF.${m.name} GAME!")
                                interceptChain(chain, a)
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

    private fun hookViewPerformClick() {
        try {
            val m = View::class.java.getDeclaredMethod("performClick")
            module.hook(m).intercept { chain ->
                if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                val v = chain.thisObject as? View ?: return@intercept chain.proceed()
                val cn = v.javaClass.name
                val lc = cn.lowercase()
                if (lc.contains("emoji") || lc.contains("game") || lc.contains("sticker")) {
                    val tag = v.tag
                    val ts = tag?.toString() ?: ""
                    if (ts.isNotEmpty() && ts.length < 500) {
                        module.log(Log.INFO, TAG, "V: $cn tag=${ts.take(200)}")
                        if (isGameEmoji(ts)) { interceptChain(chain, ts); return@intercept null }
                    } else { module.log(Log.INFO, TAG, "V: $cn") }
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "V.click hooked")
        } catch (e: Throwable) { module.log(Log.ERROR, TAG, "V: ${e.message}") }
    }

    private fun hookAdapterViewClick() {
        try {
            val av = classLoader!!.loadClass("android.widget.AdapterView")
            val m = av.getDeclaredMethod("performItemClick", View::class.java, Integer.TYPE, java.lang.Long.TYPE)
            module.hook(m).intercept { chain ->
                if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                val ao = chain.thisObject
                val cn = ao.javaClass.name
                val lc = cn.lowercase()
                if (lc.contains("emoji") || lc.contains("game") || lc.contains("sticker")) {
                    val pos = chain.args[1] as Int
                    try {
                        val ad = ao.javaClass.getMethod("getAdapter").invoke(ao)
                        val item = ad?.javaClass?.getMethod("getItem", Integer.TYPE)?.invoke(ad, pos)
                        val itemStr = item?.toString() ?: ""
                        module.log(Log.INFO, TAG, "A: $cn pos=$pos item=${itemStr.take(200)}")
                        if (isGameEmoji(itemStr)) { interceptChain(chain, itemStr); return@intercept null }
                    } catch (e: Throwable) { module.log(Log.INFO, TAG, "A: $cn pos=$pos err=${e.message}") }
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "AV hooked")
        } catch (e: Throwable) { module.log(Log.ERROR, TAG, "AV: ${e.message}") }
    }

    private fun isGameEmoji(c: String): Boolean {
        if (c.length < 20) return false
        val lc = c.lowercase()
        if (!lc.contains("<emoji") && !lc.contains("<gameext") && !lc.contains("gamecontent")) return false
        return lc.contains("gameext") || lc.contains("gamecontent") || (lc.contains("<emoji") && lc.contains("type"))
    }

    private fun interceptChain(chain: Any, content: String) {
        blockedChain = chain; blockedContent = content
        blockedGameType = if (content.lowercase().contains("dice")) 2 else 1
        mainHandler.post { showPicker() }
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
            val dq = "\""
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