package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public final class p implements xi1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f87631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f87632b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi1.n f87633c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.activity.q f87634d;

    public p(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, android.view.View view, xi1.n nVar, com.tencent.mm.plugin.appbrand.platform.window.activity.q qVar) {
        this.f87631a = atomicBoolean;
        this.f87632b = view;
        this.f87633c = nVar;
        this.f87634d = qVar;
    }

    @Override // xi1.n
    public final void e(xi1.o oVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("Luggage.WXA.ActivityWindowOrientationHandlerProxyImpl", "requestDeviceOrientation, callback from AppBrandDeviceOrientationHandler, orientation:" + oVar + ", success:" + z17);
        com.tencent.mm.plugin.appbrand.platform.window.activity.o oVar2 = new com.tencent.mm.plugin.appbrand.platform.window.activity.o(oVar, z17, this.f87633c, this.f87634d);
        if (!z17 || this.f87631a.get()) {
            oVar2.a("syncReturn");
            return;
        }
        com.tencent.mm.plugin.appbrand.platform.window.activity.m mVar = new com.tencent.mm.plugin.appbrand.platform.window.activity.m(oVar2);
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        android.view.View view = this.f87632b;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.appbrand.platform.window.activity.r(f0Var, 2, view, mVar));
        view.postDelayed(new com.tencent.mm.plugin.appbrand.platform.window.activity.n(oVar2), 100L);
    }
}
