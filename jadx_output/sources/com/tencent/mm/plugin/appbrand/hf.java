package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class hf extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78324e;

    public hf(java.lang.String str, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f78323d = str;
        this.f78324e = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SinglePageModeLogic", "onDestroy appid:%s", this.f78323d);
        com.tencent.mm.plugin.appbrand.x0.e(this.f78323d, this);
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78324e;
        java.lang.String str = o6Var.f74803n;
        int i17 = o6Var.E0().f305853s;
        java.lang.String str2 = o6Var.E0().f305855u;
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.Cif(str, i17, str2), "SinglePageMode#cleanData");
    }
}
