package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class k0 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask f84710d;

    public k0(com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask appBrandPreInitTask) {
        this.f84710d = appBrandPreInitTask;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.Boolean bool = (java.lang.Boolean) obj2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreInitTask", "AppBrandTeenModeTempAuthMgr check callback appId:%s, canGoOn:%b", str, bool);
        com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask appBrandPreInitTask = this.f84710d;
        boolean equals = str.equals(appBrandPreInitTask.f84372q.f77278d);
        com.tencent.mm.plugin.appbrand.launching.o0 o0Var = appBrandPreInitTask.f84364f;
        if (equals && bool.booleanValue()) {
            o0Var.a(appBrandPreInitTask.f84372q, appBrandPreInitTask.f84368m.f84910o);
        } else {
            o0Var.a(null, null);
        }
        appBrandPreInitTask.x();
        return null;
    }
}
