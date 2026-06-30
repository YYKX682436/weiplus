package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes3.dex */
public final class t4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f255847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f255848g;

    public t4(android.view.View view, int i17, int i18, int i19) {
        this.f255845d = view;
        this.f255846e = i17;
        this.f255847f = i18;
        this.f255848g = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.view.View view = this.f255845d;
        if (view == null) {
            return;
        }
        view.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.s4(this.f255846e, this.f255847f, animatedFraction, this.f255848g));
    }
}
