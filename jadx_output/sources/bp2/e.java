package bp2;

/* loaded from: classes3.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.i f23048d;

    public e(bp2.i iVar) {
        this.f23048d = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        android.widget.RelativeLayout relativeLayout = this.f23048d.f23058h;
        if (relativeLayout != null) {
            java.lang.Object animatedValue = animator.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            relativeLayout.setBackgroundColor(((java.lang.Integer) animatedValue).intValue());
        }
    }
}
