package cn2;

/* loaded from: classes3.dex */
public final class a1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.e1 f43467d;

    public a1(cn2.e1 e1Var) {
        this.f43467d = e1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        cn2.e1 e1Var = this.f43467d;
        e1Var.f43502e = false;
        e1Var.f43498a.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        cn2.e1 e1Var = this.f43467d;
        e1Var.f43502e = false;
        e1Var.f43498a.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        cn2.e1 e1Var = this.f43467d;
        e1Var.f43505h = 0.0f;
        e1Var.f43502e = true;
        e1Var.f43498a.invalidate();
    }
}
