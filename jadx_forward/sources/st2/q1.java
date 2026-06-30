package st2;

/* loaded from: classes3.dex */
public final class q1 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.s1 f493960e;

    public q1(st2.s1 s1Var) {
        this.f493960e = s1Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        st2.s1 s1Var = this.f493960e;
        s1Var.f493981h.requestFocus();
        st2.s1.a(s1Var);
    }
}
