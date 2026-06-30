package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class qf implements com.tencent.mm.plugin.appbrand.task.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.x0 f82880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f82882c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f82883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.rf f82884e;

    public qf(com.tencent.mm.plugin.appbrand.task.x0 x0Var, int i17, com.tencent.mm.plugin.appbrand.y yVar, int i18, com.tencent.mm.plugin.appbrand.jsapi.rf rfVar) {
        this.f82880a = x0Var;
        this.f82881b = i17;
        this.f82882c = yVar;
        this.f82883d = i18;
        this.f82884e = rfVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.task.d0
    public final void onReady() {
        boolean z17 = com.tencent.mm.plugin.appbrand.task.r.h(this.f82880a) != null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrivateJSApiPreloadMiniProgramEnv", "onReady, preloaded[" + z17 + ']');
        com.tencent.mm.plugin.appbrand.jsapi.rf rfVar = this.f82884e;
        int i17 = this.f82883d;
        com.tencent.mm.plugin.appbrand.y yVar = this.f82882c;
        if (!z17) {
            yVar.a(i17, rfVar.o("fail"));
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.appbrand.service.w6 w6Var = com.tencent.mm.plugin.appbrand.service.x6.f88818f;
        g0Var.A(this.f82881b, 40);
        yVar.a(i17, rfVar.o("ok"));
    }
}
