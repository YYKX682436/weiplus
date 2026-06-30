package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public final class d1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1254;
    public static final java.lang.String NAME = "requestContactDisplayInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("JsApiRequestContactDisplayInfo", "invoke jsapi");
        if (c0Var == null || jSONObject == null) {
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("userHashList");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.tencent.mars.xlog.Log.i("JsApiRequestContactDisplayInfo", "userHashList length is 0");
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = optJSONArray.length();
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.String optString = optJSONArray.optJSONObject(i18).optString("userHash");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                kotlin.jvm.internal.o.d(optString);
                arrayList.add(optString);
            }
        }
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.i("JsApiRequestContactDisplayInfo", "hashItemList length is 0");
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str4 != null ? str4 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i17, u(str, jSONObject3));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArray("hashItemList", (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
        java.lang.String[] stringArray = ((android.os.Bundle) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.appbrand.jsapi.pay.c1.class)).getStringArray("retInfoList");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (stringArray != null) {
            java.util.Iterator a17 = kotlin.jvm.internal.c.a(stringArray);
            while (true) {
                kotlin.jvm.internal.b bVar = (kotlin.jvm.internal.b) a17;
                if (!bVar.hasNext()) {
                    break;
                }
                org.json.JSONObject jSONObject4 = new org.json.JSONObject((java.lang.String) bVar.next());
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.lang.String optString2 = jSONObject4.optString("userHash");
                kotlin.jvm.internal.o.f(optString2, "optString(...)");
                linkedHashMap.put("userHash", optString2);
                java.util.Iterator it = a17;
                java.lang.String optString3 = jSONObject4.optString("nickname");
                kotlin.jvm.internal.o.f(optString3, "optString(...)");
                linkedHashMap.put("nickname", optString3);
                java.lang.String optString4 = jSONObject4.optString("headUrl");
                kotlin.jvm.internal.o.f(optString4, "optString(...)");
                linkedHashMap.put("headUrl", optString4);
                arrayList2.add(linkedHashMap);
                a17 = it;
            }
        }
        if (arrayList2.size() > 0) {
            com.tencent.mars.xlog.Log.i("JsApiRequestContactDisplayInfo", "get data succ, ret to jsapi");
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.put("displayInfo", arrayList2);
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            linkedHashMap2.put("errno", 0);
            c0Var.a(i17, t("ok", linkedHashMap2));
            return;
        }
        com.tencent.mars.xlog.Log.i("JsApiRequestContactDisplayInfo", "get data count 0, ret to jsapi");
        java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        str = str7 != null ? str7 : "";
        java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("errno", 101);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        c0Var.a(i17, u(str, jSONObject5));
    }
}
