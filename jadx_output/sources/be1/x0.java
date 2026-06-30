package be1;

/* loaded from: classes4.dex */
public class x0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 534;
    public static final java.lang.String NAME = "setVolume";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetVolume", "invoke JsApiSetVolume!");
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetVolume", "fail:component is null");
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetVolume", "fail:context is null");
            lVar.a(i17, o("fail:context is null"));
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetVolume", "fail:context is not Activity");
            lVar.a(i17, o("fail:context is not Activity"));
            return;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetVolume", "fail:manager is null");
            lVar.a(i17, o("fail:manager is null"));
            return;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int optInt = jSONObject.optInt("value", streamVolume);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetVolume", "JsApiSetVolume value:%d, current:%d, max:%d", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(streamVolume), java.lang.Integer.valueOf(streamMaxVolume));
        if (optInt < 0) {
            streamMaxVolume = 0;
        } else if (optInt <= streamMaxVolume) {
            streamMaxVolume = optInt;
        }
        if (streamMaxVolume == streamVolume) {
            lVar.a(i17, o("fail:volume does not change"));
        } else {
            to.a.c(audioManager, 3, streamMaxVolume, 0);
            lVar.a(i17, o("ok"));
        }
    }
}
