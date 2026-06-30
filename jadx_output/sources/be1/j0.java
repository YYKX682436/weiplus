package be1;

/* loaded from: classes4.dex */
public class j0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 535;
    public static final java.lang.String NAME = "getVolume";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetVolume", "invoke JsApiGetVolume!");
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetVolume", "component is null");
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetVolume", "fail:context is null");
            lVar.a(i17, o("fail:context is null"));
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetVolume", "fail:context is not Activity");
            lVar.a(i17, o("fail:context is not Activity"));
            return;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetVolume", "fail:manager is null");
            lVar.a(i17, o("fail:manager is null"));
            return;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetVolume", "JsApiGetVolume %d/%d", java.lang.Integer.valueOf(streamVolume), java.lang.Integer.valueOf(streamMaxVolume));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("currentVolume", java.lang.Integer.valueOf(streamVolume));
        hashMap.put("maxVolume", java.lang.Integer.valueOf(streamMaxVolume));
        lVar.a(i17, p("ok", hashMap));
    }
}
