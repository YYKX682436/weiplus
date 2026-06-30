package qt2;

/* loaded from: classes2.dex */
public final class i extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.j f448118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f448119e;

    public i(qt2.j jVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f448118d = jVar;
        this.f448119e = k3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f448118d.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f448119e;
        in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
        if (s0Var != null) {
            sc2.m3.A.d(s0Var, "pullUpOtherViews");
        }
    }
}
