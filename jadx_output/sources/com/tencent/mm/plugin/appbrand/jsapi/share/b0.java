package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class b0 implements com.tencent.mm.plugin.appbrand.jsapi.share.s {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void a(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject) {
        uVar.D = false;
        java.lang.String optString = jSONObject.optString("webpageUrl");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            optString = com.tencent.mm.plugin.appbrand.v9.b(c0Var.getAppId());
        }
        uVar.A = optString;
        uVar.I.put("is_weishi_video", java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = c0Var.t3().u0();
        com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams appBrandWeishiParams = u07.E;
        if (appBrandWeishiParams == null || com.tencent.mm.sdk.platformtools.t8.K0(appBrandWeishiParams.f77347g)) {
            return;
        }
        uVar.I.put("msg_img_path", u07.E.f77347g);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void b(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = c0Var.t3().u0();
        sendAppMessageTask.B = 3;
        com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams appBrandWeishiParams = u07.E;
        if (appBrandWeishiParams != null) {
            sendAppMessageTask.f83071p0 = appBrandWeishiParams.f77348h;
            sendAppMessageTask.f83081x0 = appBrandWeishiParams.f77349i;
            sendAppMessageTask.f83084y0 = appBrandWeishiParams.f77350m;
            sendAppMessageTask.f83066l1 = appBrandWeishiParams.f77345e;
            if (com.tencent.mm.sdk.platformtools.t8.K0(sendAppMessageTask.f83070p)) {
                sendAppMessageTask.f83074r = u07.E.f77346f;
                sendAppMessageTask.f83075s = false;
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void c(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, boolean z17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16979, uVar.f83276v, uVar.f83262h, 0, 3);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void d(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public boolean e(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
        java.lang.String str = uVar.C;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.startsWith("delayLoadFile://");
    }
}
