package be1;

/* loaded from: classes7.dex */
public class q extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 425;
    public static final java.lang.String NAME = "getBatteryInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        jk1.e a17;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBatteryInfo", "JsApiGetBatteryInfo: start");
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBatteryInfo", "JsApiGetBatteryInfo no component");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            return u(str2, jSONObject2);
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBatteryInfo", "JsApiGetBatteryInfo no context");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            return u(str2, jSONObject3);
        }
        android.os.BatteryManager batteryManager = (android.os.BatteryManager) context.getSystemService("batterymanager");
        if (batteryManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBatteryInfo", "JsApiGetBatteryInfo no batteryManager");
            batteryManager = null;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBatteryInfo", "JsApiGetBatteryInfo: BatteryManager got!");
        }
        if (batteryManager == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            return u(str2, jSONObject4);
        }
        int intProperty = batteryManager.getIntProperty(4);
        boolean isCharging = batteryManager.isCharging();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBatteryInfo", "BatteryInfo Api23 level = %d, isCharging = %b", java.lang.Integer.valueOf(intProperty), java.lang.Boolean.valueOf(isCharging));
        jk1.d dVar = (jk1.d) jk1.a.INST.f300050d;
        synchronized (dVar) {
            android.content.Context context2 = dVar.f300053d;
            if (context2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandBatteryManagerImplBelow21", "getBatteryInfo no context");
                a17 = jk1.a.f300048g;
            } else {
                android.content.Intent intent = dVar.f300056g;
                if (intent == null) {
                    dVar.f300058i = new jk1.c(dVar, null);
                    intent = context2.getApplicationContext().registerReceiver(dVar.f300058i, dVar.f300054e);
                    dVar.f300056g = intent;
                }
                if (intent == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandBatteryManagerImplBelow21", "getBatteryInfo no intent got");
                    a17 = jk1.a.f300048g;
                } else {
                    a17 = dVar.f300055f.a(intent);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBatteryInfo", "BatterInfo Below21, level = %d, isCharging = %b", java.lang.Integer.valueOf(a17.f300060b), java.lang.Boolean.valueOf(a17.f300059a));
        boolean isOnPowerSavedMode = ((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).isOnPowerSavedMode();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBatteryInfo", "isLowPowerModeEnabled:%b", java.lang.Boolean.valueOf(isOnPowerSavedMode));
        java.util.HashMap hashMap = new java.util.HashMap();
        if (intProperty < 0) {
            intProperty = a17.f300060b;
        }
        hashMap.put(ya.b.LEVEL, java.lang.Integer.valueOf(intProperty));
        hashMap.put("isCharging", java.lang.Boolean.valueOf(isCharging || a17.f300059a));
        hashMap.put("isLowPowerModeEnabled", java.lang.Boolean.valueOf(isOnPowerSavedMode));
        return p("ok", hashMap);
    }
}
