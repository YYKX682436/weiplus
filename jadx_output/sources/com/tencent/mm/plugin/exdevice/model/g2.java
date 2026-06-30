package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes9.dex */
public class g2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f98908d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f98909e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f98910f;

    /* renamed from: g, reason: collision with root package name */
    public final int f98911g;

    public g2(r45.rf4 rf4Var, java.lang.String str, java.lang.String str2, int i17) {
        this.f98909e = null;
        this.f98910f = null;
        this.f98911g = 0;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.wo6();
        lVar.f70665b = new r45.xo6();
        lVar.f70666c = "/cgi-bin/mmoc-bin/hardware/transfermsgtodevice";
        lVar.f70667d = 1717;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f98909e = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneGetAppMsgInfo", "deviceid %s", str2);
        r45.wo6 wo6Var = (r45.wo6) a17.f70710a.f70684a;
        wo6Var.f389348e = str;
        wo6Var.f389347d = str2;
        wo6Var.f389349f = rf4Var;
        wo6Var.f389350g = i17;
        this.f98910f = str2;
        this.f98911g = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f98908d = u0Var;
        return dispatch(sVar, this.f98909e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1717;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneGetAppMsgInfo", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        this.f98908d.onSceneEnd(i18, i19, str, this);
    }
}
