package ng2;

/* loaded from: classes10.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f418505d;

    public l(ng2.s sVar) {
        this.f418505d = sVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.FrameLayout frameLayout = this.f418505d.f400105s;
        if (frameLayout != null) {
            java.lang.Object animatedValue = it.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            frameLayout.setBackgroundColor(((java.lang.Integer) animatedValue).intValue());
        }
    }
}
