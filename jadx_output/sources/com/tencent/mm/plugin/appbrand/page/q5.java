package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class q5 implements ph1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.u4 f87032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wd f87033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87034c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f87035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.d5 f87036e;

    public q5(com.tencent.mm.plugin.appbrand.page.d5 d5Var, com.tencent.mm.plugin.appbrand.page.u4 u4Var, com.tencent.mm.plugin.appbrand.page.wd wdVar, java.lang.String str, boolean z17) {
        this.f87036e = d5Var;
        this.f87032a = u4Var;
        this.f87033b = wdVar;
        this.f87034c = str;
        this.f87035d = z17;
    }

    @Override // ph1.d
    public void a(ph1.g gVar) {
        com.tencent.mm.plugin.appbrand.page.d5 d5Var = this.f87036e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "modularizingNewPageNavigation.onLoadResult(%s), appId:%s, type:%s, url:%s", gVar, d5Var.getAppId(), this.f87033b, this.f87034c);
        int ordinal = gVar.ordinal();
        boolean z17 = this.f87035d;
        if (ordinal == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(937, z17 ? 6 : 2);
            d5Var.c0(new com.tencent.mm.plugin.appbrand.page.l5(this));
        } else if (ordinal == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(937, z17 ? 7 : 3);
            d5Var.c0(new com.tencent.mm.plugin.appbrand.page.p5(this));
        } else {
            if (ordinal != 2) {
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(937, z17 ? 8 : 4);
            d5Var.c0(new com.tencent.mm.plugin.appbrand.page.m5(this));
        }
    }

    @Override // ph1.d
    public void b(java.util.List list) {
        this.f87032a.c("downloadPackageList", list);
    }
}
