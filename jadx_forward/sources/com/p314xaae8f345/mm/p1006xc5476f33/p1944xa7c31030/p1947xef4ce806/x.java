package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes7.dex */
public abstract class x {
    public static final org.json.JSONArray a() {
        java.util.List R6;
        ft.e eVar = (ft.e) i95.n0.c(ft.e.class);
        if (eVar == null || (R6 = eVar.R6()) == null) {
            return null;
        }
        java.util.ArrayList<ft.b> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : R6) {
            if (((ft.b) obj).a()) {
                arrayList.add(obj);
            }
        }
        try {
            if (arrayList.isEmpty()) {
                return null;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (ft.b bVar : arrayList) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONArray.put(jSONObject);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, bVar.getF146571d());
                jSONObject.put("size", bVar.getF146572e().size());
                for (java.lang.String str : bVar.c()) {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    jSONArray2.put(str);
                    jSONObject.put("app", jSONArray2);
                }
            }
            return jSONArray;
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.MemoryReportHelper", th6, "", new java.lang.Object[0]);
            return null;
        }
    }
}
