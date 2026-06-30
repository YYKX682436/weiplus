package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public class u extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f12238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f12240f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12241g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f12242h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.z f12243i;

    public u(androidx.recyclerview.widget.z zVar, androidx.recyclerview.widget.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f12243i = zVar;
        this.f12238d = k3Var;
        this.f12239e = i17;
        this.f12240f = view;
        this.f12241g = i18;
        this.f12242h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f12239e;
        android.view.View view = this.f12240f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f12241g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f12242h.setListener(null);
        androidx.recyclerview.widget.z zVar = this.f12243i;
        androidx.recyclerview.widget.k3 k3Var = this.f12238d;
        zVar.x(k3Var);
        zVar.f12305p.remove(k3Var);
        zVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f12243i.A(this.f12238d);
    }
}
