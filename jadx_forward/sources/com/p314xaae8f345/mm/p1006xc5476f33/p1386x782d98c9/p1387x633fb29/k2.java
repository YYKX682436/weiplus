package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class k2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f180492d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f180493e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f180494f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f180495g;

    public k2(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, byte[] bArr) {
        this.f180493e = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pv3();
        lVar.f152198b = new r45.qv3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/harddeviceauth";
        lVar.f152200d = 541;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f180493e = a17;
        r45.pv3 pv3Var = (r45.pv3) a17.f152243a.f152217a;
        r45.nv3 nv3Var = new r45.nv3();
        nv3Var.f463224d = str2;
        nv3Var.f463225e = str3;
        pv3Var.f464948d = nv3Var;
        pv3Var.f464949e = i17;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        pv3Var.f464950f = cu5Var;
        this.f180494f = str3;
        this.f180495g = str;
    }

    public byte[] H() {
        try {
            return ((r45.qv3) this.f180493e.f152244b.f152233a).f465829f.f453374f.f273689a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.NetSceneHardDeviceAuth", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f180492d = u0Var;
        return mo9409x10f9447a(sVar, this.f180493e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 541;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        byte[] bArr2;
        java.lang.String str2;
        byte[] bArr3;
        byte[] bArr4;
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneHardDeviceAuth", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        v32.b P0 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().P0(this.f180494f);
        java.lang.String str3 = this.f180495g;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f180493e;
            r45.qv3 qv3Var = (r45.qv3) oVar.f152244b.f152233a;
            if (P0 != null) {
                byte[] H = H();
                if (H != null) {
                    P0.f66600x4e091566 = H;
                }
                P0.f318636v = qv3Var.f465831h;
                P0.f318635u = qv3Var.f465830g;
                P0.f318634t = true;
                com.p314xaae8f345.mm.p944x882e457a.n nVar = oVar.f152244b;
                try {
                    bArr2 = ((r45.qv3) nVar.f152233a).f465827d.f453374f.f273689a;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.NetSceneHardDeviceAuth", e17, "", new java.lang.Object[0]);
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    bArr3 = H;
                    u32.h1.a().h(P0.f66609x4b6e688a, bArr2, 2);
                    if (u32.h1.c().f180539a != null) {
                        str2 = str3;
                        ((u32.k1) u32.h1.c().f180539a).c(P0.f66609x4b6e688a, bArr2);
                    } else {
                        str2 = str3;
                    }
                    P0.f66612x1c34c84e = bArr2;
                } else {
                    str2 = str3;
                    bArr3 = H;
                }
                try {
                    bArr4 = ((r45.qv3) nVar.f152233a).f465828e.f453374f.f273689a;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.NetSceneHardDeviceAuth", e18, "", new java.lang.Object[0]);
                    bArr4 = null;
                }
                if (bArr4 != null) {
                    u32.h1.a().h(P0.f66609x4b6e688a, bArr4, 3);
                    P0.f66611x1c34a862 = bArr4;
                }
                byte[] H2 = H();
                if (bArr3 != null) {
                    z17 = true;
                    u32.h1.a().h(P0.f66609x4b6e688a, H2, 1);
                    P0.f66600x4e091566 = bArr3;
                } else {
                    z17 = true;
                }
                P0.f318637w = java.lang.System.currentTimeMillis() / 1000;
                P0.f318634t = z17;
                if (2 == u32.h1.a().c(P0.f66609x4b6e688a)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0.n(str2, P0.f66613x4b6e88aa, 2, P0.f66606x5fdff396);
                }
                u32.h1.a().i(P0.f66609x4b6e688a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneHardDeviceAuth", "update local device auth infos = %b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().mo9952xce0038c9(P0, new java.lang.String[0])));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NetSceneHardDeviceAuth", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceIdServer == null");
            }
        } else {
            if (P0 != null) {
                u32.h1.a().a(P0.f66609x4b6e688a);
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di();
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0.n(str3, P0.f66613x4b6e88aa, 4, P0.f66606x5fdff396);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().m(str3, 3);
        }
        this.f180492d.mo815x76e0bfae(i18, i19, str, this);
    }
}
