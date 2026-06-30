package mz2;

/* loaded from: classes9.dex */
public class w1 implements pz2.d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f414731a = null;

    /* renamed from: b, reason: collision with root package name */
    public pz2.b f414732b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f414733c = "";

    /* renamed from: d, reason: collision with root package name */
    public pz2.b f414734d = null;

    /* renamed from: e, reason: collision with root package name */
    public d50.q f414735e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f414736f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f414737g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f414738h;

    @Override // pz2.d
    public void a(android.content.Context context, pz2.b bVar, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: prepare");
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        this.f414735e = new ne4.n();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) context);
        this.f414731a = weakReference;
        this.f414732b = bVar;
        this.f414733c = str;
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) weakReference.get()).m83090x14f40144(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r6.f34501x366c91de);
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) this.f414731a.get()).m83090x14f40144(1638);
        re4.n.j();
        ((nz2.o) gm0.j1.s(nz2.o.class)).D1(new java.lang.Object[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: start gen auth key");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 35);
        d50.q qVar = this.f414735e;
        mz2.u1 u1Var = new mz2.u1(this);
        d50.k kVar = (d50.k) i95.n0.c(d50.k.class);
        java.lang.String str2 = this.f414733c;
        ((d50.i) kVar).getClass();
        ((ne4.n) qVar).b(u1Var, true, 1, new oz2.c(str2, 1), 0);
    }

    @Override // pz2.d
    public void b(pz2.b bVar, java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: doOpenFP");
        this.f414734d = bVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f414737g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: signature is null");
            re4.n.g(9, -1000223, -1, "signature is null");
            d(-1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_k));
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f414731a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) this.f414731a.get();
        d50.k kVar = (d50.k) i95.n0.c(d50.k.class);
        java.lang.String str2 = this.f414737g;
        java.lang.String str3 = this.f414738h;
        java.lang.String str4 = this.f414733c;
        ((d50.i) kVar).getClass();
        abstractActivityC22902xe37969e.m83098x5406100e(new oz2.b(str2, str3, str4, 1));
    }

    @Override // pz2.d
    public void c(android.content.Context context, pz2.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "request authentication");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f414736f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterFingerprintOpenDelegate", "no challenge!!");
        } else {
            if (bVar == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 41);
            ((nz2.o) gm0.j1.s(nz2.o.class)).g9(context, new nz2.f(this.f414736f, 1), new mz2.t1(this, bVar));
        }
    }

    @Override // pz2.d
    /* renamed from: clear */
    public void mo148634x5a5b64d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: clear");
        java.lang.ref.WeakReference weakReference = this.f414731a;
        if (weakReference != null && weakReference.get() != null) {
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) this.f414731a.get()).m83121xf6ff5b27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r6.f34501x366c91de);
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) this.f414731a.get()).m83121xf6ff5b27(1638);
        }
        this.f414732b = null;
        mz2.d2.IML.h();
        java.lang.ref.WeakReference weakReference2 = this.f414731a;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        this.f414731a.clear();
    }

    public final void d(int i17, java.lang.String str) {
        pz2.b bVar = this.f414732b;
        if (bVar != null) {
            bVar.h(i17, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pz2.d
    /* renamed from: onSceneEnd */
    public boolean mo148635x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: onSceneEnd: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_k);
        }
        if (m1Var instanceof d50.l) {
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: failed get challenge");
                d(i18, str);
                re4.n.g(7, i17, i18, "get challenge failed");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "get challenge success");
            oz2.a aVar = (oz2.a) ((d50.l) m1Var);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f431772f)) {
                d(-1, str);
                return true;
            }
            this.f414736f = aVar.f431772f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mz2.v1(this));
        }
        if (!(m1Var instanceof d50.m)) {
            return false;
        }
        if (i18 == 0 && i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: open success");
            re4.n.h();
            re4.n.g(0, 0, 0, "OK");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: callback total");
            mo148634x5a5b64d();
            this.f414734d.h(0, str);
            this.f414734d = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: open");
            re4.n.g(8, i17, i18, "open fp pay failed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: callback total");
            mo148634x5a5b64d();
            this.f414734d.h(-1, str);
            this.f414734d = null;
        }
        return true;
    }
}
