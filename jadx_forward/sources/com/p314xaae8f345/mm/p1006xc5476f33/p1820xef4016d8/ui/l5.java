package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public class l5 implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f228660a;

    public l5(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.t5 t5Var, in5.s0 s0Var) {
        this.f228660a = s0Var;
    }

    @Override // gb3.i
    /* renamed from: onComplete */
    public void mo66107x815f5438(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "load ok: %s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.k5 k5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.k5(this, z17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            k5Var.run();
        } else {
            this.f228660a.p(com.p314xaae8f345.mm.R.id.ikz).post(k5Var);
        }
    }
}
