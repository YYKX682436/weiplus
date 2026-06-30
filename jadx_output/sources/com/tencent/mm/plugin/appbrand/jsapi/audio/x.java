package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class x extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 291;
    public static final java.lang.String NAME = "createAudioInstance";

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Vector f79298g = new java.util.Vector();

    public static java.lang.String B(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        java.lang.String appId = lVar.getAppId();
        java.lang.String a17 = dl3.h.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "createAudioInstance appId:%s, audioId:%s", appId, a17);
        com.tencent.mm.plugin.appbrand.jsapi.audio.w wVar = new com.tencent.mm.plugin.appbrand.jsapi.audio.w();
        wVar.f79294e = a17;
        wVar.f79295f = 0;
        wVar.f79293d = appId;
        wVar.c();
        com.tencent.mm.plugin.appbrand.jsapi.audio.v vVar = new com.tencent.mm.plugin.appbrand.jsapi.audio.v(appId, lVar);
        java.util.Vector vector = f79298g;
        if (!vector.contains(appId)) {
            com.tencent.mm.plugin.appbrand.x0.a(appId, vVar);
            vector.add(appId);
        }
        return a17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("audioId", B(lVar));
        return p("ok", hashMap);
    }
}
