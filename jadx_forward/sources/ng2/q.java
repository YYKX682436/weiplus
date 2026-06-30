package ng2;

/* loaded from: classes10.dex */
public final class q extends jg2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f418517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 f418518e;

    public q(ng2.s sVar, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614) {
        this.f418517d = sVar;
        this.f418518e = c10850xc00cf614;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        mn0.b0 b0Var = this.f418517d.d().f372942h;
        if (b0Var != null) {
            mn0.b0.B(b0Var, this.f418518e, null, 2, null);
        }
    }
}
