package e04;

/* loaded from: classes15.dex */
public final class a3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f327398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.c3 f327399e;

    public a3(boolean z17, e04.c3 c3Var) {
        this.f327398d = z17;
        this.f327399e = c3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        e04.c3 c3Var = this.f327399e;
        e04.z2 z2Var = c3Var.f327413c;
        boolean z17 = this.f327398d;
        if (z2Var != null) {
            z2Var.d(z17);
        }
        if (!z17) {
            e04.z2 z2Var2 = c3Var.f327413c;
            if (z2Var2 != null) {
                z2Var2.a();
                return;
            }
            return;
        }
        c3Var.f327415e = true;
        wu5.c cVar = c3Var.f327414d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        e04.b3 b3Var = new e04.b3(c3Var);
        long j17 = c3Var.f327412b;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        c3Var.f327414d = t0Var.z(b3Var, j17, false);
        c3Var.f327415e = false;
    }
}
