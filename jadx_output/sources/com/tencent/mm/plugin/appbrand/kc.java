package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class kc extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f84075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f84076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f84077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f84078g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.mc f84079h;

    public kc(android.animation.ObjectAnimator objectAnimator, com.tencent.mm.plugin.appbrand.page.n7 n7Var, int i17, int i18, com.tencent.mm.plugin.appbrand.mc mcVar) {
        this.f84075d = objectAnimator;
        this.f84076e = n7Var;
        this.f84077f = i17;
        this.f84078g = i18;
        this.f84079h = mcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        pm0.v.V(300L, new com.tencent.mm.plugin.appbrand.jc(this.f84075d, this.f84076e, this.f84077f, this.f84078g, this.f84079h));
    }
}
