package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class p0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.c0 f79677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f79678c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.q0 f79679d;

    public p0(com.tencent.mm.plugin.appbrand.jsapi.auth.q0 q0Var, com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, int i17) {
        this.f79679d = q0Var;
        this.f79676a = yVar;
        this.f79677b = c0Var;
        this.f79678c = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.q0 q0Var = this.f79679d;
        java.lang.String k17 = q0Var.k();
        com.tencent.mm.plugin.appbrand.y yVar = this.f79676a;
        com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var = this.f79677b;
        boolean c17 = yVar.c(k17, c0Var);
        int i19 = this.f79678c;
        if (!c17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi callback, callbackId:%s, service not running or preloaded", java.lang.Integer.valueOf(i19));
            return;
        }
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            if (fVar instanceof r45.n24) {
                r45.n24 n24Var = (r45.n24) fVar;
                if (n24Var.f381015d.f377491d != 0) {
                    yVar.d0(i19, q0Var.o("fail:errorCode:" + n24Var.f381015d.f377491d + ",errorMsg:" + n24Var.f381015d.f377492e), c0Var);
                    return;
                }
                java.lang.String i27 = n24Var.f381016e.i();
                if (com.tencent.mm.sdk.platformtools.t8.K0(i27)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi success, data is null");
                    yVar.d0(i19, q0Var.o("fail invalid response"), c0Var);
                    return;
                }
                java.lang.String appId = yVar.getAppId();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Map map = i81.j.f289592a;
                try {
                    if (i81.a0.b(appId).f289574r == 0) {
                        i81.a0.b(appId).f289574r = currentTimeMillis;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi success, callbackId:%s, callback data:%s", java.lang.Integer.valueOf(i19), n24Var.f381016e.i());
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, i27);
                    yVar.d0(i19, q0Var.p("ok", hashMap), c0Var);
                    return;
                } catch (java.lang.NullPointerException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "setAdOperateCallbackSendTime npe, appId:%s, runtime:%s", appId, com.tencent.mm.plugin.appbrand.l.b(appId));
                    throw e17;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi fail, errType:%s, errCode:%s, errMsg:%s, response:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, oVar.f70711b.f70700a);
        yVar.d0(i19, q0Var.o("fail invalid response"), c0Var);
    }
}
