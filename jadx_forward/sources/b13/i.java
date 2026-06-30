package b13;

/* loaded from: classes14.dex */
public final class i extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b13.m f98640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f98641e;

    public i(b13.m mVar, yz5.l lVar) {
        this.f98640d = mVar;
        this.f98641e = lVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        int i17 = b13.m.L1;
        dr4.p1 p1Var = this.f98640d.f257908f;
        if (p1Var != null) {
            p1Var.i(false);
        }
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        b(animation);
        int i17 = b13.m.L1;
        dr4.p1 p1Var = this.f98640d.f257908f;
        if (p1Var != null) {
            p1Var.i(false);
        }
        this.f98641e.mo146xb9724478(java.lang.Boolean.TRUE);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
    }
}
