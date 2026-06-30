package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class g0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 46;
    public static final java.lang.String NAME = "getMusicPlayerState";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState$GetMusicPlayerState f79193g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState$GetMusicPlayerState jsApiGetMusicPlayerState$GetMusicPlayerState = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState$GetMusicPlayerState(this, lVar, i17);
        this.f79193g = jsApiGetMusicPlayerState$GetMusicPlayerState;
        jsApiGetMusicPlayerState$GetMusicPlayerState.f79006i = lVar.getAppId();
        this.f79193g.d();
    }
}
