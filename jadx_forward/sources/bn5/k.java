package bn5;

/* loaded from: classes10.dex */
public final class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn5.l f104496d;

    public k(bn5.l lVar) {
        this.f104496d = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueAnimator);
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        bn5.l lVar = this.f104496d;
        lVar.S = intValue;
        lVar.invalidate();
    }
}
