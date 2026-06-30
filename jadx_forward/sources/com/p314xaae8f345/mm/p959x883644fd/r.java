package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes4.dex */
public class r extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f153081d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f153082e;

    public r(int i17, java.lang.String str, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.y2();
        lVar.f152198b = new r45.z2();
        lVar.f152199c = "/cgi-bin/mmoc-bin/ad/addatareport";
        lVar.f152200d = 1295;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f153081d = a17;
        r45.y2 y2Var = (r45.y2) a17.f152243a.f152217a;
        r45.j3 j3Var = new r45.j3();
        j3Var.f459059d = i17;
        j3Var.f459060e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(str.getBytes());
        j3Var.f459061f = i18;
        y2Var.f472257d.add(j3Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAdDataReport", "init logId:%d, logStr:%s", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        this.f153082e = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f153081d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        return 1295;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        r45.z2 z2Var = (r45.z2) this.f153081d.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAdDataReport", "onGYNetEnd, errType = %d, errCode = %d, ret=%d, msg=%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(z2Var.f473158d), z2Var.f473159e);
        this.f153082e.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.modelstat.NetSceneAdDataReport");
    }
}
