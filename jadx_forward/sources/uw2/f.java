package uw2;

/* loaded from: classes2.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PathMeasure f513195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float[] f513196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513197f;

    public f(android.graphics.PathMeasure pathMeasure, float[] fArr, android.view.View view) {
        this.f513195d = pathMeasure;
        this.f513196e = fArr;
        this.f513197f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.graphics.PathMeasure pathMeasure = this.f513195d;
        float[] fArr = this.f513196e;
        pathMeasure.getPosTan(floatValue, fArr, null);
        float f17 = fArr[0];
        android.view.View view = this.f513197f;
        view.setTranslationX(f17);
        view.setTranslationY(fArr[1]);
    }
}
