package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes2.dex */
public final class cp0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f193717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f193718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f193719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f193720g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f193721h;

    public cp0(android.view.View view, android.graphics.Rect rect, android.view.View view2, float f17, android.view.View view3) {
        this.f193717d = view;
        this.f193718e = rect;
        this.f193719f = view2;
        this.f193720g = f17;
        this.f193721h = view3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        android.graphics.Rect rect;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = floatValue / 0.3f;
        android.view.View view = this.f193717d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        android.graphics.Rect rect2 = this.f193718e;
        if (marginLayoutParams != null) {
            float f18 = 1 - f17;
            marginLayoutParams.bottomMargin = -((int) (rect2.top + (this.f193720g * f18) + (((f18 * this.f193721h.getHeight()) * 0.3d) / 2)));
            rect = rect2;
        } else {
            rect = rect2;
        }
        view.setTranslationX((float) (rect.left + ((((1 - f17) * this.f193719f.getWidth()) * 0.3d) / 2)));
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
        view.requestLayout();
    }
}
