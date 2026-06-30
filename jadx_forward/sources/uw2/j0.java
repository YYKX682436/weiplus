package uw2;

/* loaded from: classes3.dex */
public final class j0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw2.k0 f513216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f513217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f513219g;

    public j0(uw2.k0 k0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f513216d = k0Var;
        this.f513217e = k3Var;
        this.f513218f = view;
        this.f513219g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        onAnimationEnd(animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        rs.l.a(this.f513218f);
        this.f513219g.setListener(null);
        uw2.k0 k0Var = this.f513216d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f513217e;
        k0Var.y(k3Var);
        k0Var.f480818q.remove(k3Var);
        k0Var.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f513216d.C(this.f513217e);
    }
}
