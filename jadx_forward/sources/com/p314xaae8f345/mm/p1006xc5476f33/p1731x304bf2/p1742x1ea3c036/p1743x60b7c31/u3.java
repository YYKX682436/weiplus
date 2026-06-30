package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class u3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "reportGameWeb";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        java.util.TreeMap treeMap = new java.util.TreeMap(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.t3(this));
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        java.lang.String optString = jSONObject.optString("type");
        boolean equals = "1".equals(jSONObject.optString("isReportNow"));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportGameWeb", "data is null or not json");
            bVar.c("data_is_null", null);
            return;
        }
        if ("1".equals(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportGameWeb", "report web performance, url:%s", ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).s());
            treeMap.put(1000, java.lang.Boolean.valueOf(equals));
            java.util.HashMap hashMap = (java.util.HashMap) sx4.b0.a(optJSONObject);
            for (java.lang.Integer num : hashMap.keySet()) {
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, hashMap.get(num));
                }
            }
            sx4.b0.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).P(), treeMap);
            bVar.a();
            return;
        }
        if (!"2".equals(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportGameWeb", "type is error. type:%s", optString);
            bVar.c("type_not_right", null);
            return;
        }
        treeMap.putAll(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).M1());
        java.util.HashMap hashMap2 = (java.util.HashMap) sx4.b0.a(optJSONObject);
        for (java.lang.Integer num2 : hashMap2.keySet()) {
            if (!treeMap.containsKey(num2)) {
                treeMap.put(num2, hashMap2.get(num2));
            }
        }
        java.lang.String a17 = sx4.y.a(treeMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportGameWeb", "report web runtime. isReportNow:%b, reportData: [%s]", java.lang.Boolean.valueOf(equals), a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.f(16145, a17, equals, false);
        bVar.a();
    }
}
