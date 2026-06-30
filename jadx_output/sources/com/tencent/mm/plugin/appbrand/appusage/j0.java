package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f76467a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f76468b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f76469c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f76470d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f76471e = "";

    /* renamed from: f, reason: collision with root package name */
    public static long f76472f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f76473g = false;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f76474h = false;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.Boolean f76475i = null;

    /* renamed from: j, reason: collision with root package name */
    public static long f76476j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Boolean f76477k = null;

    /* renamed from: l, reason: collision with root package name */
    public static long f76478l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appusage.AppBrandCommonUsedTransferData f76479m = new com.tencent.mm.plugin.appbrand.appusage.AppBrandCommonUsedTransferData();

    /* renamed from: n, reason: collision with root package name */
    public static long f76480n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static long f76481o = 0;

    public static void a(r45.a60 a60Var) {
        if (a60Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "reset commUseConfig");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_COMMON_USE_INFO_CONFIG_STRING, "");
            f76467a = 0;
            f76468b = 0;
            f76469c = 0;
            f76470d = "";
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            f76475i = bool;
            f76476j = -1L;
            f76477k = bool;
            f76478l = -1L;
            f76471e = "";
            f76472f = -1L;
            return;
        }
        f76467a = a60Var.f369757e;
        f76468b = a60Var.f369758f;
        f76469c = a60Var.f369760h;
        f76470d = a60Var.f369761i;
        f76475i = java.lang.Boolean.valueOf(a60Var.f369763n);
        f76477k = java.lang.Boolean.valueOf(a60Var.f369764o);
        f76478l = a60Var.f369765p;
        f76476j = a60Var.f369762m;
        f76471e = a60Var.f369766q;
        f76472f = a60Var.f369767r;
        g(a60Var);
        try {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_COMMON_USE_INFO_CONFIG_STRING, new java.lang.String(n56.a.b(a60Var.toByteArray(), false)));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "save commUseConfig");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandCommonUsedAppLogic", e17, "", new java.lang.Object[0]);
        }
    }

    public static r45.a60 b() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_COMMON_USE_INFO_CONFIG_STRING, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            return (r45.a60) new r45.a60().parseFrom(n56.a.a(str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandCommonUsedAppLogic", e17, "", new java.lang.Object[0]);
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
            r7.f387641d = r0
            boolean r0 = e()
            java.lang.String r1 = "MicroMsg.AppBrandCommonUsedAppLogic"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L1d
            java.lang.String r0 = "canGetWifiInfo ban taskbar get ssid"
            com.tencent.mars.xlog.Log.i(r1, r0)
        L1b:
            r0 = r2
            goto L61
        L1d:
            boolean r0 = c01.e2.a0()
            if (r0 == 0) goto L29
            java.lang.String r0 = "is wechat user, not to request location"
            com.tencent.mars.xlog.Log.i(r1, r0)
            goto L1b
        L29:
            java.lang.Class<tb0.j> r0 = tb0.j.class
            i95.m r0 = i95.n0.c(r0)
            tb0.j r0 = (tb0.j) r0
            android.content.Context r4 = com.tencent.mm.sdk.platformtools.x2.f193071a
            sb0.f r0 = (sb0.f) r0
            r0.getClass()
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = j35.u.d(r4, r0, r2)
            if (r0 != 0) goto L46
            java.lang.String r0 = "ACCESS_FINE_LOCATION permission not grant"
            com.tencent.mars.xlog.Log.i(r1, r0)
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
            com.tencent.mars.xlog.Log.i(r1, r0)
            goto L1b
        L60:
            r0 = r3
        L61:
            if (r0 != 0) goto L69
            java.lang.String r0 = "canGetWifiInfo fail"
            com.tencent.mars.xlog.Log.e(r1, r0)
            return r7
        L69:
            com.tencent.mm.sdk.platformtools.i0 r0 = com.tencent.mm.sdk.platformtools.v0.f193027a     // Catch: java.lang.Exception -> Lc9
            java.lang.String r4 = r0.f(r2)     // Catch: java.lang.Exception -> Lc9
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Exception -> Lc9
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
            r45.ab7 r0 = r7.f387641d     // Catch: java.lang.Exception -> Lc9
            java.lang.String r6 = kk.r.b(r4)     // Catch: java.lang.Exception -> Lc9
            r0.f369906e = r6     // Catch: java.lang.Exception -> Lc9
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
            r45.ab7 r0 = r7.f387641d     // Catch: java.lang.Exception -> Lc9
            java.lang.String r6 = kk.r.b(r5)     // Catch: java.lang.Exception -> Lc9
            r0.f369905d = r6     // Catch: java.lang.Exception -> Lc9
            java.lang.String r0 = "getNetworkInfo bssid:%s, ssid:%s， bssid_hash：%s, ssid_hash:%s"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lc9
            r6[r2] = r4     // Catch: java.lang.Exception -> Lc9
            r6[r3] = r5     // Catch: java.lang.Exception -> Lc9
            r45.ab7 r2 = r7.f387641d     // Catch: java.lang.Exception -> Lc9
            java.lang.String r3 = r2.f369906e     // Catch: java.lang.Exception -> Lc9
            r4 = 2
            r6[r4] = r3     // Catch: java.lang.Exception -> Lc9
            java.lang.String r2 = r2.f369905d     // Catch: java.lang.Exception -> Lc9
            r3 = 3
            r6[r3] = r2     // Catch: java.lang.Exception -> Lc9
            com.tencent.mars.xlog.Log.i(r1, r0, r6)     // Catch: java.lang.Exception -> Lc9
            goto Ldf
        Lc9:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getNetworkInfo Exception: "
            r2.<init>(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.mars.xlog.Log.e(r1, r0)
        Ldf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appusage.j0.c(android.content.Context):r45.ut4");
    }

    public static boolean d() {
        java.lang.Boolean bool = f76477k;
        if (bool != null) {
            return bool.booleanValue();
        }
        r45.a60 b17 = b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(b17 != null && b17.f369764o);
        f76477k = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean e() {
        java.lang.Boolean bool = f76475i;
        if (bool != null) {
            return bool.booleanValue();
        }
        r45.a60 b17 = b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(b17 != null && b17.f369763n);
        f76475i = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean f() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_comm_use_new, 0) == 1;
    }

    public static void g(r45.a60 a60Var) {
        if (a60Var == null) {
            return;
        }
        java.util.LinkedList linkedList = a60Var.f369756d;
        java.lang.String str = "";
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.fn5 fn5Var = (r45.fn5) it.next();
                str = str + "refer_id:" + fn5Var.f374467d + "  zh_cn:" + fn5Var.f374468e + ", ";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "printCommUseConfig refer_info size:%d", java.lang.Integer.valueOf(linkedList.size()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "printCommUseConfig commUseConfig show_type：%d, history_show_type:%d, no_response_ms_when_refresh:%d, refresh_immediately:%b, commonUsedNextReqExtraData:%s, updateLoadingWaitMs:%d, report_ssid:%b, report_location:%b, get_location_wait_ms:%d, next_req_interval_s:%d, overview_extra_data:%s, out:%s", java.lang.Integer.valueOf(a60Var.f369757e), java.lang.Integer.valueOf(a60Var.f369758f), java.lang.Integer.valueOf(a60Var.f369760h), java.lang.Boolean.valueOf(a60Var.f369759g), a60Var.f369761i, java.lang.Integer.valueOf(a60Var.f369762m), java.lang.Boolean.valueOf(a60Var.f369763n), java.lang.Boolean.valueOf(a60Var.f369764o), java.lang.Integer.valueOf(a60Var.f369765p), java.lang.Integer.valueOf(a60Var.f369767r), a60Var.f369766q, str);
    }
}
