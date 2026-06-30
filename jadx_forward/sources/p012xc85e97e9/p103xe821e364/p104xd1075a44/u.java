package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes3.dex */
public class u extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f93771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f93772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f93773f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f93774g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f93775h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.z f93776i;

    public u(p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f93776i = zVar;
        this.f93771d = k3Var;
        this.f93772e = i17;
        this.f93773f = view;
        this.f93774g = i18;
        this.f93775h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f93772e;
        android.view.View view = this.f93773f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f93774g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f93775h.setListener(null);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar = this.f93776i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f93771d;
        zVar.x(k3Var);
        zVar.f93838p.remove(k3Var);
        zVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f93776i.A(this.f93771d);
    }
}
