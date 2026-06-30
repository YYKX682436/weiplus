package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public final class a3 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13315x6be26709 f179426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f179427b;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13315x6be26709 activityC13315x6be26709, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8) {
        this.f179426a = activityC13315x6be26709;
        this.f179427b = viewOnClickListenerC22631x1cc07cc8;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13315x6be26709 activityC13315x6be26709 = this.f179426a;
        java.lang.String obj = ((android.widget.TextView) activityC13315x6be26709.findViewById(com.p314xaae8f345.mm.R.id.t2f)).getText().toString();
        android.view.View findViewById = activityC13315x6be26709.findViewById(com.p314xaae8f345.mm.R.id.t2g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 recommendUnSaved = this.f179427b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recommendUnSaved, "$recommendUnSaved");
        activityC13315x6be26709.T6(obj, findViewById, recommendUnSaved);
        com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.Ni(z17);
    }
}
