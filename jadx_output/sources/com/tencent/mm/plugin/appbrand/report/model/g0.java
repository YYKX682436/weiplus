package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public final class g0 {
    public static final com.tencent.mm.plugin.appbrand.report.model.g0 C = new com.tencent.mm.plugin.appbrand.report.model.g0(true, null);
    public java.lang.String A;
    public long B;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87955a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.model.y f87956b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87957c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f87958d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f87959e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f87960f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f87961g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime f87962h;

    /* renamed from: i, reason: collision with root package name */
    public int f87963i;

    /* renamed from: j, reason: collision with root package name */
    public int f87964j;

    /* renamed from: k, reason: collision with root package name */
    public int f87965k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f87966l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f87967m;

    /* renamed from: n, reason: collision with root package name */
    public long f87968n;

    /* renamed from: o, reason: collision with root package name */
    public long f87969o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f87970p;

    /* renamed from: q, reason: collision with root package name */
    public int f87971q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f87972r;

    /* renamed from: s, reason: collision with root package name */
    public long f87973s;

    /* renamed from: t, reason: collision with root package name */
    public int f87974t;

    /* renamed from: u, reason: collision with root package name */
    public int f87975u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f87976v;

    /* renamed from: w, reason: collision with root package name */
    public int f87977w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f87978x;

    /* renamed from: y, reason: collision with root package name */
    public int f87979y;

    /* renamed from: z, reason: collision with root package name */
    public int f87980z;

    public g0(boolean z17, com.tencent.mm.plugin.appbrand.report.model.y yVar) {
        this.f87955a = z17;
        this.f87956b = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.luggage.sdk.jsapi.component.b bVar) {
        com.tencent.mm.plugin.appbrand.report.model.w wVar;
        com.tencent.mm.plugin.appbrand.report.model.x xVar;
        k91.z0 E0 = appBrandRuntime.E0();
        if (E0 != null) {
            this.f87963i = E0.f305852r.pkgVersion;
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = bVar.x();
        if (x17 != null) {
            this.f87974t = x17.i();
        }
        this.f87973s = bVar.w3().f87985e;
        this.f87968n = java.lang.Math.max(0L, bVar.w3().f87986f);
        this.f87969o = bVar.w3().a();
        if (bVar.w3() instanceof com.tencent.mm.plugin.appbrand.report.model.r) {
            com.tencent.mm.plugin.appbrand.report.model.r rVar = (com.tencent.mm.plugin.appbrand.report.model.r) bVar.w3();
            com.tencent.mm.plugin.appbrand.report.t0 t0Var = (com.tencent.mm.plugin.appbrand.report.t0) rVar;
            this.B = t0Var.f88406i ? t0Var.f87981a.f88424e - t0Var.f88405h : 0L;
            com.tencent.mm.plugin.appbrand.report.t0 t0Var2 = (com.tencent.mm.plugin.appbrand.report.t0) rVar;
            this.f87966l = t0Var2.f88407j == null ? bVar.X1() : t0Var2.f88407j;
        } else {
            this.f87966l = bVar.X1();
        }
        this.f87978x = bVar.Y1();
        this.f87967m = com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l27 = ((ze.n) appBrandRuntime).l2();
        this.f87965k = l27 != null ? l27.f87792h : 0;
        com.tencent.mm.plugin.appbrand.report.model.v o17 = this.f87956b.o(bVar);
        if (o17 != null) {
            com.tencent.mm.plugin.appbrand.report.model.x xVar2 = o17.f88115c;
            wVar = o17.f88116d;
            xVar = xVar2;
        } else if (appBrandRuntime.S) {
            com.tencent.mm.plugin.appbrand.w0 d17 = com.tencent.mm.plugin.appbrand.x0.d(bVar.getAppId());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Report.kv_13536", "visitNode (%s) not found, runtime.isFinishing=TRUE, pauseType=%s, maybe closed by user in LoadingSplash", bVar.Y1(), d17);
            int ordinal = d17.ordinal();
            xVar = ordinal != 0 ? ordinal != 1 ? null : new com.tencent.mm.plugin.appbrand.report.model.x(5, null) : new com.tencent.mm.plugin.appbrand.report.model.x(4, null);
            wVar = null;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Report.kv_13536", "visitNode (%s) not found, maybe page switching to quickly", bVar.Y1());
            xVar = null;
            wVar = null;
        }
        this.f87971q = xVar != null ? xVar.f88118a : 0;
        this.f87972r = xVar == null ? null : xVar.f88119b;
        this.f87970p = wVar != null ? wVar.f88117a : null;
        this.f87977w = this.f87956b.c(this.f87978x) ? 1 : 0;
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) appBrandRuntime.u0();
        if (appBrandInitConfigLU != null) {
            this.f87979y = appBrandInitConfigLU.f47284z;
            this.f87980z = appBrandInitConfigLU.f47275u;
        } else {
            int b17 = com.tencent.mm.plugin.appbrand.report.w0.b(this.f87961g, -1);
            this.f87979y = b17;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Report.kv_13536", "prepareCommonFields null = initConfig! apptype:%s", java.lang.Integer.valueOf(b17));
        }
        this.f87979y += 1000;
        java.lang.String str = com.tencent.mm.plugin.appbrand.m6.b(bVar.getAppId()).f85716i;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.A = str;
    }

    public final void b() {
        if (this.f87955a) {
            return;
        }
        com.tencent.mm.plugin.appbrand.report.model.f0 f0Var = new com.tencent.mm.plugin.appbrand.report.model.f0(this, new java.lang.Object[]{java.lang.Integer.valueOf(this.f87958d), this.f87959e, this.f87960f, this.f87961g, java.lang.Integer.valueOf(this.f87963i), java.lang.Integer.valueOf(this.f87964j), java.lang.Integer.valueOf(this.f87965k), this.f87966l, this.f87967m, java.lang.Long.valueOf(this.f87968n), java.lang.Long.valueOf(this.f87969o), this.f87970p, java.lang.Integer.valueOf(this.f87971q), this.f87972r, java.lang.Long.valueOf(this.f87973s), java.lang.Integer.valueOf(this.f87974t), java.lang.Integer.valueOf(this.f87975u), this.f87976v, java.lang.Integer.valueOf(this.f87977w), this.f87978x, java.lang.Integer.valueOf(this.f87979y), java.lang.Integer.valueOf(this.f87980z), this.A, null, java.lang.Long.valueOf(this.B)});
        if (this.f87957c) {
            f0Var.run();
        } else {
            java.util.Set set = com.tencent.mm.plugin.appbrand.utils.s0.f90550a;
            ik1.h0.a().postToWorker(f0Var);
        }
    }

    public java.lang.String toString() {
        return "kv_13536{scene=" + this.f87958d + ", sceneNote='" + this.f87959e + "', sessionId='" + this.f87960f + "', appId='" + this.f87961g + "', appVersion=" + this.f87963i + ", appState=" + this.f87964j + ", usedState=" + this.f87965k + ", pagePath='" + this.f87966l + "', networkType='" + this.f87967m + "', costTime=" + this.f87968n + ", stayTime=" + this.f87969o + ", referPagePath='" + this.f87970p + "', targetAction=" + this.f87971q + ", targetPagePath='" + this.f87972r + "', clickTimestamp=" + this.f87973s + ", publicLibVersion=" + this.f87974t + ", preScene=" + this.f87975u + ", preSceneNote='" + this.f87976v + "', isEntrance=" + this.f87977w + ", apptype=" + this.f87979y + ", systemRecentsReason=" + this.f87980z + ", referAction=" + this.A + ", manufacturerAppId=null, stayTimeFuncPageStart=" + this.B + '}';
    }
}
