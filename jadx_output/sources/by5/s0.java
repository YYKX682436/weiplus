package by5;

/* loaded from: classes13.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f36593a = "";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f36594b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.xweb.n1 f36595c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f36596d = false;

    public static java.lang.String a() {
        return java.util.UUID.randomUUID().toString().replace("-", "");
    }

    public static int b() {
        if (f36593a.equals("mm")) {
            return 30;
        }
        if (f36593a.equals("tools")) {
            return 36;
        }
        if (f36593a.equals("appbrand")) {
            return 48;
        }
        return f36593a.equals("support") ? 54 : -1;
    }

    public static int c(java.lang.String str) {
        if (str.startsWith("https://servicewechat.com/")) {
            return 0;
        }
        return (str.startsWith("http://mp.weixin.qq.com/") || str.startsWith("https://mp.weixin.qq.com/") || str.startsWith("https://servicewechat.com/preload/") || str.startsWith("http://mp.weixinbridge.com/")) ? 1 : 2;
    }

    public static void d(long j17, int i17) {
        com.tencent.xweb.n1 n1Var = f36595c;
        if (n1Var != null) {
            n1Var.b(577L, j17, i17);
        }
    }

    public static void e(long j17, long j18, long j19) {
        com.tencent.xweb.n1 n1Var = f36595c;
        if (n1Var != null) {
            n1Var.b(j17, j18, j19);
        }
    }

    public static void f(long j17) {
        com.tencent.xweb.n1 n1Var = f36595c;
        if (n1Var == null || n1Var == null || j17 <= 0 || j17 >= u04.d.f423477c) {
            return;
        }
        n1Var.a(nd1.a2.CTRL_INDEX, nd1.a2.CTRL_INDEX, 16, 17, 1, (int) j17);
    }

    public static void g(java.lang.String str, boolean z17) {
        if (f36595c == null) {
            return;
        }
        int i17 = z17 ? 55 : 63;
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO.equals(str)) {
            f36595c.b(577L, 188L, 1L);
            return;
        }
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PPT.equals(str)) {
            f36595c.b(1068L, i17, 1L);
            return;
        }
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PDF.equals(str)) {
            f36595c.b(1071L, i17, 1L);
            return;
        }
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_WORD.equals(str)) {
            f36595c.b(1069L, i17, 1L);
            return;
        }
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL.equals(str)) {
            f36595c.b(1070L, i17, 1L);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE.equals(str)) {
            f36595c.b(1544L, i17, 1L);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_TXT.equals(str)) {
            f36595c.b(1889L, i17, 1L);
        }
    }

    public static void h(java.lang.String str, boolean z17) {
        if (f36595c == null) {
            return;
        }
        int i17 = z17 ? 54 : 62;
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO.equals(str)) {
            f36595c.b(577L, 187L, 1L);
            return;
        }
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PPT.equals(str)) {
            f36595c.b(1068L, i17, 1L);
            return;
        }
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PDF.equals(str)) {
            f36595c.b(1071L, i17, 1L);
            return;
        }
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_WORD.equals(str)) {
            f36595c.b(1069L, i17, 1L);
            return;
        }
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL.equals(str)) {
            f36595c.b(1070L, i17, 1L);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE.equals(str)) {
            f36595c.b(1544L, i17, 1L);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_TXT.equals(str)) {
            f36595c.b(1889L, i17, 1L);
        }
    }

    public static void i(java.lang.String str) {
        if (str == null || str.isEmpty() || f36595c == null) {
            return;
        }
        if (str.equalsIgnoreCase("ppt") || str.equalsIgnoreCase("pptx") || str.equalsIgnoreCase("dps")) {
            f36595c.b(com.tencent.xweb.n.j(str, false) ? 1544L : 1068L, 68L, 1L);
            return;
        }
        if (str.equalsIgnoreCase("pdf")) {
            f36595c.b(1071L, 68L, 1L);
            return;
        }
        if (str.equalsIgnoreCase("doc") || str.equalsIgnoreCase("docx") || str.equalsIgnoreCase("wps")) {
            f36595c.b(com.tencent.xweb.n.j(str, false) ? 1544L : 1069L, 68L, 1L);
            return;
        }
        if (str.equalsIgnoreCase("xls") || str.equalsIgnoreCase("xlsx") || str.equalsIgnoreCase("et")) {
            f36595c.b(com.tencent.xweb.n.j(str, false) ? 1544L : 1070L, 68L, 1L);
        } else if (str.equalsIgnoreCase("txt")) {
            f36595c.b(1889L, 68L, 1L);
        } else if (com.tencent.xweb.n.k(str)) {
            f36595c.b(1900L, 68L, 1L);
        }
    }

    public static void j(java.lang.String str) {
        if (str == null || str.isEmpty() || f36595c == null) {
            return;
        }
        if (str.equalsIgnoreCase("ppt") || str.equalsIgnoreCase("pptx") || str.equalsIgnoreCase("dps")) {
            f36595c.b(com.tencent.xweb.n.j(str, false) ? 1544L : 1068L, 67L, 1L);
            return;
        }
        if (str.equalsIgnoreCase("pdf")) {
            f36595c.b(1071L, 67L, 1L);
            return;
        }
        if (str.equalsIgnoreCase("doc") || str.equalsIgnoreCase("docx") || str.equalsIgnoreCase("wps")) {
            f36595c.b(com.tencent.xweb.n.j(str, false) ? 1544L : 1069L, 67L, 1L);
            return;
        }
        if (str.equalsIgnoreCase("xls") || str.equalsIgnoreCase("xlsx") || str.equalsIgnoreCase("et")) {
            f36595c.b(com.tencent.xweb.n.j(str, false) ? 1544L : 1070L, 67L, 1L);
        } else if (str.equalsIgnoreCase("txt")) {
            f36595c.b(1889L, 67L, 1L);
        } else if (com.tencent.xweb.n.k(str)) {
            f36595c.b(1900L, 67L, 1L);
        }
    }

    public static void k(com.tencent.xweb.f1 f1Var, int i17) {
        if (by5.v.b("kv_19307" + f1Var.toString() + "_" + i17)) {
            by5.r0 r0Var = new by5.r0(19307);
            r0Var.a(21, java.lang.Integer.valueOf(i17));
            if (f1Var == com.tencent.xweb.f1.WV_KIND_CW || f1Var == com.tencent.xweb.f1.WV_KIND_PINUS) {
                r0Var.a(22, java.lang.Integer.valueOf(org.xwalk.core.XWalkEnvironment.h()));
            } else if (f1Var == com.tencent.xweb.f1.WV_KIND_SYS) {
                r0Var.a(22, java.lang.Integer.valueOf(by5.e.d()));
            } else {
                r0Var.a(22, 0);
            }
            r0Var.a(23, java.lang.Integer.valueOf(com.tencent.xwebsdk.BuildConfig.SDK_VERSION_CODE));
            if ("armeabi-v7a".equalsIgnoreCase(by5.a.b())) {
                r0Var.a(24, 1);
            } else if ("arm64-v8a".equalsIgnoreCase(by5.a.b())) {
                r0Var.a(24, 2);
            }
            r0Var.a(25, java.lang.Integer.valueOf(f1Var.ordinal()));
            java.lang.StringBuilder sb6 = r0Var.f36591a;
            sb6.toString();
            t(r0Var.f36592b, sb6.toString());
        }
    }

    public static void l(com.tencent.xweb.f1 f1Var) {
        java.lang.String str;
        int i17;
        if (f36595c == null) {
            return;
        }
        com.tencent.xweb.f1 f1Var2 = com.tencent.xweb.f1.WV_KIND_CW;
        com.tencent.xweb.f1 f1Var3 = com.tencent.xweb.f1.WV_KIND_PINUS;
        if (f1Var == f1Var2 || f1Var == f1Var3) {
            str = "REPORT_APK_VER_TIME";
        } else {
            str = "REPORT_APK_VER_TIME_" + f1Var;
        }
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
        java.lang.String string = by5.d4.f().getString(str, "");
        java.lang.String str2 = string != null ? string : "";
        if (f1Var == f1Var2 || f1Var == f1Var3) {
            int i18 = by5.d4.f().getInt("REPORT_XWEB_APK_VER", 0);
            int d17 = org.xwalk.core.XWalkEnvironment.d();
            if (d17 <= 0) {
                return;
            }
            if (d17 != i18 || !format.equals(str2)) {
                f36595c.b(577L, (d17 % 50) + 100, 1L);
                by5.d4.f().edit().putInt("REPORT_XWEB_APK_VER", d17).commit();
            }
        }
        if (format.equals(str2)) {
            return;
        }
        if (f1Var == f1Var2 || f1Var == f1Var3) {
            if (org.xwalk.core.XWalkEnvironment.d() <= 0) {
                return;
            } else {
                i17 = 99;
            }
        } else if (f1Var != com.tencent.xweb.f1.WV_KIND_SYS) {
            return;
        } else {
            i17 = 97;
        }
        f36595c.b(577L, i17, 1L);
        by5.d4.f().edit().putString(str, format).commit();
    }

    public static void m(java.lang.String str) {
        com.tencent.xweb.n1 n1Var = f36595c;
        if (n1Var != null) {
            n1Var.b(577L, 0L, 1L);
            if (f36593a.equals("tools") && str != null && c(str) == 1) {
                f36595c.b(903L, 103L, 1L);
            }
            if (f36594b) {
                return;
            }
            int i17 = f36593a.equals("tools") ? 70 : f36593a.equals("appbrand") ? 73 : -1;
            int ordinal = com.tencent.xweb.WebView.getCurrentModuleWebCoreType().ordinal() - 1;
            if (com.tencent.xweb.WebView.getCurrentModuleWebCoreType() == com.tencent.xweb.f1.WV_KIND_PINUS) {
                ordinal = 0;
            }
            if (i17 < 70 || ordinal < 0) {
                return;
            }
            f36594b = true;
            p(nd1.a2.CTRL_INDEX, i17 + ordinal);
        }
    }

    public static void n(long j17) {
        com.tencent.xweb.n1 n1Var = f36595c;
        if (n1Var == null || j17 <= 0 || j17 >= 300000) {
            return;
        }
        n1Var.a(nd1.a2.CTRL_INDEX, nd1.a2.CTRL_INDEX, 2, 3, 1, (int) j17);
    }

    public static void o() {
        java.lang.String b17 = by5.a.b();
        java.lang.String str = "armeabi-v7a".equals(b17) ? "arm64-v8a" : "armeabi-v7a";
        int g17 = org.xwalk.core.XWalkEnvironment.g(b17);
        int g18 = org.xwalk.core.XWalkEnvironment.g(str);
        by5.c4.f("WXWebReporter", "reportCoreInstalled, cur abi(" + b17 + "), ver = " + g17 + ", predown abi(" + str + "), ver = " + g18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(g17);
        boolean c17 = by5.v.c("report_core_ver", sb6.toString());
        if (by5.v.b("report_core_daily") || c17) {
            if (g17 <= 0) {
                s(1367L, 251L, 1L);
            } else {
                s(1367L, (g17 % 100) + 0, 1L);
            }
        }
        boolean c18 = by5.v.c("report_core_ver_predown", "" + g18);
        if (by5.v.b("report_core_daily_predown") || c18) {
            if (g18 <= 0) {
                s(1367L, 252L, 1L);
            } else {
                s(1367L, (g18 % 100) + 100, 1L);
            }
        }
        if (!"armeabi-v7a".equalsIgnoreCase(b17)) {
            if ("arm64-v8a".equalsIgnoreCase(b17)) {
                p(com.tencent.mm.plugin.appbrand.jsapi.finder.c.CTRL_INDEX, 255);
                return;
            }
            return;
        }
        java.lang.String a17 = by5.a.a();
        if ("armeabi-v7a".equalsIgnoreCase(a17)) {
            p(com.tencent.mm.plugin.appbrand.jsapi.finder.c.CTRL_INDEX, com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR);
        } else if ("arm64-v8a".equalsIgnoreCase(a17)) {
            p(com.tencent.mm.plugin.appbrand.jsapi.finder.c.CTRL_INDEX, 254);
        }
    }

    public static void p(int i17, int i18) {
        if (f36595c == null) {
            return;
        }
        android.content.SharedPreferences a17 = by5.d4.a("REPORT_DAILY", true);
        java.lang.String str = "id_" + i17 + "_key_" + i18;
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
        if (format.equals(a17.getString(str, ""))) {
            return;
        }
        f36595c.b(i17, i18, 1L);
        a17.edit().putString(str, format).commit();
    }

    public static synchronized void q(java.lang.String str, com.tencent.xweb.WebView webView) {
        synchronized (by5.s0.class) {
            if (f36595c == null) {
                return;
            }
            if (!f36596d) {
                int b17 = b();
                int ordinal = com.tencent.xweb.WebView.getCurrentModuleWebCoreType().ordinal() - 1;
                if (com.tencent.xweb.WebView.getCurrentModuleWebCoreType() == com.tencent.xweb.f1.WV_KIND_PINUS) {
                    ordinal = 0;
                }
                if (b17 >= 30 && ordinal >= 0) {
                    f36596d = true;
                    p(oc1.f.CTRL_INDEX, b17 + 3 + ordinal);
                }
            }
            if (str != null && "https://servicewechat.com/preload/page-frame.html".equalsIgnoreCase(str.trim())) {
                f36595c.b(903L, 102L, 1L);
            }
            int b18 = b();
            int ordinal2 = com.tencent.xweb.WebView.getCurrentModuleWebCoreType().ordinal() - 1;
            if (com.tencent.xweb.WebView.getCurrentModuleWebCoreType() == com.tencent.xweb.f1.WV_KIND_PINUS) {
                ordinal2 = 0;
            }
            if (b18 >= 30 && ordinal2 >= 0) {
                f36595c.b(903L, b18 + 0 + ordinal2, 1L);
            }
        }
    }

    public static void r(com.tencent.xweb.f1 f1Var, boolean z17, java.lang.String str) {
        int i17;
        com.tencent.xweb.n1 n1Var = f36595c;
        if (n1Var == null) {
            return;
        }
        if (f1Var == com.tencent.xweb.f1.WV_KIND_PINUS) {
            i17 = z17 ? 78 : 82;
        } else if (f1Var == com.tencent.xweb.f1.WV_KIND_CW) {
            i17 = z17 ? 77 : 81;
        } else if (f1Var != com.tencent.xweb.f1.WV_KIND_SYS) {
            return;
        } else {
            i17 = z17 ? 75 : 79;
        }
        n1Var.b(1749L, i17, 1L);
        xx5.s.a(f1Var, z17 ? 1 : 2, 2, false, str);
    }

    public static void s(long j17, long j18, long j19) {
        by5.c4.f("WXWebReporter", "report idkey id = " + j17 + " key = " + j18 + " value = " + j19);
        com.tencent.xweb.n1 n1Var = f36595c;
        if (n1Var != null) {
            n1Var.b(j17, j18, j19);
        }
    }

    public static void t(int i17, java.lang.String str) {
        com.tencent.xweb.n1 n1Var = f36595c;
        if (n1Var != null) {
            ((com.tencent.mm.xwebutil.a0) n1Var).getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
        }
    }
}
