package vo1;

/* loaded from: classes3.dex */
public final class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo1.q f520061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f520062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f520063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f520064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f520065h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f520066i;

    public l(vo1.q qVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f520061d = qVar;
        this.f520062e = k3Var;
        this.f520063f = i17;
        this.f520064g = view;
        this.f520065h = i18;
        this.f520066i = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        int i17 = this.f520063f;
        android.view.View view = this.f520064g;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f520065h != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f520066i.setListener(null);
        vo1.q qVar = this.f520061d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f520062e;
        qVar.x(k3Var);
        qVar.f520087p.remove(k3Var);
        qVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f520061d.A(this.f520062e);
    }
}
