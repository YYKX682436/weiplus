package com.p314xaae8f345.mm.p1006xc5476f33.fav;

@j95.b
/* loaded from: classes12.dex */
public class o extends jm0.o implements o72.f5 {

    /* renamed from: m, reason: collision with root package name */
    public final o72.k4[] f181776m = {null};

    /* renamed from: n, reason: collision with root package name */
    public final o72.y3[] f181777n = {null};

    /* renamed from: o, reason: collision with root package name */
    public final o72.v4[] f181778o = {null};

    /* renamed from: p, reason: collision with root package name */
    public final o72.d4[] f181779p = {null};

    /* renamed from: q, reason: collision with root package name */
    public final o72.a4[] f181780q = {null};

    /* renamed from: r, reason: collision with root package name */
    public final o72.i3[] f181781r = {null};

    /* renamed from: s, reason: collision with root package name */
    public final o72.b4[] f181782s = {null};

    /* renamed from: t, reason: collision with root package name */
    public final a82.h2[] f181783t = {null};

    /* renamed from: u, reason: collision with root package name */
    public final a82.z0[] f181784u = {null};

    /* renamed from: v, reason: collision with root package name */
    public final a82.w0[] f181785v = {null};

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f181786w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.s2 f181787x;

    public o() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f181786w = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6115x1cf24afe>(a0Var) { // from class: com.tencent.mm.plugin.fav.PluginFav$4
            {
                this.f39173x3fe91575 = 290524430;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6115x1cf24afe c6115x1cf24afe) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.PluginFav", "runService");
                com.p314xaae8f345.mm.p1006xc5476f33.fav.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.o.this;
                oVar.aj();
                ((a82.o0) oVar.aj()).T6();
                if (!jm0.g.class.isAssignableFrom(a82.v.class)) {
                    throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
                }
                p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(oVar.getViewModel(), new jm0.e(oVar)).a(a82.v.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
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
        this.f181787x = new com.p314xaae8f345.mm.p1006xc5476f33.fav.n(this);
    }

    public o72.x4 Aj() {
        a82.h2[] h2VarArr = this.f181783t;
        if (h2VarArr[0] == null) {
            synchronized (h2VarArr) {
                a82.h2[] h2VarArr2 = this.f181783t;
                if (h2VarArr2[0] == null) {
                    h2VarArr2[0] = new a82.h2();
                }
            }
        }
        return this.f181783t[0];
    }

    public long Bj() {
        try {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitFavVideoSize");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.PluginFav", "getVideoSizeLimit nullOrNil");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.PluginFav", "getVideoSizeLimit " + d17);
            }
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(d17, 26214400L);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.PluginFav", th6, "getVideoSizeLimit", new java.lang.Object[0]);
            return 26214400L;
        }
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.PluginFav", "init fav storage");
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218912d.b(-86016, new com.p314xaae8f345.mm.p1006xc5476f33.fav.k(this));
        this.f181786w.mo48813x58998cd();
        this.f181787x.m43071x58998cd();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = o72.x1.f425048a;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o72.x1.C() + "/");
        if (!r6Var.m() || !r6Var.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.PluginFav", "fav root dir not exists, try to make it");
            r6Var.J();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(o72.x1.I());
        if (!r6Var2.m() || !r6Var2.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.PluginFav", "fav web dir not exists, try to make it");
            r6Var2.J();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(o72.x1.D());
        if (!r6Var3.m() || !r6Var3.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.PluginFav", "fav attach dir not exists, try to make it");
            r6Var3.J();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(o72.x1.C() + "/voice/");
        if (r6Var4.m() && r6Var4.y()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.PluginFav", "fav voice dir not exists, try to make it");
        r6Var4.J();
    }

    @Override // jm0.o
    public void Vi() {
        this.f181786w.mo48814x2efc64();
        this.f181787x.m43072x2efc64();
        o72.j5.f424904m.set(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).vj(256);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).wj(6);
        synchronized (this.f181783t) {
            try {
                a82.h2 h2Var = this.f181783t[0];
                if (h2Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavSendService", "stop");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavSendService", "on finish");
                    ((java.util.LinkedList) h2Var.f83547g).clear();
                    ((java.util.HashMap) a82.h2.f83542i).clear();
                    h2Var.f83544d = false;
                    h2Var.f83546f = false;
                    h2Var.f83548h.d();
                    gm0.j1.d().q(401, h2Var);
                    this.f181783t[0] = null;
                }
            } finally {
            }
        }
        synchronized (this.f181784u) {
            try {
                a82.z0 z0Var = this.f181784u[0];
                if (z0Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavModService", "stop");
                    ((java.util.LinkedList) z0Var.f83784g).clear();
                    ((java.util.HashMap) a82.z0.f83779i).clear();
                    z0Var.f83781d = false;
                    z0Var.f83783f = false;
                    ((java.util.HashMap) a82.z0.f83780m).clear();
                    z0Var.f83785h.d();
                    gm0.j1.d().q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60870xaffa30c6, z0Var);
                    this.f181784u[0] = null;
                }
            } finally {
            }
        }
        synchronized (this.f181785v) {
            a82.w0 w0Var = this.f181785v[0];
            if (w0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavEditService", "stop");
                gm0.j1.d().q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60870xaffa30c6, w0Var);
                gm0.j1.d().q(401, w0Var);
                ((java.util.HashMap) w0Var.f83731d).clear();
                this.f181785v[0] = null;
            }
        }
        synchronized (this.f181776m) {
            o72.k4[] k4VarArr = this.f181776m;
            if (k4VarArr[0] != null) {
                k4VarArr[0] = null;
            }
        }
        synchronized (this.f181777n) {
            o72.y3[] y3VarArr = this.f181777n;
            if (y3VarArr[0] != null) {
                y3VarArr[0] = null;
            }
        }
        synchronized (this.f181778o) {
            o72.v4[] v4VarArr = this.f181778o;
            if (v4VarArr[0] != null) {
                v4VarArr[0] = null;
            }
        }
        synchronized (this.f181779p) {
            o72.d4[] d4VarArr = this.f181779p;
            if (d4VarArr[0] != null) {
                d4VarArr[0] = null;
            }
        }
        synchronized (this.f181780q) {
            o72.a4[] a4VarArr = this.f181780q;
            if (a4VarArr[0] != null) {
                a4VarArr[0] = null;
            }
        }
        synchronized (this.f181781r) {
            o72.i3[] i3VarArr = this.f181781r;
            if (i3VarArr[0] != null) {
                i3VarArr[0] = null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.PluginFav", "release fav storage");
    }

    public void Zi(java.util.List list) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.l(this, new y72.a(list)));
    }

    public o72.z3 aj() {
        if (!jm0.g.class.isAssignableFrom(a82.o0.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        java.lang.Object a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(a82.o0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (o72.z3) ((jm0.g) a17);
    }

    public a82.w0 bj() {
        a82.w0[] w0VarArr = this.f181785v;
        if (w0VarArr[0] == null) {
            synchronized (w0VarArr) {
                a82.w0[] w0VarArr2 = this.f181785v;
                if (w0VarArr2[0] == null) {
                    w0VarArr2[0] = new a82.w0();
                }
            }
        }
        return this.f181785v[0];
    }

    public o72.w3 cj() {
        if (!jm0.g.class.isAssignableFrom(a82.v.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        java.lang.Object a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(a82.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (o72.w3) ((jm0.g) a17);
    }

    public o72.y3 fj() {
        o72.y3[] y3VarArr = this.f181777n;
        if (y3VarArr[0] == null) {
            synchronized (y3VarArr) {
                if (this.f181777n[0] == null) {
                    if (c82.e.d()) {
                        this.f181777n[0] = new z72.a(c82.e.f121201a.b());
                    } else {
                        this.f181777n[0] = new b82.a(c82.e.f121201a.a());
                    }
                }
            }
        }
        return this.f181777n[0];
    }

    public o72.a4 hj() {
        o72.a4[] a4VarArr = this.f181780q;
        if (a4VarArr[0] == null) {
            synchronized (a4VarArr) {
                if (this.f181780q[0] == null) {
                    if (c82.e.d()) {
                        this.f181780q[0] = new z72.b(c82.e.f121201a.b());
                    } else {
                        this.f181780q[0] = new b82.b(c82.e.f121201a.a());
                    }
                }
            }
        }
        return this.f181780q[0];
    }

    public o72.b4 ij() {
        o72.b4[] b4VarArr = this.f181782s;
        if (b4VarArr[0] == null) {
            synchronized (b4VarArr) {
                if (this.f181782s[0] == null) {
                    if (c82.e.d()) {
                        this.f181782s[0] = new p72.k();
                    } else {
                        this.f181782s[0] = new p72.e();
                    }
                }
            }
        }
        return this.f181782s[0];
    }

    public o72.c4 mj() {
        if (!jm0.g.class.isAssignableFrom(a82.s0.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        java.lang.Object a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(a82.s0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (o72.c4) ((jm0.g) a17);
    }

    public o72.d4 nj() {
        o72.d4[] d4VarArr = this.f181779p;
        if (d4VarArr[0] == null) {
            synchronized (d4VarArr) {
                if (this.f181779p[0] == null) {
                    if (c82.e.d()) {
                        this.f181779p[0] = new z72.e(c82.e.f121201a.b());
                    } else {
                        this.f181779p[0] = new b82.c(c82.e.f121201a.a());
                    }
                }
            }
        }
        return this.f181779p[0];
    }

    public o72.k4 oj() {
        o72.k4[] k4VarArr = this.f181776m;
        if (k4VarArr[0] == null) {
            synchronized (k4VarArr) {
                if (this.f181776m[0] == null) {
                    if (c82.e.d()) {
                        this.f181776m[0] = new z72.f(c82.e.f121201a.b());
                    } else {
                        this.f181776m[0] = new b82.d(c82.e.f121201a.a());
                    }
                }
            }
        }
        return this.f181776m[0];
    }

    public o72.v4 pj() {
        o72.v4[] v4VarArr = this.f181778o;
        if (v4VarArr[0] == null) {
            synchronized (v4VarArr) {
                if (this.f181778o[0] == null) {
                    if (c82.e.d()) {
                        this.f181778o[0] = new z72.h(c82.e.f121201a.b());
                    } else {
                        this.f181778o[0] = new b82.e(c82.e.f121201a.a());
                    }
                }
            }
        }
        return this.f181778o[0];
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
        java.lang.Object a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(s72.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (o72.y4) ((jm0.g) a17);
    }

    public o72.i3 tj() {
        o72.i3[] i3VarArr = this.f181781r;
        if (i3VarArr[0] == null) {
            synchronized (i3VarArr) {
                o72.i3[] i3VarArr2 = this.f181781r;
                if (i3VarArr2[0] == null) {
                    i3VarArr2[0] = new o72.i3();
                }
            }
        }
        return this.f181781r[0];
    }

    public o72.z4 uj() {
        if (!jm0.g.class.isAssignableFrom(t72.l.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        java.lang.Object a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(t72.l.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (o72.z4) ((jm0.g) a17);
    }

    public int vj() {
        return (int) ((ip.c.g() / 1024) / 1024);
    }

    public long wj() {
        try {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitFavImageSize");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.PluginFav", "getImageSizeLimit nullOrNil");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.PluginFav", "getImageSizeLimit " + d17);
            }
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(d17, 26214400L);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.PluginFav", th6, "getImageSizeLimit", new java.lang.Object[0]);
            return 26214400L;
        }
    }

    /* renamed from: xj, reason: merged with bridge method [inline-methods] */
    public a82.z0 yj() {
        a82.z0[] z0VarArr = this.f181784u;
        if (z0VarArr[0] == null) {
            synchronized (z0VarArr) {
                a82.z0[] z0VarArr2 = this.f181784u;
                if (z0VarArr2[0] == null) {
                    z0VarArr2[0] = new a82.z0();
                }
            }
        }
        return this.f181784u[0];
    }

    public o72.g4 zj() {
        if (!jm0.g.class.isAssignableFrom(s72.p0.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        java.lang.Object a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(s72.p0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (o72.g4) ((jm0.g) a17);
    }
}
