package rp1;

/* loaded from: classes14.dex */
public class u1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f480065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f480066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rp1.v1 f480067f;

    public u1(rp1.v1 v1Var, android.animation.Animator.AnimatorListener animatorListener, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f480067f = v1Var;
        this.f480065d = animatorListener;
        this.f480066e = k3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f480065d;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f480065d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
        long j17 = !qp1.w.a(this.f480067f.f480075a.f175118p) ? 0L : 200L;
        ku5.u0 u0Var = ku5.t0.f394148d;
        rp1.t1 t1Var = new rp1.t1(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(t1Var, j17, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f480065d;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f480065d;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }
}
