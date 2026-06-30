package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes11.dex */
public final class i0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 1318;
    public static final java.lang.String NAME = "getTingAudioState";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l service, org.json.JSONObject data) {
        java.lang.String mErrorMsg;
        java.lang.String concat;
        java.lang.String str;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String appId = service.getAppId();
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetTingAudioState$GetTingAudioStateTask jsApiGetTingAudioState$GetTingAudioStateTask = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetTingAudioState$GetTingAudioStateTask();
        jsApiGetTingAudioState$GetTingAudioStateTask.U(appId);
        if (!jsApiGetTingAudioState$GetTingAudioStateTask.s()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiGetTingAudioState", "getTingAudioState fail");
            concat = android.text.TextUtils.isEmpty(null) ? "fail" : null;
            str = concat != null ? concat : "";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            java.lang.String u17 = u(str, jSONObject);
            kotlin.jvm.internal.o.f(u17, "makeReturnJson(...)");
            return u17;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("duration", java.lang.Double.valueOf(jsApiGetTingAudioState$GetTingAudioStateTask.getDuration()));
        hashMap.put("currentTime", java.lang.Double.valueOf(jsApiGetTingAudioState$GetTingAudioStateTask.getCurrentTime()));
        hashMap.put("paused", java.lang.Boolean.valueOf(jsApiGetTingAudioState$GetTingAudioStateTask.getPaused() == 1));
        hashMap.put("buffered", java.lang.Double.valueOf(jsApiGetTingAudioState$GetTingAudioStateTask.getBuffered()));
        hashMap.put("src", jsApiGetTingAudioState$GetTingAudioStateTask.getSrc());
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, jsApiGetTingAudioState$GetTingAudioStateTask.getCom.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE java.lang.String());
        hashMap.put("epname", jsApiGetTingAudioState$GetTingAudioStateTask.getEpname());
        hashMap.put("singer", jsApiGetTingAudioState$GetTingAudioStateTask.getSinger());
        hashMap.put("coverImgUrl", jsApiGetTingAudioState$GetTingAudioStateTask.getCoverImgUrl());
        hashMap.put("webUrl", jsApiGetTingAudioState$GetTingAudioStateTask.getWebUrl());
        hashMap.put("protocol", jsApiGetTingAudioState$GetTingAudioStateTask.getProtocol() == null ? "" : jsApiGetTingAudioState$GetTingAudioStateTask.getProtocol());
        hashMap.put("startTime", java.lang.Integer.valueOf(jsApiGetTingAudioState$GetTingAudioStateTask.getStartTime()));
        hashMap.put("songLyric", jsApiGetTingAudioState$GetTingAudioStateTask.getSongLyric());
        hashMap.put("playbackRate", java.lang.Double.valueOf(jsApiGetTingAudioState$GetTingAudioStateTask.getPlaybackRate()));
        if (android.text.TextUtils.isEmpty(jsApiGetTingAudioState$GetTingAudioStateTask.getMErrorMsg())) {
            mErrorMsg = "";
        } else {
            mErrorMsg = jsApiGetTingAudioState$GetTingAudioStateTask.getMErrorMsg();
            kotlin.jvm.internal.o.d(mErrorMsg);
        }
        if (!jsApiGetTingAudioState$GetTingAudioStateTask.getError()) {
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            java.lang.String t17 = t("ok", hashMap);
            kotlin.jvm.internal.o.d(t17);
            return t17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiGetTingAudioState", "getTingAudioState fail, err:".concat(mErrorMsg));
        concat = android.text.TextUtils.isEmpty(null) ? "fail:".concat(mErrorMsg) : null;
        str = concat != null ? concat : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        java.lang.String u18 = u(str, jSONObject2);
        kotlin.jvm.internal.o.d(u18);
        return u18;
    }
}
