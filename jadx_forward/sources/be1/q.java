package be1;

/* loaded from: classes7.dex */
public class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f4226x366c91de = 425;

    /* renamed from: NAME */
    public static final java.lang.String f4227x24728b = "getBatteryInfo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        jk1.e a17;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBatteryInfo", "JsApiGetBatteryInfo: start");
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBatteryInfo", "JsApiGetBatteryInfo no component");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            return u(str2, jSONObject2);
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBatteryInfo", "JsApiGetBatteryInfo no context");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            return u(str2, jSONObject3);
        }
        android.os.BatteryManager batteryManager = (android.os.BatteryManager) mo50352x76847179.getSystemService("batterymanager");
        if (batteryManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBatteryInfo", "JsApiGetBatteryInfo no batteryManager");
            batteryManager = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBatteryInfo", "JsApiGetBatteryInfo: BatteryManager got!");
        }
        if (batteryManager == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            return u(str2, jSONObject4);
        }
        int intProperty = batteryManager.getIntProperty(4);
        boolean isCharging = batteryManager.isCharging();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBatteryInfo", "BatteryInfo Api23 level = %d, isCharging = %b", java.lang.Integer.valueOf(intProperty), java.lang.Boolean.valueOf(isCharging));
        jk1.d dVar = (jk1.d) jk1.a.INST.f381583d;
        synchronized (dVar) {
            android.content.Context context = dVar.f381586d;
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandBatteryManagerImplBelow21", "getBatteryInfo no context");
                a17 = jk1.a.f381581g;
            } else {
                android.content.Intent intent = dVar.f381589g;
                if (intent == null) {
                    dVar.f381591i = new jk1.c(dVar, null);
                    intent = context.getApplicationContext().registerReceiver(dVar.f381591i, dVar.f381587e);
                    dVar.f381589g = intent;
                }
                if (intent == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandBatteryManagerImplBelow21", "getBatteryInfo no intent got");
                    a17 = jk1.a.f381581g;
                } else {
                    a17 = dVar.f381588f.a(intent);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBatteryInfo", "BatterInfo Below21, level = %d, isCharging = %b", java.lang.Integer.valueOf(a17.f381593b), java.lang.Boolean.valueOf(a17.f381592a));
        boolean mo48898xb1b1d24e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48898xb1b1d24e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBatteryInfo", "isLowPowerModeEnabled:%b", java.lang.Boolean.valueOf(mo48898xb1b1d24e));
        java.util.HashMap hashMap = new java.util.HashMap();
        if (intProperty < 0) {
            intProperty = a17.f381593b;
        }
        hashMap.put(ya.b.f77487x44fa364, java.lang.Integer.valueOf(intProperty));
        hashMap.put("isCharging", java.lang.Boolean.valueOf(isCharging || a17.f381592a));
        hashMap.put("isLowPowerModeEnabled", java.lang.Boolean.valueOf(mo48898xb1b1d24e));
        return p("ok", hashMap);
    }
}
