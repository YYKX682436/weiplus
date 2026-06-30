package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class e2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f98882d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f98883e;

    public e2(java.lang.String str, int i17) {
        this.f98883e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.xh();
        lVar.f70665b = new r45.yh();
        lVar.f70666c = "/cgi-bin/micromsg-bin/bindharddevice";
        lVar.f70667d = 536;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f98883e = a17;
        r45.xh xhVar = (r45.xh) a17.f70710a.f70684a;
        xhVar.f390090d = str == null ? "" : str;
        xhVar.f390091e = com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f98882d = u0Var;
        return dispatch(sVar, this.f98883e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 536;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBindHardDevice", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.modelbase.o oVar = this.f98883e;
            r45.yh yhVar = (oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.yh) fVar;
            r45.nv3 nv3Var = yhVar.f391073d;
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBindHardDevice", "hardDevice : DeviceIdServer = %s, DeviceType = %s", nv3Var.f381692e, nv3Var.f381691d);
            java.lang.Object[] objArr = new java.lang.Object[6];
            r45.ov3 ov3Var = yhVar.f391074e;
            objArr[0] = ov3Var.f382539e;
            boolean z17 = true;
            objArr[1] = ov3Var.f382538d;
            objArr[2] = ov3Var.f382540f;
            objArr[3] = ov3Var.f382541g;
            objArr[4] = java.lang.Integer.valueOf(ov3Var.f382542h);
            objArr[5] = yhVar.f391075f == 0 ? "sync" : "async";
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBindHardDevice", "hardDeviceAttr : AuthKey = %s, BrandName = %s, Mac = %s, connProto = %s, ConnStrategy = %s, bindFlag = %s", objArr);
            if (com.tencent.mm.plugin.exdevice.model.l3.Ui().d1(yhVar.f391074e.f382538d, yhVar.f391073d.f381692e) != null) {
                z17 = com.tencent.mm.plugin.exdevice.model.l3.Ui().y0(yhVar.f391073d.f381692e, yhVar.f391074e.f382538d);
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBindHardDevice", "delete local deviceinfo : %s, ret : %b", yhVar.f391074e.f382538d, java.lang.Boolean.valueOf(z17));
            }
            v32.b bVar = new v32.b();
            com.tencent.mm.plugin.exdevice.model.q0.a(bVar, yhVar.f391073d, yhVar.f391074e);
            bVar.field_url = "";
            u32.v d17 = u32.h1.a().d(bVar.field_mac);
            if (d17 != null && d17.f424383e == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBindHardDevice", "before do bind netscene, stop the channel now");
                com.tencent.mm.plugin.exdevice.model.l3.Bi().b(bVar.field_mac);
                u32.w a17 = u32.h1.a();
                long j17 = bVar.field_mac;
                java.util.HashMap hashMap = a17.f424390a;
                if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                    hashMap.remove(java.lang.Long.valueOf(j17));
                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceInfoManager", "remove the device from map : %d", java.lang.Long.valueOf(j17));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceInfoManager", "device id not contains in the map : %d", java.lang.Long.valueOf(j17));
                }
            }
            if (z17) {
                com.tencent.mm.plugin.exdevice.model.l3.Ui().insert(bVar);
            } else {
                com.tencent.mm.plugin.exdevice.model.l3.Ui().i1(bVar);
            }
        }
        this.f98882d.onSceneEnd(i18, i19, str, this);
    }
}
