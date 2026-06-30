package com.tencent.mm.modelsimple;

/* loaded from: classes2.dex */
public class q0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71399d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71400e;

    public q0(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hn3();
        lVar.f70665b = new r45.in3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getresourcecontrolinfo";
        lVar.f70667d = 725;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71399d = a17;
        ((r45.hn3) a17.f70710a.f70684a).f376312d = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate GetResourceControlInfo type[%d], stack[%s]", java.lang.Integer.valueOf(i17), new com.tencent.mm.sdk.platformtools.z3());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71400e = u0Var;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 1L, 1L, true);
        return dispatch(sVar, this.f71399d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 725;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate GetResourceControlInfo onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 2L, 1L, true);
        }
        this.f71400e.onSceneEnd(i18, i19, str, this);
    }
}
