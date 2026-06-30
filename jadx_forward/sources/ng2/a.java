package ng2;

/* loaded from: classes5.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.c f418484d;

    public a(ng2.c cVar) {
        this.f418484d = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.FrameLayout frameLayout = this.f418484d.f418490s;
        if (frameLayout != null) {
            java.lang.Object animatedValue = it.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            frameLayout.setBackgroundColor(((java.lang.Integer) animatedValue).intValue());
        }
    }
}
