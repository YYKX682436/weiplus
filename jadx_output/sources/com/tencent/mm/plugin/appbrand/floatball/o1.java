package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class o1 implements mp1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.t1 f78128a;

    public o1(com.tencent.mm.plugin.appbrand.floatball.t1 t1Var) {
        this.f78128a = t1Var;
    }

    @Override // mp1.b
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onCloseInternal, transform to float ball animation cancel");
        this.f78128a.f93239n.q(true);
    }

    @Override // mp1.b
    public void onAnimationEnd() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onCloseInternal, transform to float ball animation end");
        this.f78128a.f93239n.q(false);
    }
}
