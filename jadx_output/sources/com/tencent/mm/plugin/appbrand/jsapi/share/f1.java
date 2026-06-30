package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class f1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f83133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f83135f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83136g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.q2 f83137h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83138i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83139j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f83140k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83141l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.g1 f83142m;

    public f1(com.tencent.mm.plugin.appbrand.jsapi.share.g1 g1Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, java.lang.String str3, com.tencent.mm.plugin.appbrand.jsapi.share.q2 q2Var, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6) {
        this.f83142m = g1Var;
        this.f83130a = activity;
        this.f83131b = str;
        this.f83132c = str2;
        this.f83133d = c0Var;
        this.f83134e = i17;
        this.f83135f = appBrandInitConfigWC;
        this.f83136g = str3;
        this.f83137h = q2Var;
        this.f83138i = str4;
        this.f83139j = str5;
        this.f83140k = i18;
        this.f83141l = str6;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.share.g1 g1Var = this.f83142m;
        if (i17 != g1Var.f83145g) {
            return false;
        }
        int i19 = this.f83134e;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f83133d;
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareTimeline", "result is cancel");
            c0Var.a(i19, g1Var.o("cancel"));
            java.lang.String str = this.f83131b;
            java.lang.String str2 = this.f83132c;
            g1Var.getClass();
            com.tencent.mm.plugin.appbrand.report.v0.e(str, str2, 3, "", com.tencent.mm.sdk.platformtools.t8.i1(), 3, i18);
            return true;
        }
        android.app.Activity activity = this.f83130a;
        db5.e1.T(activity, activity.getResources().getString(com.tencent.mm.R.string.f490560yi));
        java.lang.String str3 = this.f83131b;
        java.lang.String str4 = this.f83132c;
        g1Var.getClass();
        com.tencent.mm.plugin.appbrand.report.v0.e(str3, str4, 3, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareTimeline", "result is success");
        c0Var.a(i19, g1Var.o("ok"));
        java.lang.String Y1 = c0Var.V0().Y1();
        java.lang.String J1 = c0Var.V0().J1();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f83135f;
        int i27 = appBrandInitConfigWC.f47284z;
        com.tencent.mm.plugin.appbrand.jsapi.share.r2.b(this.f83136g, this.f83137h);
        java.lang.String str5 = this.f83131b;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = appBrandInitConfigWC.f47269b2;
        com.tencent.mm.plugin.appbrand.jsapi.share.n2.d(str5, appBrandStatObject.f87790f, appBrandStatObject.f87791g, appBrandInitConfigWC.f47276v, null, this.f83138i, this.f83132c, Y1, J1, 0, this.f83136g, null, i27, this.f83139j, this.f83140k, 3, this.f83141l);
        return true;
    }
}
