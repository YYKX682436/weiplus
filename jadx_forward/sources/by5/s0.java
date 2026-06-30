package by5;

/* loaded from: classes13.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f118126a = "";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f118127b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.p3210x3857dc.n1 f118128c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f118129d = false;

    public static java.lang.String a() {
        return java.util.UUID.randomUUID().toString().replace("-", "");
    }

    public static int b() {
        if (f118126a.equals("mm")) {
            return 30;
        }
        if (f118126a.equals("tools")) {
            return 36;
        }
        if (f118126a.equals("appbrand")) {
            return 48;
        }
        return f118126a.equals("support") ? 54 : -1;
    }

    public static int c(java.lang.String str) {
        if (str.startsWith("https://servicewechat.com/")) {
            return 0;
        }
        return (str.startsWith("http://mp.weixin.qq.com/") || str.startsWith("https://mp.weixin.qq.com/") || str.startsWith("https://servicewechat.com/preload/") || str.startsWith("http://mp.weixinbridge.com/")) ? 1 : 2;
    }

    public static void d(long j17, int i17) {
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = f118128c;
        if (n1Var != null) {
            n1Var.b(577L, j17, i17);
        }
    }

    public static void e(long j17, long j18, long j19) {
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = f118128c;
        if (n1Var != null) {
            n1Var.b(j17, j18, j19);
        }
    }

    public static void f(long j17) {
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = f118128c;
        if (n1Var == null || n1Var == null || j17 <= 0 || j17 >= u04.d.f505010c) {
            return;
        }
        n1Var.a(nd1.a2.f72909x366c91de, nd1.a2.f72909x366c91de, 16, 17, 1, (int) j17);
    }

    public static void g(java.lang.String str, boolean z17) {
        if (f118128c == null) {
            return;
        }
        int i17 = z17 ? 55 : 63;
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450.equals(str)) {
            f118128c.b(577L, 188L, 1L);
            return;
        }
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61209xfb9a522c.equals(str)) {
            f118128c.b(1068L, i17, 1L);
            return;
        }
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61208xfb9a50aa.equals(str)) {
            f118128c.b(1071L, i17, 1L);
            return;
        }
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61211x77b31e32.equals(str)) {
            f118128c.b(1069L, i17, 1L);
            return;
        }
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61205x7db6e06f.equals(str)) {
            f118128c.b(1070L, i17, 1L);
        } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4.equals(str)) {
            f118128c.b(1544L, i17, 1L);
        } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61210xfb9a6228.equals(str)) {
            f118128c.b(1889L, i17, 1L);
        }
    }

    public static void h(java.lang.String str, boolean z17) {
        if (f118128c == null) {
            return;
        }
        int i17 = z17 ? 54 : 62;
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450.equals(str)) {
            f118128c.b(577L, 187L, 1L);
            return;
        }
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61209xfb9a522c.equals(str)) {
            f118128c.b(1068L, i17, 1L);
            return;
        }
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61208xfb9a50aa.equals(str)) {
            f118128c.b(1071L, i17, 1L);
            return;
        }
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61211x77b31e32.equals(str)) {
            f118128c.b(1069L, i17, 1L);
            return;
        }
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61205x7db6e06f.equals(str)) {
            f118128c.b(1070L, i17, 1L);
        } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4.equals(str)) {
            f118128c.b(1544L, i17, 1L);
        } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61210xfb9a6228.equals(str)) {
            f118128c.b(1889L, i17, 1L);
        }
    }

    public static void i(java.lang.String str) {
        if (str == null || str.isEmpty() || f118128c == null) {
            return;
        }
        if (str.equalsIgnoreCase("ppt") || str.equalsIgnoreCase("pptx") || str.equalsIgnoreCase("dps")) {
            f118128c.b(com.p314xaae8f345.p3210x3857dc.n.j(str, false) ? 1544L : 1068L, 68L, 1L);
            return;
        }
        if (str.equalsIgnoreCase("pdf")) {
            f118128c.b(1071L, 68L, 1L);
            return;
        }
        if (str.equalsIgnoreCase("doc") || str.equalsIgnoreCase("docx") || str.equalsIgnoreCase("wps")) {
            f118128c.b(com.p314xaae8f345.p3210x3857dc.n.j(str, false) ? 1544L : 1069L, 68L, 1L);
            return;
        }
        if (str.equalsIgnoreCase("xls") || str.equalsIgnoreCase("xlsx") || str.equalsIgnoreCase("et")) {
            f118128c.b(com.p314xaae8f345.p3210x3857dc.n.j(str, false) ? 1544L : 1070L, 68L, 1L);
        } else if (str.equalsIgnoreCase("txt")) {
            f118128c.b(1889L, 68L, 1L);
        } else if (com.p314xaae8f345.p3210x3857dc.n.k(str)) {
            f118128c.b(1900L, 68L, 1L);
        }
    }

    public static void j(java.lang.String str) {
        if (str == null || str.isEmpty() || f118128c == null) {
            return;
        }
        if (str.equalsIgnoreCase("ppt") || str.equalsIgnoreCase("pptx") || str.equalsIgnoreCase("dps")) {
            f118128c.b(com.p314xaae8f345.p3210x3857dc.n.j(str, false) ? 1544L : 1068L, 67L, 1L);
            return;
        }
        if (str.equalsIgnoreCase("pdf")) {
            f118128c.b(1071L, 67L, 1L);
            return;
        }
        if (str.equalsIgnoreCase("doc") || str.equalsIgnoreCase("docx") || str.equalsIgnoreCase("wps")) {
            f118128c.b(com.p314xaae8f345.p3210x3857dc.n.j(str, false) ? 1544L : 1069L, 67L, 1L);
            return;
        }
        if (str.equalsIgnoreCase("xls") || str.equalsIgnoreCase("xlsx") || str.equalsIgnoreCase("et")) {
            f118128c.b(com.p314xaae8f345.p3210x3857dc.n.j(str, false) ? 1544L : 1070L, 67L, 1L);
        } else if (str.equalsIgnoreCase("txt")) {
            f118128c.b(1889L, 67L, 1L);
        } else if (com.p314xaae8f345.p3210x3857dc.n.k(str)) {
            f118128c.b(1900L, 67L, 1L);
        }
    }

    public static void k(com.p314xaae8f345.p3210x3857dc.f1 f1Var, int i17) {
        if (by5.v.b("kv_19307" + f1Var.toString() + "_" + i17)) {
            by5.r0 r0Var = new by5.r0(19307);
            r0Var.a(21, java.lang.Integer.valueOf(i17));
            if (f1Var == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_CW || f1Var == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS) {
                r0Var.a(22, java.lang.Integer.valueOf(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.h()));
            } else if (f1Var == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS) {
                r0Var.a(22, java.lang.Integer.valueOf(by5.e.d()));
            } else {
                r0Var.a(22, 0);
            }
            r0Var.a(23, java.lang.Integer.valueOf(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61212x34eb0d19));
            if ("armeabi-v7a".equalsIgnoreCase(by5.a.b())) {
                r0Var.a(24, 1);
            } else if ("arm64-v8a".equalsIgnoreCase(by5.a.b())) {
                r0Var.a(24, 2);
            }
            r0Var.a(25, java.lang.Integer.valueOf(f1Var.ordinal()));
            java.lang.StringBuilder sb6 = r0Var.f118124a;
            sb6.toString();
            t(r0Var.f118125b, sb6.toString());
        }
    }

    public static void l(com.p314xaae8f345.p3210x3857dc.f1 f1Var) {
        java.lang.String str;
        int i17;
        if (f118128c == null) {
            return;
        }
        com.p314xaae8f345.p3210x3857dc.f1 f1Var2 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_CW;
        com.p314xaae8f345.p3210x3857dc.f1 f1Var3 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
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
            int d17 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d();
            if (d17 <= 0) {
                return;
            }
            if (d17 != i18 || !format.equals(str2)) {
                f118128c.b(577L, (d17 % 50) + 100, 1L);
                by5.d4.f().edit().putInt("REPORT_XWEB_APK_VER", d17).commit();
            }
        }
        if (format.equals(str2)) {
            return;
        }
        if (f1Var == f1Var2 || f1Var == f1Var3) {
            if (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d() <= 0) {
                return;
            } else {
                i17 = 99;
            }
        } else if (f1Var != com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS) {
            return;
        } else {
            i17 = 97;
        }
        f118128c.b(577L, i17, 1L);
        by5.d4.f().edit().putString(str, format).commit();
    }

    public static void m(java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = f118128c;
        if (n1Var != null) {
            n1Var.b(577L, 0L, 1L);
            if (f118126a.equals("tools") && str != null && c(str) == 1) {
                f118128c.b(903L, 103L, 1L);
            }
            if (f118127b) {
                return;
            }
            int i17 = f118126a.equals("tools") ? 70 : f118126a.equals("appbrand") ? 73 : -1;
            int ordinal = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de().ordinal() - 1;
            if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de() == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS) {
                ordinal = 0;
            }
            if (i17 < 70 || ordinal < 0) {
                return;
            }
            f118127b = true;
            p(nd1.a2.f72909x366c91de, i17 + ordinal);
        }
    }

    public static void n(long j17) {
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = f118128c;
        if (n1Var == null || j17 <= 0 || j17 >= 300000) {
            return;
        }
        n1Var.a(nd1.a2.f72909x366c91de, nd1.a2.f72909x366c91de, 2, 3, 1, (int) j17);
    }

    public static void o() {
        java.lang.String b17 = by5.a.b();
        java.lang.String str = "armeabi-v7a".equals(b17) ? "arm64-v8a" : "armeabi-v7a";
        int g17 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.g(b17);
        int g18 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.g(str);
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
                p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.c.f34284x366c91de, 255);
                return;
            }
            return;
        }
        java.lang.String a17 = by5.a.a();
        if ("armeabi-v7a".equalsIgnoreCase(a17)) {
            p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.c.f34284x366c91de, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432);
        } else if ("arm64-v8a".equalsIgnoreCase(a17)) {
            p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.c.f34284x366c91de, 254);
        }
    }

    public static void p(int i17, int i18) {
        if (f118128c == null) {
            return;
        }
        android.content.SharedPreferences a17 = by5.d4.a("REPORT_DAILY", true);
        java.lang.String str = "id_" + i17 + "_key_" + i18;
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
        if (format.equals(a17.getString(str, ""))) {
            return;
        }
        f118128c.b(i17, i18, 1L);
        a17.edit().putString(str, format).commit();
    }

    public static synchronized void q(java.lang.String str, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        synchronized (by5.s0.class) {
            if (f118128c == null) {
                return;
            }
            if (!f118129d) {
                int b17 = b();
                int ordinal = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de().ordinal() - 1;
                if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de() == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS) {
                    ordinal = 0;
                }
                if (b17 >= 30 && ordinal >= 0) {
                    f118129d = true;
                    p(oc1.f.f73032x366c91de, b17 + 3 + ordinal);
                }
            }
            if (str != null && "https://servicewechat.com/preload/page-frame.html".equalsIgnoreCase(str.trim())) {
                f118128c.b(903L, 102L, 1L);
            }
            int b18 = b();
            int ordinal2 = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de().ordinal() - 1;
            if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de() == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS) {
                ordinal2 = 0;
            }
            if (b18 >= 30 && ordinal2 >= 0) {
                f118128c.b(903L, b18 + 0 + ordinal2, 1L);
            }
        }
    }

    public static void r(com.p314xaae8f345.p3210x3857dc.f1 f1Var, boolean z17, java.lang.String str) {
        int i17;
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = f118128c;
        if (n1Var == null) {
            return;
        }
        if (f1Var == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS) {
            i17 = z17 ? 78 : 82;
        } else if (f1Var == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_CW) {
            i17 = z17 ? 77 : 81;
        } else if (f1Var != com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS) {
            return;
        } else {
            i17 = z17 ? 75 : 79;
        }
        n1Var.b(1749L, i17, 1L);
        xx5.s.a(f1Var, z17 ? 1 : 2, 2, false, str);
    }

    public static void s(long j17, long j18, long j19) {
        by5.c4.f("WXWebReporter", "report idkey id = " + j17 + " key = " + j18 + " value = " + j19);
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = f118128c;
        if (n1Var != null) {
            n1Var.b(j17, j18, j19);
        }
    }

    public static void t(int i17, java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = f118128c;
        if (n1Var != null) {
            ((com.p314xaae8f345.mm.p2829xfa87f9de.a0) n1Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, str);
        }
    }
}
