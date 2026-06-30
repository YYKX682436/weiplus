package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class n0 implements mp1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.p0 f78123a;

    public n0(com.tencent.mm.plugin.appbrand.floatball.p0 p0Var) {
        this.f78123a = p0Var;
    }

    @Override // mp1.b
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onCloseInternal, transform to float ball animation cancel");
        this.f78123a.f93239n.q(true);
    }

    @Override // mp1.b
    public void onAnimationEnd() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onCloseInternal, transform to float ball animation end");
        this.f78123a.f93239n.q(false);
    }
}
