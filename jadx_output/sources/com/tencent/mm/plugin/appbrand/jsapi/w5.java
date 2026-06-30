package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.JsApiGetAppConfigTask f83709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f83710f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f83711g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.x5 f83712h;

    public w5(com.tencent.mm.plugin.appbrand.jsapi.x5 x5Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.JsApiGetAppConfigTask jsApiGetAppConfigTask, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i18) {
        this.f83712h = x5Var;
        this.f83708d = i17;
        this.f83709e = jsApiGetAppConfigTask;
        this.f83710f = c0Var;
        this.f83711g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        int i17 = this.f83708d;
        sb6.append(i17);
        hashMap.put("type", sb6.toString());
        com.tencent.mm.plugin.appbrand.jsapi.JsApiGetAppConfigTask jsApiGetAppConfigTask = this.f83709e;
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jsApiGetAppConfigTask.f78519h);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetAppConfig", "getAppConfig type:%d,data:\n%s", java.lang.Integer.valueOf(i17), jsApiGetAppConfigTask.f78519h);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(jsApiGetAppConfigTask.f78519h);
        com.tencent.mm.plugin.appbrand.jsapi.x5 x5Var = this.f83712h;
        int i18 = this.f83711g;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f83710f;
        if (K0) {
            c0Var.a(i18, x5Var.o("fail"));
        } else {
            c0Var.a(i18, x5Var.p("ok", hashMap));
        }
        jsApiGetAppConfigTask.x();
    }
}
