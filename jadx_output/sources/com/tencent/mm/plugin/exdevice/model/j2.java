package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes2.dex */
public class j2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f98942d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f98943e;

    public j2() {
        this.f98943e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hq3();
        lVar.f70665b = new r45.iq3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/get_user_bind_iot_device_info";
        lVar.f70667d = 6693;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f98943e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f98942d = u0Var;
        return dispatch(sVar, this.f98943e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6693;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneGetUserBindIotDeviceInfo", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        this.f98942d.onSceneEnd(i18, i19, str, this);
    }
}
