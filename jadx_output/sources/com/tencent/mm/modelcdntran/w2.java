package com.tencent.mm.modelcdntran;

/* loaded from: classes4.dex */
public class w2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71153d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71154e;

    public w2(int i17, int i18, int i19) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCdnDistance", "summersafecdn init Scene ver %d prov %d city %d [%s]", valueOf, valueOf2, valueOf3, new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.w86();
        lVar.f70665b = new r45.x86();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsgetcdndistance";
        lVar.f70667d = 7989;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71153d = a17;
        r45.w86 w86Var = (r45.w86) a17.f70710a.f70684a;
        w86Var.f388968d = i17;
        w86Var.f388970f = i18;
        w86Var.f388969e = i19;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71154e = u0Var;
        if (gm0.j1.b().h() != 0) {
            return dispatch(sVar, this.f71153d, this);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetCdnDistance", "has not set uin.");
        return -1;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 7989;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.protobuf.g gVar;
        r45.x86 x86Var = (r45.x86) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0 && (gVar = x86Var.f389876d) != null) {
            try {
                ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).setSnsDistanceData(x86Var.f389877e, x86Var.f389879g, x86Var.f389878f, gVar.g());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetCdnDistance", "what: %s", e17.getLocalizedMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetCdnDistance", e17, "", new java.lang.Object[0]);
            }
            this.f71154e.onSceneEnd(i18, i19, str, this);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i18);
        objArr[1] = java.lang.Integer.valueOf(i19);
        objArr[2] = java.lang.Boolean.valueOf(x86Var.f389876d == null);
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetCdnDistance", "onGYNetEnd: [%d ,%d]  data is null :%b", objArr);
        this.f71154e.onSceneEnd(i18, i19, str, this);
    }
}
