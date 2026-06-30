package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class t0 implements mp1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.w0 f78142a;

    public t0(com.tencent.mm.plugin.appbrand.floatball.w0 w0Var) {
        this.f78142a = w0Var;
    }

    @Override // mp1.b
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCloseInternal, transform to float ball animation cancel");
        this.f78142a.f93239n.q(true);
    }

    @Override // mp1.b
    public void onAnimationEnd() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCloseInternal, transform to float ball animation end");
        this.f78142a.f93239n.q(false);
    }
}
