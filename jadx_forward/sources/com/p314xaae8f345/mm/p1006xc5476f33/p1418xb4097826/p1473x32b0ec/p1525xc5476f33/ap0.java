package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes2.dex */
public final class ap0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f193459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f193460e;

    public ap0(android.view.View view, android.graphics.Rect rect) {
        this.f193459d = view;
        this.f193460e = rect;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = (floatValue - 0.3f) / 0.7f;
        android.view.View view = this.f193459d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        android.graphics.Rect rect = this.f193460e;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = (int) (-((1 - f17) * rect.top));
        }
        view.setTranslationX((1 - f17) * rect.left);
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
        view.requestLayout();
    }
}
