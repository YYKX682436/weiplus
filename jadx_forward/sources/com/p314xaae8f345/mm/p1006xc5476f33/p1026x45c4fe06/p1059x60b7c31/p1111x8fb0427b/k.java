package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34857x366c91de = 522;

    /* renamed from: NAME */
    public static final java.lang.String f34858x24728b = "getBackgroundFetchData";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "fail:component is null");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "fail:data is null");
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString("fetchType");
        boolean optBoolean = jSONObject.optBoolean("cleanCache", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBackgroundFetchData", "data:%s", jSONObject);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "fail:fetchType is null");
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = yVar.mo32091x9a3f0ba2();
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = mo32091x9a3f0ba2 == null ? null : (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) mo32091x9a3f0ba2.u0();
        java.lang.String str = c3897xbc286aa1 == null ? null : c3897xbc286aa1.f128811x;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo48798x74292566)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "fail:appid is null");
            yVar.a(i17, o("fail:appID is empty"));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "fail:username is null");
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str2, jSONObject2));
            return;
        }
        boolean equals = optString.equals("periodic");
        if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1.class) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "worker fail:IAppBrandBackgroundFetchDataStorage is null");
            yVar.a(i17, o("fail:internal error"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 E4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1.class)).E4(str, equals ? 1 : 0);
        if (E4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "worker fail:record is null");
            yVar.a(i17, o("fail:record is null"));
            return;
        }
        if (E4.f158314h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "worker fail:fetched data is null");
            yVar.a(i17, o("fail:fetched data is null"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("fetchedData", E4.f158314h);
        hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, E4.f158312f);
        hashMap.put("query", E4.f158313g);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(E4.f158315i));
        hashMap.put("timeStamp", java.lang.Long.valueOf(E4.f158316m));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBackgroundFetchData", "JsApiGetBackgroundFetchData, app(%s_%d), timeStamp:%d", mo48798x74292566, java.lang.Integer.valueOf(equals ? 1 : 0), java.lang.Long.valueOf(E4.f158316m));
        yVar.a(i17, p("ok", hashMap));
        if (optBoolean) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBackgroundFetchData", "delete data , appId:%s, userName:%s, type:%d, delRet:%b", mo48798x74292566, str, java.lang.Integer.valueOf(equals ? 1 : 0), java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1.class)).z6(str, equals ? 1 : 0)));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
