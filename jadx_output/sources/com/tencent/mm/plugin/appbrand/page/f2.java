package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class f2 extends com.tencent.mm.plugin.appbrand.page.k2 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86598g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wd f86599h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f86600i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f86601m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f86602n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f86603o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.j2 f86604p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.y1 f86605q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.tencent.mm.plugin.appbrand.page.y1 y1Var, java.lang.String str, com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.page.wd wdVar, long j17, boolean z17, int i17, int i18, com.tencent.mm.plugin.appbrand.page.j2 j2Var) {
        super(str);
        this.f86605q = y1Var;
        this.f86598g = v5Var;
        this.f86599h = wdVar;
        this.f86600i = j17;
        this.f86601m = z17;
        this.f86602n = i17;
        this.f86603o = i18;
        this.f86604p = j2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.k2
    public void a() {
        com.tencent.mm.plugin.appbrand.page.wd wdVar;
        com.tencent.mm.plugin.appbrand.page.y1 y1Var = this.f86605q;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86598g;
        if (v5Var != null) {
            int b27 = v5Var.b2();
            int componentId = v5Var.getComponentId();
            boolean p27 = v5Var.p2();
            com.tencent.mm.plugin.appbrand.page.jb skylineRouter = y1Var.getContainer().getSkylineRouter();
            if (skylineRouter != null && (wdVar = this.f86599h) == com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB) {
                ((com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) skylineRouter).f(this.f86600i, this.f86816d, this.f86601m, this.f86602n, this.f86603o, p27, b27, componentId, wdVar, null, null);
            }
        } else {
            com.tencent.mm.plugin.appbrand.utils.s3.a("MicroMsg.AppBrandMultiplePage", "switch tab error ,can't find AppBrandPageView", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.appbrand.page.j2 j2Var = this.f86604p;
        java.lang.String str = this.f86816d;
        if (j2Var != null) {
            j2Var.b(y1Var, str);
        }
        com.tencent.mm.plugin.appbrand.page.y1.O(y1Var, this.f86600i, str, this.f86599h);
        if (j2Var != null) {
            j2Var.a(y1Var, str);
        }
    }
}
