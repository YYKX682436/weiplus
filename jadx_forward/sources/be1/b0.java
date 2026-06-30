package be1;

/* loaded from: classes4.dex */
public class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4210x366c91de = 232;

    /* renamed from: NAME */
    public static final java.lang.String f4211x24728b = "getScreenBrightness";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            lVar.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetScreenBrightness", "context is null, invoke fail!");
            return;
        }
        if (!(mo50352x76847179 instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetScreenBrightness", "context is not Activity, invoke fail!");
            return;
        }
        android.view.WindowManager.LayoutParams attributes = ((android.app.Activity) mo50352x76847179).getWindow().getAttributes();
        float f17 = attributes.screenBrightness;
        if (f17 < 0.0f) {
            try {
                f17 = android.provider.Settings.System.getInt(mo50352x76847179.getContentResolver(), "screen_brightness") / C();
            } catch (android.provider.Settings.SettingNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetScreenBrightness", "getSystemBrightnessPercent err %s", e17.getMessage());
                f17 = 0.0f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(attributes.screenBrightness));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("value", java.lang.Float.valueOf(f17));
                lVar.a(i17, p("ok", hashMap));
            } catch (java.lang.IllegalArgumentException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetScreenBrightness", "getSystemBrightnessPercent IllegalArgumentException: %s", e18.getMessage());
                f17 = 0.0f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(attributes.screenBrightness));
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("value", java.lang.Float.valueOf(f17));
                lVar.a(i17, p("ok", hashMap2));
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetScreenBrightness", "getSystemBrightnessPercent err %s", e19.getMessage());
                f17 = 0.0f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(attributes.screenBrightness));
                java.util.HashMap hashMap22 = new java.util.HashMap();
                hashMap22.put("value", java.lang.Float.valueOf(f17));
                lVar.a(i17, p("ok", hashMap22));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(attributes.screenBrightness));
        java.util.HashMap hashMap222 = new java.util.HashMap();
        hashMap222.put("value", java.lang.Float.valueOf(f17));
        lVar.a(i17, p("ok", hashMap222));
    }

    public final int C() {
        try {
            android.content.res.Resources system = android.content.res.Resources.getSystem();
            int identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
            if (identifier != 0) {
                return system.getInteger(identifier);
            }
            return 255;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetScreenBrightness", "get max brightness fail, fallback to 255");
            return 255;
        }
    }
}
