package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public class q3 extends com.tencent.mm.plugin.appbrand.jsapi.xe {
    public static final int CTRL_INDEX = 324;
    public static final java.lang.String NAME = "addWeRunData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.xe, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject != null) {
            C(this, lVar, i17, jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP), true);
        } else {
            lVar.a(i17, o("fail:data is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddWeRunData", "data is null");
        }
    }
}
