package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class a5 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 36;
    public static final java.lang.String NAME = "chooseVideo";

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f81697g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        if (f81697g) {
            lVar.a(i17, o("cancel"));
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseRequest jsApiChooseVideo$ChooseRequest = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseRequest();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
        java.lang.String optString = jSONObject.optString("maxDuration");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseVideo", "doChooseVideo sourceType = %s, maxDuration = %s", optJSONArray, optString);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            jsApiChooseVideo$ChooseRequest.f81667f = true;
            jsApiChooseVideo$ChooseRequest.f81668g = true;
        } else {
            jsApiChooseVideo$ChooseRequest.f81667f = optJSONArray.toString().contains("camera");
            jsApiChooseVideo$ChooseRequest.f81668g = optJSONArray.toString().contains(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
        }
        jsApiChooseVideo$ChooseRequest.f81669h = jSONObject.optBoolean("compressed", true);
        if (jsApiChooseVideo$ChooseRequest.f81667f) {
            si1.e1.a(lVar.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.media.t4(this, lVar, jSONObject, i17));
            android.content.Context context2 = lVar.getContext();
            if (context2 == null || !(context2 instanceof android.app.Activity)) {
                lVar.a(i17, o("fail"));
                z17 = false;
            } else {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                z17 = j35.u.a((android.app.Activity) context2, "android.permission.CAMERA", 115, "", "");
                if (z17) {
                    si1.e1.c(lVar.getAppId());
                }
            }
            if (!z17) {
                return;
            }
        }
        f81697g = true;
        com.tencent.mm.plugin.appbrand.x0.a(lVar.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.media.r4(this, lVar));
        jsApiChooseVideo$ChooseRequest.f81666e = com.tencent.mm.sdk.platformtools.t8.P(optString, 60);
        jsApiChooseVideo$ChooseRequest.f81665d = lVar.getAppId();
        com.tencent.mm.plugin.appbrand.ipc.d.b(context, jsApiChooseVideo$ChooseRequest, new com.tencent.mm.plugin.appbrand.jsapi.media.s4(this, lVar, i17));
    }
}
