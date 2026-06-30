package at2;

/* loaded from: classes.dex */
public final class c1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.n1 f13644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f13645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f13646f;

    public c1(at2.n1 n1Var, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        this.f13644d = n1Var;
        this.f13645e = c0Var;
        this.f13646f = continuation;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.c0 c0Var = this.f13645e;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        this.f13646f.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object value = ((jz5.n) this.f13644d.f13718t).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin$countdownToPlayReplay$2$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin$countdownToPlayReplay$2$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kotlin.jvm.internal.c0 c0Var = this.f13645e;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        this.f13646f.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
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
