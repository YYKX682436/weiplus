package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes3.dex */
public final class q4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f255752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5 f255753g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f255754h;

    public q4(android.view.View view, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5 activityC18624x35d9f9b5, int i19) {
        this.f255750d = view;
        this.f255751e = i17;
        this.f255752f = i18;
        this.f255753g = activityC18624x35d9f9b5;
        this.f255754h = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.view.View view = this.f255750d;
        if (view == null) {
            return;
        }
        view.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p4(this.f255751e, this.f255752f, animatedFraction, this.f255753g, this.f255754h));
    }
}
