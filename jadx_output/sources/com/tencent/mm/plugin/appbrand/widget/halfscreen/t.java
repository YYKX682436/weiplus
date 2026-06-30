package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class t extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f91219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 f91220e;

    public t(android.animation.AnimatorListenerAdapter animatorListenerAdapter, com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var) {
        this.f91219d = animatorListenerAdapter;
        this.f91220e = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationCancel(animation);
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f91219d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animation);
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = this.f91220e;
        l0Var.getClass();
        java.util.Iterator it = l0Var.f91205k.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).invoke();
        }
        l0Var.f91205k.clear();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f91219d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animation);
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = this.f91220e;
        l0Var.getClass();
        java.util.Iterator it = l0Var.f91205k.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).invoke();
        }
        l0Var.f91205k.clear();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationPause(animation);
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f91219d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationPause(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationRepeat(animation);
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f91219d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationRepeat(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationResume(animation);
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f91219d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationResume(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f91219d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animation);
        }
        this.f91220e.getClass();
    }
}
