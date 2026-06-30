package com.tencent.mm.modelstat;

/* loaded from: classes4.dex */
public class r extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71548d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71549e;

    public r(int i17, java.lang.String str, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.y2();
        lVar.f70665b = new r45.z2();
        lVar.f70666c = "/cgi-bin/mmoc-bin/ad/addatareport";
        lVar.f70667d = 1295;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71548d = a17;
        r45.y2 y2Var = (r45.y2) a17.f70710a.f70684a;
        r45.j3 j3Var = new r45.j3();
        j3Var.f377526d = i17;
        j3Var.f377527e = new com.tencent.mm.protobuf.g(str.getBytes());
        j3Var.f377528f = i18;
        y2Var.f390724d.add(j3Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAdDataReport", "init logId:%d, logStr:%s", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        this.f71549e = u0Var;
        int dispatch = dispatch(sVar, this.f71548d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        return 1295;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        r45.z2 z2Var = (r45.z2) this.f71548d.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAdDataReport", "onGYNetEnd, errType = %d, errCode = %d, ret=%d, msg=%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(z2Var.f391625d), z2Var.f391626e);
        this.f71549e.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.modelstat.NetSceneAdDataReport");
    }
}
