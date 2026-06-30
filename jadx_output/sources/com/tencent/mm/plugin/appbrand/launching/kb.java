package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class kb extends com.tencent.mm.plugin.appbrand.launching.hb {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo f84721h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f84722i;

    /* renamed from: m, reason: collision with root package name */
    public final int f84723m;

    /* renamed from: n, reason: collision with root package name */
    public final int f84724n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f84725o;

    /* renamed from: p, reason: collision with root package name */
    public final int f84726p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f84727q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.QualitySession f84728r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.p f84729s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f84730t = new java.util.LinkedList();

    public kb(java.lang.String str, int i17, int i18, boolean z17, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo, int i19, java.lang.String str2, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, com.tencent.luggage.sdk.launching.p pVar) {
        this.f84722i = str;
        this.f84723m = i17;
        this.f84724n = com.tencent.mm.plugin.appbrand.appcache.g0.b(i17) ? i18 : 0;
        this.f84725o = z17;
        this.f84726p = i19;
        this.f84721h = wxaAttributes$WxaVersionInfo;
        this.f84727q = str2;
        this.f84728r = qualitySession;
        this.f84729s = pVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppWxaJsApiPermissionInfo", "<init> hash:%d, appId:%s,versionType:%d,isGame:%b,enterScene:%d, wxaColdStartMode:%s", java.lang.Integer.valueOf(hashCode()), str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19), pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.kb.call():java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.hb
    public java.lang.String f() {
        return "MicroMsg.AppBrand.PrepareStepCheckAppWxaJsApiPermissionInfo";
    }
}
