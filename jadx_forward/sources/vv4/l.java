package vv4;

/* loaded from: classes3.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f522008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f522009e;

    public l(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75) {
        this.f522008d = imageView;
        this.f522009e = activityC19216xc2476b75;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.widget.ImageView imageView = this.f522008d;
        if (floatValue <= 0.1f) {
            imageView.setAlpha(10 * floatValue);
        } else if (floatValue >= 0.9f) {
            imageView.setAlpha((1.0f - floatValue) * 10);
        }
        imageView.setTranslationY(floatValue * (((java.lang.Number) ((jz5.n) this.f522009e.f263167f).mo141623x754a37bb()).intValue() - imageView.getHeight()));
    }
}
