package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class k0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 297;
    public static final java.lang.String NAME = "operateAudio";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.audio.z1 f79239g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String appId = lVar.getAppId();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) jh1.a.f299795d;
        if (!(!concurrentHashMap.containsKey(appId) ? false : ((java.lang.Boolean) concurrentHashMap.get(appId)).booleanValue())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiOperateAudio", "can't do operateAudio, App is paused or background");
            lVar.a(i17, o("fail:App is paused or background"));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiOperateAudio", "operateAudio data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiOperateAudio", "operateAudio appId:%s, data:%s", lVar.getAppId(), jSONObject.toString());
        java.lang.String optString = jSONObject.optString("audioId");
        int optInt = jSONObject.optInt("currentTime", 0);
        java.lang.String optString2 = jSONObject.optString("operationType");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiOperateAudio", "audioId is empty");
            lVar.a(i17, o("fail:audioId is empty"));
            return;
        }
        if (android.text.TextUtils.isEmpty(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiOperateAudio", "operationType is empty");
            lVar.a(i17, o("fail:operationType is empty"));
            return;
        }
        if (this.f79239g == null) {
            this.f79239g = new com.tencent.mm.plugin.appbrand.jsapi.audio.z1(lVar);
        }
        this.f79239g.f79318e = lVar.getAppId();
        this.f79239g.c();
        com.tencent.mm.plugin.appbrand.jsapi.audio.j0 j0Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.j0(this, lVar, i17);
        j0Var.f79207g = lVar.getAppId();
        j0Var.f79208h = optString;
        j0Var.f79210m = optInt;
        j0Var.f79209i = optString2;
        if (optString2.equalsIgnoreCase(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
            long j17 = 0;
            long optLong = jSONObject.optLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (optLong > 0 && optLong < currentTimeMillis) {
                j17 = currentTimeMillis - optLong;
            }
            j0Var.f79215r = j17;
            j0Var.f79216s = currentTimeMillis;
        }
        jh1.b bVar = (jh1.b) ((java.util.concurrent.ConcurrentHashMap) jh1.a.f299792a).get(optString);
        if (bVar != null) {
            j0Var.f79211n = bVar.f299797b;
            j0Var.f79212o = bVar.f299796a;
            j0Var.f79214q = bVar.f299798c;
        }
        j0Var.f79213p = bm5.f1.a();
        j0Var.c();
    }
}
