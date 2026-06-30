package ck3;

/* loaded from: classes14.dex */
public final class y implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck3.a0 f124058d;

    public y(ck3.a0 a0Var) {
        this.f124058d = a0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue("canvasTranslationX");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        ck3.a0 a0Var = this.f124058d;
        a0Var.f123986p = intValue;
        android.graphics.RectF rectF = a0Var.f123985o;
        if (rectF == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animation.getAnimatedValue("translationX"), "null cannot be cast to non-null type kotlin.Int");
        rectF.left = ((java.lang.Integer) r5).intValue();
        android.graphics.RectF rectF2 = a0Var.f123985o;
        if (rectF2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animation.getAnimatedValue("translationY"), "null cannot be cast to non-null type kotlin.Int");
        rectF2.top = ((java.lang.Integer) r5).intValue();
        android.graphics.RectF rectF3 = a0Var.f123985o;
        if (rectF3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
            throw null;
        }
        if (rectF3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
            throw null;
        }
        float f17 = rectF3.left;
        float f18 = a0Var.f123990t;
        java.lang.Object animatedValue2 = animation.getAnimatedValue("scaleX");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        rectF3.right = f17 + (f18 * ((java.lang.Float) animatedValue2).floatValue());
        android.graphics.RectF rectF4 = a0Var.f123985o;
        if (rectF4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
            throw null;
        }
        if (rectF4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
            throw null;
        }
        float f19 = rectF4.top;
        float f27 = a0Var.f123991u;
        java.lang.Object animatedValue3 = animation.getAnimatedValue("scaleY");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        rectF4.bottom = f19 + (f27 * ((java.lang.Float) animatedValue3).floatValue());
        java.lang.Object animatedValue4 = animation.getAnimatedValue("bgAlpha");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
        a0Var.f123994x = ((java.lang.Integer) animatedValue4).intValue();
        a0Var.postInvalidate();
    }
}
