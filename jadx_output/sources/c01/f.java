package c01;

/* loaded from: classes11.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public volatile c01.ib f37170a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c01.hb f37171b;

    /* renamed from: c, reason: collision with root package name */
    public volatile e01.e f37172c;

    /* renamed from: d, reason: collision with root package name */
    public volatile e01.f f37173d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.tencent.mm.storage.m f37174e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.tencent.mm.storage.q f37175f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.tencent.mm.storage.o f37176g;

    /* renamed from: h, reason: collision with root package name */
    public volatile e01.d f37177h;

    public c01.ib A() {
        if (this.f37170a == null && gm0.j1.a()) {
            synchronized (this) {
                if (this.f37170a == null) {
                    this.f37170a = new c01.ib(gm0.j1.u().f273153f, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di());
                }
            }
        }
        return this.f37170a;
    }

    public xg3.v0 B() {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj();
    }

    public int C() {
        gm0.j1.i();
        return gm0.j1.b().h();
    }

    public android.content.SharedPreferences D(java.lang.String str) {
        gm0.j1.i();
        gm0.b0 u17 = gm0.j1.u();
        u17.getClass();
        int h17 = gm0.j1.b().h();
        if (h17 == 0) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = u17.f273159l;
        if (concurrentHashMap.containsKey(str)) {
            return (android.content.SharedPreferences) concurrentHashMap.get(str);
        }
        try {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getParent() + "/shared_prefs/";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.x2.e() + str + h17 + ".xml";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.x2.e() + str + h17 + ".xml.bak";
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str2 + str3);
            if (r6Var.m()) {
                r6Var.l();
            }
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(str2 + str4);
            if (r6Var2.m()) {
                r6Var2.l();
            }
        } catch (java.lang.Exception unused) {
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(java.lang.String.valueOf(h17 / 2));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.sdk.platformtools.x2.e());
        sb6.append(str);
        sb6.append(com.tencent.mm.sdk.platformtools.w2.a(h17 + a17));
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(sb6.toString(), 0);
        concurrentHashMap.put(str, sharedPreferences);
        return sharedPreferences;
    }

    public boolean E() {
        gm0.j1.i();
        return gm0.j1.u().l();
    }

    public boolean F() {
        gm0.j1.i();
        return gm0.j1.b().t();
    }

    public void G(c01.y8 y8Var) {
        gm0.j1.i();
        gm0.j1.b().z(y8Var);
    }

    public void a(c01.y8 y8Var) {
        gm0.j1.i();
        gm0.j1.b().a(y8Var);
    }

    public void b(int i17) {
        fs.g.b(ct.g3.class, new c01.e(this, i17));
        if ((i17 & 16) != 0) {
            c01.w9.h("medianote", null);
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).k("medianote");
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.tencent.mm.modelsimple.g1.I("medianote", 15);
        }
    }

    public void c() {
        java.lang.String h17 = gm0.j1.u().h();
        java.lang.String d17 = gm0.j1.u().d();
        java.lang.String[] E = new com.tencent.mm.vfs.r6(h17).E(new c01.d(this));
        if (E == null) {
            return;
        }
        for (java.lang.String str : E) {
            java.lang.String str2 = d17 + str + ".dump";
            com.tencent.mm.vfs.w6.h(str2);
            com.tencent.mm.vfs.w6.c(h17 + str, str2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Exported: ");
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.AccountStorage", sb6.toString());
        }
    }

    public java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("attachment/");
        return sb6.toString();
    }

    public java.lang.String e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("record/");
        return sb6.toString();
    }

    public java.lang.String f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("image/shakeTranImg/");
        return sb6.toString();
    }

    public com.tencent.mm.storage.m g() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (this.f37174e == null) {
            synchronized (this) {
                if (this.f37174e == null) {
                    this.f37174e = new com.tencent.mm.storage.m(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f37174e;
    }

    public com.tencent.mm.storage.o h() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (this.f37176g == null) {
            synchronized (this) {
                if (this.f37176g == null) {
                    this.f37176g = new com.tencent.mm.storage.o(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f37176g;
    }

    public com.tencent.mm.storage.q i() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (this.f37175f == null) {
            synchronized (this) {
                if (this.f37175f == null) {
                    this.f37175f = new com.tencent.mm.storage.q(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f37175f;
    }

    public com.tencent.mm.storage.v j() {
        return ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Bi(null);
    }

    public com.tencent.mm.storage.w k() {
        return ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Ai();
    }

    public c01.b8 l() {
        gm0.j1.i();
        gm0.j1.b().c();
        return ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
    }

    public e01.d m() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (this.f37177h == null) {
            synchronized (this) {
                if (this.f37177h == null) {
                    this.f37177h = new e01.d();
                }
            }
        }
        return this.f37177h;
    }

    public e01.e n() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (this.f37172c == null) {
            synchronized (this) {
                if (this.f37172c == null) {
                    this.f37172c = new e01.e();
                }
            }
        }
        return this.f37172c;
    }

    public e01.f o() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (this.f37173d == null) {
            synchronized (this) {
                if (this.f37173d == null) {
                    this.f37173d = new e01.f();
                }
            }
        }
        return this.f37173d;
    }

    public com.tencent.mm.storage.n3 p() {
        gm0.j1.i();
        return gm0.j1.u().c();
    }

    public com.tencent.mm.storage.e8 q() {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
    }

    public com.tencent.mm.storage.l8 r() {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
    }

    public l75.k0 s() {
        gm0.j1.i();
        return gm0.j1.u().f273153f;
    }

    public xg3.b0 t() {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Vi();
    }

    public xg3.m0 u() {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
    }

    public st0.e v() {
        gm0.j1.i();
        gm0.j1.b().c();
        return ((ro3.e) ((st0.f) i95.n0.c(st0.f.class))).wi();
    }

    public xg3.o0 w() {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj();
    }

    public int x() {
        gm0.j1.i();
        return gm0.j1.b().f273249l;
    }

    public xg3.r0 y() {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj();
    }

    public c01.hb z() {
        if (this.f37171b == null && gm0.j1.a()) {
            synchronized (this) {
                if (this.f37171b == null) {
                    this.f37171b = new c01.hb(gm0.j1.u().f273153f, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi());
                }
            }
        }
        return this.f37171b;
    }
}
