package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class r8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f228905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f228907f;

    public r8(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d, boolean z17) {
        this.f228905d = interfaceC4987x84e327cb;
        this.f228906e = activityC16371xf216ae6d;
        this.f228907f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = this.f228905d;
        if (interfaceC4987x84e327cb2 == null || (interfaceC4987x84e327cb = (activityC16371xf216ae6d = this.f228906e).Z1) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(interfaceC4987x84e327cb.mo42933xb5885648(), interfaceC4987x84e327cb2.mo42933xb5885648())) {
            return;
        }
        if (!this.f228907f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[EmojiDownloadCallback] error.");
            android.widget.LinearLayout linearLayout = activityC16371xf216ae6d.T;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.TextView textView = activityC16371xf216ae6d.S;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[EmojiDownloadCallback] success.");
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6 g6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6.class);
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb3 = activityC16371xf216ae6d.Z1;
        activityC16371xf216ae6d.Z1 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r1) g6Var).wi(interfaceC4987x84e327cb3 != null ? interfaceC4987x84e327cb3.mo42933xb5885648() : null);
        android.widget.LinearLayout linearLayout2 = activityC16371xf216ae6d.T;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a c10448x87c5001a = activityC16371xf216ae6d.R;
        if (c10448x87c5001a != null) {
            c10448x87c5001a.setVisibility(0);
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb4 = activityC16371xf216ae6d.Z1;
        activityC16371xf216ae6d.f227742o3 = 3;
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a c10448x87c5001a2 = activityC16371xf216ae6d.R;
        if (c10448x87c5001a2 != null) {
            c10448x87c5001a2.m43719xc040f7d2(interfaceC4987x84e327cb4);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6824xd593096d c6824xd593096d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6824xd593096d();
        c6824xd593096d.f141469d = 11L;
        c6824xd593096d.k();
    }
}
