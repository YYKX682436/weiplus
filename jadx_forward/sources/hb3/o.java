package hb3;

@j95.b
/* loaded from: classes9.dex */
public class o extends i95.w implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: r, reason: collision with root package name */
    public static int f361663r = -1;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d1 f361664d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i5 f361665e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i4 f361666f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h4 f361667g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m4 f361668h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f361669i;

    /* renamed from: m, reason: collision with root package name */
    public final pq5.i f361670m;

    /* renamed from: n, reason: collision with root package name */
    public final pq5.i f361671n;

    /* renamed from: o, reason: collision with root package name */
    public final pq5.i f361672o;

    /* renamed from: p, reason: collision with root package name */
    public final pq5.i f361673p;

    /* renamed from: q, reason: collision with root package name */
    public final l75.q0 f361674q;

    public o() {
        this.f361669i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2524x2c1ddc83.C20111xbd50b1af()) == 1;
        this.f361670m = new pq5.i(new hb3.e(this));
        this.f361671n = new pq5.i(new hb3.f(this));
        this.f361672o = new pq5.i(new hb3.g(this));
        this.f361673p = new pq5.i(new hb3.h(this));
        this.f361674q = new hb3.j(this);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(Zi());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            return;
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
        if (m18.a()) {
            m18.f294799a.r(m18.f294800b);
        }
    }

    public static hb3.o Ni() {
        return (hb3.o) i95.n0.c(hb3.o.class);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h4 Ai() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreLuckyMoney", "getConfigMgrHK()");
        gm0.j1.b().c();
        if (Ni().f361667g == null) {
            Ni().f361667g = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h4();
        }
        return Ni().f361667g;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i4 Bi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreLuckyMoney", "getConfigMgrLive()");
        gm0.j1.b().c();
        if (Ni().f361666f == null) {
            Ni().f361666f = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i4();
        }
        return Ni().f361666f;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i5 Di() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreLuckyMoney", "getConfigMgrUnion()");
        gm0.j1.b().c();
        if (Ni().f361665e == null) {
            Ni().f361665e = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i5();
        }
        return Ni().f361665e;
    }

    public dc3.f Ri() {
        return (dc3.f) this.f361673p.a();
    }

    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m4 Ui() {
        if (this.f361668h == null) {
            this.f361668h = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m4();
        }
        return this.f361668h;
    }

    public dc3.b Vi() {
        return (dc3.b) this.f361671n.a();
    }

    public java.lang.String Zi() {
        if (!gm0.j1.a()) {
            return "";
        }
        return g83.a.a() + "luckymoney";
    }

    public dc3.d aj() {
        return (dc3.d) this.f361672o.a();
    }

    public void bj(java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).h(new hb3.l(this, str), "update_hb_red_flag");
    }

    public void cj(java.lang.String str, boolean z17) {
        ((ku5.t0) ku5.t0.f394148d).h(new hb3.k(this, str, z17), "update_hb_red_flag_2");
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d4.f226760d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(991, 18);
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(58);
        g0Var.A(991, 24);
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(104);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(182);
        arrayList.add(193);
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).getClass();
        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.k0(arrayList));
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this);
        try {
            jz5.g gVar = rb3.g.f475391a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreLuckyMoney", "[onAccountInitialized] pay db inital failed ： %s ", e17.getMessage());
        }
        gm0.j1.i();
        boolean z17 = java.lang.System.currentTimeMillis() - gm0.j1.u().c().s(352276, 0L) >= 43200000;
        boolean z18 = gm0.j1.b().f354777g.f354790a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreLuckyMoney", "isTime=" + z17 + ", isUpdate=" + z18);
        if (z18 || z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreLuckyMoney", "get service applist");
            lt.s0 s0Var = (lt.s0) i95.n0.c(lt.s0.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((kt.u0) s0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x5.c().e(context2);
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t0.f227165a;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.D() + "wallet/luckyMoneyEffect/");
        if (r6Var.y() && r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckMoneyEffectResourceMgr", "delete unused files: %s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.g(r6Var.u(), true)));
        }
        ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().add(this.f361674q);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        ((kt.u0) ((lt.s0) i95.n0.c(lt.s0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x5 c17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x5.c();
        c17.getClass();
        if (gm0.j1.a()) {
            c17.f270676a = false;
            c17.f270677b = false;
        }
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this);
        synchronized (this) {
            this.f361668h = null;
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t0.f227165a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckMoneyEffectResourceMgr", "unInit");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t0.f227165a.mo48814x2efc64();
        ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().mo49775xc84af884(this.f361674q);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).h(new hb3.m(this), "check_hb_red_flag_background");
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d1 wi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreLuckyMoney", "getConfigMgr()");
        gm0.j1.b().c();
        if (Ni().f361664d == null) {
            Ni().f361664d = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d1();
        }
        return Ni().f361664d;
    }
}
