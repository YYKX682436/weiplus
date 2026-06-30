package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class q8 extends al5.q0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f89955a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f89956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f89957c;

    public q8(com.tencent.mm.plugin.appbrand.ui.u8 u8Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.Runnable runnable) {
        this.f89956b = appBrandRuntime;
        this.f89957c = runnable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        java.lang.Runnable runnable = this.f89957c;
        if (runnable != null) {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        }
    }

    @Override // al5.q0, android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89956b;
        if (!(appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6) || this.f89955a) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).H2;
        long duration = animation.getDuration();
        hl1.h hVar = l0Var.f91199e;
        hVar.d(hVar.h(), 0, duration);
        this.f89955a = true;
    }
}
