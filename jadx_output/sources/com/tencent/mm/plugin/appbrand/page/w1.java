package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class w1 extends al5.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.x1 f87190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f87191b;

    public w1(com.tencent.mm.plugin.appbrand.page.x1 x1Var, java.lang.Runnable runnable) {
        this.f87190a = x1Var;
        this.f87191b = runnable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f87190a.f87242J = null;
        java.lang.Runnable runnable = this.f87191b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
