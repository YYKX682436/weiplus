package ed5;

/* loaded from: classes5.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed5.c f332892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewOverlay f332893e;

    public g(ed5.c cVar, android.view.ViewOverlay viewOverlay) {
        this.f332892d = cVar;
        this.f332893e = viewOverlay;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        ed5.c cVar = this.f332892d;
        cVar.f332882b = floatValue;
        if (cVar.f332883c) {
            cVar.invalidateSelf();
        } else {
            this.f332893e.add(cVar);
            cVar.f332883c = true;
        }
    }
}
