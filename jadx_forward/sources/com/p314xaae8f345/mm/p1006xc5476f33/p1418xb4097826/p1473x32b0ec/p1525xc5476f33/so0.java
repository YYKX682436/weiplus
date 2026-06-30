package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes2.dex */
public final class so0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f195826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f195827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f195828f;

    public so0(android.view.View view, android.graphics.Rect rect, android.view.View view2) {
        this.f195826d = view;
        this.f195827e = rect;
        this.f195828f = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = (0.3f - floatValue) / 0.3f;
        android.view.View view = this.f195826d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        android.view.View view2 = this.f195828f;
        android.graphics.Rect rect = this.f195827e;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = (int) (-(rect.top + (((view2.getHeight() * f17) * 0.3d) / 2)));
        }
        view.setTranslationX((float) (rect.left + (((f17 * view2.getWidth()) * 0.3d) / 2)));
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
        view.requestLayout();
    }
}
