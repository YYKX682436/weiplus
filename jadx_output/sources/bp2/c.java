package bp2;

/* loaded from: classes3.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.i f23046d;

    public c(bp2.i iVar) {
        this.f23046d = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        bp2.i iVar = this.f23046d;
        iVar.f23060j = intValue;
        android.widget.RelativeLayout relativeLayout = iVar.f23058h;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(iVar.f23060j);
        }
    }
}
