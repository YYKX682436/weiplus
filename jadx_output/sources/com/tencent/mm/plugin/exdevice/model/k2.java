package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class k2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f98959d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f98960e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f98961f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f98962g;

    public k2(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, byte[] bArr) {
        this.f98960e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pv3();
        lVar.f70665b = new r45.qv3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/harddeviceauth";
        lVar.f70667d = 541;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f98960e = a17;
        r45.pv3 pv3Var = (r45.pv3) a17.f70710a.f70684a;
        r45.nv3 nv3Var = new r45.nv3();
        nv3Var.f381691d = str2;
        nv3Var.f381692e = str3;
        pv3Var.f383415d = nv3Var;
        pv3Var.f383416e = i17;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        pv3Var.f383417f = cu5Var;
        this.f98961f = str3;
        this.f98962g = str;
    }

    public byte[] H() {
        try {
            return ((r45.qv3) this.f98960e.f70711b.f70700a).f384296f.f371841f.f192156a;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f98959d = u0Var;
        return dispatch(sVar, this.f98960e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 541;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        byte[] bArr2;
        java.lang.String str2;
        byte[] bArr3;
        byte[] bArr4;
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneHardDeviceAuth", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        v32.b P0 = com.tencent.mm.plugin.exdevice.model.l3.Ui().P0(this.f98961f);
        java.lang.String str3 = this.f98962g;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.modelbase.o oVar = this.f98960e;
            r45.qv3 qv3Var = (r45.qv3) oVar.f70711b.f70700a;
            if (P0 != null) {
                byte[] H = H();
                if (H != null) {
                    P0.field_authBuf = H;
                }
                P0.f237103v = qv3Var.f384298h;
                P0.f237102u = qv3Var.f384297g;
                P0.f237101t = true;
                com.tencent.mm.modelbase.n nVar = oVar.f70711b;
                try {
                    bArr2 = ((r45.qv3) nVar.f70700a).f384294d.f371841f.f192156a;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", e17, "", new java.lang.Object[0]);
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    bArr3 = H;
                    u32.h1.a().h(P0.field_mac, bArr2, 2);
                    if (u32.h1.c().f99006a != null) {
                        str2 = str3;
                        ((u32.k1) u32.h1.c().f99006a).c(P0.field_mac, bArr2);
                    } else {
                        str2 = str3;
                    }
                    P0.field_sessionKey = bArr2;
                } else {
                    str2 = str3;
                    bArr3 = H;
                }
                try {
                    bArr4 = ((r45.qv3) nVar.f70700a).f384295e.f371841f.f192156a;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", e18, "", new java.lang.Object[0]);
                    bArr4 = null;
                }
                if (bArr4 != null) {
                    u32.h1.a().h(P0.field_mac, bArr4, 3);
                    P0.field_sessionBuf = bArr4;
                }
                byte[] H2 = H();
                if (bArr3 != null) {
                    z17 = true;
                    u32.h1.a().h(P0.field_mac, H2, 1);
                    P0.field_authBuf = bArr3;
                } else {
                    z17 = true;
                }
                P0.f237104w = java.lang.System.currentTimeMillis() / 1000;
                P0.f237101t = z17;
                if (2 == u32.h1.a().c(P0.field_mac)) {
                    com.tencent.mm.plugin.exdevice.model.l3.Di();
                    com.tencent.mm.plugin.exdevice.model.o0.n(str2, P0.field_url, 2, P0.field_deviceID);
                }
                u32.h1.a().i(P0.field_mac);
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneHardDeviceAuth", "update local device auth infos = %b", java.lang.Boolean.valueOf(com.tencent.mm.plugin.exdevice.model.l3.Ui().update(P0, new java.lang.String[0])));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NetSceneHardDeviceAuth", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceIdServer == null");
            }
        } else {
            if (P0 != null) {
                u32.h1.a().a(P0.field_mac);
                com.tencent.mm.plugin.exdevice.model.l3.Di();
                com.tencent.mm.plugin.exdevice.model.o0.n(str3, P0.field_url, 4, P0.field_deviceID);
            }
            com.tencent.mm.plugin.exdevice.model.l3.Di().m(str3, 3);
        }
        this.f98959d.onSceneEnd(i18, i19, str, this);
    }
}
