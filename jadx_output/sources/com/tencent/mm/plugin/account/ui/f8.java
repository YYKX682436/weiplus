package com.tencent.mm.plugin.account.ui;

/* loaded from: classes2.dex */
public final class f8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f73845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f73846e;

    public f8(android.view.ViewGroup.LayoutParams layoutParams, android.view.View view) {
        this.f73845d = layoutParams;
        this.f73846e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.f73845d;
        layoutParams.height = intValue;
        android.view.View view = this.f73846e;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }
}
