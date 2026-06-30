package com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29;

/* loaded from: classes4.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f233902d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f233903e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f233904f;

    public c(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.of5();
        lVar.f152198b = new r45.pf5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/pushnewtips";
        lVar.f152200d = 597;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f233903e = a17;
        ((r45.of5) a17.f152243a.f152217a).f463762g = str;
        this.f233904f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f233902d = u0Var;
        return mo9409x10f9447a(sVar, this.f233903e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 597;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTips.NetScenePushNewTips", "errType:" + i18 + " errCode:" + i19);
            this.f233902d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.pf5 pf5Var = (r45.pf5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        boolean z17 = pf5Var.f464542d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.String str2 = this.f233904f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsHelper", "setLocalNewTipsState() uniqueId:%s isReject:%s", str2, valueOf);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("new_tips_" + gm0.m.i());
        M.getClass();
        M.putBoolean(str2, z17);
        this.f233902d.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NetScenePushNewTips", "onGYNetEnd() uniqueId:%s IsReject:%s", str2, java.lang.Boolean.valueOf(pf5Var.f464542d));
    }
}
