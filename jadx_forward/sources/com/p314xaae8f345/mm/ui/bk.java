package com.p314xaae8f345.mm.ui;

/* loaded from: classes13.dex */
public abstract class bk {

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f279516f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f279517g;

    /* renamed from: a, reason: collision with root package name */
    public static final android.graphics.Rect f279511a = new android.graphics.Rect(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static boolean f279512b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseArray f279513c = new android.util.SparseArray(4);

    /* renamed from: d, reason: collision with root package name */
    public static final android.util.SparseArray f279514d = new android.util.SparseArray(4);

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f279515e = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.Boolean f279518h = null;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.Boolean f279519i = null;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Boolean f279520j = null;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Boolean f279521k = null;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.Boolean f279522l = null;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.Boolean f279523m = null;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.Boolean f279524n = null;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.Boolean f279525o = null;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.Boolean f279526p = null;

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.Boolean f279527q = null;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.Boolean f279528r = null;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.Boolean f279529s = null;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.Boolean f279530t = null;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.reflect.Method[] f279531u = {null, null};

    /* renamed from: v, reason: collision with root package name */
    public static boolean f279532v = false;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f279533w = false;

    /* renamed from: x, reason: collision with root package name */
    public static java.lang.Boolean f279534x = null;

    /* renamed from: y, reason: collision with root package name */
    public static java.lang.Boolean f279535y = null;

    /* renamed from: z, reason: collision with root package name */
    public static java.lang.Boolean f279536z = null;
    public static java.lang.Boolean A = null;
    public static final java.lang.String B = "xiaomi&28, redmi&28, samsung&28, vivo&28, oppo&29, huawei&29, honor&29, oneplus&29, meizu&24, smartisan&24, other&29";
    public static boolean C = false;
    public static boolean D = false;
    public static java.lang.Boolean E = null;
    public static java.lang.Boolean F = null;
    public static java.lang.Boolean G = null;

    public static boolean A() {
        return B(new bm5.x0(new com.p314xaae8f345.mm.ui.C21591x5962ef9()));
    }

    public static boolean B(bm5.x0 x0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.f274627a) {
            return true;
        }
        java.lang.Boolean bool = f279516f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (Q()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "inTabletEnv, isFoldableDevice, return false");
            f279516f = java.lang.Boolean.FALSE;
            return false;
        }
        if (u75.b.c() && R()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "inTabletEnv, isHWTablet, return true");
            f279516f = java.lang.Boolean.TRUE;
            return true;
        }
        if (fp.e0.b() && T()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "inTabletEnv, isHonorTablet, return true");
            f279516f = java.lang.Boolean.TRUE;
            return true;
        }
        if (u75.d.h() && X()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "inTabletEnv, isMiTablet, return true");
            f279516f = java.lang.Boolean.TRUE;
            return true;
        }
        if (fp.e0.h() && g0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "inTabletEnv, isVIVOTablet, return true");
            f279516f = java.lang.Boolean.TRUE;
            return true;
        }
        if ((fp.e0.e() || fp.e0.d()) && Z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "inTabletEnv, isOppoTablet, return true");
            f279516f = java.lang.Boolean.TRUE;
            return true;
        }
        if (fp.e0.f346722m == null) {
            fp.e0.f346722m = fp.e0.f346710a.contains("lenovo") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        if (fp.e0.f346722m.booleanValue() && "Lenovo TB-9707F".equalsIgnoreCase(android.os.Build.MODEL)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "inTabletEnv, isP8Pad, return true");
            f279516f = java.lang.Boolean.TRUE;
            return true;
        }
        if (fp.e0.f346724o == null) {
            fp.e0.f346724o = fp.e0.f346710a.contains("eebbk") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        if (!(fp.e0.f346724o.booleanValue() && "X2".equalsIgnoreCase(android.os.Build.MODEL))) {
            if (fp.e0.f346724o == null) {
                fp.e0.f346724o = fp.e0.f346710a.contains("eebbk") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
            if (!(fp.e0.f346724o.booleanValue() && "A2".equalsIgnoreCase(android.os.Build.MODEL))) {
                if (((java.lang.Integer) x0Var.b()).intValue() >= 600) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "inTabletEnv, widthDp:%s >= %s, return true", x0Var.b(), 600);
                    f279516f = java.lang.Boolean.TRUE;
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "inTabletEnv, no tablet condition matched, return false");
                f279516f = java.lang.Boolean.FALSE;
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "inTabletEnv, isEebbkPad, return true");
        f279516f = java.lang.Boolean.TRUE;
        return true;
    }

    public static boolean C() {
        if (I()) {
            return E(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources()) && F();
        }
        if (E == null) {
            E = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("dark_mode", false));
        }
        return E.booleanValue() && (G() || F());
    }

    public static boolean D(android.content.res.Configuration configuration) {
        return (configuration.uiMode & 48) == 32;
    }

    public static boolean E(android.content.res.Resources resources) {
        if (!G() && !F()) {
            return false;
        }
        if (!I()) {
            return C();
        }
        if (resources != null) {
            return (resources.getConfiguration().uiMode & 48) == 32;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "dancy test is not darkmode, activity is null ");
        return false;
    }

    public static boolean F() {
        if (!J() || H()) {
            return false;
        }
        if (!L() && !K()) {
            return false;
        }
        java.lang.String str = B;
        if (A == null) {
            A = java.lang.Boolean.FALSE;
            java.lang.String str2 = null;
            try {
                str2 = j62.e.g().a("clicfg_dark_mode_brand_api", str, false, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "dancy test darkModeUsableBrandAPI: %s", str2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UIUtils", e17, "darModeUsableBrandAPI", new java.lang.Object[0]);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                java.lang.String lowerCase = android.os.Build.BRAND.toLowerCase();
                if (str.contains(lowerCase)) {
                    for (java.lang.String str3 : str2.split(",")) {
                        if (str3.contains(lowerCase)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "dancy test usable brandAPI: %s", str3);
                            java.lang.String[] split = str3.split("&");
                            if (split.length >= 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[1])) {
                                try {
                                    if (android.os.Build.VERSION.SDK_INT >= java.lang.Integer.parseInt(split[1])) {
                                        A = java.lang.Boolean.TRUE;
                                    }
                                } catch (java.lang.NumberFormatException e18) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UIUtils", e18, "parse api error!", new java.lang.Object[0]);
                                }
                            }
                        }
                    }
                } else if (str2.contains("other") && android.os.Build.VERSION.SDK_INT >= 29) {
                    A = java.lang.Boolean.TRUE;
                }
            }
        }
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return A.booleanValue();
    }

    public static boolean G() {
        return J() && !H() && (L() || K()) && android.os.Build.VERSION.SDK_INT >= 26;
    }

    public static boolean H() {
        if (f279536z == null) {
            f279536z = java.lang.Boolean.FALSE;
            java.lang.String lowerCase = wo.w0.m().toLowerCase();
            java.lang.String a17 = j62.e.g().a("clicfg_dark_mode_disable_device", "", false, true);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) && a17.contains(lowerCase)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "isDarkModeDisableDevice ture!!!");
                f279536z = java.lang.Boolean.TRUE;
                return true;
            }
        }
        return f279536z.booleanValue();
    }

    public static boolean I() {
        if (!D) {
            C = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("dark_mode_follow_system", true);
            D = true;
        }
        return C;
    }

    public static boolean J() {
        if (f279534x == null) {
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_dark_mode_on", "1", false, true), 1) > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "dancy test, isDarkModeOn!!");
                    f279534x = java.lang.Boolean.TRUE;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "dancy test, isDarkModeOn close!!");
                    f279534x = java.lang.Boolean.FALSE;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UIUtils", e17, "isDarkModeOn", new java.lang.Object[0]);
                f279534x = java.lang.Boolean.FALSE;
            }
        }
        return f279534x.booleanValue();
    }

    public static boolean K() {
        if (f279535y == null) {
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_dark_mode_unused_on", "1", false, false), 1) > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "dancy test, isDarkModeUnusedOn!!");
                    f279535y = java.lang.Boolean.TRUE;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "dancy test, isDarkModeUnusedOn close!!");
                    f279535y = java.lang.Boolean.FALSE;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UIUtils", e17, "isDarkModeUnusedOn", new java.lang.Object[0]);
                f279535y = java.lang.Boolean.FALSE;
            }
        }
        return f279535y.booleanValue();
    }

    public static boolean L() {
        if (F == null) {
            F = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("dark_mode_used", false));
        }
        return F.booleanValue();
    }

    public static boolean M(float f17, float f18) {
        return ((double) java.lang.Math.abs(f17 - f18)) <= 1.0E-5d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean N(int r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.bk.N(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00eb, code lost:
    
        if (r6 != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean O(android.content.ContentResolver r6) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.bk.O(android.content.ContentResolver):boolean");
    }

    public static boolean P(android.content.Context context) {
        return com.p314xaae8f345.mm.ui.fl.d(context) || com.p314xaae8f345.mm.ui.v7.d(context) || com.p314xaae8f345.mm.ui.w9.c(context) || context.getResources().getConfiguration().toString().contains("oplus-magic-window") || (w0() && O(context.getContentResolver()));
    }

    public static boolean Q() {
        if (U() || b0()) {
            return true;
        }
        if (f279521k == null) {
            java.lang.String str = android.os.Build.BRAND;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.toLowerCase().contains("royole")) {
                f279521k = java.lang.Boolean.FALSE;
            } else {
                java.lang.String m17 = wo.w0.m();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(m17, "Royole FlexPai 2") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(m17, "ROYOLE Flexi")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "isRoyoleFoldableDevice!!!");
                    f279521k = java.lang.Boolean.TRUE;
                } else {
                    f279521k = java.lang.Boolean.FALSE;
                }
            }
        }
        if (f279521k.booleanValue() || Y() || S() || f0()) {
            return true;
        }
        if (f279525o == null) {
            if (fp.e0.f346726q == null) {
                fp.e0.f346726q = fp.e0.f346710a.contains("tecno") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
            if (fp.e0.f346726q.booleanValue()) {
                try {
                    if (wo.w1.b("ro.os_foldable_screen_support", 0) == 1) {
                        f279525o = new java.lang.Boolean(true);
                    } else {
                        f279525o = new java.lang.Boolean(false);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UIUtils", e17, "get displayMode failed", new java.lang.Object[0]);
                    f279525o = new java.lang.Boolean(false);
                }
            } else {
                f279525o = new java.lang.Boolean(false);
            }
        }
        if (f279525o == null) {
            f279525o = new java.lang.Boolean(false);
        }
        return f279525o.booleanValue();
    }

    public static boolean R() {
        if (f279528r == null) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("com.huawei.android.os.SystemPropertiesEx");
                f279528r = java.lang.Boolean.valueOf("tablet".equals(cls.getMethod("get", java.lang.String.class, java.lang.String.class).invoke(cls.newInstance(), "ro.build.characteristics", "")) || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("com.huawei.software.features.pad"));
            } catch (java.lang.Exception unused) {
                f279528r = java.lang.Boolean.FALSE;
            }
        }
        return f279528r.booleanValue();
    }

    public static boolean S() {
        if (f279519i == null) {
            if (u75.a.f506709a.a()) {
                if ("HNMGI".equalsIgnoreCase(android.os.Build.DEVICE)) {
                    java.lang.String str = android.os.Build.MODEL;
                    if ("DIA-AN00".equalsIgnoreCase(str) || "MGI-AN00".equalsIgnoreCase(str)) {
                        f279519i = java.lang.Boolean.TRUE;
                    }
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("com.hihonor.hardware.sensor.posture")) {
                    f279519i = java.lang.Boolean.TRUE;
                } else {
                    f279519i = java.lang.Boolean.FALSE;
                }
            } else {
                f279519i = java.lang.Boolean.FALSE;
            }
        }
        return f279519i.booleanValue();
    }

    public static boolean T() {
        if (f279529s == null) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("com.hihonor.android.os.SystemPropertiesEx");
                f279529s = java.lang.Boolean.valueOf("tablet".equals(cls.getMethod("get", java.lang.String.class, java.lang.String.class).invoke(cls.newInstance(), "ro.build.characteristics", "")));
            } catch (java.lang.Exception unused) {
                f279529s = java.lang.Boolean.FALSE;
            }
        }
        return f279529s.booleanValue();
    }

    public static boolean U() {
        if (f279518h == null) {
            if (!u75.b.c() || R()) {
                f279518h = java.lang.Boolean.FALSE;
            } else {
                java.lang.String str = android.os.Build.DEVICE;
                if (str.equals("HWBAL") || str.equals("unknownQTZ") || str.equals("HWBAL-QL")) {
                    f279518h = java.lang.Boolean.FALSE;
                } else if (str.equals("HWTAH") || str.equals("HWTAH-C") || str.equals("unknownRLI") || str.equals("unknownTXL") || str.equals("unknownRHA") || str.equals("HWTET")) {
                    f279518h = java.lang.Boolean.TRUE;
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("com.huawei.hardware.sensor.posture")) {
                    f279518h = java.lang.Boolean.TRUE;
                } else {
                    f279518h = java.lang.Boolean.FALSE;
                }
            }
        }
        return f279518h.booleanValue();
    }

    public static boolean V() {
        if (f279520j == null) {
            if (u75.d.h()) {
                try {
                    f279520j = java.lang.Boolean.valueOf(wo.w1.b("persist.sys.muiltdisplay_type", 0) == 2);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UIUtils", e17, "get muiltdisplay_type failed", new java.lang.Object[0]);
                    f279520j = java.lang.Boolean.FALSE;
                }
            } else {
                f279520j = java.lang.Boolean.FALSE;
            }
        }
        return f279520j.booleanValue();
    }

    public static boolean W() {
        if (G == null) {
            G = java.lang.Boolean.valueOf("meizu".equalsIgnoreCase(android.os.Build.MANUFACTURER));
        }
        return G.booleanValue();
    }

    public static boolean X() {
        if (!u75.d.h()) {
            return false;
        }
        java.lang.String str = android.os.Build.DEVICE;
        return str.equals("enuma") || str.equals("elish") || str.equals("nabu");
    }

    public static boolean Y() {
        if (f279523m == null) {
            if (fp.e0.e() || fp.e0.d() || fp.e0.f()) {
                android.content.pm.PackageManager packageManager = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager();
                if (packageManager.hasSystemFeature("oplus.feature.largescreen.land") || packageManager.hasSystemFeature("oplus.feature.largescreen.port")) {
                    f279523m = java.lang.Boolean.TRUE;
                } else {
                    f279523m = java.lang.Boolean.FALSE;
                }
            } else {
                f279523m = java.lang.Boolean.FALSE;
            }
        }
        return f279523m.booleanValue();
    }

    public static boolean Z() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("oplus.hardware.type.tablet");
    }

    public static boolean a(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        if (r6Var.m()) {
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.vfs.w6.M(r6Var.o()))) {
                    return !r2.contains("default#default");
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public static boolean a0() {
        if (f279522l == null) {
            if (fp.e0.g()) {
                java.lang.String m17 = wo.w0.m();
                if (m17.contains("SM-F9") || m17.contains("SM-W202") || m17.contains("SM-W90")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "isSamsungFoldableDevice!!!");
                    f279522l = java.lang.Boolean.TRUE;
                } else {
                    f279522l = java.lang.Boolean.FALSE;
                }
            } else {
                f279522l = java.lang.Boolean.FALSE;
            }
        }
        return f279522l.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.ViewGroup b(android.view.Window r7, android.view.View r8) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            yo.b r1 = new yo.b
            java.lang.String r2 = "mContentRoot"
            r1.<init>(r7, r2, r0)
            r1.b()
            java.lang.reflect.Field r2 = r1.f545577d
            r3 = 0
            if (r2 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = r3
        L16:
            if (r2 == 0) goto L2d
            java.lang.Object r1 = r1.a()     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.IllegalAccessException -> L21 java.lang.NoSuchFieldException -> L23
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.IllegalAccessException -> L21 java.lang.NoSuchFieldException -> L23
            goto L2e
        L1f:
            r1 = move-exception
            goto L24
        L21:
            r1 = move-exception
            goto L24
        L23:
            r1 = move-exception
        L24:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = "MicroMsg.UIUtils"
            java.lang.String r5 = ""
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r1, r5, r2)
        L2d:
            r1 = r0
        L2e:
            if (r1 == 0) goto L31
            return r1
        L31:
            if (r8 == 0) goto L47
            android.view.ViewParent r8 = r8.getParent()
        L37:
            android.view.View r1 = r7.getDecorView()
            if (r8 == r1) goto L47
            if (r8 == 0) goto L47
            android.view.ViewParent r0 = r8.getParent()
            r6 = r0
            r0 = r8
            r8 = r6
            goto L37
        L47:
            if (r0 != 0) goto L5f
            android.view.View r8 = r7.getDecorView()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            android.view.View r8 = r8.getChildAt(r3)
            boolean r1 = r8 instanceof android.view.ViewGroup
            if (r1 == 0) goto L5a
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            return r8
        L5a:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.clearFlags(r8)
        L5f:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.bk.b(android.view.Window, android.view.View):android.view.ViewGroup");
    }

    public static boolean b0() {
        if (V() || a0()) {
            return true;
        }
        if (f279526p == null) {
            if (fp.e0.j()) {
                try {
                    f279526p = java.lang.Boolean.valueOf(wo.w1.b("ro.vendor.feature.zte_foldable", 0) == 2);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UIUtils", e17, "isNubiaFoldableDevice get muiltdisplay_type failed", new java.lang.Object[0]);
                    f279526p = java.lang.Boolean.FALSE;
                }
            } else {
                f279526p = java.lang.Boolean.FALSE;
            }
        }
        if (f279526p.booleanValue()) {
            return true;
        }
        if (f279527q == null) {
            if (fp.e0.f346723n == null) {
                fp.e0.f346723n = fp.e0.f346710a.contains("motorola") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
            if (!fp.e0.f346723n.booleanValue()) {
                f279527q = java.lang.Boolean.FALSE;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("com.motorola.hardware.form_factor.fold")) {
                f279527q = java.lang.Boolean.TRUE;
            } else {
                f279527q = java.lang.Boolean.FALSE;
            }
        }
        return f279527q.booleanValue();
    }

    public static int[] c(android.graphics.Bitmap bitmap, int i17, int i18) {
        float[] fArr;
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i17, i18, false);
        int i19 = i17 * i18;
        int[] iArr = new int[i19];
        createScaledBitmap.getPixels(iArr, 0, i17, 0, 0, i17, i18);
        float[][] fArr2 = new float[i19];
        for (int i27 = 0; i27 < i19; i27++) {
            float[] fArr3 = new float[3];
            android.graphics.Color.colorToHSV(iArr[i27], fArr3);
            fArr2[i27] = fArr3;
        }
        int[] iArr2 = new int[8];
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        for (int i28 = 0; i28 < i19; i28++) {
            int i29 = 1;
            while (true) {
                if (i29 > 7) {
                    break;
                }
                if (fArr2[i28][0] < (i29 / 7.0f) * 360.0f) {
                    iArr2[i29] = iArr2[i29] + 1;
                    java.util.List list = (java.util.List) sparseArray.get(i29);
                    if (list == null) {
                        list = new java.util.ArrayList();
                    }
                    list.add(fArr2[i28]);
                    sparseArray.put(i29, list);
                } else {
                    i29++;
                }
            }
        }
        int i37 = -1;
        int i38 = 0;
        for (int i39 = 1; i39 <= 7; i39++) {
            int i47 = iArr2[i39];
            if (i47 > i38) {
                i37 = i39;
                i38 = i47;
            }
        }
        java.util.List list2 = (java.util.List) sparseArray.get(i37, new java.util.ArrayList());
        if (list2.size() > java.lang.Math.max(i17, i18)) {
            float f17 = Float.MAX_VALUE;
            fArr = null;
            for (int i48 = 0; i48 < list2.size(); i48++) {
                if (((float[]) list2.get(i48))[2] < f17) {
                    float[] fArr4 = (float[]) list2.get(i48);
                    fArr = fArr4;
                    f17 = fArr4[2];
                }
            }
            float f18 = fArr[2];
            if (f18 > 0.15d) {
                float f19 = fArr[1];
                if (f19 > 0.5d) {
                    fArr[1] = f19 - 0.1f;
                    fArr[2] = f18 - 0.1f;
                } else {
                    fArr[2] = f18 - 0.1f;
                }
            }
        } else {
            fArr = (float[]) list2.get(0);
            fArr[2] = 0.15f;
        }
        float[] fArr5 = new float[3];
        float f27 = fArr[2];
        if (f27 <= 0.15d) {
            fArr5[0] = fArr[0];
            fArr5[1] = fArr[1];
            fArr5[2] = f27 + 0.7f;
        } else {
            fArr5[0] = fArr[0];
            fArr5[1] = fArr[1];
            if (f27 + 0.5d >= 1.0d) {
                fArr5[2] = f27 - 0.5f;
            } else {
                fArr5[2] = f27 + 0.5f;
            }
        }
        float f28 = fArr5[1];
        if (f28 > 0.5f) {
            fArr5[1] = f28 - 0.1f;
        }
        return new int[]{android.graphics.Color.HSVToColor(fArr), android.graphics.Color.HSVToColor(fArr5)};
    }

    public static boolean c0() {
        return R() || g0() || Z() || T();
    }

    public static int d(int i17) {
        int round;
        int round2;
        int round3;
        if (!C()) {
            return i17;
        }
        float[] fArr = new float[3];
        java.lang.ThreadLocal threadLocal = e3.b.f328575a;
        e3.b.a(android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17), fArr);
        float f17 = fArr[2];
        if (f17 >= 0.45d) {
            return i17;
        }
        float f18 = 1.0f - f17;
        if (f18 > 0.8d) {
            f18 = 0.8f;
        }
        float f19 = fArr[0];
        float abs = (1.0f - java.lang.Math.abs((f18 * 2.0f) - 1.0f)) * fArr[1];
        float f27 = f18 - (0.5f * abs);
        float abs2 = (1.0f - java.lang.Math.abs(((f19 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f19) / 60) {
            case 0:
                round = java.lang.Math.round((abs + f27) * 255.0f);
                round2 = java.lang.Math.round((abs2 + f27) * 255.0f);
                round3 = java.lang.Math.round(f27 * 255.0f);
                break;
            case 1:
                round = java.lang.Math.round((abs2 + f27) * 255.0f);
                round2 = java.lang.Math.round((abs + f27) * 255.0f);
                round3 = java.lang.Math.round(f27 * 255.0f);
                break;
            case 2:
                round = java.lang.Math.round(f27 * 255.0f);
                round2 = java.lang.Math.round((abs + f27) * 255.0f);
                round3 = java.lang.Math.round((abs2 + f27) * 255.0f);
                break;
            case 3:
                round = java.lang.Math.round(f27 * 255.0f);
                round2 = java.lang.Math.round((abs2 + f27) * 255.0f);
                round3 = java.lang.Math.round((abs + f27) * 255.0f);
                break;
            case 4:
                round = java.lang.Math.round((abs2 + f27) * 255.0f);
                round2 = java.lang.Math.round(f27 * 255.0f);
                round3 = java.lang.Math.round((abs + f27) * 255.0f);
                break;
            case 5:
            case 6:
                round = java.lang.Math.round((abs + f27) * 255.0f);
                round2 = java.lang.Math.round(f27 * 255.0f);
                round3 = java.lang.Math.round((abs2 + f27) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return android.graphics.Color.rgb(e3.b.h(round, 0, 255), e3.b.h(round2, 0, 255), e3.b.h(round3, 0, 255));
    }

    public static boolean d0() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static int e() {
        try {
            java.lang.reflect.Method[] methodArr = f279531u;
            java.lang.reflect.Method method = methodArr[0];
            if (method == null) {
                synchronized (methodArr) {
                    method = methodArr[0];
                    if (method == null) {
                        method = java.lang.Class.forName("android.view.WindowManagerGlobal").getDeclaredMethod("getWindowManagerService", new java.lang.Class[0]);
                        method.setAccessible(true);
                        methodArr[0] = method;
                    }
                }
            }
            java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Method method2 = methodArr[1];
            if (method2 == null) {
                synchronized (methodArr) {
                    method2 = methodArr[1];
                    if (method2 == null) {
                        method2 = invoke.getClass().getDeclaredMethod("getInitialDisplayDensity", java.lang.Integer.TYPE);
                        method2.setAccessible(true);
                        methodArr[1] = method2;
                    }
                }
            }
            int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) method2.invoke(invoke, 0), 0);
            if (android.os.Build.VERSION.SDK_INT >= 36 && fp.e0.g()) {
                com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                int min = java.lang.Math.min(a17.f278668a, a17.f278669b);
                int g17 = g();
                if (min != 0 && g17 != 0) {
                    j17 = (j17 * g17) / min;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "screenWidth:%s, deviceWidth:%s, new dpi：%s", java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(g17), java.lang.Integer.valueOf(j17));
            }
            return j17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UIUtils", "Exception:%s", e17);
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT <= 27) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (r0 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014a, code lost:
    
        if (com.p314xaae8f345.mm.ui.bk.f279532v != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e0() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.bk.e0():boolean");
    }

    public static int f() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getMetrics(displayMetrics);
        android.view.Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
        int i17 = 0;
        if (supportedModes != null && supportedModes.length > 0) {
            i17 = java.lang.Math.max(supportedModes[0].getPhysicalWidth(), supportedModes[0].getPhysicalHeight());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "getDeviceHeight:%s", java.lang.Integer.valueOf(i17));
            if (supportedModes.length > 1) {
                int max = java.lang.Math.max(supportedModes[1].getPhysicalWidth(), supportedModes[1].getPhysicalHeight());
                if (max > 0 && i17 > 1440 && max >= i17) {
                    i17 = max;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "getDeviceHeightTwo:%s", java.lang.Integer.valueOf(max));
            }
        }
        if (i17 == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1055L, 2L, 1L, false);
        }
        return i17;
    }

    public static boolean f0() {
        if (f279524n == null) {
            if (!fp.e0.h()) {
                f279524n = java.lang.Boolean.FALSE;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(wo.w1.a("ro.vivo.device.type"), "foldable")) {
                f279524n = java.lang.Boolean.TRUE;
            } else {
                f279524n = java.lang.Boolean.FALSE;
            }
        }
        return f279524n.booleanValue();
    }

    public static int g() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getMetrics(displayMetrics);
        android.view.Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
        int i17 = 0;
        if (supportedModes != null && supportedModes.length > 0) {
            i17 = java.lang.Math.min(supportedModes[0].getPhysicalWidth(), supportedModes[0].getPhysicalHeight());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "getDeviceWidthOne:%s", java.lang.Integer.valueOf(i17));
            if (supportedModes.length > 1) {
                int min = java.lang.Math.min(supportedModes[1].getPhysicalWidth(), supportedModes[1].getPhysicalHeight());
                if (min > 0 && i17 > 1440 && min < i17) {
                    i17 = min;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "getDeviceWidthTwo:%s", java.lang.Integer.valueOf(min));
            }
        }
        if (i17 == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1055L, 2L, 1L, false);
        }
        if (U() && !y() && o0(displayMetrics) != 0) {
            i17 = o0(displayMetrics);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "getDeviceWidth:%s", java.lang.Integer.valueOf(i17));
        return i17;
    }

    public static boolean g0() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(wo.w1.a("ro.vivo.device.type"), "tablet");
    }

    public static android.graphics.Point h(android.content.Context context) {
        android.graphics.Point point = new android.graphics.Point();
        if (context == null) {
            return point;
        }
        ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static void h0(android.view.Window window, boolean z17) {
        if (window == null || window.getDecorView() == null || android.os.Build.VERSION.SDK_INT < 26) {
            return;
        }
        android.view.View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z17 ? systemUiVisibility | 16 : systemUiVisibility & (-17));
    }

    public static android.graphics.Point i(android.content.Context context) {
        android.graphics.Point point = new android.graphics.Point();
        if (context == null) {
            return point;
        }
        ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    public static boolean i0(android.view.Window window, boolean z17) {
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        if (u75.d.e()) {
            u75.d.g();
        }
        android.view.View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z17 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        return true;
    }

    public static int j(android.content.Context context) {
        int identifier;
        if (!k(context) || (identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f)) <= 0) {
            return 0;
        }
        return android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
    }

    public static void j0(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            k0(((android.app.Activity) context).getWindow());
        }
    }

    public static boolean k(android.content.Context context) {
        return l(context) > 0;
    }

    public static void k0(android.view.Window window) {
        if (window == null) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public static int l(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UIUtils", "getRealBottomHeight, get NULL windowManager");
            return 0;
        }
        android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        android.graphics.Point h17 = h(context);
        int max = java.lang.Math.max(point.y, point.x);
        int max2 = java.lang.Math.max(h17.y, h17.x);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            max = java.lang.Math.max(rect.bottom - rect.top, rect.right - rect.left);
        }
        return max2 - max;
    }

    public static boolean l0(android.view.View view, android.view.View view2) {
        if (!fp.h.c(21)) {
            return true;
        }
        if (view == null || !(view instanceof android.view.ViewGroup) || view2 == null || !(view.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return false;
        }
        view.setOnApplyWindowInsetsListener(new com.p314xaae8f345.mm.ui.ck(view, view2));
        return true;
    }

    public static android.graphics.Rect m(android.app.Activity activity) {
        android.graphics.Rect rect;
        boolean z17;
        android.graphics.Rect rect2;
        android.view.WindowInsets windowInsets;
        android.util.DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        synchronized (com.p314xaae8f345.mm.ui.bk.class) {
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            android.util.SparseArray sparseArray = f279514d;
            if (sparseArray.get(rotation) != null) {
                return (android.graphics.Rect) sparseArray.get(rotation);
            }
            android.graphics.Rect rect3 = null;
            if (activity.getWindow() == null) {
                return null;
            }
            if (u(activity, true)) {
                if (android.os.Build.VERSION.SDK_INT < 28 || (windowInsets = (android.view.WindowInsets) f279513c.get(rotation)) == null || windowInsets.getDisplayCutout() == null) {
                    z17 = false;
                } else {
                    rect3 = new android.graphics.Rect(windowInsets.getDisplayCutout().getSafeInsetLeft(), windowInsets.getDisplayCutout().getSafeInsetTop(), i17 - windowInsets.getDisplayCutout().getSafeInsetRight(), i18 - windowInsets.getDisplayCutout().getSafeInsetBottom());
                    z17 = true;
                }
                if (z17) {
                    rect = rect3;
                } else {
                    int p17 = p(activity);
                    if (rotation == 0) {
                        rect2 = new android.graphics.Rect(0, p17, i17, i18);
                    } else if (rotation == 1) {
                        rect2 = new android.graphics.Rect(p17, 0, i17, i18);
                    } else if (rotation == 2) {
                        rect2 = new android.graphics.Rect(0, 0, i17, i18 - p17);
                    } else if (rotation != 3) {
                        rect = new android.graphics.Rect(0, 0, i17, i18);
                    } else {
                        rect2 = new android.graphics.Rect(0, 0, i17 - p17, i18);
                    }
                    rect = rect2;
                }
            } else {
                rect = new android.graphics.Rect(0, 0, i17, i18);
            }
            sparseArray.put(rotation, rect);
            return rect;
        }
    }

    public static boolean m0(android.content.Context context) {
        if (context == null) {
            return false;
        }
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        android.graphics.Point point2 = new android.graphics.Point();
        defaultDisplay.getRealSize(point);
        defaultDisplay.getSize(point2);
        return ((double) ((((float) point.x) * 1.0f) / ((float) point2.x))) >= 1.7d || ((double) ((((float) point.y) * 1.0f) / ((float) point2.y))) >= 1.7d;
    }

    public static int n(float f17) {
        return (int) (f() * f17);
    }

    public static int n0(int i17, int i18, float f17) {
        float f18 = 1.0f - f17;
        return ((((int) (((i17 & 255) * f17) + ((i18 & 255) * f18))) & 255) << 0) | ((((int) ((((i17 >> 24) & 255) * f17) + (((i18 >> 24) & 255) * f18))) & 255) << 24) | ((((int) ((((i17 >> 16) & 255) * f17) + (((i18 >> 16) & 255) * f18))) & 255) << 16) | ((((int) ((((i17 >> 8) & 255) * f17) + (((i18 >> 8) & 255) * f18))) & 255) << 8);
    }

    public static int o(float f17) {
        return (int) (g() * f17);
    }

    public static int o0(android.util.DisplayMetrics displayMetrics) {
        try {
            java.lang.reflect.Field declaredField = android.util.DisplayMetrics.class.getDeclaredField("noncompatWidthPixels");
            declaredField.setAccessible(true);
            int intValue = ((java.lang.Integer) declaredField.get(displayMetrics)).intValue();
            java.lang.reflect.Field declaredField2 = android.util.DisplayMetrics.class.getDeclaredField("noncompatHeightPixels");
            declaredField2.setAccessible(true);
            int intValue2 = ((java.lang.Integer) declaredField2.get(displayMetrics)).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "noncompatWidth, width:%s, height:%s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
            return java.lang.Math.min(intValue, intValue2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UIUtils", e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    public static int p(android.content.Context context) {
        return fp.j0.a(context, 25);
    }

    public static void p0(android.app.Activity activity, int i17) {
        if (activity == null) {
            return;
        }
        try {
            if (activity.getWindow() == null) {
                return;
            }
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().setStatusBarColor(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UIUtils", th6, "", new java.lang.Object[0]);
        }
    }

    public static int q(android.content.Context context) {
        int a17 = fp.j0.a(context, -1);
        if (a17 > 0) {
            android.graphics.Rect rect = new android.graphics.Rect();
            ((android.app.Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i17 = rect.top;
            if (i17 <= a17) {
                return a17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UIUtils", "[fixStatusBarHeight] top:%s statusHeight:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
            return 0;
        }
        if (!(context instanceof android.app.Activity)) {
            return i65.a.b(context, 20);
        }
        android.graphics.Rect rect2 = new android.graphics.Rect();
        android.app.Activity activity = (android.app.Activity) context;
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
        int height = activity.getWindow().getDecorView().getHeight();
        int[] iArr = new int[2];
        activity.getWindow().getDecorView().getLocationOnScreen(iArr);
        return (height - rect2.height() < 0 || iArr[1] <= 200) ? rect2.top : height - rect2.height();
    }

    public static void q0(android.graphics.Paint paint) {
        if (paint == null) {
            return;
        }
        paint.setFakeBoldText(true);
    }

    public static int r(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "getWidthDp, getDeviceDpi:%d, getWindowDpi:%d, getDeviceWidth:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i17 == 0) {
            return 0;
        }
        if (Q()) {
            android.util.DisplayMetrics displayMetrics = j65.f.f379474e;
            if (displayMetrics != null) {
                return java.lang.Math.round(java.lang.Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels) / displayMetrics.density);
            }
            return 0;
        }
        if (i17 != i18 && !v()) {
            return java.lang.Math.round(i19 / (i17 / 160.0f));
        }
        android.util.DisplayMetrics t17 = t();
        android.graphics.Point h17 = h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int round = java.lang.Math.round(java.lang.Math.min(h17.y, h17.x) / t17.density);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "getWidthDp1, realSizePoint.y:%s realSizePoint.x:%s windowMetrics.density:%s result:%s", java.lang.Integer.valueOf(h17.y), java.lang.Integer.valueOf(h17.x), java.lang.Float.valueOf(t17.density), java.lang.Integer.valueOf(round));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "getWidthDp2, windowMetrics.heightPixels:%s windowMetrics.widthPixels:%s windowMetrics.density:%s result2:%s", java.lang.Integer.valueOf(t17.heightPixels), java.lang.Integer.valueOf(t17.widthPixels), java.lang.Float.valueOf(t17.density), java.lang.Integer.valueOf(java.lang.Math.round(java.lang.Math.min(t17.heightPixels, t17.widthPixels) / t17.density)));
        return round;
    }

    public static void r0(android.graphics.Paint paint, float f17) {
        if (paint == null) {
            return;
        }
        if (!e0()) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(f17);
        } else if (f17 == 0.8f) {
            paint.setFakeBoldText(true);
        }
    }

    public static int s() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    public static void s0(android.graphics.Paint paint) {
        if (paint == null) {
            return;
        }
        if (e0()) {
            paint.setFakeBoldText(true);
        } else {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(0.8f);
        }
    }

    public static android.util.DisplayMetrics t() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static void t0(android.graphics.Paint paint) {
        if (paint == null) {
            return;
        }
        if (e0()) {
            paint.setFakeBoldText(false);
        } else {
            paint.setStyle(android.graphics.Paint.Style.FILL);
        }
    }

    public static boolean u(android.content.Context context, boolean z17) {
        boolean z18;
        android.view.DisplayCutout displayCutout;
        java.util.List<android.graphics.Rect> boundingRects;
        boolean z19 = true;
        if (!u75.g.a(context)) {
            if (!(context == null ? false : context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism")) && !u75.b.b(context)) {
                if (context != null && (context instanceof android.app.Activity)) {
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        f279512b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("has_cutout", false);
                        android.app.Activity activity = (android.app.Activity) context;
                        android.view.View decorView = activity.getWindow().getDecorView();
                        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
                        synchronized (f279515e) {
                            android.util.SparseArray sparseArray = f279513c;
                            android.view.WindowInsets windowInsets = (android.view.WindowInsets) sparseArray.get(rotation);
                            if (windowInsets == null) {
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e() && decorView.isAttachedToWindow()) {
                                    windowInsets = decorView.getRootWindowInsets();
                                    sparseArray.put(rotation, decorView.getRootWindowInsets());
                                } else if (z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e() && decorView.isAttachedToWindow()) {
                                    windowInsets = (android.view.WindowInsets) new com.p314xaae8f345.mm.ui.dk(500L, null, decorView).a(new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()));
                                    sparseArray.put(rotation, windowInsets);
                                } else {
                                    android.app.Activity activity2 = (android.app.Activity) context;
                                    if (!activity2.isFinishing() && !activity2.isDestroyed()) {
                                        com.p314xaae8f345.mm.ui.qk c17 = com.p314xaae8f345.mm.ui.qk.c((android.app.Activity) context, true);
                                        c17.a(new com.p314xaae8f345.mm.ui.ek(rotation, decorView, c17));
                                        z18 = f279512b;
                                    }
                                    z18 = f279512b;
                                }
                            }
                            if (windowInsets != null && (displayCutout = windowInsets.getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && boundingRects.size() > 0) {
                                f279512b = true;
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("has_cutout", f279512b);
                            }
                        }
                    } else {
                        f279512b = context.getPackageManager().hasSystemFeature("android.hardware.notch_support");
                    }
                    z18 = f279512b;
                } else {
                    z18 = false;
                }
                if (!z18) {
                    z19 = false;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "hasCutOut:%s", java.lang.Boolean.valueOf(z19));
        return z19;
    }

    public static void u0(android.app.Activity activity) {
        if (activity == null || android.os.Build.VERSION.SDK_INT < 26 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.x.v0()) {
            return;
        }
        try {
            boolean isScreenWideColorGamut = activity.getResources().getConfiguration().isScreenWideColorGamut();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "isScreenWideColorGamut :" + isScreenWideColorGamut);
            if (isScreenWideColorGamut) {
                activity.getWindow().setColorMode(1);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UIUtils", th6, "setWideColorImageMode", new java.lang.Object[0]);
        }
    }

    public static boolean v() {
        java.lang.String str = android.os.Build.BRAND;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (!lowerCase.contains("huawei") && !lowerCase.contains("honor")) {
            return false;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 != 26 && i17 != 27) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "dancy huaweiSpecial!!");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean v0() {
        /*
            java.lang.Boolean r0 = com.p314xaae8f345.mm.ui.bk.f279530t
            java.lang.String r1 = "MicroMsg.UIUtils"
            if (r0 != 0) goto Lc4
            com.huawei.easygo.sdk.EasyGo r0 = com.p314xaae8f345.mm.ui.fl.f290138a
            if (r0 != 0) goto Lf
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            com.p314xaae8f345.mm.ui.fl.b(r0)
        Lf:
            com.hihonor.easygo.sdk.EasyGo r0 = com.p314xaae8f345.mm.ui.v7.f292641a
            if (r0 != 0) goto L18
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            com.p314xaae8f345.mm.ui.v7.b(r0)
        L18:
            boolean r0 = com.p314xaae8f345.mm.ui.fl.c()
            boolean r2 = com.p314xaae8f345.mm.ui.v7.c()
            com.miui.easygo.sdk.EasyGo r3 = com.p314xaae8f345.mm.ui.w9.f292747a
            if (r3 != 0) goto L35
            boolean r3 = V()
            if (r3 != 0) goto L30
            boolean r3 = X()
            if (r3 == 0) goto L35
        L30:
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            com.p314xaae8f345.mm.ui.w9.b(r3)
        L35:
            java.util.List r3 = com.p314xaae8f345.mm.ui.w9.f292748b
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L56
            int r3 = r3.size()
            if (r3 <= 0) goto L56
            java.util.List r3 = com.p314xaae8f345.mm.ui.w9.f292748b
            r3.get(r5)
            java.util.List r3 = com.p314xaae8f345.mm.ui.w9.f292748b
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L56
            r3 = r4
            goto L57
        L56:
            r3 = r5
        L57:
            boolean r6 = g0()
            if (r6 != 0) goto L66
            boolean r6 = f0()
            if (r6 != 0) goto L66
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L70
        L66:
            android.content.Context r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            boolean r6 = com.p314xaae8f345.mm.ui.rk.b(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
        L70:
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L84
            boolean r6 = f0()
            if (r6 != 0) goto L82
            boolean r6 = g0()
            if (r6 == 0) goto L84
        L82:
            r6 = r4
            goto L85
        L84:
            r6 = r5
        L85:
            qb.a r7 = com.p314xaae8f345.mm.ui.eg.f289933a
            if (r7 != 0) goto L8e
            android.content.Context r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            com.p314xaae8f345.mm.ui.eg.c(r7)
        L8e:
            boolean r7 = com.p314xaae8f345.mm.ui.eg.b()
            java.lang.Boolean r8 = new java.lang.Boolean
            if (r0 != 0) goto La6
            if (r2 != 0) goto La6
            if (r3 != 0) goto La6
            if (r6 != 0) goto La6
            if (r7 != 0) goto La6
            boolean r2 = w0()
            if (r2 == 0) goto La5
            goto La6
        La5:
            r4 = r5
        La6:
            r8.<init>(r4)
            com.p314xaae8f345.mm.ui.bk.f279530t = r8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0, r2, r3, r4}
            java.lang.String r2 = "supportMagicWindow:%s, hwInitSucceed:%s, miUIInitSucceed:%s, vivoInMagicWindow:%s, oppoInitSucceed:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
        Lc4:
            java.lang.Boolean r0 = com.p314xaae8f345.mm.ui.bk.f279530t
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "supportMagicWindow:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            java.lang.Boolean r0 = com.p314xaae8f345.mm.ui.bk.f279530t
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.bk.v0():boolean");
    }

    public static boolean w() {
        return x(new bm5.x0(new com.p314xaae8f345.mm.ui.C21590x5962ef8()));
    }

    public static boolean w0() {
        boolean z17 = false;
        if (fp.h.c(31)) {
            if (p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36.INSTANCE.m8472x9cf0d20b().m8468xeeea3e7e() && com.p314xaae8f345.mm.ui.fj.h()) {
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "supportSplit：%s", java.lang.Boolean.valueOf(z17));
        }
        return z17;
    }

    public static boolean x(bm5.x0 x0Var) {
        java.lang.Boolean bool = f279517g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (((java.lang.Integer) x0Var.b()).intValue() > 550) {
            f279517g = java.lang.Boolean.TRUE;
            return true;
        }
        f279517g = java.lang.Boolean.FALSE;
        return false;
    }

    public static void x0() {
        C = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("dark_mode_follow_system", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (A() == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y() {
        /*
            boolean r0 = v0()
            r1 = 0
            if (r0 != 0) goto Lf
            boolean r0 = w0()
            if (r0 == 0) goto Le
            goto Lf
        Le:
            return r1
        Lf:
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            boolean r0 = com.p314xaae8f345.mm.ui.fl.d(r0)
            r2 = 1
            if (r0 != 0) goto L80
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            boolean r0 = com.p314xaae8f345.mm.ui.v7.d(r0)
            if (r0 != 0) goto L80
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            boolean r0 = com.p314xaae8f345.mm.ui.w9.c(r0)
            if (r0 != 0) goto L80
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            if (r0 == 0) goto L4f
            boolean r3 = g0()
            if (r3 != 0) goto L39
            boolean r3 = f0()
            if (r3 != 0) goto L39
            goto L4f
        L39:
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "multi-landscape"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L4f
            r0 = r2
            goto L50
        L4f:
            r0 = r1
        L50:
            if (r0 != 0) goto L80
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "oplus-magic-window"
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L80
            boolean r0 = w0()
            if (r0 == 0) goto L81
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.ContentResolver r0 = r0.getContentResolver()
            boolean r0 = O(r0)
            if (r0 != 0) goto L80
            boolean r0 = A()
            if (r0 == 0) goto L81
        L80:
            r1 = r2
        L81:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "MicroMsg.UIUtils"
            java.lang.String r3 = "inMagicWindowMode:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.bk.y():boolean");
    }

    public static void y0() {
        if (com.p314xaae8f345.mm.ui.fl.f290138a == null) {
            com.p314xaae8f345.mm.ui.fl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        boolean c17 = com.p314xaae8f345.mm.ui.fl.c();
        if (com.p314xaae8f345.mm.ui.v7.f292641a == null) {
            com.p314xaae8f345.mm.ui.v7.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        boolean c18 = com.p314xaae8f345.mm.ui.v7.c();
        java.lang.Boolean bool = f279530t;
        if (bool != null) {
            f279530t = new java.lang.Boolean(bool.booleanValue() || c17 || c18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "updateSupportMagicWindow!");
    }

    public static boolean z(int i17) {
        com.p292xb816a1e7.p293xb1e6786a.sdk.C2831x7b4b60aa c2831x7b4b60aa = com.p314xaae8f345.mm.ui.fl.f290138a;
        if (c2831x7b4b60aa != null && com.p314xaae8f345.mm.ui.fl.a(c2831x7b4b60aa, i17) == 2) {
            return true;
        }
        com.miui.easygo.sdk.EasyGo easyGo = com.p314xaae8f345.mm.ui.w9.f292747a;
        if (easyGo != null && com.p314xaae8f345.mm.ui.w9.a(easyGo, i17) == 2) {
            return true;
        }
        if (com.p314xaae8f345.mm.ui.rk.f291287b != null && (g0() || f0()) && com.p314xaae8f345.mm.ui.rk.a(i17) == 2) {
            return true;
        }
        if (com.p314xaae8f345.mm.ui.eg.f289933a != null && com.p314xaae8f345.mm.ui.eg.a(i17) == 2) {
            return true;
        }
        return com.p314xaae8f345.mm.ui.v7.f292641a != null && com.p314xaae8f345.mm.ui.v7.c() && com.p314xaae8f345.mm.ui.v7.a(com.p314xaae8f345.mm.ui.v7.f292641a, i17) == 2;
    }
}
