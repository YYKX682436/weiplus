package uw2;

/* loaded from: classes2.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PathMeasure f513182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float[] f513183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d f513184f;

    public d(android.graphics.PathMeasure pathMeasure, float[] fArr, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d c13821x319c273d) {
        this.f513182d = pathMeasure;
        this.f513183e = fArr;
        this.f513184f = c13821x319c273d;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.graphics.PathMeasure pathMeasure = this.f513182d;
        float[] fArr = this.f513183e;
        pathMeasure.getPosTan(floatValue, fArr, null);
        float length = floatValue / (pathMeasure.getLength() * 0.5f);
        if (length < 0.0f) {
            length = 0.0f;
        }
        if (length > 1.0f) {
            length = 1.0f;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d c13821x319c273d = this.f513184f;
        c13821x319c273d.setScaleX(length);
        c13821x319c273d.setScaleY(length);
        c13821x319c273d.setX(fArr[0]);
        c13821x319c273d.setY(fArr[1]);
    }
}
