package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class o8 extends al5.q0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f89902a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f89903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f89904c;

    public o8(com.tencent.mm.plugin.appbrand.ui.u8 u8Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.Runnable runnable) {
        this.f89903b = appBrandRuntime;
        this.f89904c = runnable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        java.lang.Runnable runnable = this.f89904c;
        if (runnable != null) {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        }
    }

    @Override // al5.q0, android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89903b;
        if (appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6) {
            if (!this.f89902a) {
                com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).H2;
                l0Var.f91199e.reset();
                l0Var.t(animation.getDuration());
            }
            this.f89902a = true;
        }
    }
}
