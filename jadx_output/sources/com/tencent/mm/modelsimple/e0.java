package com.tencent.mm.modelsimple;

/* loaded from: classes2.dex */
public class e0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71314d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71315e;

    public e0(java.lang.String str, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDelTempSession", "NetSceneDelTempSession %s", str);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.uc0();
        lVar.f70665b = new r45.vc0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/deltempsession";
        lVar.f70667d = 1067;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71315e = a17;
        r45.uc0 uc0Var = (r45.uc0) a17.f70710a.f70684a;
        uc0Var.f387209d = str;
        if (bArr == null) {
            uc0Var.f387210e = com.tencent.mm.protobuf.g.b(new byte[0]);
        } else {
            uc0Var.f387210e = com.tencent.mm.protobuf.g.b(bArr);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71314d = u0Var;
        return dispatch(sVar, this.f71315e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1067;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDelTempSession", "onGYNetEnd: %d, %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f71314d.onSceneEnd(i18, i19, str, this);
    }
}
