package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class l0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f12118d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.n0 f12119e;

    public l0(androidx.recyclerview.widget.n0 n0Var) {
        this.f12119e = n0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f12118d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (this.f12118d) {
            this.f12118d = false;
            return;
        }
        androidx.recyclerview.widget.n0 n0Var = this.f12119e;
        if (((java.lang.Float) n0Var.F.getAnimatedValue()).floatValue() == 0.0f) {
            n0Var.G = 0;
            n0Var.f(0);
        } else {
            n0Var.G = 2;
            n0Var.f12164y.invalidate();
        }
    }
}
