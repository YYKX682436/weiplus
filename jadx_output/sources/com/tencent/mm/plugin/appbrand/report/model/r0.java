package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public final class r0 {
    public static final com.tencent.mm.plugin.appbrand.report.model.r0 A = new com.tencent.mm.plugin.appbrand.report.model.r0(true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f88071a;

    /* renamed from: e, reason: collision with root package name */
    public int f88075e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f88076f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f88077g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f88078h;

    /* renamed from: i, reason: collision with root package name */
    public ze.n f88079i;

    /* renamed from: j, reason: collision with root package name */
    public int f88080j;

    /* renamed from: k, reason: collision with root package name */
    public int f88081k;

    /* renamed from: l, reason: collision with root package name */
    public int f88082l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f88083m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f88084n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f88085o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f88086p;

    /* renamed from: q, reason: collision with root package name */
    public int f88087q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f88088r;

    /* renamed from: s, reason: collision with root package name */
    public long f88089s;

    /* renamed from: t, reason: collision with root package name */
    public int f88090t;

    /* renamed from: u, reason: collision with root package name */
    public int f88091u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f88092v;

    /* renamed from: w, reason: collision with root package name */
    public int f88093w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f88094x;

    /* renamed from: y, reason: collision with root package name */
    public int f88095y;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f88072b = "";

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f88073c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f88074d = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f88096z = true;

    public r0(boolean z17) {
        this.f88071a = z17;
    }

    public void a(com.tencent.luggage.sdk.jsapi.component.b bVar, boolean z17) {
        this.f88087q = z17 ? 1 : 7;
        java.lang.String str = (java.lang.String) this.f88073c.pollFirst();
        this.f88088r = str;
        this.f88086p = str;
        if (!z17) {
            this.f88088r = this.f88072b;
        }
        b(bVar);
    }

    public final void b(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        com.tencent.mm.plugin.appbrand.jsapi.webview.s s37 = bVar.s3();
        if (s37 == null) {
            return;
        }
        com.tencent.luggage.sdk.config.AppBrandSysConfigLU E0 = bVar.t3().E0();
        if (E0 != null) {
            this.f88080j = E0.f305852r.pkgVersion;
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = bVar.x();
        if (x17 != null) {
            this.f88090t = x17.i();
        }
        this.f88089s = java.lang.System.currentTimeMillis();
        java.lang.String url = ((of1.w1) s37).getUrl();
        if (url == null) {
            url = "";
        }
        this.f88084n = fp.s0.a(url);
        this.f88083m = bVar.X1();
        this.f88094x = bVar.Y1();
        this.f88085o = com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f88093w = this.f88096z ? 1 : 0;
        this.f88096z = false;
        ze.n t37 = bVar.t3();
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07 = t37 == null ? null : t37.u0();
        if (u07 != null) {
            this.f88095y = u07.f47284z;
        } else {
            int b17 = com.tencent.mm.plugin.appbrand.report.w0.b(this.f88078h, -1);
            this.f88095y = b17;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Report.kv_14992", "prepareCommonFields null = initConfig! apptype:%s", java.lang.Integer.valueOf(b17));
        }
        this.f88095y += 1000;
        if (this.f88071a) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Report.kv_14992", "report " + toString());
        com.tencent.mm.plugin.appbrand.report.model.q0 q0Var = new com.tencent.mm.plugin.appbrand.report.model.q0(this, new java.lang.Object[]{java.lang.Integer.valueOf(this.f88075e), this.f88076f, this.f88077g, this.f88078h, java.lang.Integer.valueOf(this.f88080j), java.lang.Integer.valueOf(this.f88081k), java.lang.Integer.valueOf(this.f88082l), this.f88083m, this.f88084n, this.f88085o, this.f88086p, java.lang.Integer.valueOf(this.f88087q), this.f88088r, java.lang.Long.valueOf(this.f88089s), java.lang.Integer.valueOf(this.f88090t), java.lang.Integer.valueOf(this.f88091u), this.f88092v, java.lang.Integer.valueOf(this.f88093w), this.f88094x, java.lang.Integer.valueOf(this.f88095y)});
        if (this.f88074d) {
            q0Var.run();
        } else {
            java.util.Set set = com.tencent.mm.plugin.appbrand.utils.s0.f90550a;
            ik1.h0.a().postToWorker(q0Var);
        }
    }

    public java.lang.String toString() {
        return "kv_14992{scene=" + this.f88075e + ", sceneNote='" + this.f88076f + "', sessionId='" + this.f88077g + "', appId='" + this.f88078h + "', appVersion=" + this.f88080j + ", appState=" + this.f88081k + ", usedState=" + this.f88082l + ", pagePath='" + this.f88083m + "', currentUrl='" + this.f88084n + "', networkType='" + this.f88085o + "', referPagePath='" + this.f88086p + "', targetAction=" + this.f88087q + ", targetPagePath='" + this.f88088r + "', clickTimestamp=" + this.f88089s + ", publicLibVersion=" + this.f88090t + ", preScene=" + this.f88091u + ", preSceneNote='" + this.f88092v + "', isEntrance=" + this.f88093w + ", apptype=" + this.f88095y + '}';
    }
}
