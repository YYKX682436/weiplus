package rh4;

/* loaded from: classes3.dex */
public class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f477249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f477250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f477251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f477252g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f477253h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rh4.k f477254i;

    public f(rh4.k kVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f477254i = kVar;
        this.f477249d = k3Var;
        this.f477250e = i17;
        this.f477251f = view;
        this.f477252g = i18;
        this.f477253h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f477250e;
        android.view.View view = this.f477251f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f477252g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f477253h.setListener(null);
        rh4.k kVar = this.f477254i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f477249d;
        kVar.x(k3Var);
        kVar.f477289p.remove(k3Var);
        kVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f477254i.A(this.f477249d);
    }
}
