package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class p4 implements gp1.y {

    /* renamed from: d, reason: collision with root package name */
    public static java.util.List f93193d = new java.util.Vector();

    /* renamed from: e, reason: collision with root package name */
    public static int f93194e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f93195f;

    /* renamed from: g, reason: collision with root package name */
    public static int f93196g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f93197h;

    /* renamed from: i, reason: collision with root package name */
    public static int f93198i;

    /* renamed from: m, reason: collision with root package name */
    public static int f93199m;

    /* renamed from: n, reason: collision with root package name */
    public static int f93200n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f93201o;

    /* renamed from: p, reason: collision with root package name */
    public static int f93202p;

    /* renamed from: q, reason: collision with root package name */
    public static com.tencent.mm.plugin.ball.service.p4 f93203q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f93204r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f93205s;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.Boolean f93206t;

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.Boolean f93207u;

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.String f93208v;

    static {
        int i17 = qp1.c0.f365713v;
        f93195f = i17;
        f93196g = 0;
        f93197h = false;
        f93198i = 0;
        f93199m = i17;
        f93200n = -1;
        f93201o = false;
        f93202p = 1;
        f93204r = new java.util.concurrent.ConcurrentHashMap();
        f93205s = new java.util.concurrent.ConcurrentHashMap();
        f93206t = null;
        f93207u = null;
        f93208v = null;
    }

    public p4() {
        java.lang.String t17;
        com.tencent.mm.plugin.ball.model.BallInfo c17;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallStorage", "initFloatBallStorage account not ready");
            return;
        }
        synchronized (this) {
            try {
                java.lang.String[] b17 = com.tencent.mm.sdk.platformtools.o4.M(d()).b();
                int length = b17 != null ? b17.length : 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "printExistedKeyValues, size:%s", java.lang.Integer.valueOf(length));
                for (int i17 = 0; i17 < length; i17++) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "printExistedKeyValues, key:%s", b17[i17]);
                }
                f93194e = com.tencent.mm.sdk.platformtools.o4.M(d()).o("pos_x", 0);
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(d());
                int i18 = qp1.c0.f365713v;
                f93195f = M.o("pos_y", i18);
                com.tencent.mm.sdk.platformtools.o4.M(d()).o("anim_pos_x", f93194e);
                com.tencent.mm.sdk.platformtools.o4.M(d()).o("anim_pos_y", f93195f);
                if (com.tencent.mm.sdk.platformtools.o4.M(d()).contains("dock_left")) {
                    f93197h = com.tencent.mm.sdk.platformtools.o4.M(d()).i("dock_left", false);
                } else {
                    f93197h = f93194e < i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a) / 2;
                }
                f93196g = com.tencent.mm.sdk.platformtools.o4.M(d()).o("collapse_state", 0);
                com.tencent.mm.sdk.platformtools.o4.M(d()).o("ball_width", 0);
                com.tencent.mm.sdk.platformtools.o4.M(d()).o("ball_height", 0);
                f93198i = com.tencent.mm.sdk.platformtools.o4.M(d()).o("content_pos_x", 0);
                f93199m = com.tencent.mm.sdk.platformtools.o4.M(d()).o("content_pos_y", i18);
                f93202p = com.tencent.mm.sdk.platformtools.o4.M(d()).o("content_collapse_state", 0);
                f93201o = com.tencent.mm.sdk.platformtools.o4.M(d()).i("content_dock_left", false);
                f93200n = com.tencent.mm.sdk.platformtools.o4.M(d()).o("content_percent_y", -1);
                t17 = com.tencent.mm.sdk.platformtools.o4.M(d()).t("balls");
            } catch (java.lang.Throwable th6) {
                f93194e = 0;
                f93195f = qp1.c0.f365713v;
                f93197h = false;
                f93193d = new java.util.Vector();
                f93196g = 0;
                f93198i = f93194e;
                f93199m = f93195f;
                f93201o = true;
                f93202p = 1;
                f93200n = -1;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallStorage", th6, "load fail, error:%s", th6);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(t17)) {
                f93193d = new java.util.Vector();
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "load, ballPosition:[%s, %s], ballInfoList is empty", java.lang.Integer.valueOf(f93194e), java.lang.Integer.valueOf(f93195f));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "load, savedBalls:%s, isTeenMode: %s, collapseState: %d, sBallDockLeft: %s, sContentBallDockLeft: %s", t17, java.lang.Boolean.valueOf(((se0.e) ((te0.e) i95.n0.c(te0.e.class))).isTeenMode()), java.lang.Integer.valueOf(f93196g), java.lang.Boolean.valueOf(f93197h), java.lang.Boolean.valueOf(f93201o));
                try {
                    f93193d = new java.util.Vector();
                    org.json.JSONArray jSONArray = new org.json.JSONArray(t17);
                    com.tencent.mm.plugin.ball.model.BallInfo ballInfo = null;
                    if (jSONArray.length() > 0) {
                        for (int i19 = 0; i19 < jSONArray.length(); i19++) {
                            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i19);
                            if (optJSONObject != null && (c17 = com.tencent.mm.plugin.ball.model.BallInfo.c(optJSONObject)) != null) {
                                if (c17.I) {
                                    android.os.Bundle bundle = c17.G;
                                    if (!(bundle == null ? false : bundle.getBoolean("key_state_float_ball_need_persist")) || !com.tencent.mm.plugin.ball.service.s.H0().O()) {
                                        j(c17);
                                    } else if (!c17.f93045J) {
                                        c17.f93054o.f93069d = false;
                                        f93193d.add(c17);
                                    }
                                } else if (!qp1.w.r(c17)) {
                                    c17.f93045J = false;
                                    c17.H = 0;
                                    f93193d.add(c17);
                                } else if (!c17.f93045J) {
                                    f93193d.add(c17);
                                }
                                if (c17.f93046d == 20) {
                                    ballInfo = c17;
                                }
                            }
                        }
                    }
                    boolean isEmpty = f93193d.isEmpty();
                    if (ballInfo != null && ballInfo.f93046d == 20) {
                        ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.ball.service.q4(this, ballInfo, isEmpty));
                    }
                    b();
                    java.lang.String str = "float_ball_permission";
                    if (gm0.j1.a()) {
                        str = c("float_ball_permission");
                    }
                    com.tencent.mm.sdk.platformtools.o4.M(str).clear();
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "load, ballPosition:[%s, %s], ballInfoList:%s", java.lang.Integer.valueOf(f93194e), java.lang.Integer.valueOf(f93195f), f93193d);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallStorage", e17, "load fail, exception:%s", e17);
                }
            }
        }
        if (i95.n0.c(d73.i.class) != null) {
            ((d73.i) i95.n0.c(d73.i.class)).i9(f93193d);
        }
    }

    public static com.tencent.mm.plugin.ball.service.p4 f() {
        if (f93203q == null) {
            synchronized (com.tencent.mm.plugin.ball.service.p4.class) {
                if (f93203q == null) {
                    f93203q = new com.tencent.mm.plugin.ball.service.p4();
                }
            }
        }
        return f93203q;
    }

    @Override // gp1.y
    public void X(java.util.List list, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        f93193d = list;
        synchronized (this) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            try {
                if (qp1.w.a(f93193d)) {
                    int i17 = 0;
                    for (int i18 = 0; i18 < f93193d.size(); i18++) {
                        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = (com.tencent.mm.plugin.ball.model.BallInfo) f93193d.get(i18);
                        org.json.JSONObject a17 = com.tencent.mm.plugin.ball.model.BallInfo.a(ballInfo2);
                        if (a17 != null) {
                            int i19 = i17 + 1;
                            jSONArray.put(i17, a17);
                            k(ballInfo2, a17);
                            i17 = i19;
                        }
                    }
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallStorage", e17, "saveBallInfoList fail, exception:%s", e17);
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            com.tencent.mm.sdk.platformtools.o4.M(d()).D("balls", jSONArray2);
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "saveBallInfoList, savedBalls:%s", jSONArray2);
            com.tencent.mm.sdk.platformtools.o4.M(d()).A("ActiveCount", qp1.w.m(f93193d));
        }
    }

    public final void a(boolean z17) {
        if (i()) {
            return;
        }
        if (f93207u == null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.o4.M(h()).i("content_menu_all_not_show", false));
            f93207u = valueOf;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "checkBallMenuDataInit, sContentMenuNewAllNotShow: %s", valueOf);
        }
        if (f93206t == null || z17) {
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.o4.M(h()).i("content_menu_clicked", false));
            f93206t = valueOf2;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "checkBallMenuDataInit, sContentMenuClicked: %s", valueOf2);
        }
    }

    public final void b() {
        boolean z17;
        java.lang.String[] b17 = com.tencent.mm.sdk.platformtools.o4.M(d()).b();
        int length = b17 != null ? b17.length : 0;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String key = b17[i17];
            if (!com.tencent.mm.sdk.platformtools.t8.D0(key, "pos_x") && !com.tencent.mm.sdk.platformtools.t8.D0(key, "pos_y") && !com.tencent.mm.sdk.platformtools.t8.D0(key, "balls") && !com.tencent.mm.sdk.platformtools.t8.D0(key, "ActiveCount") && !com.tencent.mm.sdk.platformtools.t8.D0(key, "dock_left") && !com.tencent.mm.sdk.platformtools.t8.D0(key, "req_perm_cnt") && !com.tencent.mm.sdk.platformtools.t8.D0(key, "content_pos_x") && !com.tencent.mm.sdk.platformtools.t8.D0(key, "content_pos_y") && !com.tencent.mm.sdk.platformtools.t8.D0(key, "content_dock_left") && !com.tencent.mm.sdk.platformtools.t8.D0(key, "content_collapse_state") && !com.tencent.mm.sdk.platformtools.t8.D0(key, "content_percent_y") && !com.tencent.mm.sdk.platformtools.t8.D0(key, "content_menu_clicked") && !com.tencent.mm.sdk.platformtools.t8.D0(key, "content_menu_all_not_show") && ((key == null || !key.startsWith("content_menu_can_show_count_")) && (key == null || !key.startsWith("content_edu_")))) {
                java.util.Iterator it = f93193d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (com.tencent.mm.sdk.platformtools.t8.D0(key, ((com.tencent.mm.plugin.ball.model.BallInfo) it.next()).e())) {
                            z17 = true;
                            break;
                        }
                    } else {
                        z17 = false;
                        break;
                    }
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "fixExistedKeyValues, key:%s", key);
                    com.tencent.mm.sdk.platformtools.o4.M(d()).remove(key);
                    com.tencent.mm.plugin.ball.service.g gVar = com.tencent.mm.plugin.ball.service.g.f93161a;
                    kotlin.jvm.internal.o.g(key, "key");
                    java.lang.String a17 = gVar.a(key);
                    if (com.tencent.mm.vfs.w6.j(a17)) {
                        com.tencent.mm.vfs.w6.h(a17);
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
        return "content_menu_can_show_count_" + b0Var.f358486d;
    }

    public final int g(pv.b0 b0Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f93205s;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(java.lang.Integer.valueOf(b0Var.f358486d));
        if (num != null) {
            return num.intValue();
        }
        int i17 = com.tencent.mm.sdk.platformtools.o4.M(h()).getInt(e(b0Var), 1);
        concurrentHashMap.put(java.lang.Integer.valueOf(b0Var.f358486d), java.lang.Integer.valueOf(i17));
        return i17;
    }

    public final java.lang.String h() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return d();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(f93208v)) {
            f93208v = new kk.v(gm0.m.i()).toString();
        }
        return f93208v + "#float_ball_storage";
    }

    public final boolean i() {
        java.lang.Boolean bool = f93207u;
        return bool != null && bool.booleanValue();
    }

    public synchronized void j(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", ">>>>>> removeBallInfo, dataKey:%s <<<<<<", ballInfo.e());
            com.tencent.mm.sdk.platformtools.o4.M(d()).remove(ballInfo.e());
        }
    }

    public synchronized void k(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, org.json.JSONObject jSONObject) {
        if (ballInfo != null) {
            if (jSONObject != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", ">>>>>> saveBallInfo, dataKey:%s <<<<<<", ballInfo.e());
                com.tencent.mm.sdk.platformtools.o4.M(d()).D(ballInfo.e(), jSONObject.toString());
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", ">>>>>> saveBallInfo, clear value, dataKey:%s <<<<<<", ballInfo.e());
                com.tencent.mm.sdk.platformtools.o4.M(d()).D(ballInfo.e(), "");
            }
        }
    }

    public final void l(java.lang.String str) {
        com.tencent.mm.ipcinvoker.extension.l.a(str, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.r4.class, new com.tencent.mm.plugin.ball.service.p4$$a());
    }
}
