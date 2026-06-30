package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes12.dex */
public class n5 implements z85.e {

    /* renamed from: u, reason: collision with root package name */
    public static final bm5.p1 f276695u;

    /* renamed from: c, reason: collision with root package name */
    public z85.l f276698c;

    /* renamed from: d, reason: collision with root package name */
    public z85.d f276699d;

    /* renamed from: e, reason: collision with root package name */
    public z85.k f276700e;

    /* renamed from: f, reason: collision with root package name */
    public z85.x f276701f;

    /* renamed from: g, reason: collision with root package name */
    public z85.z f276702g;

    /* renamed from: h, reason: collision with root package name */
    public z85.t f276703h;

    /* renamed from: i, reason: collision with root package name */
    public z85.v f276704i;

    /* renamed from: j, reason: collision with root package name */
    public z85.r f276705j;

    /* renamed from: k, reason: collision with root package name */
    public z85.b0 f276706k;

    /* renamed from: l, reason: collision with root package name */
    public z85.d0 f276707l;

    /* renamed from: m, reason: collision with root package name */
    public z85.p f276708m;

    /* renamed from: n, reason: collision with root package name */
    public z85.f0 f276709n;

    /* renamed from: o, reason: collision with root package name */
    public z85.b f276710o;

    /* renamed from: p, reason: collision with root package name */
    public z85.n f276711p;

    /* renamed from: q, reason: collision with root package name */
    public z85.h f276712q;

    /* renamed from: r, reason: collision with root package name */
    public gr.t f276713r;

    /* renamed from: a, reason: collision with root package name */
    public final boolean[] f276696a = {false};

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f276697b = {false};

    /* renamed from: s, reason: collision with root package name */
    public final l75.q0 f276714s = new com.p314xaae8f345.mm.p2621x8fb0427b.k5(this);

    /* renamed from: t, reason: collision with root package name */
    public final l75.q0 f276715t = new com.p314xaae8f345.mm.p2621x8fb0427b.l5(this);

    static {
        new java.util.ArrayList();
        new java.util.HashMap();
        f276695u = new com.p314xaae8f345.mm.p2621x8fb0427b.m5();
    }

    public n5(com.p314xaae8f345.mm.p2621x8fb0427b.k5 k5Var) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStorageMgr", "EmojiStorageMgr: %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.n5 f() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n5 n5Var = (com.p314xaae8f345.mm.p2621x8fb0427b.n5) f276695u.b();
        boolean[] zArr = n5Var.f276696a;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!n5Var.f276696a[0]) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStorageMgr", "initStorage: ");
                    boolean z17 = gm0.j1.u().f354686f != null && gm0.j1.u().f354686f.mo123783xb9a70294();
                    if (!z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStorageMgr", "initStorage: db close %s", gm0.j1.u().f354686f);
                    }
                    n5Var.f276698c = new z85.l(gm0.j1.u().f354686f);
                    z85.d dVar = new z85.d(gm0.j1.u().f354686f);
                    n5Var.f276699d = dVar;
                    dVar.f552322e = n5Var;
                    n5Var.f276700e = new z85.k(gm0.j1.u().f354686f);
                    n5Var.f276703h = new z85.t(gm0.j1.u().f354686f);
                    n5Var.f276704i = new z85.v(gm0.j1.u().f354686f);
                    n5Var.f276705j = new z85.r(gm0.j1.u().f354686f);
                    n5Var.f276701f = new z85.x(gm0.j1.u().f354686f);
                    n5Var.f276702g = new z85.z(gm0.j1.u().f354686f);
                    n5Var.f276706k = new z85.b0(gm0.j1.u().f354686f);
                    n5Var.f276707l = new z85.d0(gm0.j1.u().f354686f);
                    n5Var.f276708m = new z85.p(gm0.j1.u().f354686f);
                    n5Var.f276709n = new z85.f0();
                    n5Var.f276710o = new z85.b(gm0.j1.u().f354686f);
                    n5Var.f276711p = new z85.n(gm0.j1.u().f354686f);
                    n5Var.f276712q = new z85.h(gm0.j1.u().f354686f);
                    n5Var.f276713r = gr.t.g();
                    if (z17) {
                        n5Var.f276696a[0] = true;
                    }
                }
            }
        }
        boolean[] zArr2 = n5Var.f276697b;
        if (!zArr2[0]) {
            synchronized (zArr2) {
                if (!n5Var.f276697b[0]) {
                    if (gm0.j1.a()) {
                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        if (context != null) {
                            boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().l(274480, java.lang.Boolean.TRUE)).booleanValue();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStorageMgr", "[oneliang]initCore,need init emoji:%s", java.lang.String.valueOf(booleanValue));
                            if (booleanValue) {
                                n5Var.c().X1(context);
                                n5Var.b().n1(context);
                            }
                            gm0.j1.u().c().w(274480, java.lang.Boolean.FALSE);
                        }
                        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_CUREENT_VERSION_INT;
                        if (((java.lang.Integer) c17.m(u3Var, 0)).intValue() != o45.wf.f424562g) {
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            n5Var.b().u1();
                            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(o45.wf.f424562g));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStorageMgr", "recoverCustomEmojiGroup use time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                        }
                        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
                        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_UPDATE_EMOJI_GROUP_COUNT_BOOLEAN;
                        if (((java.lang.Boolean) c18.m(u3Var2, java.lang.Boolean.TRUE)).booleanValue()) {
                            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                            gm0.j1.u().c().x(u3Var2, java.lang.Boolean.valueOf(!n5Var.b().K1()));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStorageMgr", "updateEmojiGroupCount use time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
                        }
                        n5Var.f276697b[0] = true;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiStorageMgr", "Not login, skip rest logic this time.");
                    }
                }
            }
        }
        return n5Var;
    }

    public z85.k a() {
        z85.k kVar;
        synchronized (this.f276696a) {
            kVar = this.f276700e;
        }
        return kVar;
    }

    public z85.d b() {
        z85.d dVar;
        synchronized (this.f276696a) {
            dVar = this.f276699d;
        }
        return dVar;
    }

    public z85.l c() {
        z85.l lVar;
        synchronized (this.f276696a) {
            lVar = this.f276698c;
        }
        return lVar;
    }

    public z85.t d() {
        z85.t tVar;
        synchronized (this.f276696a) {
            tVar = this.f276703h;
        }
        return tVar;
    }

    public z85.x e() {
        z85.x xVar;
        synchronized (this.f276696a) {
            xVar = this.f276701f;
        }
        return xVar;
    }

    public void g(java.lang.String str) {
        boolean z17 = false;
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals("event_update_group");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equalsIgnoreCase("productID")) {
            z17 = true;
        }
        if (z18) {
            if (!gm0.j1.b().m()) {
                return;
            }
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).getClass();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Bi().g();
        }
        if (z18 || z17) {
            this.f276713r.o(true);
        }
    }
}
