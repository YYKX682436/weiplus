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

    private val dq = "\""
    private lateinit var module: XposedModule
    private val mainHandler = Handler(Looper.getMainLooper())
    private var blockedChain: Any? = null
    private var blockedContent: String? = null
    private var blockedGameType = 0
    private var currentDialog: AlertDialog? = null

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module
        hookViewClick()
        module.log(Log.INFO, TAG, "OK")
    }

    // ========= Helper: find method by name + param count (iterates hierarchy) =========

    private fun findMethod(cls: Class<*>, name: String, paramCount: Int): java.lang.reflect.Method? {
        var c: Class<*>? = cls
        while (c != null) {
            for (m in c.declaredMethods) {
                if (m.name == name && m.parameterTypes.size == paramCount) return m
            }
            c = c.superclass
        }
        return null
    }

    // ========= View.click hook =========

    private fun hookViewClick() {
        try {
            val m = View::class.java.getDeclaredMethod("performClick")
            module.hook(m).intercept { chain ->
                if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                val v = chain.thisObject as? View ?: return@intercept chain.proceed()

                var p: Any? = v.parent
                var rv: Any? = null
                while (p != null) {
                    val pcn = p.javaClass.name
                    if (pcn.contains("PanelRecyclerView") || pcn.contains("EmojiRecycler")) {
                        rv = p
                        break
                    }
                    p = (p as? ViewGroup)?.parent
                }
                if (rv == null) return@intercept chain.proceed()

                try {
                    // Get ViewHolder via reflection (iterate class hierarchy)
                    val gvh = findMethod(rv.javaClass, "getChildViewHolder", 1) ?: return@intercept chain.proceed()
                    val holder = gvh.invoke(rv, v)
                    val gap = findMethod(holder.javaClass, "getAdapterPosition", 0) ?: return@intercept chain.proceed()
                    val pos = gap.invoke(holder) as Int

                    // Get adapter and item
                    val ga = findMethod(rv.javaClass, "getAdapter", 0) ?: return@intercept chain.proceed()
                    val adapter = ga.invoke(rv)
                    val adapterCls = adapter?.javaClass?.name ?: "?"

                    var item: Any? = null
                    val gi = findMethod(adapter?.javaClass, "getItem", 1)
                    if (gi != null) item = gi.invoke(adapter, pos)
                    else {
                        val gt = findMethod(adapter?.javaClass, "get", 1)
                        if (gt != null) item = gt.invoke(adapter, pos)
                    }

                    val itemStr = item?.toString()?.take(300) ?: "?"
                    val isGame = itemStr.lowercase().let { it.contains("jsb") || it.contains("dice") }
                    module.log(Log.INFO, TAG, "EMOJI pos=$pos adapter=$adapterCls game=$isGame item=$itemStr")

                    if (isGame) {
                        module.log(Log.INFO, TAG, "GAME! pos=$pos")
                        blockedChain = chain; blockedContent = itemStr
                        blockedGameType = if (itemStr.lowercase().contains("dice")) 2 else 1
                        mainHandler.post { showGameDialog() }
                        return@intercept null
                    }
                } catch (e: Throwable) {
                    module.log(Log.INFO, TAG, "EMOJI err: ${e.message}")
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "View.click hooked")
        } catch (e: Throwable) { module.log(Log.ERROR, TAG, "View.click: ${e.message}") }
    }

    private fun showGameDialog() {
        val ctx = tryGetActivity()
        if (ctx == null) { proceedBlocked(); return }
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
                proceedBlocked()
            }
            .setOnCancelListener { proceedBlocked() }
            .create()
        try { currentDialog?.window?.setType(android.view.WindowManager.LayoutParams.TYPE_APPLICATION) } catch (_: Throwable) {}
        currentDialog?.show()
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