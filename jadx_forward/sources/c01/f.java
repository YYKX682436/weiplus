package c01;

/* loaded from: classes11.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public volatile c01.ib f118703a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c01.hb f118704b;

    /* renamed from: c, reason: collision with root package name */
    public volatile e01.e f118705c;

    /* renamed from: d, reason: collision with root package name */
    public volatile e01.f f118706d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2621x8fb0427b.m f118707e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2621x8fb0427b.q f118708f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2621x8fb0427b.o f118709g;

    /* renamed from: h, reason: collision with root package name */
    public volatile e01.d f118710h;

    public c01.ib A() {
        if (this.f118703a == null && gm0.j1.a()) {
            synchronized (this) {
                if (this.f118703a == null) {
                    this.f118703a = new c01.ib(gm0.j1.u().f354686f, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di());
                }
            }
        }
        return this.f118703a;
    }

    public xg3.v0 B() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj();
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
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = u17.f354692l;
        if (concurrentHashMap.containsKey(str)) {
            return (android.content.SharedPreferences) concurrentHashMap.get(str);
        }
        try {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getParent() + "/shared_prefs/";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + str + h17 + ".xml";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + str + h17 + ".xml.bak";
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str2 + str3);
            if (r6Var.m()) {
                r6Var.l();
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(str2 + str4);
            if (r6Var2.m()) {
                r6Var2.l();
            }
        } catch (java.lang.Exception unused) {
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(java.lang.String.valueOf(h17 / 2));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e());
        sb6.append(str);
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(h17 + a17));
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(sb6.toString(), 0);
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
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k("medianote");
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.p314xaae8f345.mm.p957x53236a1b.g1.I("medianote", 15);
        }
    }

    public void c() {
        java.lang.String h17 = gm0.j1.u().h();
        java.lang.String d17 = gm0.j1.u().d();
        java.lang.String[] E = new com.p314xaae8f345.mm.vfs.r6(h17).E(new c01.d(this));
        if (E == null) {
            return;
        }
        for (java.lang.String str : E) {
            java.lang.String str2 = d17 + str + ".dump";
            com.p314xaae8f345.mm.vfs.w6.h(str2);
            com.p314xaae8f345.mm.vfs.w6.c(h17 + str, str2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Exported: ");
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountStorage", sb6.toString());
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

    public com.p314xaae8f345.mm.p2621x8fb0427b.m g() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (this.f118707e == null) {
            synchronized (this) {
                if (this.f118707e == null) {
                    this.f118707e = new com.p314xaae8f345.mm.p2621x8fb0427b.m(gm0.j1.u().f354686f);
                }
            }
        }
        return this.f118707e;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.o h() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (this.f118709g == null) {
            synchronized (this) {
                if (this.f118709g == null) {
                    this.f118709g = new com.p314xaae8f345.mm.p2621x8fb0427b.o(gm0.j1.u().f354686f);
                }
            }
        }
        return this.f118709g;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.q i() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (this.f118708f == null) {
            synchronized (this) {
                if (this.f118708f == null) {
                    this.f118708f = new com.p314xaae8f345.mm.p2621x8fb0427b.q(gm0.j1.u().f354686f);
                }
            }
        }
        return this.f118708f;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.v j() {
        return ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Bi(null);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.w k() {
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
        if (this.f118710h == null) {
            synchronized (this) {
                if (this.f118710h == null) {
                    this.f118710h = new e01.d();
                }
            }
        }
        return this.f118710h;
    }

    public e01.e n() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (this.f118705c == null) {
            synchronized (this) {
                if (this.f118705c == null) {
                    this.f118705c = new e01.e();
                }
            }
        }
        return this.f118705c;
    }

    public e01.f o() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (this.f118706d == null) {
            synchronized (this) {
                if (this.f118706d == null) {
                    this.f118706d = new e01.f();
                }
            }
        }
        return this.f118706d;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.n3 p() {
        gm0.j1.i();
        return gm0.j1.u().c();
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.e8 q() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.l8 r() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
    }

    public l75.k0 s() {
        gm0.j1.i();
        return gm0.j1.u().f354686f;
    }

    public xg3.b0 t() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Vi();
    }

    public xg3.m0 u() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
    }

    public st0.e v() {
        gm0.j1.i();
        gm0.j1.b().c();
        return ((ro3.e) ((st0.f) i95.n0.c(st0.f.class))).wi();
    }

    public xg3.o0 w() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj();
    }

    public int x() {
        gm0.j1.i();
        return gm0.j1.b().f354782l;
    }

    public xg3.r0 y() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj();
    }

    public c01.hb z() {
        if (this.f118704b == null && gm0.j1.a()) {
            synchronized (this) {
                if (this.f118704b == null) {
                    this.f118704b = new c01.hb(gm0.j1.u().f354686f, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi());
                }
            }
        }
        return this.f118704b;
    }
}
