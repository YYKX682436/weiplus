package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes3.dex */
public final class n4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f255649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f255650g;

    public n4(android.view.View view, int i17, int i18, int i19) {
        this.f255647d = view;
        this.f255648e = i17;
        this.f255649f = i18;
        this.f255650g = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.view.View view = this.f255647d;
        if (view == null) {
            return;
        }
        view.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.m4(this.f255648e, this.f255649f, animatedFraction, this.f255650g));
    }
}
