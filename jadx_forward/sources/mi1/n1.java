package mi1;

/* loaded from: classes7.dex */
public final class n1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.q1 f408166d;

    public n1(mi1.q1 q1Var) {
        this.f408166d = q1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        mi1.q1.b(this.f408166d);
    }
}
