package b13;

/* loaded from: classes14.dex */
public final class k extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b13.m f98646d;

    public k(b13.m mVar) {
        this.f98646d = mVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        dr4.p1 p1Var = this.f98646d.f257908f;
        if (p1Var != null) {
            p1Var.i(false);
        }
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        b(animation);
        dr4.p1 p1Var = this.f98646d.f257908f;
        if (p1Var != null) {
            p1Var.i(false);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
    }
}
