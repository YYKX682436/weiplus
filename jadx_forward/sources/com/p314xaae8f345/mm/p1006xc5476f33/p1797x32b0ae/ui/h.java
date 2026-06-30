package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 f225946d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 c16237x250976b0) {
        this.f225946d = c16237x250976b0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 c16237x250976b0 = this.f225946d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c uiEventListener = c16237x250976b0.getUiEventListener();
        if (uiEventListener != null) {
            uiEventListener.b(c16237x250976b0.getHorizontalScroll() ? c16237x250976b0.getTranslationX() : c16237x250976b0.getTranslationY());
        }
    }
}
