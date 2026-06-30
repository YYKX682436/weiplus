package jn5;

/* loaded from: classes3.dex */
public final class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn5.i f382367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f382368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f382369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f382371h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f382372i;

    public c(jn5.i iVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f382367d = iVar;
        this.f382368e = k3Var;
        this.f382369f = i17;
        this.f382370g = view;
        this.f382371h = i18;
        this.f382372i = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        super.onAnimationCancel(animator);
        int i17 = this.f382369f;
        android.view.View view = this.f382370g;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f382371h != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f382372i;
        viewPropertyAnimator.setUpdateListener(null);
        viewPropertyAnimator.setListener(null);
        this.f382367d.x(this.f382368e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        super.onAnimationStart(animator);
        this.f382367d.A(this.f382368e);
    }
}
