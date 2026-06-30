package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class x4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f85397a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f85398b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85399c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85400d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f85401e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f85402f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo f85403g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.w4 f85404h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.QualitySession f85405i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.p f85406j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f85407k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f85408l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f85409m;

    public x4(com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams appBrandPrepareTask$PrepareParams, com.tencent.mm.plugin.appbrand.launching.w4 w4Var) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = appBrandPrepareTask$PrepareParams.f84382f;
        this.f85397a = appBrandInitConfigWC.f47278x;
        this.f85398b = appBrandInitConfigWC.f77278d;
        this.f85399c = appBrandInitConfigWC.f47284z;
        this.f85400d = appBrandPrepareTask$PrepareParams.f84383g.f87790f;
        this.f85401e = appBrandInitConfigWC.f77283i;
        this.f85402f = appBrandInitConfigWC.f47281y;
        this.f85403g = appBrandInitConfigWC.N;
        this.f85404h = w4Var;
        this.f85405i = appBrandInitConfigWC.f77298k2;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC2 = appBrandPrepareTask$PrepareParams.f84382f;
        this.f85406j = appBrandInitConfigWC2.W1;
        this.f85407k = appBrandInitConfigWC2.f47285z1;
        this.f85409m = false;
        this.f85408l = false;
    }

    public void a() {
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = this.f85403g;
        if (wxaAttributes$WxaVersionInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "start with NULL WxaVersionInfo, notify NO_UPDATE with username(%s) appId(%s)", this.f85397a, this.f85398b);
            this.f85404h.a(ne1.j.NO_UPDATE, 0, null, null, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "start with WxaVersionInfo.appVersion(%d) username(%s) appId(%s) isWarmLaunch(%b)", java.lang.Integer.valueOf(wxaAttributes$WxaVersionInfo.f77444d), this.f85397a, this.f85398b, java.lang.Boolean.valueOf(this.f85408l));
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "ContactSilentSyncProcess|%s|%s", this.f85397a, this.f85398b);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.launching.s4(this, format), format);
    }

    public x4(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, int i17, com.tencent.mm.plugin.appbrand.launching.w4 w4Var) {
        this.f85397a = appBrandInitConfigWC.f47278x;
        this.f85398b = appBrandInitConfigWC.f77278d;
        this.f85399c = appBrandInitConfigWC.f47284z;
        this.f85400d = i17;
        this.f85401e = appBrandInitConfigWC.f77283i;
        this.f85402f = appBrandInitConfigWC.f47281y;
        this.f85403g = appBrandInitConfigWC.N;
        this.f85404h = w4Var;
        this.f85405i = appBrandInitConfigWC.f77298k2;
        this.f85406j = appBrandInitConfigWC.W1;
        this.f85407k = appBrandInitConfigWC.f47285z1;
        this.f85409m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_skip_event_on_warm_attrsync_freq_limit, 0) > 0;
        this.f85408l = true;
    }
}
