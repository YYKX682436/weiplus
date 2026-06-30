package rp1;

/* loaded from: classes3.dex */
public class e2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f479920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f479921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f479922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479923g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f479924h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rp1.k2 f479925i;

    public e2(rp1.k2 k2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f479925i = k2Var;
        this.f479920d = k3Var;
        this.f479921e = i17;
        this.f479922f = view;
        this.f479923g = i18;
        this.f479924h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f479921e;
        android.view.View view = this.f479922f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f479923g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f479924h.setListener(null);
        rp1.k2 k2Var = this.f479925i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f479920d;
        k2Var.x(k3Var);
        k2Var.f479995p.remove(k3Var);
        k2Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f479925i.A(this.f479920d);
    }
}
