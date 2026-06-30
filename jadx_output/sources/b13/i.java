package b13;

/* loaded from: classes14.dex */
public final class i extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b13.m f17107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f17108e;

    public i(b13.m mVar, yz5.l lVar) {
        this.f17107d = mVar;
        this.f17108e = lVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        int i17 = b13.m.L1;
        dr4.p1 p1Var = this.f17107d.f176375f;
        if (p1Var != null) {
            p1Var.i(false);
        }
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
        int i17 = b13.m.L1;
        dr4.p1 p1Var = this.f17107d.f176375f;
        if (p1Var != null) {
            p1Var.i(false);
        }
        this.f17108e.invoke(java.lang.Boolean.TRUE);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
    }
}
