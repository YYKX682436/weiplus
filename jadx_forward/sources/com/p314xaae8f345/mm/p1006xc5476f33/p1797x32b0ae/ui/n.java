package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class n implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 f225978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f225979e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39, float f17) {
        this.f225978d = c16238x79483a39;
        this.f225979e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c uiEventListener = this.f225978d.getUiEventListener();
        if (uiEventListener != null) {
            uiEventListener.b(this.f225979e);
        }
    }
}
