package ac2;

/* loaded from: classes2.dex */
public final class e extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.g f84553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f84554e;

    public e(ac2.g gVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f84553d = gVar;
        this.f84554e = k3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f84553d.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f84554e;
        in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
        if (s0Var != null) {
            sc2.m3.A.d(s0Var, "pullUpOtherViews");
        }
    }
}
