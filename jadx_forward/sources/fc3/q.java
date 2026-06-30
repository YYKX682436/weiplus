package fc3;

/* loaded from: classes5.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f342605d;

    public q(java.util.List list) {
        this.f342605d = list;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        for (fc3.k kVar : this.f342605d) {
            android.widget.TextView textView = kVar.f342587e;
            if (textView != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                java.lang.Object animatedValue = it.getAnimatedValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                textView.setAlpha(kVar.f342586d * ((java.lang.Float) animatedValue).floatValue());
            }
        }
    }
}
