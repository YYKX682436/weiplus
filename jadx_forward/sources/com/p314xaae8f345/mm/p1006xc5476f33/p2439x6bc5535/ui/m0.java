package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes5.dex */
public class m0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.n0 f269580d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.n0 n0Var) {
        this.f269580d = n0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.m48017xd0f4c159(true);
        en.k kVar = (en.k) i95.n0.c(en.k.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.n0 n0Var = this.f269580d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebWxPopUnlockUI", "onSceneEnd() called with handleErrMsg:%s errType = [" + i17 + "], errCode = [" + i18 + "], errMsg = [" + str + "], scene = [" + m1Var + "]", java.lang.Boolean.valueOf(((en.a) kVar).Zi(n0Var.f269585g, i17, i18, str)));
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        w11.w1.wi().h(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebWxPopUnlockUI", "trigger netSceneSync notify");
        n0Var.f269585g.finish();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6191x1700be4c().e();
    }
}
