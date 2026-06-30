package com.tencent.mm.modelsimple;

/* loaded from: classes4.dex */
public class h0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71334d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71335e;

    public h0(java.lang.String str, int i17, java.lang.String str2, byte[] bArr, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneEnterTempSession", "NetSceneEnterTempSession %s, %s, %s, %d", str, java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(i18));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.bl0();
        lVar.f70665b = new r45.cl0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/entertempsession";
        lVar.f70667d = 1066;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71335e = a17;
        if (str2 == null) {
            str2 = "";
        } else if (str2.length() > 32 && i17 != 19) {
            str2 = str2.substring(0, 32);
        }
        r45.bl0 bl0Var = (r45.bl0) a17.f70710a.f70684a;
        bl0Var.f370841d = str;
        bl0Var.f370842e = i17;
        bl0Var.f370843f = com.tencent.mm.protobuf.g.c(str2);
        if (bArr == null) {
            bl0Var.f370844g = com.tencent.mm.protobuf.g.b(new byte[0]);
        } else {
            bl0Var.f370844g = com.tencent.mm.protobuf.g.b(bArr);
        }
        bl0Var.f370845h = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneEnterTempSession", "NetSceneEnterTempSession %s, %s, %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bl0Var.f370844g.f192156a.length));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71334d = u0Var;
        return dispatch(sVar, this.f71335e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1066;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneEnterTempSession", "onGYNetEnd: %d, %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f71334d.onSceneEnd(i18, i19, str, this);
    }
}
