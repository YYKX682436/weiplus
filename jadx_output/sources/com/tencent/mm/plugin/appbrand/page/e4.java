package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class e4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wd f86558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f86559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f86560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86561g;

    public e4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        this.f86561g = i3Var;
        this.f86558d = wdVar;
        this.f86559e = w2Var;
        this.f86560f = w2Var2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
        this.f86561g.k(this.f86558d, this.f86559e, this.f86560f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.f86561g.l(this.f86558d, this.f86559e, this.f86560f);
    }
}
