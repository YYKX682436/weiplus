package com.tencent.mm.plugin.fav;

@j95.b
/* loaded from: classes12.dex */
public class o extends jm0.o implements o72.f5 {

    /* renamed from: m, reason: collision with root package name */
    public final o72.k4[] f100243m = {null};

    /* renamed from: n, reason: collision with root package name */
    public final o72.y3[] f100244n = {null};

    /* renamed from: o, reason: collision with root package name */
    public final o72.v4[] f100245o = {null};

    /* renamed from: p, reason: collision with root package name */
    public final o72.d4[] f100246p = {null};

    /* renamed from: q, reason: collision with root package name */
    public final o72.a4[] f100247q = {null};

    /* renamed from: r, reason: collision with root package name */
    public final o72.i3[] f100248r = {null};

    /* renamed from: s, reason: collision with root package name */
    public final o72.b4[] f100249s = {null};

    /* renamed from: t, reason: collision with root package name */
    public final a82.h2[] f100250t = {null};

    /* renamed from: u, reason: collision with root package name */
    public final a82.z0[] f100251u = {null};

    /* renamed from: v, reason: collision with root package name */
    public final a82.w0[] f100252v = {null};

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f100253w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f100254x;

    public o() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f100253w = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StartFavServiceEvent>(a0Var) { // from class: com.tencent.mm.plugin.fav.PluginFav$4
            {
                this.__eventId = 290524430;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StartFavServiceEvent startFavServiceEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.PluginFav", "runService");
                com.tencent.mm.plugin.fav.o oVar = com.tencent.mm.plugin.fav.o.this;
                oVar.aj();
                ((a82.o0) oVar.aj()).T6();
                if (!jm0.g.class.isAssignableFrom(a82.v.class)) {
                    throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
                }
                androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(oVar.getViewModel(), new jm0.e(oVar)).a(a82.v.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                ((a82.v) ((jm0.g) a17)).V6();
                if (oVar.Aj() != null) {
                    ((a82.h2) oVar.Aj()).b();
                }
                if (oVar.yj() != null) {
                    oVar.yj().b();
                }
                if (oVar.bj() == null) {
                    return false;
                }
                a82.w0 bj6 = oVar.bj();
                bj6.getClass();
                gm0.j1.e().j(new a82.t0(bj6));
                return false;
            }
        };
        this.f100254x = new com.tencent.mm.plugin.fav.n(this);
    }

    public o72.x4 Aj() {
        a82.h2[] h2VarArr = this.f100250t;
        if (h2VarArr[0] == null) {
            synchronized (h2VarArr) {
                a82.h2[] h2VarArr2 = this.f100250t;
                if (h2VarArr2[0] == null) {
                    h2VarArr2[0] = new a82.h2();
                }
            }
        }
        return this.f100250t[0];
    }

    public long Bj() {
        try {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitFavVideoSize");
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.PluginFav", "getVideoSizeLimit nullOrNil");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.PluginFav", "getVideoSizeLimit " + d17);
            }
            return com.tencent.mm.sdk.platformtools.t8.V(d17, 26214400L);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.PluginFav", th6, "getVideoSizeLimit", new java.lang.Object[0]);
            return 26214400L;
        }
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(a82.v.class);
        set.add(a82.t.class);
        set.add(a82.d0.class);
        set.add(a82.o0.class);
        set.add(a82.n0.class);
        set.add(t72.l.class);
        set.add(s72.j0.class);
        set.add(a82.s0.class);
        set.add(a82.l2.class);
        set.add(s72.p0.class);
    }

    @Override // jm0.o
    public void Ni(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.PluginFav", "init fav storage");
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d.b(-86016, new com.tencent.mm.plugin.fav.k(this));
        this.f100253w.alive();
        this.f100254x.alive();
        com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(o72.x1.C() + "/");
        if (!r6Var.m() || !r6Var.y()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.PluginFav", "fav root dir not exists, try to make it");
            r6Var.J();
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(o72.x1.I());
        if (!r6Var2.m() || !r6Var2.y()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.PluginFav", "fav web dir not exists, try to make it");
            r6Var2.J();
        }
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(o72.x1.D());
        if (!r6Var3.m() || !r6Var3.y()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.PluginFav", "fav attach dir not exists, try to make it");
            r6Var3.J();
        }
        com.tencent.mm.vfs.r6 r6Var4 = new com.tencent.mm.vfs.r6(o72.x1.C() + "/voice/");
        if (r6Var4.m() && r6Var4.y()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.PluginFav", "fav voice dir not exists, try to make it");
        r6Var4.J();
    }

    @Override // jm0.o
    public void Vi() {
        this.f100253w.dead();
        this.f100254x.dead();
        o72.j5.f343371m.set(0);
        com.tencent.mars.xlog.Log.isDebug();
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).vj(256);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).wj(6);
        synchronized (this.f100250t) {
            try {
                a82.h2 h2Var = this.f100250t[0];
                if (h2Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavSendService", "stop");
                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavSendService", "on finish");
                    ((java.util.LinkedList) h2Var.f2014g).clear();
                    ((java.util.HashMap) a82.h2.f2009i).clear();
                    h2Var.f2011d = false;
                    h2Var.f2013f = false;
                    h2Var.f2015h.d();
                    gm0.j1.d().q(401, h2Var);
                    this.f100250t[0] = null;
                }
            } finally {
            }
        }
        synchronized (this.f100251u) {
            try {
                a82.z0 z0Var = this.f100251u[0];
                if (z0Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavModService", "stop");
                    ((java.util.LinkedList) z0Var.f2251g).clear();
                    ((java.util.HashMap) a82.z0.f2246i).clear();
                    z0Var.f2248d = false;
                    z0Var.f2250f = false;
                    ((java.util.HashMap) a82.z0.f2247m).clear();
                    z0Var.f2252h.d();
                    gm0.j1.d().q(com.tencent.wxmm.v2helper.EMethodSetAgcRxOn, z0Var);
                    this.f100251u[0] = null;
                }
            } finally {
            }
        }
        synchronized (this.f100252v) {
            a82.w0 w0Var = this.f100252v[0];
            if (w0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavEditService", "stop");
                gm0.j1.d().q(com.tencent.wxmm.v2helper.EMethodSetAgcRxOn, w0Var);
                gm0.j1.d().q(401, w0Var);
                ((java.util.HashMap) w0Var.f2198d).clear();
                this.f100252v[0] = null;
            }
        }
        synchronized (this.f100243m) {
            o72.k4[] k4VarArr = this.f100243m;
            if (k4VarArr[0] != null) {
                k4VarArr[0] = null;
            }
        }
        synchronized (this.f100244n) {
            o72.y3[] y3VarArr = this.f100244n;
            if (y3VarArr[0] != null) {
                y3VarArr[0] = null;
            }
        }
        synchronized (this.f100245o) {
            o72.v4[] v4VarArr = this.f100245o;
            if (v4VarArr[0] != null) {
                v4VarArr[0] = null;
            }
        }
        synchronized (this.f100246p) {
            o72.d4[] d4VarArr = this.f100246p;
            if (d4VarArr[0] != null) {
                d4VarArr[0] = null;
            }
        }
        synchronized (this.f100247q) {
            o72.a4[] a4VarArr = this.f100247q;
            if (a4VarArr[0] != null) {
                a4VarArr[0] = null;
            }
        }
        synchronized (this.f100248r) {
            o72.i3[] i3VarArr = this.f100248r;
            if (i3VarArr[0] != null) {
                i3VarArr[0] = null;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.PluginFav", "release fav storage");
    }

    public void Zi(java.util.List list) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.l(this, new y72.a(list)));
    }

    public o72.z3 aj() {
        if (!jm0.g.class.isAssignableFrom(a82.o0.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        java.lang.Object a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(a82.o0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (o72.z3) ((jm0.g) a17);
    }

    public a82.w0 bj() {
        a82.w0[] w0VarArr = this.f100252v;
        if (w0VarArr[0] == null) {
            synchronized (w0VarArr) {
                a82.w0[] w0VarArr2 = this.f100252v;
                if (w0VarArr2[0] == null) {
                    w0VarArr2[0] = new a82.w0();
                }
            }
        }
        return this.f100252v[0];
    }

    public o72.w3 cj() {
        if (!jm0.g.class.isAssignableFrom(a82.v.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        java.lang.Object a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(a82.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (o72.w3) ((jm0.g) a17);
    }

    public o72.y3 fj() {
        o72.y3[] y3VarArr = this.f100244n;
        if (y3VarArr[0] == null) {
            synchronized (y3VarArr) {
                if (this.f100244n[0] == null) {
                    if (c82.e.d()) {
                        this.f100244n[0] = new z72.a(c82.e.f39668a.b());
                    } else {
                        this.f100244n[0] = new b82.a(c82.e.f39668a.a());
                    }
                }
            }
        }
        return this.f100244n[0];
    }

    public o72.a4 hj() {
        o72.a4[] a4VarArr = this.f100247q;
        if (a4VarArr[0] == null) {
            synchronized (a4VarArr) {
                if (this.f100247q[0] == null) {
                    if (c82.e.d()) {
                        this.f100247q[0] = new z72.b(c82.e.f39668a.b());
                    } else {
                        this.f100247q[0] = new b82.b(c82.e.f39668a.a());
                    }
                }
            }
        }
        return this.f100247q[0];
    }

    public o72.b4 ij() {
        o72.b4[] b4VarArr = this.f100249s;
        if (b4VarArr[0] == null) {
            synchronized (b4VarArr) {
                if (this.f100249s[0] == null) {
                    if (c82.e.d()) {
                        this.f100249s[0] = new p72.k();
                    } else {
                        this.f100249s[0] = new p72.e();
                    }
                }
            }
        }
        return this.f100249s[0];
    }

    public o72.c4 mj() {
        if (!jm0.g.class.isAssignableFrom(a82.s0.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        java.lang.Object a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(a82.s0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (o72.c4) ((jm0.g) a17);
    }

    public o72.d4 nj() {
        o72.d4[] d4VarArr = this.f100246p;
        if (d4VarArr[0] == null) {
            synchronized (d4VarArr) {
                if (this.f100246p[0] == null) {
                    if (c82.e.d()) {
                        this.f100246p[0] = new z72.e(c82.e.f39668a.b());
                    } else {
                        this.f100246p[0] = new b82.c(c82.e.f39668a.a());
                    }
                }
            }
        }
        return this.f100246p[0];
    }

    public o72.k4 oj() {
        o72.k4[] k4VarArr = this.f100243m;
        if (k4VarArr[0] == null) {
            synchronized (k4VarArr) {
                if (this.f100243m[0] == null) {
                    if (c82.e.d()) {
                        this.f100243m[0] = new z72.f(c82.e.f39668a.b());
                    } else {
                        this.f100243m[0] = new b82.d(c82.e.f39668a.a());
                    }
                }
            }
        }
        return this.f100243m[0];
    }

    public o72.v4 pj() {
        o72.v4[] v4VarArr = this.f100245o;
        if (v4VarArr[0] == null) {
            synchronized (v4VarArr) {
                if (this.f100245o[0] == null) {
                    if (c82.e.d()) {
                        this.f100245o[0] = new z72.h(c82.e.f39668a.b());
                    } else {
                        this.f100245o[0] = new b82.e(c82.e.f39668a.a());
                    }
                }
            }
        }
        return this.f100245o[0];
    }

    public long qj(int i17) {
        return i17 == 2 ? wj() : i17 == 4 ? Bj() : ip.c.g();
    }

    public int rj(int i17) {
        return i17 == 2 ? (int) ((wj() / 1024) / 1024) : i17 == 4 ? (int) ((Bj() / 1024) / 1024) : vj();
    }

    public o72.y4 sj() {
        if (!jm0.g.class.isAssignableFrom(s72.j0.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        java.lang.Object a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(s72.j0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (o72.y4) ((jm0.g) a17);
    }

    public o72.i3 tj() {
        o72.i3[] i3VarArr = this.f100248r;
        if (i3VarArr[0] == null) {
            synchronized (i3VarArr) {
                o72.i3[] i3VarArr2 = this.f100248r;
                if (i3VarArr2[0] == null) {
                    i3VarArr2[0] = new o72.i3();
                }
            }
        }
        return this.f100248r[0];
    }

    public o72.z4 uj() {
        if (!jm0.g.class.isAssignableFrom(t72.l.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        java.lang.Object a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(t72.l.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (o72.z4) ((jm0.g) a17);
    }

    public int vj() {
        return (int) ((ip.c.g() / 1024) / 1024);
    }

    public long wj() {
        try {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitFavImageSize");
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.PluginFav", "getImageSizeLimit nullOrNil");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.PluginFav", "getImageSizeLimit " + d17);
            }
            return com.tencent.mm.sdk.platformtools.t8.V(d17, 26214400L);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.PluginFav", th6, "getImageSizeLimit", new java.lang.Object[0]);
            return 26214400L;
        }
    }

    /* renamed from: xj, reason: merged with bridge method [inline-methods] */
    public a82.z0 yj() {
        a82.z0[] z0VarArr = this.f100251u;
        if (z0VarArr[0] == null) {
            synchronized (z0VarArr) {
                a82.z0[] z0VarArr2 = this.f100251u;
                if (z0VarArr2[0] == null) {
                    z0VarArr2[0] = new a82.z0();
                }
            }
        }
        return this.f100251u[0];
    }

    public o72.g4 zj() {
        if (!jm0.g.class.isAssignableFrom(s72.p0.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        java.lang.Object a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(s72.p0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (o72.g4) ((jm0.g) a17);
    }
}
