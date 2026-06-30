package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes2.dex */
public final class v7 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f233037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f233038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f233039f;

    public v7(int i17, int i18, android.view.View view) {
        this.f233037d = i17;
        this.f233038e = i18;
        this.f233039f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator value) {
        android.view.View findViewById;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        float animatedFraction = value.getAnimatedFraction();
        float f17 = this.f233037d + ((this.f233038e - r0) * animatedFraction);
        android.view.View view = this.f233039f;
        android.view.ViewGroup.LayoutParams layoutParams = (view == null || (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.ojy)) == null) ? null : findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) f17;
        }
        android.view.View findViewById2 = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.ojy) : null;
        if (findViewById2 == null) {
            return;
        }
        findViewById2.setLayoutParams(layoutParams);
    }
}
