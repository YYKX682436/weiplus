package e71;

/* loaded from: classes4.dex */
public final class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f331408d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f331409e;

    /* renamed from: f, reason: collision with root package name */
    public final e71.h f331410f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f331411g;

    public g(e71.h hVar, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.rs6();
        lVar.f152198b = new r45.ss6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/updatesafedevice";
        lVar.f152200d = 361;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f331409e = a17;
        this.f331410f = hVar;
        this.f331411g = str;
        r45.rs6 rs6Var = (r45.rs6) a17.f152243a.f152217a;
        rs6Var.f466711d = hVar.f69210x4b6e878b;
        rs6Var.f466712e = str;
        rs6Var.f466713f = hVar.f69205xe7c5c6f5;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        e71.h hVar = this.f331410f;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f69210x4b6e878b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f331411g) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f69205xe7c5c6f5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetscenUpdateSafeDevice", "null device is or device name or device type");
            return -1;
        }
        this.f331408d = u0Var;
        return mo9409x10f9447a(sVar, this.f331409e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 361;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetscenUpdateSafeDevice", "errType = " + i18 + ", errCode = " + i19);
        if (i18 == 0 && i19 == 0) {
            this.f331410f.f69207x225f1eb0 = this.f331411g;
        }
        this.f331408d.mo815x76e0bfae(i18, i19, str, this);
    }
}
