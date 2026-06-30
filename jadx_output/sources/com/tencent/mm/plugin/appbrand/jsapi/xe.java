package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public class xe extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 323;
    public static final java.lang.String NAME = "uploadWeRunData";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData$UploadMiniAppStepTask f83922g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject != null) {
            C(this, lVar, i17, jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP), false);
        } else {
            lVar.a(i17, o("fail:data is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadWeRunData", "data is null");
        }
    }

    public void C(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, int i18, boolean z17) {
        if (i18 <= 0) {
            lVar.a(i17, k0Var.o("fail:step invalid"));
        } else {
            this.f83922g = new com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData$UploadMiniAppStepTask(k0Var, lVar, i17, i18, z17);
            this.f83922g.d();
        }
    }
}
