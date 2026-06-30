package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class p4 implements gp1.y {

    /* renamed from: d, reason: collision with root package name */
    public static java.util.List f174726d = new java.util.Vector();

    /* renamed from: e, reason: collision with root package name */
    public static int f174727e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f174728f;

    /* renamed from: g, reason: collision with root package name */
    public static int f174729g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f174730h;

    /* renamed from: i, reason: collision with root package name */
    public static int f174731i;

    /* renamed from: m, reason: collision with root package name */
    public static int f174732m;

    /* renamed from: n, reason: collision with root package name */
    public static int f174733n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f174734o;

    /* renamed from: p, reason: collision with root package name */
    public static int f174735p;

    /* renamed from: q, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4 f174736q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f174737r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f174738s;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.Boolean f174739t;

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.Boolean f174740u;

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.String f174741v;

    static {
        int i17 = qp1.c0.f447246v;
        f174728f = i17;
        f174729g = 0;
        f174730h = false;
        f174731i = 0;
        f174732m = i17;
        f174733n = -1;
        f174734o = false;
        f174735p = 1;
        f174737r = new java.util.concurrent.ConcurrentHashMap();
        f174738s = new java.util.concurrent.ConcurrentHashMap();
        f174739t = null;
        f174740u = null;
        f174741v = null;
    }

    public p4() {
        java.lang.String t17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c17;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallStorage", "initFloatBallStorage account not ready");
            return;
        }
        synchronized (this) {
            try {
                java.lang.String[] b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).b();
                int length = b17 != null ? b17.length : 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "printExistedKeyValues, size:%s", java.lang.Integer.valueOf(length));
                for (int i17 = 0; i17 < length; i17++) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "printExistedKeyValues, key:%s", b17[i17]);
                }
                f174727e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).o("pos_x", 0);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d());
                int i18 = qp1.c0.f447246v;
                f174728f = M.o("pos_y", i18);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).o("anim_pos_x", f174727e);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).o("anim_pos_y", f174728f);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).contains("dock_left")) {
                    f174730h = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).i("dock_left", false);
                } else {
                    f174730h = f174727e < i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) / 2;
                }
                f174729g = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).o("collapse_state", 0);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).o("ball_width", 0);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).o("ball_height", 0);
                f174731i = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).o("content_pos_x", 0);
                f174732m = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).o("content_pos_y", i18);
                f174735p = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).o("content_collapse_state", 0);
                f174734o = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).i("content_dock_left", false);
                f174733n = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).o("content_percent_y", -1);
                t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).t("balls");
            } catch (java.lang.Throwable th6) {
                f174727e = 0;
                f174728f = qp1.c0.f447246v;
                f174730h = false;
                f174726d = new java.util.Vector();
                f174729g = 0;
                f174731i = f174727e;
                f174732m = f174728f;
                f174734o = true;
                f174735p = 1;
                f174733n = -1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallStorage", th6, "load fail, error:%s", th6);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t17)) {
                f174726d = new java.util.Vector();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "load, ballPosition:[%s, %s], ballInfoList is empty", java.lang.Integer.valueOf(f174727e), java.lang.Integer.valueOf(f174728f));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "load, savedBalls:%s, isTeenMode: %s, collapseState: %d, sBallDockLeft: %s, sContentBallDockLeft: %s", t17, java.lang.Boolean.valueOf(((se0.e) ((te0.e) i95.n0.c(te0.e.class))).m164332x74219ae7()), java.lang.Integer.valueOf(f174729g), java.lang.Boolean.valueOf(f174730h), java.lang.Boolean.valueOf(f174734o));
                try {
                    f174726d = new java.util.Vector();
                    org.json.JSONArray jSONArray = new org.json.JSONArray(t17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = null;
                    if (jSONArray.length() > 0) {
                        for (int i19 = 0; i19 < jSONArray.length(); i19++) {
                            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i19);
                            if (optJSONObject != null && (c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.c(optJSONObject)) != null) {
                                if (c17.I) {
                                    android.os.Bundle bundle = c17.G;
                                    if (!(bundle == null ? false : bundle.getBoolean("key_state_float_ball_need_persist")) || !com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0().O()) {
                                        j(c17);
                                    } else if (!c17.f174578J) {
                                        c17.f174587o.f174602d = false;
                                        f174726d.add(c17);
                                    }
                                } else if (!qp1.w.r(c17)) {
                                    c17.f174578J = false;
                                    c17.H = 0;
                                    f174726d.add(c17);
                                } else if (!c17.f174578J) {
                                    f174726d.add(c17);
                                }
                                if (c17.f174579d == 20) {
                                    c12886x91aa2b6d = c17;
                                }
                            }
                        }
                    }
                    boolean isEmpty = f174726d.isEmpty();
                    if (c12886x91aa2b6d != null && c12886x91aa2b6d.f174579d == 20) {
                        ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.q4(this, c12886x91aa2b6d, isEmpty));
                    }
                    b();
                    java.lang.String str = "float_ball_permission";
                    if (gm0.j1.a()) {
                        str = c("float_ball_permission");
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str).clear();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "load, ballPosition:[%s, %s], ballInfoList:%s", java.lang.Integer.valueOf(f174727e), java.lang.Integer.valueOf(f174728f), f174726d);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallStorage", e17, "load fail, exception:%s", e17);
                }
            }
        }
        if (i95.n0.c(d73.i.class) != null) {
            ((d73.i) i95.n0.c(d73.i.class)).i9(f174726d);
        }
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4 f() {
        if (f174736q == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.class) {
                if (f174736q == null) {
                    f174736q = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4();
                }
            }
        }
        return f174736q;
    }

    @Override // gp1.y
    public void X(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        f174726d = list;
        synchronized (this) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            try {
                if (qp1.w.a(f174726d)) {
                    int i17 = 0;
                    for (int i18 = 0; i18 < f174726d.size(); i18++) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) f174726d.get(i18);
                        org.json.JSONObject a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.a(c12886x91aa2b6d2);
                        if (a17 != null) {
                            int i19 = i17 + 1;
                            jSONArray.put(i17, a17);
                            k(c12886x91aa2b6d2, a17);
                            i17 = i19;
                        }
                    }
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallStorage", e17, "saveBallInfoList fail, exception:%s", e17);
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).D("balls", jSONArray2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "saveBallInfoList, savedBalls:%s", jSONArray2);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).A("ActiveCount", qp1.w.m(f174726d));
        }
    }

    public final void a(boolean z17) {
        if (i()) {
            return;
        }
        if (f174740u == null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(h()).i("content_menu_all_not_show", false));
            f174740u = valueOf;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "checkBallMenuDataInit, sContentMenuNewAllNotShow: %s", valueOf);
        }
        if (f174739t == null || z17) {
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(h()).i("content_menu_clicked", false));
            f174739t = valueOf2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "checkBallMenuDataInit, sContentMenuClicked: %s", valueOf2);
        }
    }

    public final void b() {
        boolean z17;
        java.lang.String[] b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).b();
        int length = b17 != null ? b17.length : 0;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String key = b17[i17];
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "pos_x") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "pos_y") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "balls") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "ActiveCount") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "dock_left") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "req_perm_cnt") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "content_pos_x") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "content_pos_y") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "content_dock_left") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "content_collapse_state") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "content_percent_y") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "content_menu_clicked") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, "content_menu_all_not_show") && ((key == null || !key.startsWith("content_menu_can_show_count_")) && (key == null || !key.startsWith("content_edu_")))) {
                java.util.Iterator it = f174726d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(key, ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next()).e())) {
                            z17 = true;
                            break;
                        }
                    } else {
                        z17 = false;
                        break;
                    }
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "fixExistedKeyValues, key:%s", key);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).remove(key);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.g.f174694a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                    java.lang.String a17 = gVar.a(key);
                    if (com.p314xaae8f345.mm.vfs.w6.j(a17)) {
                        com.p314xaae8f345.mm.vfs.w6.h(a17);
                    }
                }
            }
        }
    }

    public final java.lang.String c(java.lang.String str) {
        if (!gm0.j1.a()) {
            return str;
        }
        return gm0.j1.b().j() + "#" + str;
    }

    public final java.lang.String d() {
        return !gm0.j1.a() ? "float_ball_storage" : c("float_ball_storage");
    }

    public final java.lang.String e(pv.b0 b0Var) {
        return "content_menu_can_show_count_" + b0Var.f440019d;
    }

    public final int g(pv.b0 b0Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f174738s;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(java.lang.Integer.valueOf(b0Var.f440019d));
        if (num != null) {
            return num.intValue();
        }
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(h()).getInt(e(b0Var), 1);
        concurrentHashMap.put(java.lang.Integer.valueOf(b0Var.f440019d), java.lang.Integer.valueOf(i17));
        return i17;
    }

    public final java.lang.String h() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return d();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f174741v)) {
            f174741v = new kk.v(gm0.m.i()).m143587x9616526c();
        }
        return f174741v + "#float_ball_storage";
    }

    public final boolean i() {
        java.lang.Boolean bool = f174740u;
        return bool != null && bool.booleanValue();
    }

    public synchronized void j(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", ">>>>>> removeBallInfo, dataKey:%s <<<<<<", c12886x91aa2b6d.e());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).remove(c12886x91aa2b6d.e());
        }
    }

    public synchronized void k(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, org.json.JSONObject jSONObject) {
        if (c12886x91aa2b6d != null) {
            if (jSONObject != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", ">>>>>> saveBallInfo, dataKey:%s <<<<<<", c12886x91aa2b6d.e());
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).D(c12886x91aa2b6d.e(), jSONObject.toString());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", ">>>>>> saveBallInfo, clear value, dataKey:%s <<<<<<", c12886x91aa2b6d.e());
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d()).D(c12886x91aa2b6d.e(), "");
            }
        }
    }

    public final void l(java.lang.String str) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.r4.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12900x642779d());
    }
}
