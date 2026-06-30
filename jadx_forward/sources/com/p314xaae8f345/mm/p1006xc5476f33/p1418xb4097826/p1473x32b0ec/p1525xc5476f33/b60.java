package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class b60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f193510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f193511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f193512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 f193513g;

    public b60(android.view.View view, android.view.View view2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var) {
        this.f193510d = view;
        this.f193511e = view2;
        this.f193512f = r60Var;
        this.f193513g = ep0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        android.view.View view = this.f193510d;
        if (view != null) {
            i17 = view.getHeight();
            int height = this.f193511e.getHeight();
            if (i17 < height) {
                i17 = height;
            }
        } else {
            i17 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f193512f;
        android.widget.ScrollView scrollView = r60Var.f195636x;
        if (scrollView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainerScrollView");
            throw null;
        }
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofInt(scrollView, "scrollY", 0, i17 + ((java.lang.Number) ((jz5.n) r60Var.I).mo141623x754a37bb()).intValue()).setDuration(200L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
        duration.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a60(r60Var, view, this.f193513g));
        duration.start();
    }
}
