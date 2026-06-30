package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.k2 f90749a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f90750b = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.v8_snapshot.k2.class, "APP_DEBUG_ENABLE", "getAPP_DEBUG_ENABLE()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.v8_snapshot.k2.class, "GAME_DEBUG_ENABLE", "getGAME_DEBUG_ENABLE()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.v8_snapshot.k2.class, "DISABLE_PRE_CONDITIONS_BLOCK", "getDISABLE_PRE_CONDITIONS_BLOCK()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.v8_snapshot.k2.class, "ENABLE_NOT_COMPRESS_LIB_SNAPSHOT", "getENABLE_NOT_COMPRESS_LIB_SNAPSHOT()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.v8_snapshot.k2.class, "KEEP_COMPILED_DATA_IN_SNAPSHOT", "getKEEP_COMPILED_DATA_IN_SNAPSHOT()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.v8_snapshot.k2.class, "NODE_DEBUG_ENABLE", "getNODE_DEBUG_ENABLE()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.v8_snapshot.k2.class, "NODE_APP_DEBUG_ENABLE", "getNODE_APP_DEBUG_ENABLE()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.v8_snapshot.k2.class, "NODE_GAME_DEBUG_ENABLE", "getNODE_GAME_DEBUG_ENABLE()Z", 0))};

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f90751c;

    /* renamed from: d, reason: collision with root package name */
    public static final nf.r f90752d;

    /* renamed from: e, reason: collision with root package name */
    public static final nf.r f90753e;

    /* renamed from: f, reason: collision with root package name */
    public static final nf.r f90754f;

    /* renamed from: g, reason: collision with root package name */
    public static final nf.r f90755g;

    /* renamed from: h, reason: collision with root package name */
    public static final nf.r f90756h;

    /* renamed from: i, reason: collision with root package name */
    public static final nf.r f90757i;

    /* renamed from: j, reason: collision with root package name */
    public static final nf.r f90758j;

    /* renamed from: k, reason: collision with root package name */
    public static final nf.r f90759k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f90760l;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f90761m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f90762n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f90763o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f90764p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f90765q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f90766r;

    static {
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2 k2Var = new com.tencent.mm.plugin.appbrand.v8_snapshot.k2();
        f90749a = k2Var;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f90751c = z65.c.a();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        f90752d = new nf.r(bool);
        f90753e = new nf.r(bool);
        f90754f = new nf.r(bool);
        f90755g = new nf.r(bool);
        f90756h = new nf.r(bool);
        f90757i = new nf.r(bool);
        f90758j = new nf.r(bool);
        f90759k = new nf.r(bool);
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        f90760l = com.tencent.mm.sdk.platformtools.a0.c() ? false : e0Var != null ? ((h62.d) e0Var).fj(e42.d0.clicfg_wxa_enable_comm_lib_v8_snapshot_app, k2Var.a()) : k2Var.a();
        f90761m = com.tencent.mm.sdk.platformtools.a0.c() ? false : e0Var != null ? ((h62.d) e0Var).fj(e42.d0.clicfg_wxa_enable_comm_lib_v8_snapshot_node_game, k2Var.d()) : k2Var.d();
        f90762n = 3;
        f90763o = 259200000L;
        f90764p = 3;
        f90765q = 6;
        f90766r = 10;
    }

    public final boolean a() {
        return ((java.lang.Boolean) f90752d.b(this, f90750b[0])).booleanValue();
    }

    public final boolean b() {
        return ((java.lang.Boolean) f90754f.b(this, f90750b[2])).booleanValue();
    }

    public final boolean c() {
        return ((java.lang.Boolean) f90755g.b(this, f90750b[3])).booleanValue();
    }

    public final boolean d() {
        return ((java.lang.Boolean) f90759k.b(this, f90750b[7])).booleanValue();
    }

    public final boolean e(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader commLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 category) {
        kotlin.jvm.internal.o.g(commLibReader, "commLibReader");
        kotlin.jvm.internal.o.g(category, "category");
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90771g != category) {
            if (com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90772h == category) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotConfig", "isEnable, ban by category");
            }
            return false;
        }
        if (!f90760l) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotConfig", "isEnable, ban by category");
            return false;
        }
        java.lang.String W0 = commLibReader.W0();
        kotlin.jvm.internal.o.f(W0, "versionName(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotConfig", "isEnable, libVersionName: ".concat(W0));
        return W0.compareTo("2.28.1") >= 0;
    }

    public final boolean f(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader commLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 category) {
        kotlin.jvm.internal.o.g(commLibReader, "commLibReader");
        kotlin.jvm.internal.o.g(category, "category");
        int ordinal = category.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return f90761m;
        }
        if (ordinal == 2) {
            return false;
        }
        throw new jz5.j();
    }
}
