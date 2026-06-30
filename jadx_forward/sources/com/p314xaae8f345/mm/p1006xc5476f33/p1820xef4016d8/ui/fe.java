package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class fe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def f228438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f228439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f228440f;

    public fe(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, boolean z17) {
        this.f228438d = activityC16377xf00b6def;
        this.f228439e = interfaceC4987x84e327cb;
        this.f228440f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def = this.f228438d;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = activityC16377xf00b6def.Z;
        if (interfaceC4987x84e327cb2 == null || (interfaceC4987x84e327cb = this.f228439e) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(interfaceC4987x84e327cb2.mo42933xb5885648(), interfaceC4987x84e327cb.mo42933xb5885648())) {
            return;
        }
        if (!this.f228440f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "EmojiDownloadCallback error.");
            android.widget.LinearLayout linearLayout = activityC16377xf00b6def.T;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.TextView textView = activityC16377xf00b6def.S;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "EmojiDownloadCallback success.");
        activityC16377xf00b6def.Z = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6.class))).wi(interfaceC4987x84e327cb2.mo42933xb5885648());
        android.widget.LinearLayout linearLayout2 = activityC16377xf00b6def.T;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a c10448x87c5001a = activityC16377xf00b6def.R;
        if (c10448x87c5001a != null) {
            c10448x87c5001a.setVisibility(0);
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb3 = activityC16377xf00b6def.Z;
        activityC16377xf00b6def.O1 = 4;
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a c10448x87c5001a2 = activityC16377xf00b6def.R;
        if (c10448x87c5001a2 != null) {
            c10448x87c5001a2.m43719xc040f7d2(interfaceC4987x84e327cb3);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6824xd593096d c6824xd593096d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6824xd593096d();
        activityC16377xf00b6def.getClass();
        c6824xd593096d.f141469d = 8L;
        c6824xd593096d.k();
    }
}
