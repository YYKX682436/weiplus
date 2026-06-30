package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f228456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f228457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.t2 f228458f;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.t2 t2Var, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, boolean z17) {
        this.f228458f = t2Var;
        this.f228456d = interfaceC4987x84e327cb;
        this.f228457e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f228456d;
        if (interfaceC4987x84e327cb != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.t2 t2Var = this.f228458f;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = t2Var.f228974a.Z1;
            if (interfaceC4987x84e327cb2 == null || !interfaceC4987x84e327cb2.mo42933xb5885648().equals(interfaceC4987x84e327cb.mo42933xb5885648())) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = t2Var.f228974a;
            if (!this.f228457e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "somethings error.");
                activityC16363x8a0a619d.T.setVisibility(8);
                activityC16363x8a0a619d.S.setVisibility(0);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "somethings success.");
            activityC16363x8a0a619d.Z1 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6.class))).wi(activityC16363x8a0a619d.Z1.mo42933xb5885648());
            activityC16363x8a0a619d.T.setVisibility(8);
            activityC16363x8a0a619d.R.setVisibility(0);
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb3 = activityC16363x8a0a619d.Z1;
            activityC16363x8a0a619d.f227618o3 = 3;
            activityC16363x8a0a619d.R.m43719xc040f7d2(interfaceC4987x84e327cb3);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6824xd593096d c6824xd593096d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6824xd593096d();
            c6824xd593096d.f141469d = 11L;
            c6824xd593096d.k();
        }
    }
}
