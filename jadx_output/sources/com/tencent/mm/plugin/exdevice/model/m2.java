package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes4.dex */
public class m2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f98993d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f98994e;

    public m2(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f98994e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yv5();
        lVar.f70665b = new r45.zv5();
        lVar.f70666c = "/cgi-bin/mmoc-bin/hardware/searchbleharddevice";
        lVar.f70667d = 1706;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f98994e = a17;
        r45.yv5 yv5Var = (r45.yv5) a17.f70710a.f70684a;
        yv5Var.f391425d = str;
        yv5Var.f391426e = str2 == null ? "" : str2;
        yv5Var.f391427f = str3 == null ? "" : str3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f98993d = u0Var;
        return dispatch(sVar, this.f98994e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1706;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneSearchBLEHardDevice", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        this.f98993d.onSceneEnd(i18, i19, str, this);
    }
}
