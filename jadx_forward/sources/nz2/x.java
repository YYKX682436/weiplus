package nz2;

/* loaded from: classes9.dex */
public class x extends nz2.a {

    /* renamed from: d, reason: collision with root package name */
    public d50.q f423113d;

    @Override // nz2.o
    public java.util.Map C() {
        java.util.HashMap hashMap = new java.util.HashMap();
        re4.v a17 = re4.u.a();
        hashMap.put("cpu_id", a17.f476086a);
        hashMap.put("uid", a17.f476087b);
        return hashMap;
    }

    @Override // nz2.o
    public void C3(android.content.Context context, nz2.f fVar, nz2.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "request faceid authorize: %s, %s", java.lang.Integer.valueOf(fVar.f423087b), fVar.f423086a);
        ((ne4.n) b()).c(new nz2.u(this, bVar), context, fVar.f423087b, 2, fVar.f423086a, null);
    }

    @Override // nz2.o
    public boolean D() {
        return wt5.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2);
    }

    @Override // nz2.o
    public void D1(java.lang.Object... objArr) {
        if (wt5.a.i(re4.g0.a())) {
            wt5.a.s(re4.g0.a(), false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "change to new authkey name");
            fu5.d.b().a().put(1, re4.g0.d(1));
        }
    }

    @Override // nz2.o
    public boolean E2() {
        return wt5.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1);
    }

    @Override // nz2.o
    public boolean Lf(android.content.Context context) {
        boolean z17 = (wo.v1.f529361h.f529344b & 1) > 0;
        boolean a17 = is4.a.a("MMKV_KEY_SUPPORT_FINGER", wt5.a.m(context, 1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "is support finger: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(a17));
        return z17 && a17;
    }

    @Override // nz2.o
    public void Mf(boolean z17, boolean z18, boolean z19, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "on post pay: %s, %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        if (z18 && !z17 && z19) {
            java.lang.String string = bundle != null ? bundle.getString("pwd") : "";
            int i17 = bundle != null ? bundle.getInt("key_open_biometric_type") : 0;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterBiometricPayManager", "no pwd. can not change auth key");
            } else {
                m05.i.f404103a.a("5", "4", "2", "update authkey after pay");
                ((ku5.t0) ku5.t0.f394148d).k(new nz2.w(this, string, i17), 500L);
            }
        }
    }

    public final d50.q b() {
        if (this.f423113d == null) {
            ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
            this.f423113d = new ne4.n();
        }
        return this.f423113d;
    }

    @Override // nz2.o
    /* renamed from: cancel */
    public void mo150320xae7a2e7a() {
        d50.q qVar = this.f423113d;
        if (qVar != null) {
            ((ne4.n) qVar).a(true);
        }
    }

    @Override // nz2.o
    public void g9(android.content.Context context, nz2.f fVar, nz2.b bVar) {
        d50.n nVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "request fingerprint authorize: %s, %s", java.lang.Integer.valueOf(fVar.f423087b), fVar.f423086a);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f423089d)) {
            nVar = null;
        } else {
            nVar = new d50.n();
            nVar.f308050a = fVar.f423089d;
            nVar.f308051b = fVar.f423090e;
            nVar.f308052c = fVar.f423091f;
        }
        d50.n nVar2 = nVar;
        ((ne4.n) b()).c(new nz2.t(this, bVar), context, fVar.f423087b, 1, fVar.f423086a, nVar2);
    }

    @Override // nz2.o
    public boolean h1() {
        boolean o17 = wt5.a.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2);
        ((ku5.t0) ku5.t0.f394148d).g(new nz2.q(this, o17));
        return o17;
    }

    @Override // nz2.o
    public boolean ja() {
        boolean o17 = wt5.a.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1);
        ((ku5.t0) ku5.t0.f394148d).g(new nz2.r(this, o17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "isDeviceHasFingerPrint:%s", java.lang.Boolean.valueOf(o17));
        return o17;
    }

    @Override // nz2.o
    public boolean mf() {
        boolean i17 = wt5.a.i(re4.g0.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "py: hasAuthKey: %b", java.lang.Boolean.valueOf(i17));
        return i17;
    }

    @Override // nz2.o
    public int of() {
        return 2;
    }

    @Override // nz2.o
    /* renamed from: prepare */
    public void mo150321xed060d07() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "prepare");
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar.mo148658x368f3a() != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "set soter manager");
            mz2.p1 p1Var = new mz2.p1();
            p1Var.c(this);
            gm0.j1.q(pz2.a.class, p1Var);
        } else {
            ((mz2.a) aVar).c(this);
        }
        if (((java.lang.String) fu5.d.b().a().get(1)).equals("WechatAuthKeyPay&null")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "init error, reinit");
            fu5.d b17 = fu5.d.b();
            b17.getClass();
            synchronized (fu5.d.class) {
                b17.f348446b = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 46);
            je0.i iVar = (je0.i) i95.n0.c(je0.i.class);
            nz2.p pVar = new nz2.p(this);
            ((ie0.m) iVar).getClass();
            se4.h.a(true, true, pVar);
        }
    }

    @Override // nz2.o
    public pz2.d r1() {
        return new mz2.w1();
    }

    @Override // nz2.o
    public boolean uf(android.content.Context context) {
        boolean z17 = (wo.v1.f529361h.f529344b & 2) > 0;
        boolean a17 = is4.a.a("MMKV_KEY_SUPPORT_FACE_ID", wt5.a.m(context, 2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "is support face: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(a17));
        return z17 && a17;
    }

    @Override // nz2.o
    public boolean wh() {
        boolean z17 = wo.v1.f529359f.f529400a == 1;
        boolean z18 = wo.v1.f529361h.f529343a;
        boolean c17 = cu5.b.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "is support: %s, %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(c17));
        return (z17 || z18) && c17;
    }

    @Override // nz2.o
    public void z9(android.content.Context context, nz2.f fVar, nz2.d dVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "request fingerprint authorize for pay");
        if (dVar == null) {
            return;
        }
        g9(context, fVar, new nz2.s(this, dVar));
    }

    @Override // nz2.a, nz2.o
    /* renamed from: cancel */
    public void mo150319xae7a2e7a(boolean z17) {
        d50.q qVar = this.f423113d;
        if (qVar != null) {
            ((ne4.n) qVar).a(z17);
        }
    }
}
