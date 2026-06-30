package gd2;

/* loaded from: classes3.dex */
public final class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.x f352091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352092e;

    public t(gd2.x xVar, int i17) {
        this.f352091d = xVar;
        this.f352092e = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        gd2.x xVar = this.f352091d;
        if (floatValue <= 0.1f) {
            android.widget.ImageView imageView = xVar.f352106j;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
                throw null;
            }
            imageView.setAlpha(10 * floatValue);
        } else if (floatValue >= 0.9f) {
            android.widget.ImageView imageView2 = xVar.f352106j;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
                throw null;
            }
            imageView2.setAlpha((1.0f - floatValue) * 10);
        }
        android.widget.ImageView imageView3 = xVar.f352106j;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
            throw null;
        }
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
            throw null;
        }
        imageView3.setTranslationY(floatValue * (this.f352092e - imageView3.getHeight()));
    }
}
