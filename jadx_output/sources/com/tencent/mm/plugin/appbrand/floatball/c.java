package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class c implements mp1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.d f78072a;

    public c(com.tencent.mm.plugin.appbrand.floatball.d dVar) {
        this.f78072a = dVar;
    }

    @Override // mp1.b
    public void a() {
        com.tencent.mm.plugin.appbrand.floatball.d dVar = this.f78072a;
        com.tencent.mars.xlog.Log.i(dVar.f78077v, "onCloseWithAnimation, transform to float ball animation cancel");
        dVar.f93239n.q(true);
    }

    @Override // mp1.b
    public void onAnimationEnd() {
        com.tencent.mm.plugin.appbrand.floatball.d dVar = this.f78072a;
        com.tencent.mars.xlog.Log.i(dVar.f78077v, "onCloseWithAnimation, transform to float ball animation end");
        dVar.f93239n.q(false);
    }
}
