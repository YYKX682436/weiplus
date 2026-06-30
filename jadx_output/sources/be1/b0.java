package be1;

/* loaded from: classes4.dex */
public class b0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 232;
    public static final java.lang.String NAME = "getScreenBrightness";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Context context = lVar.getContext();
        if (context == null) {
            lVar.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetScreenBrightness", "context is null, invoke fail!");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetScreenBrightness", "context is not Activity, invoke fail!");
            return;
        }
        android.view.WindowManager.LayoutParams attributes = ((android.app.Activity) context).getWindow().getAttributes();
        float f17 = attributes.screenBrightness;
        if (f17 < 0.0f) {
            try {
                f17 = android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness") / C();
            } catch (android.provider.Settings.SettingNotFoundException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetScreenBrightness", "getSystemBrightnessPercent err %s", e17.getMessage());
                f17 = 0.0f;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(attributes.screenBrightness));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("value", java.lang.Float.valueOf(f17));
                lVar.a(i17, p("ok", hashMap));
            } catch (java.lang.IllegalArgumentException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetScreenBrightness", "getSystemBrightnessPercent IllegalArgumentException: %s", e18.getMessage());
                f17 = 0.0f;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(attributes.screenBrightness));
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("value", java.lang.Float.valueOf(f17));
                lVar.a(i17, p("ok", hashMap2));
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetScreenBrightness", "getSystemBrightnessPercent err %s", e19.getMessage());
                f17 = 0.0f;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(attributes.screenBrightness));
                java.util.HashMap hashMap22 = new java.util.HashMap();
                hashMap22.put("value", java.lang.Float.valueOf(f17));
                lVar.a(i17, p("ok", hashMap22));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(attributes.screenBrightness));
        java.util.HashMap hashMap222 = new java.util.HashMap();
        hashMap222.put("value", java.lang.Float.valueOf(f17));
        lVar.a(i17, p("ok", hashMap222));
    }

    public final int C() {
        try {
            android.content.res.Resources system = android.content.res.Resources.getSystem();
            int identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", com.eclipsesource.mmv8.Platform.ANDROID);
            if (identifier != 0) {
                return system.getInteger(identifier);
            }
            return 255;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetScreenBrightness", "get max brightness fail, fallback to 255");
            return 255;
        }
    }
}
