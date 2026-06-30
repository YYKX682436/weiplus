package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 f225953d;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0) {
        this.f225953d = activityC16262x8382bfc0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0.f225885x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0 = this.f225953d;
        activityC16262x8382bfc0.P6(false);
        float f17 = (float) activityC16262x8382bfc0.f225891i;
        android.view.View findViewById = activityC16262x8382bfc0.findViewById(com.p314xaae8f345.mm.R.id.gd9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 c16237x250976b0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) findViewById;
        if (c16237x250976b0.horizontalScroll) {
            c16237x250976b0.setTranslationX(f17);
        } else {
            c16237x250976b0.setTranslationY(f17);
        }
        c16237x250976b0.e(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a.f225913f, 300L, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.j(c16237x250976b0));
    }
}
