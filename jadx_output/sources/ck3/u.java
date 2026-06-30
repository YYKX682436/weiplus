package ck3;

/* loaded from: classes14.dex */
public final class u implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck3.a0 f42521d;

    public u(ck3.a0 a0Var) {
        this.f42521d = a0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ck3.a0 a0Var = this.f42521d;
        if (a0Var.f42455r <= a0Var.f42457t / 2 || !a0Var.f42460w) {
            java.lang.Object animatedValue = animation.getAnimatedValue("canvasTranslationX");
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            a0Var.f42453p = ((java.lang.Integer) animatedValue).intValue();
        }
        android.graphics.RectF rectF = a0Var.f42452o;
        if (rectF == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        kotlin.jvm.internal.o.e(animation.getAnimatedValue("translationX"), "null cannot be cast to non-null type kotlin.Int");
        rectF.left = ((java.lang.Integer) r5).intValue();
        android.graphics.RectF rectF2 = a0Var.f42452o;
        if (rectF2 == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        kotlin.jvm.internal.o.e(animation.getAnimatedValue("translationY"), "null cannot be cast to non-null type kotlin.Int");
        rectF2.top = ((java.lang.Integer) r5).intValue();
        android.graphics.RectF rectF3 = a0Var.f42452o;
        if (rectF3 == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        if (rectF3 == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        float f17 = rectF3.left;
        float f18 = a0Var.f42457t;
        java.lang.Object animatedValue2 = animation.getAnimatedValue("scaleX");
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        rectF3.right = f17 + (f18 * ((java.lang.Float) animatedValue2).floatValue());
        android.graphics.RectF rectF4 = a0Var.f42452o;
        if (rectF4 == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        if (rectF4 == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        float f19 = rectF4.top;
        float f27 = a0Var.f42458u;
        java.lang.Object animatedValue3 = animation.getAnimatedValue("scaleY");
        kotlin.jvm.internal.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        rectF4.bottom = f19 + (f27 * ((java.lang.Float) animatedValue3).floatValue());
        java.lang.Object animatedValue4 = animation.getAnimatedValue("curPageAlpha");
        kotlin.jvm.internal.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
        a0Var.setAlpha(((java.lang.Float) animatedValue4).floatValue());
        a0Var.postInvalidate();
    }
}
