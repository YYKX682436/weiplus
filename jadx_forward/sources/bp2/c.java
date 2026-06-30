package bp2;

/* loaded from: classes3.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.i f104579d;

    public c(bp2.i iVar) {
        this.f104579d = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        bp2.i iVar = this.f104579d;
        iVar.f104593j = intValue;
        android.widget.RelativeLayout relativeLayout = iVar.f104591h;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(iVar.f104593j);
        }
    }
}
