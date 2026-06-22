package com.muchen.weiplus.features

import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import io.github.libxposed.api.XposedModule
import java.util.Collections
import java.util.WeakHashMap

class SwipeQuoteFeature : BaseFeature() {

    companion object {
        private const val TAG = "SwipeQuote"
        private const val SWIPE_PX = 150f
    }

    override val key = "swipe_quote"
    override val name = "左滑引用消息"

    private lateinit var module: XposedModule
    private val states: MutableMap<ViewGroup, TouchState> = Collections.synchronizedMap(WeakHashMap())
    private val mainHandler = Handler(Looper.getMainLooper())
    private var classLoader: ClassLoader? = null

    private class TouchState(var downX: Float = 0f, var downY: Float = 0f, var swiping: Boolean = false)

    override fun onEnable(m: XposedModule, cl: ClassLoader) {
        module = m
        classLoader = cl

        try {
            val vgClass = cl.loadClass("android.view.ViewGroup")
            val method = vgClass.getDeclaredMethod("onInterceptTouchEvent", MotionEvent::class.java)
            module.hook(method).intercept { chain ->
                val vg = chain.thisObject as? ViewGroup ?: return@intercept chain.proceed()
                val event = chain.args[0] as MotionEvent

                if (event.action == MotionEvent.ACTION_DOWN) tryRegister(vg)

                val s = states[vg] ?: return@intercept chain.proceed()

                when (event.action) {
                    MotionEvent.ACTION_DOWN -> { s.downX = event.x; s.downY = event.y; s.swiping = false }
                    MotionEvent.ACTION_MOVE -> {
                        if (s.swiping) return@intercept true
                        val dx = event.x - s.downX
                        if (dx < -SWIPE_PX && Math.abs(event.y - s.downY) < Math.abs(dx) * 0.5f) {
                            s.swiping = true
                            if (PreferenceBridge.get(key, true)) doQuote(vg, s.downX, s.downY)
                            return@intercept true
                        }
                    }
                    MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> { s.swiping = false }
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "VG hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "VG hook fail", e)
        }
    }

    private fun tryRegister(vg: ViewGroup) {
        if (states.containsKey(vg)) return
        if (vg.childCount == 0) return
        val c = vg.getChildAt(0) ?: return
        val tagName = c.tag?.javaClass?.name ?: return
        if (tagName.contains("viewitems")) { states[vg] = TouchState() }
    }

    private fun doQuote(vg: ViewGroup, x: Float, y: Float) {
        mainHandler.post {
            try {
                val child = findViewUnder(vg, x, y) ?: return@post
                val tagObj = findTagObj(child) ?: return@post
                val cl = classLoader!!

                val f9 = tagObj.javaClass.getMethod("c").invoke(tagObj) ?: run {
                    module.log(Log.WARN, TAG, "tag.c()=null"); return@post
                }

                val activity = getActivity(vg.context) ?: return@post
                val cf = findViewByClass(activity.window.decorView,
                    "com.tencent.mm.pluginsdk.ui.chat.ChatFooter") ?: return@post

                val f9Class = cl.loadClass("com.tencent.mm.storage.f9")

                var foundMethod: java.lang.reflect.Method? = null
                var scl: Class<*>? = cf.javaClass
                while (scl != null && scl.name.startsWith("com.tencent")) {
                    for (m in scl.declaredMethods) {
                        if (m.name == "F" && m.parameterTypes.size >= 1
                            && m.parameterTypes[0].isAssignableFrom(f9Class)
                        ) { foundMethod = m; break }
                    }
                    if (foundMethod != null) break
                    scl = scl.superclass
                }
                if (foundMethod == null) { module.log(Log.ERROR, TAG, "F method not found"); return@post }
                foundMethod.isAccessible = true
                if (foundMethod.parameterTypes.size >= 2) foundMethod.invoke(cf, f9, null)
                else foundMethod.invoke(cf, f9)
            } catch (e: Throwable) {
                module.log(Log.ERROR, TAG, "quote fail: ${e.message}")
            }
        }
    }

    private fun findViewUnder(parent: ViewGroup, x: Float, y: Float): View? {
        for (i in parent.childCount - 1 downTo 0) {
            val c = parent.getChildAt(i)
            if (c.visibility != View.VISIBLE) continue
            if (x < c.left || x > c.right || y < c.top || y > c.bottom) continue
            if (c is ViewGroup) { findViewUnder(c, x - c.left, y - c.top)?.let { return it } }
            return c
        }
        return null
    }

    private fun findTagObj(view: View): Any? {
        var v: View? = view
        while (v != null) {
            val tag = v.tag
            if (tag != null && tag.javaClass.name.contains("viewitems.")) return tag
            v = (v.parent as? View)
        }
        return null
    }

    private fun findViewByClass(root: View, className: String): Any? {
        if (root.javaClass.name == className) return root
        if (root is ViewGroup) for (i in 0 until root.childCount)
            findViewByClass(root.getChildAt(i), className)?.let { return it }
        return null
    }

    private fun getActivity(ctx: android.content.Context): android.app.Activity? {
        var c: android.content.Context? = ctx
        while (c != null) {
            if (c is android.app.Activity) return c
            c = if (c is android.content.ContextWrapper) c.baseContext else null
        }
        return null
    }
}
