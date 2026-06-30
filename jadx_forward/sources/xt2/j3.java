package xt2;

/* loaded from: classes2.dex */
public final class j3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f538361d;

    public j3(xt2.r3 r3Var) {
        this.f538361d = r3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        xt2.r3 r3Var = this.f538361d;
        r3Var.f538518h.setPivotX(r0.getLayoutParams().width);
        r3Var.f538518h.setPivotY(0.0f);
    }
}
