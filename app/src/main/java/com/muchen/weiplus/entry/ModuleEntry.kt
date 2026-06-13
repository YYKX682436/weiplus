package com.muchen.weiplus.entry

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.Gravity
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.XC_MethodHook
import de.robv.android.xposed.XposedHelpers
import de.robv.android.xposed.callbacks.XC_LoadPackage

class ModuleEntry : IXposedHookLoadPackage {

    companion object {
        private const val TAG = "WeiPlus"
        private const val MENU_ID = 0x7701
    }

    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        if (lpparam.packageName != "com.tencent.mm") return
        if (lpparam.processName != "com.tencent.mm") return

        Log.i(TAG, "WeiPlus injecting...")
        Handler(Looper.getMainLooper()).postDelayed({
            showToast("微+ 已注入 ✨")
        }, 2000)
        injectEntry(lpparam.classLoader)
    }

    private fun showToast(msg: String) {
        try {
            val app = XposedHelpers.callStaticMethod(
                XposedHelpers.findClass("android.app.ActivityThread", null), "currentApplication"
            ) as? Context
            Toast.makeText(app, msg, Toast.LENGTH_SHORT).show()
        } catch (_: Throwable) {}
    }

    private fun openWeiPlus(ctx: Context) {
        try {
            val intent = Intent()
            intent.setClassName("com.muchen.weiplus", "com.muchen.weiplus.ui.MainActivity")
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            ctx.startActivity(intent)
        } catch (e: Throwable) {
            Log.e(TAG, "startActivity fail", e)
            Toast.makeText(ctx, "微+ 启动失败", Toast.LENGTH_SHORT).show()
        }
    }

    private fun injectEntry(classLoader: ClassLoader) {
        try {
            val clz = classLoader.loadClass("com.tencent.mm.ui.LauncherUI")

            // 右上角菜单
            try {
                XposedHelpers.findAndHookMethod(clz, "onCreateOptionsMenu",
                    android.view.Menu::class.java,
                    object : XC_MethodHook() {
                        override fun afterHookedMethod(param: MethodHookParam) {
                            val menu = param.args[0] as android.view.Menu
                            if (menu.findItem(MENU_ID) != null) return
                            menu.add(0, MENU_ID, 0, "微+")
                                .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS)
                        }
                    })
            } catch (_: Throwable) {}

            // 菜单点击
            try {
                XposedHelpers.findAndHookMethod(clz, "onOptionsItemSelected",
                    MenuItem::class.java,
                    object : XC_MethodHook() {
                        override fun beforeHookedMethod(param: MethodHookParam) {
                            val item = param.args[0] as MenuItem
                            if (item.itemId == MENU_ID) {
                                param.result = true
                                (param.thisObject as? Activity)?.let { openWeiPlus(it) }
                            }
                        }
                    })
            } catch (_: Throwable) {}

            // 浮动按钮
            try {
                XposedHelpers.findAndHookMethod(clz, "onResume",
                    object : XC_MethodHook() {
                        private var added = false
                        override fun afterHookedMethod(param: MethodHookParam) {
                            if (added) return
                            val a = param.thisObject as Activity
                            Handler(Looper.getMainLooper()).postDelayed({
                                try { addFab(a); added = true } catch (_: Throwable) {}
                            }, 1500)
                        }
                    })
            } catch (_: Throwable) {}

        } catch (_: Throwable) {}
    }

    private fun addFab(activity: Activity) {
        val root = activity.window.decorView.findViewById<android.view.ViewGroup>(android.R.id.content) ?: return
        if (root.findViewWithTag<TextView>("weiplus_fab") != null) return
        val d = activity.resources.displayMetrics.density
        val btn = TextView(activity).apply {
            tag = "weiplus_fab"
            text = "微+"
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.argb(200, 80, 140, 230))
            textSize = 13f; gravity = Gravity.CENTER
            setPadding((14*d).toInt(), (8*d).toInt(), (14*d).toInt(), (8*d).toInt())
            setOnClickListener { openWeiPlus(activity) }
        }
        root.addView(btn, FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT,
            Gravity.BOTTOM or Gravity.END
        ).apply { bottomMargin = (80*d).toInt(); rightMargin = (12*d).toInt() })
    }
}
