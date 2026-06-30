package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public final class z2 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13315x6be26709 f180105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f180106b;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13315x6be26709 activityC13315x6be26709, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8) {
        this.f180105a = activityC13315x6be26709;
        this.f180106b = viewOnClickListenerC22631x1cc07cc8;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13315x6be26709 activityC13315x6be26709 = this.f180105a;
        java.lang.String obj = ((android.widget.TextView) activityC13315x6be26709.findViewById(com.p314xaae8f345.mm.R.id.t2i)).getText().toString();
        android.view.View findViewById = activityC13315x6be26709.findViewById(com.p314xaae8f345.mm.R.id.t2j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 personalSwitch = this.f180106b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(personalSwitch, "$personalSwitch");
        activityC13315x6be26709.T6(obj, findViewById, personalSwitch);
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.Di(true);
            com.p314xaae8f345.mm.p2614xca6eae71.c0.f274758a.d(true);
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.Di(false);
            com.p314xaae8f345.mm.p2614xca6eae71.c0.f274758a.e(com.p314xaae8f345.mm.p2614xca6eae71.z.f274948d);
        }
    }
}
