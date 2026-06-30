package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes8.dex */
public class v5 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 527;
    public static final java.lang.String NAME = "getABTestConfig";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.storage.c cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetABTestConfig", "JSONObject = " + jSONObject);
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
                com.tencent.mm.model.newabtest.s sVar = (com.tencent.mm.model.newabtest.s) i95.n0.c(com.tencent.mm.model.newabtest.s.class);
                sVar.getClass();
                if (!(optString.length() == 0)) {
                    cVar = new com.tencent.mm.storage.c();
                    cVar.field_layerId = optString;
                    sVar.requireAccountInitialized();
                    com.tencent.mm.sdk.platformtools.o4 wi6 = sVar.wi();
                    kotlin.jvm.internal.o.f(wi6, "<get-MMKV>(...)");
                    java.lang.String str = "layer_" + cVar.field_layerId;
                    cVar.field_rawXML = wi6.getString(str + "_rawXML", "");
                    cVar.field_startTime = wi6.getLong(str + "_startTime", com.tencent.mm.sdk.platformtools.t8.i1());
                    cVar.field_endTime = wi6.getLong(str + "_endTime", com.tencent.mm.sdk.platformtools.t8.i1());
                }
            } else if (gm0.j1.i().f273208a.f273299d && gm0.j1.b().f273254q) {
                cVar = com.tencent.mm.model.newabtest.z.Ai().z0(optString);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCNewABTest", "kernel or account not ready.");
            }
            hashMap4.put("testConfig", (cVar == null && cVar.isValid()) ? cVar.t0() : new java.util.HashMap(0));
            return p("ok", hashMap4);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCNewABTest", "get ABTestItem by layerId failed, id is null.", optString);
        cVar = null;
        hashMap4.put("testConfig", (cVar == null && cVar.isValid()) ? cVar.t0() : new java.util.HashMap(0));
        return p("ok", hashMap4);
    }
}
