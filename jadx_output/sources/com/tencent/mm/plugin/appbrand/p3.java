package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class p3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f86317a;

    public p3(com.tencent.mm.plugin.appbrand.j3 j3Var) {
        this.f86317a = j3Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        pq5.g q17;
        com.tencent.mm.plugin.appbrand.j3 j3Var = this.f86317a;
        if (j3Var.f78452d) {
            j3Var.g("tryGetProcessPreloadedPageView EXPIRED return null", new java.lang.Object[0]);
            q17 = null;
        } else {
            j3Var.h("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", "tryGetProcessPreloadedPageView, entered");
            java.lang.String str = j3Var.f78450b.f74803n;
            q17 = j3Var.i("tryGetProcessPreloadedPageView").q(new com.tencent.mm.plugin.appbrand.d4(j3Var));
            q17.K(new com.tencent.mm.plugin.appbrand.c4(j3Var, str));
        }
        if (q17 != null) {
            km5.u.a(q17);
        }
        return null;
    }
}
