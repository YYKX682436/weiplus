package com.tencent.mm.app;

/* loaded from: classes11.dex */
public abstract class j3 {
    public static boolean a(java.lang.StackTraceElement[] stackTraceElementArr) {
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            java.lang.String className = stackTraceElement.getClassName();
            if (className != null && (className.contains("de.robv.android.xposed.XposedBridge") || className.contains("com.zte.heartyservice.SCC.FrameworkBridge"))) {
                return true;
            }
        }
        return false;
    }

    public static void b() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("patch_server_config", 0);
            if (sharedPreferences.getLong("fetch_patch_last_check", 0L) != -1) {
                sharedPreferences.edit().putLong("fetch_patch_last_check", 0L).commit();
            }
        }
    }

    public static void c(java.lang.Throwable th6) {
        if (!ak0.o.f()) {
            com.tencent.mars.xlog.Log.w("TinkerCrashProtect", "tinker is not loaded");
            return;
        }
        java.lang.String str = android.os.Build.MODEL;
        boolean z17 = str.contains("ZUK") || str.contains("zuk");
        boolean z18 = false;
        while (th6 != null) {
            if (!z18) {
                z18 = a(th6.getStackTrace());
            }
            if (z18) {
                if ((th6 instanceof java.lang.IllegalAccessError) && th6.getMessage().contains("Class ref in pre-verified class resolved to unexpected implementation")) {
                    com.tencent.mars.xlog.Log.e("TinkerCrashProtect", "have xposed: just clean tinker");
                    ak0.n.c();
                    ak0.n.a();
                    ak0.n.b();
                    return;
                }
            }
            if (z17) {
                com.tencent.mars.xlog.Log.w("TinkerCrashProtect", "it is zuk model here, crash:" + th6.getMessage());
                if ((th6 instanceof org.xmlpull.v1.XmlPullParserException) && th6.getMessage().contains("tag requires a 'drawable' attribute or child tag defining a drawable")) {
                    com.tencent.mars.xlog.Log.e("TinkerCrashProtect", "have zuk parse error: just clean tinker");
                    ak0.n.c();
                    ak0.n.a();
                    ak0.n.b();
                    return;
                }
            }
            th6 = th6.getCause();
        }
    }
}
