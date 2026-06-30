package rs;

/* loaded from: classes3.dex */
public class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f480783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f480784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f480785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f480786g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f480787h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rs.k f480788i;

    public f(rs.k kVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f480788i = kVar;
        this.f480783d = k3Var;
        this.f480784e = i17;
        this.f480785f = view;
        this.f480786g = i18;
        this.f480787h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f480784e;
        android.view.View view = this.f480785f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f480786g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f480787h.setListener(null);
        rs.k kVar = this.f480788i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f480783d;
        kVar.x(k3Var);
        kVar.f480817p.remove(k3Var);
        kVar.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f480788i.A(this.f480783d);
    }
}
