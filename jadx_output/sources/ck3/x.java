package ck3;

/* loaded from: classes14.dex */
public final class x extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck3.a0 f42524d;

    public x(ck3.a0 a0Var) {
        this.f42524d = a0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ck3.a0 a0Var = this.f42524d;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = a0Var.f42462y;
        if (animatorListenerAdapter != null && animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animation);
        }
        a0Var.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f42524d.f42462y;
        if (animatorListenerAdapter == null || animatorListenerAdapter == null) {
            return;
        }
        animatorListenerAdapter.onAnimationStart(animation);
    }
}
