package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public final class d1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34608x366c91de = 1254;

    /* renamed from: NAME */
    public static final java.lang.String f34609x24728b = "requestContactDisplayInfo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestContactDisplayInfo", "invoke jsapi");
        if (c0Var == null || jSONObject == null) {
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("userHashList");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestContactDisplayInfo", "userHashList length is 0");
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = optJSONArray.length();
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.String optString = optJSONArray.optJSONObject(i18).optString("userHash");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                arrayList.add(optString);
            }
        }
        if (arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestContactDisplayInfo", "hashItemList length is 0");
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str4 != null ? str4 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i17, u(str, jSONObject3));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArray("hashItemList", (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
        java.lang.String[] stringArray = ((android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.c1.class)).getStringArray("retInfoList");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (stringArray != null) {
            java.util.Iterator a17 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(stringArray);
            while (true) {
                p3321xbce91901.jvm.p3324x21ffc6bd.b bVar = (p3321xbce91901.jvm.p3324x21ffc6bd.b) a17;
                if (!bVar.hasNext()) {
                    break;
                }
                org.json.JSONObject jSONObject4 = new org.json.JSONObject((java.lang.String) bVar.next());
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.lang.String optString2 = jSONObject4.optString("userHash");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                linkedHashMap.put("userHash", optString2);
                java.util.Iterator it = a17;
                java.lang.String optString3 = jSONObject4.optString("nickname");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
                linkedHashMap.put("nickname", optString3);
                java.lang.String optString4 = jSONObject4.optString("headUrl");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
                linkedHashMap.put("headUrl", optString4);
                arrayList2.add(linkedHashMap);
                a17 = it;
            }
        }
        if (arrayList2.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestContactDisplayInfo", "get data succ, ret to jsapi");
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.put("displayInfo", arrayList2);
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            linkedHashMap2.put("errno", 0);
            c0Var.a(i17, t("ok", linkedHashMap2));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestContactDisplayInfo", "get data count 0, ret to jsapi");
        java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        str = str7 != null ? str7 : "";
        java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("errno", 101);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        c0Var.a(i17, u(str, jSONObject5));
    }
}
