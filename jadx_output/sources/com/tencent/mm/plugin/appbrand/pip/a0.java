package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class a0 implements com.tencent.mm.plugin.appbrand.page.r4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.r4 f87425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.b0 f87426e;

    public a0(com.tencent.mm.plugin.appbrand.pip.b0 b0Var, com.tencent.mm.plugin.appbrand.page.r4 r4Var) {
        this.f87426e = b0Var;
        this.f87425d = r4Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r4
    public com.tencent.mm.plugin.appbrand.page.v5 a(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str) {
        return this.f87425d.a(i3Var, str);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r4
    public boolean b(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.i3 i3Var, com.tencent.mm.plugin.appbrand.page.u4 u4Var) {
        return this.f87425d.b(str, wdVar, i3Var, u4Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r4
    public boolean c(com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return this.f87425d.c(v5Var, str);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r4
    public com.tencent.mm.plugin.appbrand.page.w2 d(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.util.concurrent.Callable callable) {
        com.tencent.mm.plugin.appbrand.pip.b0 b0Var = this.f87426e;
        return com.tencent.mm.plugin.appbrand.pip.b0.a(b0Var, str, wdVar) ? b0Var.f87428a.f87531n : this.f87425d.d(str, wdVar, i3Var, callable);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r4
    public boolean e(java.lang.String str) {
        return this.f87425d.e(str);
    }
}
