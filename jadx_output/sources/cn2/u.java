package cn2;

/* loaded from: classes.dex */
public final class u implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f43617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f43618e;

    public u(kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        this.f43617d = c0Var;
        this.f43618e = continuation;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.c0 c0Var = this.f43617d;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f43618e.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.c0 c0Var = this.f43617d;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f43618e.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
