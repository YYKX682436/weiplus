package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class g6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 732;
    public static final java.lang.String NAME = "getVideoInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetVideoInfo", "fail:internal error");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetVideoInfo", "fail:data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        if (lVar.getFileSystem() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetVideoInfo", "fail:file system is null");
            lVar.a(i17, o("fail:internal error"));
            return;
        }
        java.lang.String optString = jSONObject.optString("src");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetVideoInfo", "fail:data src is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        if (!optString.startsWith("wxfile://")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetVideoInfo", "fail:src path not supported");
            lVar.a(i17, o("fail:src path not be supported"));
            return;
        }
        com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(optString);
        if (absoluteFile == null) {
            lVar.a(i17, o("fail:file doesn't exist"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.s7 c17 = com.tencent.mm.plugin.appbrand.jsapi.media.t7.c(absoluteFile.o());
        if (c17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetVideoInfo", "fail:videoInfo is null");
            lVar.a(i17, o("fail:can't get info from video file"));
            return;
        }
        int i18 = c17.f82051a;
        java.lang.String str = i18 != 90 ? i18 != 180 ? i18 != 270 ? "up" : "left" : "down" : "right";
        java.util.HashMap hashMap = new java.util.HashMap(8);
        hashMap.put("orientation", str);
        hashMap.put("type", c17.f82052b);
        hashMap.put("duration", java.lang.Float.valueOf(com.tencent.mm.sdk.platformtools.t8.B1(new java.text.DecimalFormat("#.#").format((c17.f82053c * 1.0f) / 1000.0f))));
        hashMap.put("size", java.lang.Integer.valueOf(java.lang.Math.round((((float) c17.f82054d) * 1.0f) / 1024.0f)));
        hashMap.put("height", java.lang.Integer.valueOf(c17.f82056f));
        hashMap.put("width", java.lang.Integer.valueOf(c17.f82055e));
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, java.lang.Integer.valueOf(java.lang.Math.round((c17.f82057g * 1.0f) / 1000.0f)));
        hashMap.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, java.lang.Float.valueOf(c17.f82058h));
        lVar.a(i17, p("ok", hashMap));
    }
}
