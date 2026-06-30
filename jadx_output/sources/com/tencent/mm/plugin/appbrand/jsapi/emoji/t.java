package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* loaded from: classes.dex */
public class t extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1270;
    public static final java.lang.String NAME = "openStickerIPView";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenStickerIPView", "data:%s", jSONObject);
        java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString2 = jSONObject.optString("desc");
        java.lang.String optString3 = jSONObject.optString("iconUrl");
        java.lang.String optString4 = jSONObject.optString("setKey");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenStickerIPView", "setKey is empty");
            e9Var.a(i17, o("fail:invalid data"));
            return;
        }
        r45.vd0 vd0Var = new r45.vd0();
        vd0Var.f388134d = optString4;
        vd0Var.f388136f = optString;
        vd0Var.f388137g = optString2;
        vd0Var.f388135e = optString3;
        qk.a0 a0Var = new qk.a0(vd0Var);
        a0Var.f364155a = 42;
        a0Var.f364133i = 58;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenStickerIPView", "unable to get emoticon liteapp feature service");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(e9Var.Z0(), a0Var);
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str, jSONObject2));
    }
}
