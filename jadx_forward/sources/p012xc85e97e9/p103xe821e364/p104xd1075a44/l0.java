package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class l0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f93651d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.n0 f93652e;

    public l0(p012xc85e97e9.p103xe821e364.p104xd1075a44.n0 n0Var) {
        this.f93652e = n0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f93651d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (this.f93651d) {
            this.f93651d = false;
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n0 n0Var = this.f93652e;
        if (((java.lang.Float) n0Var.F.getAnimatedValue()).floatValue() == 0.0f) {
            n0Var.G = 0;
            n0Var.f(0);
        } else {
            n0Var.G = 2;
            n0Var.f93697y.invalidate();
        }
    }
}
