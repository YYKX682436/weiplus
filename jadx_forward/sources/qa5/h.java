package qa5;

/* loaded from: classes3.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa5.l f442653d;

    public h(qa5.l lVar) {
        this.f442653d = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        qa5.l lVar = this.f442653d;
        lVar.f442666i = (java.lang.Integer) animatedValue;
        lVar.f442659b.requestLayout();
    }
}
