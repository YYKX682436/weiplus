package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class v7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f229065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f229066e;

    public v7(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        this.f229065d = activityC16371xf216ae6d;
        this.f229066e = interfaceC4987x84e327cb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f229065d;
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a c10448x87c5001a = activityC16371xf216ae6d.f227765x1;
        if (c10448x87c5001a != null) {
            c10448x87c5001a.m43719xc040f7d2(this.f229066e);
        }
        android.widget.LinearLayout linearLayout = activityC16371xf216ae6d.U;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout2 = activityC16371xf216ae6d.V;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout3 = activityC16371xf216ae6d.W;
        if (linearLayout3 == null) {
            return;
        }
        linearLayout3.setVisibility(0);
    }
}
