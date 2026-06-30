package c04;

/* loaded from: classes13.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.w0 f37673d;

    public h(com.tencent.mm.plugin.scanner.view.w0 w0Var) {
        this.f37673d = w0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.view.w0 w0Var = this.f37673d;
        if (w0Var != null) {
            com.tencent.mm.plugin.scanner.view.w0.a(w0Var, false, 1, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.view.w0 w0Var = this.f37673d;
        if (w0Var != null) {
            w0Var.c();
        }
    }
}
