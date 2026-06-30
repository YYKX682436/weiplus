package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.a f164910a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.a();

    public final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 jsapi, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapi, "jsapi");
        if (lVar == null) {
            return "";
        }
        if (jSONObject == null) {
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str4 = str3 != null ? str3 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            java.lang.String u17 = jsapi.u(str4, jSONObject2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "makeReturnJson(...)");
            return u17;
        }
        int optInt = jSONObject.optInt("storageId");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.c(optInt)) {
            java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:nonexistent storage space" : null;
            str4 = str6 != null ? str6 : "";
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 800001);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u18 = jsapi.u(str4, jSONObject3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u18, "makeReturnJson(...)");
            return u18;
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo48798x74292566)) {
            java.lang.String o17 = jsapi.o("fail:appID is empty");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "makeReturnJson(...)");
            return o17;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("keyList");
        if (optJSONArray == null) {
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str4 = str3 != null ? str3 : "";
            java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            java.lang.String u19 = jsapi.u(str4, jSONObject4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u19, "makeReturnJson(...)");
            return u19;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int length = optJSONArray.length();
        int i17 = 0;
        while (i17 < length) {
            java.lang.String string = optJSONArray.getString(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            arrayList2.add(string);
            i17++;
            optJSONArray = optJSONArray;
        }
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (z0Var == null) {
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str4 = str3 != null ? str3 : "";
            java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 101);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            java.lang.String u27 = jsapi.u(str4, jSONObject5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u27, "makeReturnJson(...)");
            return u27;
        }
        for (java.lang.Object[] objArr : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.mo48798x74292566(), z0Var.f387386s, z0Var.f387388u).G(optInt, mo48798x74292566, arrayList2)) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.lang.Object obj = objArr[0];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appstorage.IAppBrandKVStorage.ErrorType");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 o1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.NONE;
            if (o1Var == o1Var2) {
                java.lang.Object obj2 = objArr[1];
                if (obj2 == null) {
                    obj2 = "";
                }
                str = (java.lang.String) obj2;
            } else {
                str = "";
            }
            linkedHashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
            str2 = "Null";
            if (o1Var == o1Var2) {
                java.lang.Object obj3 = objArr[2];
                str2 = (java.lang.String) (obj3 != null ? obj3 : "Null");
            }
            linkedHashMap.put("dataType", str2);
            arrayList.add(linkedHashMap);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("dataList", arrayList);
        java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        java.lang.String t17 = jsapi.t("ok", hashMap);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t17, "makeReturnJson(...)");
        return t17;
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 jsapi, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapi, "jsapi");
        if (lVar == null) {
            return "";
        }
        if (jSONObject == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            java.lang.String u17 = jsapi.u(str2, jSONObject2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "makeReturnJson(...)");
            return u17;
        }
        int optInt = jSONObject.optInt("storageId");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.c(optInt)) {
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:nonexistent storage space" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 800001);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u18 = jsapi.u(str2, jSONObject3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u18, "makeReturnJson(...)");
            return u18;
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo48798x74292566)) {
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:invalid appid" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 1005);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            java.lang.String u19 = jsapi.u(str2, jSONObject4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u19, "makeReturnJson(...)");
            return u19;
        }
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (z0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandBatchStorageApiOp", "invoke with appId[%s] , NULL sysConfig", lVar.mo48798x74292566());
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 4);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            java.lang.String u27 = jsapi.u(str2, jSONObject5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u27, "makeReturnJson(...)");
            return u27;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("kvList");
        if (optJSONArray == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            try {
                jSONObject6.put("errno", 101);
            } catch (java.lang.Exception e28) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
            }
            java.lang.String u28 = jsapi.u(str2, jSONObject6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u28, "makeReturnJson(...)");
            return u28;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = optJSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject jSONObject7 = optJSONArray.getJSONObject(i17);
            java.lang.String optString = jSONObject7.optString("key");
            java.lang.String optString2 = jSONObject7.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            java.lang.String optString3 = jSONObject7.optString("dataType");
            if (optString == null) {
                optString = "";
            }
            if (optString2 == null) {
                optString2 = "";
            }
            if (optString3 == null) {
                optString3 = "";
            }
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.p1(optString, optString2, optString3));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.mo48798x74292566(), z0Var.f387386s, z0Var.f387388u).z(optInt, mo48798x74292566, arrayList);
        java.lang.String r17 = jsapi.r(null, z17 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.NONE ? jc1.f.f380445a : z17 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.QUOTA_REACHED ? jc1.i.f380478b : jc1.i.f380477a, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "makeReturnJson(...)");
        return r17;
    }
}
