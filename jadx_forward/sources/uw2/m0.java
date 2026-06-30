package uw2;

/* loaded from: classes3.dex */
public final class m0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw2.n0 f513228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f513229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513230f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f513231g;

    public m0(uw2.n0 n0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f513228d = n0Var;
        this.f513229e = k3Var;
        this.f513230f = view;
        this.f513231g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        onAnimationEnd(animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        rs.l.a(this.f513230f);
        this.f513231g.setListener(null);
        uw2.n0 n0Var = this.f513228d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f513229e;
        n0Var.y(k3Var);
        n0Var.f480818q.remove(k3Var);
        n0Var.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f513228d.C(this.f513229e);
    }
}
