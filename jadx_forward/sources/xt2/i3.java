package xt2;

/* loaded from: classes2.dex */
public final class i3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f538322d;

    public i3(xt2.r3 r3Var) {
        this.f538322d = r3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        xt2.r3 r3Var = this.f538322d;
        float f17 = 2;
        r3Var.f538518h.setPivotX(r0.getLayoutParams().width / f17);
        r3Var.f538518h.setPivotY(r4.getLayoutParams().height / f17);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
