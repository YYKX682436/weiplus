package uw2;

/* loaded from: classes3.dex */
public final class l0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw2.n0 f513223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f513224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f513226g;

    public l0(uw2.n0 n0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f513223d = n0Var;
        this.f513224e = k3Var;
        this.f513225f = view;
        this.f513226g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        onAnimationEnd(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        rs.l.a(this.f513225f);
        this.f513226g.setListener(null);
        uw2.n0 n0Var = this.f513223d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f513224e;
        n0Var.h(k3Var);
        n0Var.f480816o.remove(k3Var);
        n0Var.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f513223d.getClass();
    }
}
