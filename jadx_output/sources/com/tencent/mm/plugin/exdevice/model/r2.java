package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class r2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f99053d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f99054e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.nv3 f99055f;

    public r2(r45.nv3 nv3Var, int i17) {
        this.f99055f = nv3Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hr6();
        lVar.f70665b = new r45.ir6();
        lVar.f70667d = 537;
        lVar.f70666c = "/cgi-bin/micromsg-bin/unbindharddevice";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f99054e = a17;
        r45.hr6 hr6Var = (r45.hr6) a17.f70710a.f70684a;
        hr6Var.f376401d = nv3Var;
        hr6Var.f376402e = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f99053d = u0Var;
        return dispatch(sVar, this.f99054e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 537;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneUnBindHardDevice", "onGYNetEnd netId = %d, errType= %d, errCode = %d , errMsg =%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.plugin.exdevice.model.a2.INSTANCE.i(0L);
        v32.c Ui = com.tencent.mm.plugin.exdevice.model.l3.Ui();
        r45.nv3 nv3Var = this.f99055f;
        v32.b P0 = Ui.P0(nv3Var.f381692e);
        if (P0 != null) {
            if (u32.h1.c().f99006a != null) {
                if (!((u32.k1) u32.h1.c().f99006a).e(P0.field_mac)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "stopChannel Failed!!!");
                }
            }
            if (!com.tencent.mm.plugin.exdevice.model.l3.Ui().y0(nv3Var.f381692e, nv3Var.f381691d)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "deleteByDeviceId Failed!!!");
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "getByDeviceIdServer Failed!!! DeviceIDServer = %s", nv3Var.f381692e);
        }
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "scene.getType() = %s", 537);
        }
        com.tencent.mm.modelbase.o oVar = this.f99054e;
        if (((oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.ir6) fVar) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "UnbindHardDevice resp or req is null");
        }
        this.f99053d.onSceneEnd(i18, i19, str, this);
    }
}
