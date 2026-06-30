package uw2;

/* loaded from: classes3.dex */
public final class i0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw2.k0 f513211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f513212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513213f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f513214g;

    public i0(uw2.k0 k0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f513211d = k0Var;
        this.f513212e = k3Var;
        this.f513213f = view;
        this.f513214g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        onAnimationEnd(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        rs.l.a(this.f513213f);
        this.f513214g.setListener(null);
        uw2.k0 k0Var = this.f513211d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f513212e;
        k0Var.h(k3Var);
        k0Var.f480816o.remove(k3Var);
        k0Var.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f513211d.getClass();
    }
}
