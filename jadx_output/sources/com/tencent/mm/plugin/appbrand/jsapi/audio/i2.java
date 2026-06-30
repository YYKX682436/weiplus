package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class i2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 481;
    public static final java.lang.String NAME = "setInnerAudioOption";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String appId = lVar.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiSetInnerAudioOption", "data:%s, appId:%s", jSONObject, appId);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerHelper", "getAudioContextOption()");
        am.f0 f0Var = new am.f0();
        f0Var.f6621a.f6413a = 20;
        dl3.c.a(f0Var);
        n01.a aVar = f0Var.f6622b.f6514c;
        if (aVar == null) {
            aVar = new n01.a();
        }
        if (!android.text.TextUtils.isEmpty(appId) && !android.text.TextUtils.isEmpty(aVar.f333835c) && !appId.equalsIgnoreCase(aVar.f333835c)) {
            aVar.f333833a = true;
            aVar.f333834b = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiSetInnerAudioOption", "reset AudioContextParam");
        }
        aVar.f333835c = appId;
        if (jSONObject.has("mixWithOther")) {
            aVar.f333833a = jSONObject.optBoolean("mixWithOther", true);
        }
        if (jSONObject.has("speakerOn")) {
            aVar.f333834b = jSONObject.optBoolean("speakerOn", true);
        }
        if (!aVar.f333834b) {
            aVar.f333833a = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerHelper", "setAudioContextOption, mixWithOther:%b", java.lang.Boolean.valueOf(aVar.f333833a));
        am.f0 f0Var2 = new am.f0();
        am.d0 d0Var = f0Var2.f6621a;
        d0Var.f6413a = 19;
        d0Var.f6418f = aVar;
        dl3.c.a(f0Var2);
        boolean z17 = f0Var2.f6622b.f6512a;
        lVar.a(i17, o("ok"));
    }
}
