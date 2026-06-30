package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes11.dex */
public class e0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 159;
    public static final java.lang.String NAME = "getBackgroundAudioState";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String appId = lVar.getAppId();
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState$GetBackgroundAudioStateTask jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState$GetBackgroundAudioStateTask();
        jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78985f = appId;
        if (!jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.s()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState fail");
            return o("fail");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("duration", java.lang.Double.valueOf(jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78986g));
        hashMap.put("currentTime", java.lang.Double.valueOf(jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78987h));
        hashMap.put("paused", java.lang.Boolean.valueOf(jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78988i == 1));
        hashMap.put("buffered", java.lang.Double.valueOf(jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78989m));
        hashMap.put("src", jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78990n);
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78991o);
        hashMap.put("epname", jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78992p);
        hashMap.put("singer", jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78993q);
        hashMap.put("coverImgUrl", jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78994r);
        hashMap.put("webUrl", jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78995s);
        java.lang.String str = jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78996t;
        if (str == null) {
            str = "";
        }
        hashMap.put("protocol", str);
        hashMap.put("startTime", java.lang.Integer.valueOf(jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78997u / 1000));
        hashMap.put("songLyric", jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78998v);
        hashMap.put("playbackRate", java.lang.Double.valueOf(jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f78999w));
        hashMap.put("referrerPolicy", jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f79000x);
        java.lang.String str2 = android.text.TextUtils.isEmpty(jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f79002z) ? "" : jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f79002z;
        if (!jsApiGetBackgroundAudioState$GetBackgroundAudioStateTask.f79001y) {
            return p("ok", hashMap);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState fail, err:%s", str2);
        return o("fail:" + str2);
    }
}
