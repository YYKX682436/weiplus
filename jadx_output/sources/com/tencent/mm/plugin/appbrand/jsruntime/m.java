package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.z f84004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f84007g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84008h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.n f84009i;

    public m(com.tencent.mm.plugin.appbrand.jsruntime.n nVar, com.tencent.mm.plugin.appbrand.jsruntime.z zVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        this.f84009i = nVar;
        this.f84004d = zVar;
        this.f84005e = str;
        this.f84006f = str2;
        this.f84007g = i17;
        this.f84008h = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsruntime.z zVar = this.f84004d;
        com.tencent.mm.plugin.appbrand.jsruntime.a0 a0Var = zVar != null ? new com.tencent.mm.plugin.appbrand.jsruntime.a0() : null;
        if (a0Var != null) {
            a0Var.f83964a = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.appbrand.jsruntime.n nVar = this.f84009i;
        if (nVar.f84020e == null) {
            nVar.f84020e = new com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJ2V8Context", "nativeCreateRuntime triggered by subscribeHandler");
            nVar.f84020e.createRuntime(nVar.L(), nVar.G());
        }
        com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding appBrandJsBridgeBinding = nVar.f84020e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = this.f84005e;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.f84006f;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.f84008h;
        appBrandJsBridgeBinding.subscribeHandler(str, str2, this.f84007g, str3 != null ? str3 : "");
        if (a0Var != null) {
            a0Var.f83965b = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.appbrand.f9 f9Var = (com.tencent.mm.plugin.appbrand.f9) zVar;
            f9Var.getClass();
            java.lang.Long valueOf = java.lang.Long.valueOf(a0Var.f83965b - a0Var.f83964a);
            com.tencent.mm.plugin.appbrand.e9 e9Var = f9Var.f78049b;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "injectConfig end by AddonDirectEvaluation, cost=%dms, hash=%d", valueOf, java.lang.Integer.valueOf(e9Var.getComponentId()));
            com.tencent.mm.plugin.appbrand.k9 k9Var = new com.tencent.mm.plugin.appbrand.k9(null);
            e9Var.f77998J = k9Var;
            k9Var.f84070a = f9Var.f78048a;
            k9Var.f84071b = a0Var.f83964a;
            k9Var.f84072c = a0Var.f83965b;
            k9Var.f84073d = a0Var;
        }
    }
}
