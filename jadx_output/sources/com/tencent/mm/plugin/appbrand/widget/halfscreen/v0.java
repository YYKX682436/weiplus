package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class v0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 f91229d;

    public v0(com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 x0Var) {
        this.f91229d = x0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 x0Var = this.f91229d;
        if (kotlin.jvm.internal.o.b(x0Var.I, animation)) {
            x0Var.I = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 x0Var = this.f91229d;
        if (kotlin.jvm.internal.o.b(x0Var.I, animation)) {
            x0Var.I = null;
        }
    }
}
