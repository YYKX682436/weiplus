package qf1;

/* loaded from: classes13.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f76479x366c91de = 317;

    /* renamed from: NAME */
    public static final java.lang.String f76480x24728b = "getWifiList";

    public static void C(qf1.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, android.content.Context context, rf1.i iVar) {
        jVar.getClass();
        if (!iVar.f476160a.equals("ok")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetWifiList", "error, mErrorMsg:%s", iVar.f476160a);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 12010);
            java.lang.String str = "fail:" + iVar.f476160a;
            if (str == null) {
                str = "fail:internal error";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 4);
            lVar.a(i17, jVar.t(str, hashMap));
            return;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWifiList", "onGetWifiList size:%d", java.lang.Integer.valueOf(((java.util.ArrayList) iVar.f476161b).size()));
            if (((java.util.ArrayList) iVar.f476161b).size() == 0) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("errCode", 12006);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    hashMap2.put("errno", 1505003);
                    lVar.a(i17, jVar.t("fail:may be not open GPS", hashMap2));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetWifiList", "wifiList is empty, may be not open GPS");
                    return;
                }
                boolean b17 = nf.t.b(context, lVar, "android.permission.ACCESS_FINE_LOCATION");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWifiList", "checkLocation:%b", java.lang.Boolean.valueOf(b17));
                if (!b17) {
                    java.util.HashMap hashMap3 = new java.util.HashMap();
                    hashMap3.put("errCode", 12012);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    hashMap3.put("errno", 1505004);
                    lVar.a(i17, jVar.t("fail:may be not obtain GPS Perrmission", hashMap3));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetWifiList", "wifiList is empty, may be not obtain GPS Perrmission");
                    return;
                }
            }
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put("errCode", 0);
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap4.put("errno", 0);
            lVar.a(i17, jVar.t("ok", hashMap4));
            qf1.i iVar2 = new qf1.i();
            java.util.HashMap hashMap5 = new java.util.HashMap();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = ((java.util.ArrayList) iVar.f476161b).iterator();
            while (it.hasNext()) {
                jSONArray.put(((rf1.h) it.next()).b());
            }
            hashMap5.put("wifiList", jSONArray);
            iVar2.p(lVar);
            iVar2.f163909h = 0;
            iVar2.t(hashMap5);
            iVar2.m();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiGetWifiList", e17, "", new java.lang.Object[0]);
            java.util.HashMap hashMap6 = new java.util.HashMap();
            hashMap6.put("errCode", 12010);
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap6.put("errno", 4);
            lVar.a(i17, jVar.t("fail:parse json err", hashMap6));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetWifiList", "mContext is null, invoke fail!");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 12010);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 4);
            lVar.a(i17, t("fail:context is null", hashMap));
            return;
        }
        if (!qf1.m.f443811g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetWifiList", "not invoke startWifi");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 12000);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 1505001);
            lVar.a(i17, t("fail:not invoke startWifi", hashMap2));
            return;
        }
        rf1.l.b(mo50352x76847179);
        if (!sf1.s.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetWifiList", "wifi is disable,invoke fail!");
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("errCode", 12005);
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap3.put("errno", 1505002);
            lVar.a(i17, t("fail:wifi is disable", hashMap3));
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new qf1.g(this, atomicBoolean, lVar, i17, mo50352x76847179), false);
        qf1.h hVar = new qf1.h(this, b4Var, atomicBoolean, lVar, i17, mo50352x76847179);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WiFiManagerWrapper", "getWifiListAsync");
        rf1.l.f476164c = null;
        if (rf1.l.f476162a && sf1.s.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WiFiManagerWrapper", "getWifiListAsync, startScan");
            sf1.s.d();
            rf1.l.f476168g = hVar;
        } else {
            rf1.i iVar = new rf1.i();
            if (rf1.l.f476162a) {
                iVar.f476160a = "wifi is disable";
            } else {
                iVar.f476160a = "sdk not init";
            }
            hVar.a(iVar);
        }
        long j17 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        if (jSONObject != null) {
            j17 = jSONObject.optLong("timeout", com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWifiList", "invoke, getWifiListAsyncTimeoutMills: " + j17);
        b4Var.c(j17, j17);
    }
}
