package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class wc implements com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.g6 f85341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85343c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f85344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.xc f85345e;

    public wc(com.tencent.mm.plugin.appbrand.launching.xc xcVar, com.tencent.mm.plugin.appbrand.service.g6 g6Var, java.lang.String str, java.lang.String str2, int i17) {
        this.f85345e = xcVar;
        this.f85341a = g6Var;
        this.f85342b = str;
        this.f85343c = str2;
        this.f85344d = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0
    public void a(int i17, java.lang.String str, boolean z17, r45.bl blVar, r45.j14 j14Var) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(j14Var != null ? j14Var.f377493f : 0);
        objArr[3] = j14Var != null ? j14Var.f377492e : "";
        com.tencent.mars.xlog.Log.e("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, launch fail, CGI errCode:%d, errMsg:%s, backendErrno:%d, backendErrmsg:%s", objArr);
        if (z17) {
            return;
        }
        this.f85345e.Di();
        this.f85341a.e();
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.b(null, this.f85342b, null, this.f85343c, -3);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0
    public void b(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, r45.bl blVar) {
        com.tencent.mm.plugin.appbrand.launching.xc xcVar = this.f85345e;
        xcVar.Di();
        if (z18 || xcVar.f85420d) {
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.appbrand.service.g6 g6Var = this.f85341a;
        java.lang.String str3 = this.f85343c;
        java.lang.String str4 = this.f85342b;
        if (K0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, invalid businessType");
            g6Var.e();
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.b(null, str4, null, str3, -3);
            return;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1069;
        appBrandStatObject.f87791g = str4;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77323e = str4;
        appBrandLaunchReferrer.f77322d = 4;
        appBrandLaunchReferrer.f77330o = str3;
        appBrandLaunchReferrer.f77329n = 5;
        if (com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.e7(com.tencent.mm.sdk.platformtools.x2.f193071a, null, str, str2, this.f85344d, -1, appBrandStatObject, appBrandLaunchReferrer, null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, launch success");
            g6Var.d();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, launch fail");
            g6Var.e();
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.b(null, str4, null, str3, -3);
        }
    }
}
