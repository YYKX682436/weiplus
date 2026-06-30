package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class bj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.cj f228290d;

    public bj(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.cj cjVar) {
        this.f228290d = cjVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.cj cjVar = this.f228290d;
        if (cjVar.f228331d != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.lj ljVar = cjVar.f228333f;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = ljVar.f228683a.X;
            if (interfaceC4987x84e327cb == null || !interfaceC4987x84e327cb.mo42933xb5885648().equals(cjVar.f228331d.mo42933xb5885648())) {
                return;
            }
            if (!cjVar.f228332e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "somethings error.");
                ljVar.f228683a.R.setVisibility(8);
                ljVar.f228683a.Q.setVisibility(0);
                ljVar.f228683a.getClass();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "somethings success.");
            ljVar.f228683a.X = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6.class))).wi(ljVar.f228683a.X.mo42933xb5885648());
            ljVar.f228683a.R.setVisibility(8);
            ljVar.f228683a.P.setVisibility(0);
            ljVar.f228683a.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9 = ljVar.f228683a;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = activityC16387x8521db9.X;
            activityC16387x8521db9.J1 = 4;
            activityC16387x8521db9.P.m43719xc040f7d2(interfaceC4987x84e327cb2);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6824xd593096d c6824xd593096d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6824xd593096d();
            c6824xd593096d.f141469d = 8L;
            c6824xd593096d.k();
        }
    }
}
