package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.model.k0 f88011n = new com.tencent.mm.plugin.appbrand.report.model.k0(true, com.tencent.mm.plugin.appbrand.report.model.y.f88120a);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f88012a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.model.y f88013b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f88014c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f88015d;

    /* renamed from: e, reason: collision with root package name */
    public int f88016e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f88017f;

    /* renamed from: g, reason: collision with root package name */
    public int f88018g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f88019h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f88020i;

    /* renamed from: j, reason: collision with root package name */
    public int f88021j;

    /* renamed from: k, reason: collision with root package name */
    public int f88022k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f88023l;

    /* renamed from: m, reason: collision with root package name */
    public int f88024m;

    public k0(boolean z17, com.tencent.mm.plugin.appbrand.report.model.y yVar) {
        this.f88012a = z17;
        this.f88013b = yVar;
    }

    public void a(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        com.tencent.mm.plugin.appbrand.report.model.w wVar;
        this.f88020i = bVar.Y1();
        com.tencent.mm.plugin.appbrand.report.model.y yVar = this.f88013b;
        com.tencent.mm.plugin.appbrand.report.model.v o17 = yVar.o(bVar);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f88023l = (o17 == null || (wVar = o17.f88116d) == null) ? null : wVar.f88117a;
        this.f88024m = yVar.c(this.f88020i) ? 1 : 0;
        if (this.f88012a) {
            return;
        }
        java.lang.String str2 = this.f88020i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str2 == null ? "" : str2).length() > 1024) {
            str2 = str2.substring(0, 1024);
        }
        this.f88020i = str2;
        java.lang.String str3 = this.f88023l;
        if ((str3 == null ? "" : str3).length() > 1024) {
            str3 = str3.substring(0, 1024);
        }
        this.f88023l = str3;
        r45.uc7 uc7Var = new r45.uc7();
        uc7Var.f387231d = 1;
        uc7Var.f387232e = this.f88014c;
        uc7Var.f387233f = this.f88020i;
        uc7Var.f387234g = 0;
        uc7Var.f387235h = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        uc7Var.f387236i = 1;
        uc7Var.f387237m = "";
        uc7Var.f387238n = this.f88022k;
        uc7Var.f387239o = this.f88015d;
        uc7Var.f387240p = com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        uc7Var.f387241q = this.f88016e;
        uc7Var.f387242r = this.f88021j;
        uc7Var.f387243s = this.f88017f;
        uc7Var.f387244t = this.f88023l;
        uc7Var.f387245u = this.f88018g;
        uc7Var.f387246v = this.f88019h;
        uc7Var.f387247w = this.f88024m;
        ((com.tencent.mm.plugin.appbrand.report.d3) com.tencent.mm.plugin.appbrand.report.c3.f87823a.invoke()).b(uc7Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Report.kv_14004", "report " + toString());
    }

    public java.lang.String toString() {
        return "kv_14004{appId='" + this.f88014c + "', sessionId='" + this.f88015d + "', scene=" + this.f88016e + ", sceneNote='" + this.f88017f + "', preScene=" + this.f88018g + ", preSceneNote='" + this.f88019h + "', pagePath='" + this.f88020i + "', usedState=" + this.f88021j + ", appState=" + this.f88022k + ", referPagePath='" + this.f88023l + "', isEntrance=" + this.f88024m + '}';
    }
}
