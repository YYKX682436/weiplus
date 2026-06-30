package mz2;

/* loaded from: classes9.dex */
public class s1 implements pz2.d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f414712a;

    /* renamed from: b, reason: collision with root package name */
    public pz2.b f414713b;

    /* renamed from: c, reason: collision with root package name */
    public pz2.b f414714c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f414715d;

    /* renamed from: e, reason: collision with root package name */
    public d50.q f414716e;

    @Override // pz2.d
    public void a(android.content.Context context, pz2.b bVar, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "do prepare");
        this.f414713b = bVar;
        this.f414715d = str;
        this.f414712a = new java.lang.ref.WeakReference((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) context);
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        this.f414716e = new ne4.n();
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) this.f414712a.get()).m83090x14f40144(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r6.f34501x366c91de);
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) this.f414712a.get()).m83090x14f40144(1638);
        ((nz2.o) gm0.j1.s(nz2.o.class)).D1(new java.lang.Object[0]);
        d50.q qVar = this.f414716e;
        mz2.r1 r1Var = new mz2.r1(this);
        d50.k kVar = (d50.k) i95.n0.c(d50.k.class);
        java.lang.String str2 = this.f414715d;
        ((d50.i) kVar).getClass();
        ((ne4.n) qVar).b(r1Var, true, 1, new oz2.c(str2, 2), 0);
    }

    @Override // pz2.d
    public void b(pz2.b bVar, java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: doOpenFP");
        this.f414714c = bVar;
        zt5.s sVar = mz2.d2.IML.f414647g;
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterFaceIdOpenDelegate", "hy: signature is null");
            re4.n.e(9, -1000223, -1, "signature is null");
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8v);
            pz2.b bVar2 = this.f414714c;
            if (bVar2 != null) {
                bVar2.h(-1, string);
                return;
            }
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f414712a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) this.f414712a.get();
        d50.k kVar = (d50.k) i95.n0.c(d50.k.class);
        java.lang.String str2 = sVar.f557162j;
        java.lang.String str3 = sVar.f557163k;
        java.lang.String str4 = this.f414715d;
        ((d50.i) kVar).getClass();
        abstractActivityC22902xe37969e.m83098x5406100e(new oz2.b(str2, str3, str4, 2));
    }

    @Override // pz2.d
    public void c(android.content.Context context, pz2.b bVar) {
    }

    @Override // pz2.d
    /* renamed from: clear */
    public void mo148634x5a5b64d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: clear");
        java.lang.ref.WeakReference weakReference = this.f414712a;
        if (weakReference != null && weakReference.get() != null) {
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) this.f414712a.get()).m83121xf6ff5b27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r6.f34501x366c91de);
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) this.f414712a.get()).m83121xf6ff5b27(1638);
        }
        mz2.d2.IML.h();
        java.lang.ref.WeakReference weakReference2 = this.f414712a;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        this.f414712a.clear();
    }

    public final void d(int i17, java.lang.String str) {
        pz2.b bVar = this.f414713b;
        if (bVar != null) {
            bVar.h(i17, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pz2.d
    /* renamed from: onSceneEnd */
    public boolean mo148635x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: onSceneEnd: errType: %d, errCode: %d, errMsg: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8v);
        }
        if (m1Var instanceof d50.l) {
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterFaceIdOpenDelegate", "hy: failed get challenge");
                d(i18, str);
                re4.n.e(7, i17, i18, "get challenge failed");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "get challenge success");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((oz2.a) ((d50.l) m1Var)).f431772f)) {
                d(-1, str);
                return true;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mz2.q1(this));
        }
        if (!(m1Var instanceof d50.m)) {
            return false;
        }
        if (i18 == 0 && i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: open success");
            re4.n.h();
            re4.n.e(0, 0, 0, "OK");
            pz2.b bVar = this.f414714c;
            if (bVar != null) {
                bVar.h(0, str);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: open");
            re4.n.e(8, i17, i18, "open fp pay failed");
            pz2.b bVar2 = this.f414714c;
            if (bVar2 != null) {
                bVar2.h(-1, str);
            }
        }
        return true;
    }
}
