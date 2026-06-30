package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class tc implements com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85185c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f85186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f85188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.xc f85189g;

    public tc(com.tencent.mm.plugin.appbrand.launching.xc xcVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, android.content.Context context, int i18) {
        this.f85189g = xcVar;
        this.f85183a = str;
        this.f85184b = str2;
        this.f85185c = str3;
        this.f85186d = i17;
        this.f85187e = context;
        this.f85188f = i18;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0
    public void a(int i17, java.lang.String str, boolean z17, r45.bl blVar, r45.j14 j14Var) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(j14Var != null ? j14Var.f377493f : 0);
        objArr[3] = j14Var != null ? j14Var.f377492e : "";
        com.tencent.mars.xlog.Log.e("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, launch fail, CGI errCode:%d, errMsg:%s, backendErrno:%d, backendErrmsg:%s", objArr);
        if (z17) {
            return;
        }
        this.f85189g.Di();
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.e(this.f85183a, null, -2);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0
    public void b(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, r45.bl blVar) {
        com.tencent.mm.plugin.appbrand.launching.xc xcVar = this.f85189g;
        xcVar.Di();
        if (z18 || xcVar.f85420d) {
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        java.lang.String str3 = this.f85183a;
        if (K0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, invalid businessType");
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.e(str3, null, -4);
            return;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1055;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str4 = this.f85184b;
        sb6.append(fp.s0.a(str4 == null ? "" : str4));
        sb6.append(":");
        java.lang.String str5 = this.f85185c;
        sb6.append(str5);
        sb6.append(":");
        sb6.append(this.f85186d);
        appBrandStatObject.f87791g = sb6.toString();
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77323e = str5;
        appBrandLaunchReferrer.f77322d = 2;
        appBrandLaunchReferrer.f77327i = str4;
        appBrandLaunchReferrer.f77330o = str3;
        appBrandLaunchReferrer.f77329n = 5;
        if (com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.e7(this.f85187e, null, str, str2, this.f85188f, -1, appBrandStatObject, appBrandLaunchReferrer, null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, launch success");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, launch fail");
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.e(str3, null, -1);
        }
    }
}
