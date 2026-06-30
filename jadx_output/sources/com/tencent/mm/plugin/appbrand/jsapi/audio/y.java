package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class y extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 291;
    public static final java.lang.String NAME = "createAudioInstanceAsync";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.getJsRuntime());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateAudioInstanceAsync", "hy: create audio instance async invoke");
        java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateAudioInstanceAsync", "hy: start create audio instance async");
        java.lang.String B = com.tencent.mm.plugin.appbrand.jsapi.audio.x.B(lVar);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("audioId", B);
        com.tencent.mm.plugin.appbrand.jsapi.audio.d.INSTANCE.a(lVar.getAppId()).f269975a.put(B, c0Var);
        lVar.a(i17, p("ok", hashMap));
    }
}
