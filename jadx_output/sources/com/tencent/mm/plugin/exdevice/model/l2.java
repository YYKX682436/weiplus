package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes8.dex */
public class l2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f98970d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f98971e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f98972f;

    public l2(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f98971e = null;
        this.f98972f = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.sv3();
        lVar.f70665b = new r45.tv3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/device/subscribestatus";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f98971e = a17;
        r45.sv3 sv3Var = (r45.sv3) a17.f70710a.f70684a;
        sv3Var.f385980d = com.tencent.mm.protobuf.g.c(str2);
        sv3Var.f385981e = com.tencent.mm.protobuf.g.c(str3);
        sv3Var.f385982f = i17;
        this.f98972f = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f98970d = u0Var;
        return dispatch(sVar, this.f98971e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneHardDeviceStatusSubscribe", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        com.tencent.mm.plugin.exdevice.model.l3.Ui().P0(this.f98972f);
        if (i18 == 0 && i19 == 0) {
            r45.ie baseResponse = ((r45.tv3) this.f98971e.f70711b.f70700a).getBaseResponse();
            int i27 = baseResponse.f376959d;
            r45.du5 du5Var = baseResponse.f376960e;
            if (du5Var.f372757e) {
                du5Var.getClass();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneHardDeviceStatusSubscribe", "HardDeviceStatusSubResponse: ret=" + i27 + ",msg=" + str);
        }
        this.f98970d.onSceneEnd(i18, i19, str, this);
    }
}
