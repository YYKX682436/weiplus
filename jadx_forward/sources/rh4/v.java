package rh4;

/* loaded from: classes3.dex */
public class v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f477323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f477324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f477325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f477326g;

    public v(rh4.b0 b0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f477326g = b0Var;
        this.f477323d = k3Var;
        this.f477324e = view;
        this.f477325f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.view.View view = this.f477324e;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f477325f.setListener(null);
        rh4.b0 b0Var = this.f477326g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f477323d;
        b0Var.h(k3Var);
        b0Var.f477233o.remove(k3Var);
        b0Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f477326g.getClass();
    }
}
