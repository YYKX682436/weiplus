package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class g9 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f78194b;

    public g9(com.tencent.mm.plugin.appbrand.e9 e9Var, java.lang.String str) {
        this.f78194b = e9Var;
        this.f78193a = str;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        java.lang.Long valueOf = java.lang.Long.valueOf(k1Var.f42676b - k1Var.f42675a);
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78194b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "injectConfig end by AddonV8, cost=%dms, hash=%d", valueOf, java.lang.Integer.valueOf(e9Var.getComponentId()));
        com.tencent.mm.plugin.appbrand.k9 k9Var = new com.tencent.mm.plugin.appbrand.k9(null);
        e9Var.f77998J = k9Var;
        k9Var.f84070a = this.f78193a;
        k9Var.f84071b = k1Var.f42675a;
        k9Var.f84072c = k1Var.f42676b;
        k9Var.f84073d = k1Var;
    }
}
