package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes8.dex */
public class v5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34918x366c91de = 527;

    /* renamed from: NAME */
    public static final java.lang.String f34919x24728b = "getABTestConfig";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p2621x8fb0427b.c cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetABTestConfig", "JSONObject = " + jSONObject);
        if (jSONObject.optString("experimentType").equals("BatchGetExpt")) {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("experimentIds");
            if (optJSONArray == null) {
                return o("fail:experimentIds is empty");
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                try {
                    hashMap.put(optJSONArray.getString(i17), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(optJSONArray.getString(i17), ""));
                } catch (org.json.JSONException unused) {
                }
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("testConfig", hashMap);
            return p("ok", hashMap2);
        }
        java.lang.String optString = jSONObject.optString("experimentId");
        boolean equals = "Expt".equals(jSONObject.optString("experimentType"));
        if (android.text.TextUtils.isEmpty(optString)) {
            return o("fail:experimentId is empty");
        }
        if (equals) {
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("testConfig", j62.e.g().a(optString, "", true, true));
            return p("ok", hashMap3);
        }
        java.util.HashMap hashMap4 = new java.util.HashMap();
        ((o80.e) ((p80.e) i95.n0.c(p80.e.class))).getClass();
        if (optString != null && optString.length() != 0) {
            if (!((km0.c) gm0.j1.p().a()).a()) {
                com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.s sVar = (com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.s) i95.n0.c(com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.s.class);
                sVar.getClass();
                if (!(optString.length() == 0)) {
                    cVar = new com.p314xaae8f345.mm.p2621x8fb0427b.c();
                    cVar.f66192x72127c07 = optString;
                    sVar.m134976x2690a4ac();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 wi6 = sVar.wi();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wi6, "<get-MMKV>(...)");
                    java.lang.String str = "layer_" + cVar.f66192x72127c07;
                    cVar.f66195xde9f9b4 = wi6.getString(str + "_rawXML", "");
                    cVar.f66197x1bb3b54a = wi6.getLong(str + "_startTime", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                    cVar.f66190x14c61803 = wi6.getLong(str + "_endTime", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                }
            } else if (gm0.j1.i().f354741a.f354832d && gm0.j1.b().f354787q) {
                cVar = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Ai().z0(optString);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCNewABTest", "kernel or account not ready.");
            }
            hashMap4.put("testConfig", (cVar == null && cVar.m77959x7b953cf2()) ? cVar.t0() : new java.util.HashMap(0));
            return p("ok", hashMap4);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCNewABTest", "get ABTestItem by layerId failed, id is null.", optString);
        cVar = null;
        hashMap4.put("testConfig", (cVar == null && cVar.m77959x7b953cf2()) ? cVar.t0() : new java.util.HashMap(0));
        return p("ok", hashMap4);
    }
}
