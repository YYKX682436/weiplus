package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class ic extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f78338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.mc f78339e;

    public ic(android.animation.ObjectAnimator objectAnimator, com.tencent.mm.plugin.appbrand.mc mcVar) {
        this.f78338d = objectAnimator;
        this.f78339e = mcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f78338d.cancel();
        this.f78339e.f85744g = false;
    }
}
