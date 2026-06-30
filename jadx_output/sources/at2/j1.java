package at2;

/* loaded from: classes.dex */
public final class j1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f13696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f13697e;

    public j1(kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        this.f13696d = c0Var;
        this.f13697e = continuation;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.c0 c0Var = this.f13696d;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f13697e.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }
}
