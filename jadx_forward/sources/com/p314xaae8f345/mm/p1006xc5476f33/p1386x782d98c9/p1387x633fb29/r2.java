package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class r2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f180586d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f180587e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.nv3 f180588f;

    public r2(r45.nv3 nv3Var, int i17) {
        this.f180588f = nv3Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.hr6();
        lVar.f152198b = new r45.ir6();
        lVar.f152200d = 537;
        lVar.f152199c = "/cgi-bin/micromsg-bin/unbindharddevice";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f180587e = a17;
        r45.hr6 hr6Var = (r45.hr6) a17.f152243a.f152217a;
        hr6Var.f457934d = nv3Var;
        hr6Var.f457935e = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f180586d = u0Var;
        return mo9409x10f9447a(sVar, this.f180587e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 537;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneUnBindHardDevice", "onGYNetEnd netId = %d, errType= %d, errCode = %d , errMsg =%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a2.INSTANCE.i(0L);
        v32.c Ui = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui();
        r45.nv3 nv3Var = this.f180588f;
        v32.b P0 = Ui.P0(nv3Var.f463225e);
        if (P0 != null) {
            if (u32.h1.c().f180539a != null) {
                if (!((u32.k1) u32.h1.c().f180539a).e(P0.f66609x4b6e688a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "stopChannel Failed!!!");
                }
            }
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().y0(nv3Var.f463225e, nv3Var.f463224d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "deleteByDeviceId Failed!!!");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "getByDeviceIdServer Failed!!! DeviceIDServer = %s", nv3Var.f463225e);
        }
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "scene.getType() = %s", 537);
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f180587e;
        if (((oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.ir6) fVar) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "UnbindHardDevice resp or req is null");
        }
        this.f180586d.mo815x76e0bfae(i18, i19, str, this);
    }
}
