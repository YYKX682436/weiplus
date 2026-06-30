package qf1;

/* loaded from: classes13.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f76475x366c91de = 318;

    /* renamed from: NAME */
    public static final java.lang.String f76476x24728b = "getConnectedWifi";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedWifi", "mContext is null, invoke fail!");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 12010);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 4);
            lVar.a(i17, t("fail:context is null", hashMap));
            return;
        }
        if (!qf1.m.f443811g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedWifi", "not invoke startWifi");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 12000);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 1505001);
            lVar.a(i17, t("fail:not invoke startWifi", hashMap2));
            return;
        }
        rf1.l.b(mo50352x76847179);
        if (!sf1.s.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedWifi", "wifi is disable,invoke fail!");
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("errCode", 12005);
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap3.put("errno", 1505002);
            lVar.a(i17, t("fail:wifi is disable", hashMap3));
            return;
        }
        rf1.h a17 = rf1.e.f476154a.a(jSONObject != null ? jSONObject.optBoolean("acceptIncompleteWiFiInfo", false) : false);
        if (a17 == null || !a17.a()) {
            if (!u75.d.e() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put("errCode", 12006);
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                hashMap4.put("errno", 1505003);
                lVar.a(i17, t("fail:may be not open GPS", hashMap4));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedWifi", "wifiList is empty, may be not open GPS");
                return;
            }
            boolean b17 = nf.t.b((android.app.Activity) mo50352x76847179, lVar, "android.permission.ACCESS_FINE_LOCATION");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetConnectedWifi", "checkLocation:%b", java.lang.Boolean.valueOf(b17));
            if (!b17) {
                java.util.HashMap hashMap5 = new java.util.HashMap();
                hashMap5.put("errCode", 12012);
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                hashMap5.put("errno", 1505004);
                lVar.a(i17, t("fail:may be not obtain GPS Perrmission", hashMap5));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedWifi", "wifiList is empty, may be not obtain GPS Perrmission");
                return;
            }
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedWifi", "currentWifi is null");
                java.util.HashMap hashMap6 = new java.util.HashMap();
                hashMap6.put("errCode", 12010);
                java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                hashMap6.put("errno", 1505005);
                lVar.a(i17, t("fail:currentWifi is null", hashMap6));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedWifi", "currentWifi is invalid");
            java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "fail:current connected wifi is invalid" : null;
            java.lang.String str8 = str7 != null ? str7 : "";
            java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1505006);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str8, jSONObject2));
            return;
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
        if (connectivityManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedWifi", "ConnectivityManager is null");
            java.util.HashMap hashMap7 = new java.util.HashMap();
            hashMap7.put("errCode", 12010);
            java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap7.put("errno", 4);
            lVar.a(i17, t("fail:connectivityManager is null", hashMap7));
            return;
        }
        boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("checkNetInfo") : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetConnectedWifi", "checkNetInfo: " + optBoolean);
        if (optBoolean || mo50352x76847179.getApplicationInfo().targetSdkVersion < 29 || android.os.Build.VERSION.SDK_INT < 29) {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedWifi", "netInfo is null");
                java.util.HashMap hashMap8 = new java.util.HashMap();
                hashMap8.put("errCode", 12010);
                java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                hashMap8.put("errno", 1505040);
                lVar.a(i17, t("fail:netInfo is null", hashMap8));
                return;
            }
            if (activeNetworkInfo.getDetailedState() != android.net.NetworkInfo.DetailedState.CONNECTED) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedWifi", "ConnectivityManager is null, detailState:%s", activeNetworkInfo.getDetailedState());
                java.util.HashMap hashMap9 = new java.util.HashMap();
                hashMap9.put("errCode", 12010);
                java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                hashMap9.put("errno", 1505040);
                lVar.a(i17, t("fail:detailState is not connected", hashMap9));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetConnectedWifi", "[invoke]currentWifi:%s", a17);
        try {
            java.util.HashMap hashMap10 = new java.util.HashMap();
            hashMap10.put("wifi", a17.b());
            hashMap10.put("errCode", 0);
            java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap10.put("errno", 0);
            lVar.a(i17, t("ok", hashMap10));
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiGetConnectedWifi", e18, "", new java.lang.Object[0]);
            java.util.HashMap hashMap11 = new java.util.HashMap();
            hashMap11.put("errCode", 12010);
            java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap11.put("errno", 4);
            lVar.a(i17, t("fail:parse json err", hashMap11));
        }
    }
}
