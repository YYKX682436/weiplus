package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class t0 extends com.tencent.mm.plugin.appbrand.widget.halfscreen.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.c0 f91221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 f91222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f91223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f91224g;

    public t0(com.tencent.mm.plugin.appbrand.widget.c0 c0Var, com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 x0Var, kotlin.jvm.internal.f0 f0Var, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f91221d = c0Var;
        this.f91222e = x0Var;
        this.f91223f = f0Var;
        this.f91224g = animatorListenerAdapter;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.halfscreen.q0, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.util.Objects.toString(this.f91221d);
        com.tencent.mm.plugin.appbrand.widget.c0 c0Var = this.f91221d;
        if (c0Var == com.tencent.mm.plugin.appbrand.widget.c0.f91067g || c0Var == com.tencent.mm.plugin.appbrand.widget.c0.f91068h) {
            this.f91222e.F = false;
        }
        if (kotlin.jvm.internal.o.b(animation, this.f91222e.H)) {
            this.f91222e.G = false;
            com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 x0Var = this.f91222e;
            x0Var.H = null;
            x0Var.f91233a.H2.i(true, this.f91221d);
        }
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f91224g;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animation);
        }
        this.f91222e.o();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.util.Objects.toString(this.f91221d);
        com.tencent.mm.plugin.appbrand.widget.c0 c0Var = this.f91221d;
        com.tencent.mm.plugin.appbrand.widget.c0 c0Var2 = com.tencent.mm.plugin.appbrand.widget.c0.f91067g;
        if (c0Var == c0Var2 || c0Var == com.tencent.mm.plugin.appbrand.widget.c0.f91068h) {
            this.f91222e.F = false;
        }
        if (kotlin.jvm.internal.o.b(animation, this.f91222e.H)) {
            this.f91222e.G = false;
            com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 x0Var = this.f91222e;
            x0Var.H = null;
            x0Var.f91233a.H2.i(false, this.f91221d);
            if (this.f91223f.f310116d != -1) {
                java.util.Objects.toString(this.f91221d);
                this.f91222e.k(this.f91223f.f310116d, true);
            }
            if (this.f91221d == c0Var2) {
                this.f91222e.f91233a.S();
            }
        }
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f91224g;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animation);
        }
        this.f91222e.o();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.halfscreen.q0, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.util.Objects.toString(this.f91221d);
        this.f91222e.G = true;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f91224g;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animation);
        }
    }
}
