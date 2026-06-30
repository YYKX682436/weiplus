package qx5;

/* loaded from: classes13.dex */
public abstract class x {
    public static java.lang.String a(java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.f1 f1Var;
        com.p314xaae8f345.p3210x3857dc.f1 f1Var2 = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301722m;
        com.p314xaae8f345.p3210x3857dc.f1 f1Var3 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("\n   default core type:");
        sb6.append(f1Var3);
        com.p314xaae8f345.p3210x3857dc.b m17 = com.p314xaae8f345.p3210x3857dc.b.m();
        java.lang.String g17 = m17.g("setwebtype", str);
        com.p314xaae8f345.p3210x3857dc.f1 f1Var4 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE;
        if (g17 != null && !g17.isEmpty()) {
            try {
                f1Var4 = com.p314xaae8f345.p3210x3857dc.f1.m120252xdce0328(g17);
            } catch (java.lang.Throwable th6) {
                by5.c4.d(m17.n(), "convertWebType error", th6);
            }
        }
        com.p314xaae8f345.p3210x3857dc.f1 f1Var5 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE;
        if (f1Var4 != f1Var5) {
            com.p314xaae8f345.p3210x3857dc.b m18 = com.p314xaae8f345.p3210x3857dc.b.m();
            java.lang.String g18 = m18.g("setwebtype", str);
            if (g18 != null && !g18.isEmpty()) {
                try {
                    f1Var = com.p314xaae8f345.p3210x3857dc.f1.m120252xdce0328(g18);
                } catch (java.lang.Throwable th7) {
                    by5.c4.d(m18.n(), "convertWebType error", th7);
                }
                sb6.append("\n   has command type:");
                sb6.append(f1Var);
            }
            f1Var = f1Var5;
            sb6.append("\n   has command type:");
            sb6.append(f1Var);
        } else {
            f1Var = f1Var3;
        }
        zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        boolean z17 = true;
        if (u0Var.d(str, true) != f1Var5) {
            f1Var = u0Var.d(str, true);
            sb6.append("\n   has abtest type:");
            sb6.append(f1Var);
        }
        if (u0Var.d(str, false) != f1Var5) {
            f1Var = u0Var.d(str, false);
            sb6.append("\n   has hardcode type:");
            sb6.append(f1Var);
        }
        if (f1Var == f1Var3 && !org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.o()) {
            f1Var = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS;
            sb6.append("\n   prefer sys because xweb is not available");
        }
        if (com.p314xaae8f345.p3210x3857dc.t1.f()) {
            f1Var = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS;
            sb6.append("\n   prefer sys because child process monitor hit");
        }
        java.util.List list = by5.q.f118113j;
        synchronized (by5.q.class) {
            if (!by5.d4.e().getBoolean("bIgnoreCrashWatch", false)) {
                if (by5.q.d("LOAD_CORE", f1Var, str).e()) {
                    by5.c4.f("CrashWatchDog", "hasRecentCrash, SCENE_LOAD_CORE, module:" + str + ", kind:" + f1Var);
                    by5.s0.k(f1Var, 1);
                } else if (by5.q.d("CREATE_WEBVIEW", f1Var, str).e()) {
                    by5.c4.f("CrashWatchDog", "hasRecentCrash, SCENE_CREATE_WEBVIEW, module:" + str + ", kind:" + f1Var);
                    by5.s0.k(f1Var, 2);
                }
            }
            z17 = false;
        }
        if (z17) {
            sb6.append("\n   will not use ");
            sb6.append(f1Var);
            sb6.append(" because of CrashWatchDog hit");
        }
        sb6.insert(0, " module(" + str + ") webview core type:" + f1Var);
        return sb6.toString();
    }

    public static java.lang.String b(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n local gray value = ");
        sb6.append(by5.a4.b());
        sb6.append("\n local device gray value = ");
        sb6.append(by5.a4.a());
        sb6.append("\n today gray value = ");
        sb6.append(by5.a4.c());
        sb6.append("\n config period(minutes) = ");
        sb6.append(by5.l0.m() / 60000);
        sb6.append("\n config url = ");
        sb6.append(by5.e4.a());
        sb6.append("\n\n system apilevel = ");
        sb6.append(android.os.Build.VERSION.SDK_INT);
        sb6.append("\n target apilevel = ");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getApplicationInfo().targetSdkVersion);
        sb6.append("\n device brand = ");
        sb6.append(android.os.Build.BRAND);
        sb6.append("\n device model = ");
        sb6.append(android.os.Build.MODEL);
        sb6.append("\n device abi = ");
        sb6.append(by5.a.a());
        sb6.append("\n runtime abi = ");
        sb6.append(by5.a.b());
        sb6.append("\n system webview version = ");
        sb6.append(by5.e.d());
        sb6.append("\n\n XWEB_TEST_MODE:false\n FORCE_XWEB_CORE:false\n NEED_TURN_OFF_DYNAMIC_CODE:false\n THIRD_PARD_RELEASE:false\n\n SHOULD_EMBED_XWEB_CORE:false\n XWEB_EMBED_LIB_MD5_MATCH = true\n EMBED_APK_VERSION(32/64) = 0/0\n embed try installed ver = ");
        sb6.append(by5.d4.a("XWEB_EMBED_INSTALL_" + by5.a.b(), false).getInt("INSTALLED_EMBED_VERSION", -1));
        sb6.append("\n installed ver for arm32 = ");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.g("armeabi-v7a"));
        sb6.append("\n installed ver for arm64 = ");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.g("arm64-v8a"));
        sb6.append("\n\n client version = 0x");
        android.os.Bundle bundle = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429514n;
        synchronized (bundle) {
            i17 = bundle.getInt("clientVersion", 0);
        }
        sb6.append(java.lang.Integer.toHexString(i17));
        sb6.append("\n app info = ");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156975x966e5ddb());
        sb6.append("\n useragent = ");
        sb6.append(c27816xac2547f9 != null ? c27816xac2547f9.mo120153xd15cf999().g() : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
        java.lang.String str4 = sb6.toString() + "\n\n>>>>>> wechat prefer webview core start >>>>>>\n";
        try {
            str = ((str4 + a("mm") + "\n") + a("tools") + "\n") + a("appbrand") + "\n";
        } catch (java.lang.Throwable th6) {
            str = str4 + "dump module prefer webview core, error";
            by5.c4.g("XWebDebugRuntimeHelper", "dump module prefer webview core, error:" + th6.getMessage());
        }
        java.lang.String str5 = str + "<<<<<< wechat prefer webview core end <<<<<<";
        com.p314xaae8f345.p3210x3857dc.b m17 = com.p314xaae8f345.p3210x3857dc.b.m();
        m17.getClass();
        try {
            str2 = m17.d();
        } catch (java.lang.Throwable th7) {
            by5.c4.d(m17.n(), "getAbstractInfo error", th7);
            str2 = "";
        }
        if (str2 != null && !str2.isEmpty()) {
            str5 = ((str5 + "\n\n>>>>>> core config commands start >>>>>>\n") + str2) + "<<<<<< core config commands end <<<<<<";
        }
        java.lang.String str6 = ((str5 + "\n\n>>>>>> core scheduler start >>>>>>") + "\n " + zx5.p.Z().c()) + "\n " + zx5.o.b0().c();
        zx5.p Z = zx5.p.Z();
        java.lang.String str7 = ((str6 + "\n\n update match gap backward(update speed) = " + Z.d(Z.f(false))) + "\n update match gap forward(提前更新) = " + Z.d(Z.f(true))) + "\n<<<<<< core scheduler end <<<<<<";
        java.lang.String str8 = "";
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f);
            if (zx5.p.Z().x()) {
                java.lang.String format = simpleDateFormat.format(new java.util.Date(zx5.p.Z().i().f118097c));
                str8 = (((((((((" going to update to apk ver = " + zx5.p.Z().i().f118107m.f118070e) + "\n update time = " + format) + "\n is patch update = " + zx5.p.Z().i().f118104j) + "\n can use cellular = " + zx5.p.Z().i().f118103i) + "\n updateHourStart = " + zx5.p.Z().i().f118107m.f118085t) + "\n updateHourEnd = " + zx5.p.Z().i().f118107m.f118086u) + "\n versionId = " + zx5.p.Z().i().f118107m.f118084s) + "\n try count = " + zx5.p.Z().i().f118098d) + "\n try use shared core count = " + zx5.p.Z().i().f118099e) + "\n";
            }
            str8 = str8 + " last fetch config time = " + simpleDateFormat.format(new java.util.Date(zx5.p.Z().i().f118095a));
            str3 = str8 + "\n last fetch config abi = " + zx5.p.Z().i().f118096b;
        } catch (java.lang.Throwable th8) {
            by5.c4.g("XWebDebugRuntimeHelper", "dump schedule updateInfo, error:" + th8.getMessage());
            str3 = str8 + "\n dump schedule updateInfo, error";
        }
        return ((str7 + "\n\n>>>>>> schedule updateInfo start >>>>>>\n") + str3) + "\n<<<<<< schedule updateInfo end <<<<<<";
    }

    public static java.lang.String c(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        java.lang.String mo120157x2e41070;
        if (c27816xac2547f9 != null) {
            mo120157x2e41070 = c27816xac2547f9.mo120157x2e41070();
        } else if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0()) {
            mo120157x2e41070 = "pinus, sdkver:20260502, apkver:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d();
        } else if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.x0()) {
            mo120157x2e41070 = "sys, sdkver:20260502, sysver:" + by5.e.a();
        } else {
            mo120157x2e41070 = "unknown, sdkver:20260502";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(mo120157x2e41070);
        sb6.append("\nprocess:");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464());
        sb6.append(", module:");
        java.lang.String str = "";
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m(""));
        java.lang.String sb7 = sb6.toString();
        if (c27816xac2547f9 == null || c27816xac2547f9.m120143xc7aa84d5() != com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS) {
            return sb7;
        }
        int k17 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.k();
        if (k17 == 0) {
            str = "Single";
        } else if (k17 == 1) {
            str = "Render";
        } else if (k17 == 2) {
            str = "Render&GPU";
        }
        if (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.k() == 0) {
            return sb7;
        }
        return (sb7 + "\ntype:" + str) + ", sandbox: " + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.e();
    }
}
