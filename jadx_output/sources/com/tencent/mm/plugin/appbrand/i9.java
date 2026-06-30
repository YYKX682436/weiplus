package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class i9 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f78337a;

    public i9(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f78337a = e9Var;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        boolean parseBoolean = java.lang.Boolean.parseBoolean(str);
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78337a;
        if (parseBoolean) {
            com.tencent.mm.plugin.appbrand.k9 k9Var = e9Var.f77998J;
            k9Var.f84071b = k1Var.f42675a;
            k9Var.f84072c = k1Var.f42676b;
            k9Var.f84073d = k1Var;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(parseBoolean);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(e9Var.getComponentId());
        com.tencent.mm.plugin.appbrand.k9 k9Var2 = e9Var.f77998J;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "notifyWxConfigReadyIfNeed end by AddonV8, applied=%b, hash=%d, reportWxConfigInjectEnd cost=%dms", valueOf, valueOf2, java.lang.Long.valueOf(k9Var2.f84072c - k9Var2.f84071b));
        com.tencent.mm.plugin.appbrand.e9 e9Var2 = this.f78337a;
        com.tencent.mm.plugin.appbrand.k9 k9Var3 = e9Var2.f77998J;
        e9Var2.p1(k9Var3.f84070a, k9Var3.f84071b, k9Var3.f84072c, k9Var3.f84073d);
    }
}
