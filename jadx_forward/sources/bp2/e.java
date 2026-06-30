package bp2;

/* loaded from: classes3.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.i f104581d;

    public e(bp2.i iVar) {
        this.f104581d = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        android.widget.RelativeLayout relativeLayout = this.f104581d.f104591h;
        if (relativeLayout != null) {
            java.lang.Object animatedValue = animator.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            relativeLayout.setBackgroundColor(((java.lang.Integer) animatedValue).intValue());
        }
    }
}
