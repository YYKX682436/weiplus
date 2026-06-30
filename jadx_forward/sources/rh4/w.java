package rh4;

/* loaded from: classes3.dex */
public class w extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f477327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f477328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f477329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f477330g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f477331h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f477332i;

    public w(rh4.b0 b0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f477332i = b0Var;
        this.f477327d = k3Var;
        this.f477328e = i17;
        this.f477329f = view;
        this.f477330g = i18;
        this.f477331h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f477328e;
        android.view.View view = this.f477329f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f477330g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f477331h.setListener(null);
        rh4.b0 b0Var = this.f477332i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f477327d;
        b0Var.x(k3Var);
        b0Var.f477234p.remove(k3Var);
        b0Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f477332i.A(this.f477327d);
    }
}
