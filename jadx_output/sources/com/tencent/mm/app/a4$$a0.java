package com.tencent.mm.app;

/* loaded from: classes7.dex */
public final /* synthetic */ class a4$$a0 implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String str;
        int i17;
        int i18;
        int i19;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = "";
        ((et.c) ((ft.t3) i95.n0.c(ft.t3.class))).getClass();
        java.lang.String a17 = m91.f.f324951a.a();
        try {
            if (a17.contains("weapp_id")) {
                str4 = a17.substring(a17.indexOf(":", a17.indexOf("weapp_id")) + 1, a17.indexOf(";", a17.indexOf("weapp_id"))) + "-" + a17.substring(a17.indexOf(":", a17.indexOf("weapp_name")) + 1, a17.indexOf(";", a17.indexOf("weapp_name")));
            } else {
                str4 = "";
            }
            str = str4;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMCrashReporter", "get weappInfo error, %s", th6.getMessage());
            str = "";
        }
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            i17 = org.xwalk.core.XWalkEnvironment.d();
            if (i17 <= 0) {
                i17 = com.tencent.xweb.a3.f(context);
            }
            try {
                i18 = by5.e.d();
                i19 = com.tencent.xwebsdk.BuildConfig.SDK_VERSION_CODE;
            } catch (java.lang.Throwable th7) {
                th = th7;
                com.tencent.mars.xlog.Log.e("MicroMsg.MMCrashReporter", "get xweb info error, %s", th.getMessage());
                i18 = 0;
                i19 = 0;
                str2 = com.tencent.mm.sdk.platformtools.o4.L().u("Matrix-AccInfo", "");
                str5 = com.tencent.mm.sdk.platformtools.o4.L().getString("webview_url_prefs_url", null);
                if (str5 != null) {
                    str3 = str5.substring(0, 119);
                    return new java.lang.String[]{str, java.lang.String.valueOf(i17), java.lang.String.valueOf(i18), java.lang.String.valueOf(i19), str2, str3};
                }
                str3 = str5;
                return new java.lang.String[]{str, java.lang.String.valueOf(i17), java.lang.String.valueOf(i18), java.lang.String.valueOf(i19), str2, str3};
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            i17 = 0;
        }
        try {
            str2 = com.tencent.mm.sdk.platformtools.o4.L().u("Matrix-AccInfo", "");
        } catch (java.lang.Throwable th9) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMCrashReporter", "get accessibilityInfo error, %s", th9.getMessage());
            str2 = "";
        }
        try {
            str5 = com.tencent.mm.sdk.platformtools.o4.L().getString("webview_url_prefs_url", null);
        } catch (java.lang.Throwable th10) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMCrashReporter", "get webview url error, %s", th10.getMessage());
        }
        if (str5 != null && str5.length() > 120) {
            str3 = str5.substring(0, 119);
            return new java.lang.String[]{str, java.lang.String.valueOf(i17), java.lang.String.valueOf(i18), java.lang.String.valueOf(i19), str2, str3};
        }
        str3 = str5;
        return new java.lang.String[]{str, java.lang.String.valueOf(i17), java.lang.String.valueOf(i18), java.lang.String.valueOf(i19), str2, str3};
    }
}
