package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class t extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1206;
    public static final java.lang.String NAME = "requestSRFile";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f83856g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f83857h = "";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiRequestSRFile", "invoke, env is null");
            return;
        }
        if (wo.w0.q()) {
            this.f83856g = "https://mmgame.qpic.cn/h5/minigame/cloudgame/arm64-v8a.zip";
            this.f83857h = "1ac39c1bb2d8db344b671a40401c4b9a";
        } else {
            this.f83856g = "https://mmgame.qpic.cn/h5/minigame/cloudgame/armeabi-v7a.zip";
            this.f83857h = "da7b68479bd4bd7b510bb66105e65795";
        }
        java.lang.String cdnUrl = this.f83856g;
        java.lang.String fileMd5 = this.f83857h;
        kotlin.jvm.internal.o.g(cdnUrl, "cdnUrl");
        kotlin.jvm.internal.o.g(fileMd5, "fileMd5");
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$GetDownloadInfo(cdnUrl, fileMd5), com.tencent.mm.plugin.appbrand.jsapi.webrtc.r.class, new com.tencent.mm.plugin.appbrand.jsapi.webrtc.s(lVar, i17, this));
    }
}
