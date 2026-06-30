package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class gf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f228478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f228479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.Cif f228480f;

    public gf(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.Cif cif, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, boolean z17) {
        this.f228480f = cif;
        this.f228478d = interfaceC4987x84e327cb;
        this.f228479e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f228478d;
        if (interfaceC4987x84e327cb != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.Cif cif = this.f228480f;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = cif.f228560a.L;
            if (interfaceC4987x84e327cb2 == null || !interfaceC4987x84e327cb2.mo42933xb5885648().equals(interfaceC4987x84e327cb.mo42933xb5885648())) {
                return;
            }
            if (!this.f228479e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "somethings error.");
                cif.f228560a.f227867u.setVisibility(8);
                cif.f228560a.f227869w.setVisibility(0);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "somethings success.");
            cif.f228560a.L = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6.class))).wi(cif.f228560a.L.mo42933xb5885648());
            cif.f228560a.f227867u.setVisibility(8);
            cif.f228560a.E.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16379x3e9c9e32 activityC16379x3e9c9e32 = cif.f228560a;
            activityC16379x3e9c9e32.E.m43719xc040f7d2(activityC16379x3e9c9e32.L);
        }
    }
}
