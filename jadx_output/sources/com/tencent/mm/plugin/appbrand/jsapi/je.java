package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class je extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 626;
    public static final java.lang.String NAME = "showImageOperateSheet";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) lVar;
        try {
            java.lang.String string = jSONObject.getString("imageUrl");
            java.lang.String string2 = jSONObject.getString("imageBase64");
            int c17 = ik1.w.c(jSONObject.getInt("elementLeft"));
            int c18 = ik1.w.c(jSONObject.getInt("elementTop"));
            new com.tencent.mm.plugin.appbrand.jsapi.md(n7Var, string, string2, new android.graphics.Rect(c17, c18, ik1.w.c(jSONObject.getInt("elementWidth")) + c17, ik1.w.c(jSONObject.getInt("elementHeight")) + c18)).d();
            n7Var.a(i17, o("ok"));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowImageOperateSheet", "fail exp:%s", e17.getLocalizedMessage());
            n7Var.a(i17, o("fail invalid params"));
        }
    }
}
