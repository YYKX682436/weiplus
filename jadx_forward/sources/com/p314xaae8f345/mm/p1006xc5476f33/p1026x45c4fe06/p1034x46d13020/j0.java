package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f158000a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f158001b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f158002c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f158003d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f158004e = "";

    /* renamed from: f, reason: collision with root package name */
    public static long f158005f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f158006g = false;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f158007h = false;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.Boolean f158008i = null;

    /* renamed from: j, reason: collision with root package name */
    public static long f158009j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Boolean f158010k = null;

    /* renamed from: l, reason: collision with root package name */
    public static long f158011l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11710x63f82843 f158012m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11710x63f82843();

    /* renamed from: n, reason: collision with root package name */
    public static long f158013n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static long f158014o = 0;

    public static void a(r45.a60 a60Var) {
        if (a60Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "reset commUseConfig");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_COMMON_USE_INFO_CONFIG_STRING, "");
            f158000a = 0;
            f158001b = 0;
            f158002c = 0;
            f158003d = "";
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            f158008i = bool;
            f158009j = -1L;
            f158010k = bool;
            f158011l = -1L;
            f158004e = "";
            f158005f = -1L;
            return;
        }
        f158000a = a60Var.f451290e;
        f158001b = a60Var.f451291f;
        f158002c = a60Var.f451293h;
        f158003d = a60Var.f451294i;
        f158008i = java.lang.Boolean.valueOf(a60Var.f451296n);
        f158010k = java.lang.Boolean.valueOf(a60Var.f451297o);
        f158011l = a60Var.f451298p;
        f158009j = a60Var.f451295m;
        f158004e = a60Var.f451299q;
        f158005f = a60Var.f451300r;
        g(a60Var);
        try {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_COMMON_USE_INFO_CONFIG_STRING, new java.lang.String(n56.a.b(a60Var.mo14344x5f01b1f6(), false)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "save commUseConfig");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandCommonUsedAppLogic", e17, "", new java.lang.Object[0]);
        }
    }

    public static r45.a60 b() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_COMMON_USE_INFO_CONFIG_STRING, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            return (r45.a60) new r45.a60().mo11468x92b714fd(n56.a.a(str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandCommonUsedAppLogic", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r45.ut4 c(android.content.Context r7) {
        /*
            r45.ut4 r7 = new r45.ut4
            r7.<init>()
            r45.ab7 r0 = new r45.ab7
            r0.<init>()
            r7.f469174d = r0
            boolean r0 = e()
            java.lang.String r1 = "MicroMsg.AppBrandCommonUsedAppLogic"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L1d
            java.lang.String r0 = "canGetWifiInfo ban taskbar get ssid"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
        L1b:
            r0 = r2
            goto L61
        L1d:
            boolean r0 = c01.e2.a0()
            if (r0 == 0) goto L29
            java.lang.String r0 = "is wechat user, not to request location"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            goto L1b
        L29:
            java.lang.Class<tb0.j> r0 = tb0.j.class
            i95.m r0 = i95.n0.c(r0)
            tb0.j r0 = (tb0.j) r0
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            sb0.f r0 = (sb0.f) r0
            r0.getClass()
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = j35.u.d(r4, r0, r2)
            if (r0 != 0) goto L46
            java.lang.String r0 = "ACCESS_FINE_LOCATION permission not grant"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            goto L1b
        L46:
            java.lang.Class<d85.m0> r0 = d85.m0.class
            i95.m r0 = i95.n0.c(r0)
            d85.m0 r0 = (d85.m0) r0
            d85.g0 r4 = d85.g0.LOCAION
            d85.f0 r5 = d85.f0.B
            d85.d1 r0 = (d85.d1) r0
            boolean r0 = r0.Ri(r4, r5)
            if (r0 != 0) goto L60
            java.lang.String r0 = "location permission not grant from SettingPermissionView for WIFI_INFO"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            goto L1b
        L60:
            r0 = r3
        L61:
            if (r0 != 0) goto L69
            java.lang.String r0 = "canGetWifiInfo fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
            return r7
        L69:
            com.tencent.mm.sdk.platformtools.i0 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a     // Catch: java.lang.Exception -> Lc9
            java.lang.String r4 = r0.f(r2)     // Catch: java.lang.Exception -> Lc9
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a     // Catch: java.lang.Exception -> Lc9
            java.lang.String r5 = ""
            if (r4 != 0) goto L76
            r4 = r5
        L76:
            java.lang.String r0 = r0.j(r2)     // Catch: java.lang.Exception -> Lc9
            if (r0 != 0) goto L7d
            goto L7e
        L7d:
            r5 = r0
        L7e:
            r45.ab7 r0 = r7.f469174d     // Catch: java.lang.Exception -> Lc9
            java.lang.String r6 = kk.r.b(r4)     // Catch: java.lang.Exception -> Lc9
            r0.f451439e = r6     // Catch: java.lang.Exception -> Lc9
            int r0 = r5.length()     // Catch: java.lang.Exception -> Lc9
            if (r0 <= r3) goto La8
            char r0 = r5.charAt(r2)     // Catch: java.lang.Exception -> Lc9
            r6 = 34
            if (r0 != r6) goto La8
            int r0 = r5.length()     // Catch: java.lang.Exception -> Lc9
            int r0 = r0 - r3
            char r0 = r5.charAt(r0)     // Catch: java.lang.Exception -> Lc9
            if (r0 != r6) goto La8
            int r0 = r5.length()     // Catch: java.lang.Exception -> Lc9
            int r0 = r0 - r3
            java.lang.String r5 = r5.substring(r3, r0)     // Catch: java.lang.Exception -> Lc9
        La8:
            r45.ab7 r0 = r7.f469174d     // Catch: java.lang.Exception -> Lc9
            java.lang.String r6 = kk.r.b(r5)     // Catch: java.lang.Exception -> Lc9
            r0.f451438d = r6     // Catch: java.lang.Exception -> Lc9
            java.lang.String r0 = "getNetworkInfo bssid:%s, ssid:%s， bssid_hash：%s, ssid_hash:%s"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lc9
            r6[r2] = r4     // Catch: java.lang.Exception -> Lc9
            r6[r3] = r5     // Catch: java.lang.Exception -> Lc9
            r45.ab7 r2 = r7.f469174d     // Catch: java.lang.Exception -> Lc9
            java.lang.String r3 = r2.f451439e     // Catch: java.lang.Exception -> Lc9
            r4 = 2
            r6[r4] = r3     // Catch: java.lang.Exception -> Lc9
            java.lang.String r2 = r2.f451438d     // Catch: java.lang.Exception -> Lc9
            r3 = 3
            r6[r3] = r2     // Catch: java.lang.Exception -> Lc9
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0, r6)     // Catch: java.lang.Exception -> Lc9
            goto Ldf
        Lc9:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getNetworkInfo Exception: "
            r2.<init>(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
        Ldf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.c(android.content.Context):r45.ut4");
    }

    public static boolean d() {
        java.lang.Boolean bool = f158010k;
        if (bool != null) {
            return bool.booleanValue();
        }
        r45.a60 b17 = b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(b17 != null && b17.f451297o);
        f158010k = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean e() {
        java.lang.Boolean bool = f158008i;
        if (bool != null) {
            return bool.booleanValue();
        }
        r45.a60 b17 = b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(b17 != null && b17.f451296n);
        f158008i = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean f() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_comm_use_new, 0) == 1;
    }

    public static void g(r45.a60 a60Var) {
        if (a60Var == null) {
            return;
        }
        java.util.LinkedList linkedList = a60Var.f451289d;
        java.lang.String str = "";
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.fn5 fn5Var = (r45.fn5) it.next();
                str = str + "refer_id:" + fn5Var.f456000d + "  zh_cn:" + fn5Var.f456001e + ", ";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "printCommUseConfig refer_info size:%d", java.lang.Integer.valueOf(linkedList.size()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "printCommUseConfig commUseConfig show_type：%d, history_show_type:%d, no_response_ms_when_refresh:%d, refresh_immediately:%b, commonUsedNextReqExtraData:%s, updateLoadingWaitMs:%d, report_ssid:%b, report_location:%b, get_location_wait_ms:%d, next_req_interval_s:%d, overview_extra_data:%s, out:%s", java.lang.Integer.valueOf(a60Var.f451290e), java.lang.Integer.valueOf(a60Var.f451291f), java.lang.Integer.valueOf(a60Var.f451293h), java.lang.Boolean.valueOf(a60Var.f451292g), a60Var.f451294i, java.lang.Integer.valueOf(a60Var.f451295m), java.lang.Boolean.valueOf(a60Var.f451296n), java.lang.Boolean.valueOf(a60Var.f451297o), java.lang.Integer.valueOf(a60Var.f451298p), java.lang.Integer.valueOf(a60Var.f451300r), a60Var.f451299q, str);
    }
}
