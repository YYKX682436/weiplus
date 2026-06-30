package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes9.dex */
public final class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f33946x366c91de = 1514;

    /* renamed from: NAME */
    private static final java.lang.String f33947x24728b = "chooseBizPoi";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        double d17;
        if (jSONObject == null || lVar == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("biz");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("gpsInfo");
        double optDouble = optJSONObject != null ? optJSONObject.optDouble("latitude") : 0.0d;
        double optDouble2 = optJSONObject != null ? optJSONObject.optDouble("longitude") : 0.0d;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("gpsList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i19 = 0;
        int length = optJSONArray != null ? optJSONArray.length() : 0;
        while (i19 < length) {
            org.json.JSONObject jSONObject2 = optJSONArray != null ? optJSONArray.getJSONObject(i19) : null;
            double optDouble3 = jSONObject2 != null ? jSONObject2.optDouble("latitude") : 0.0d;
            if (jSONObject2 != null) {
                i18 = length;
                d17 = jSONObject2.optDouble("longitude");
            } else {
                i18 = length;
                d17 = 0.0d;
            }
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12022x63a30bfc(optDouble3, d17));
            i19++;
            length = i18;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12025xc3abaace(optString, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12022x63a30bfc(optDouble, optDouble2), arrayList), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.i.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.j(lVar, i17, this));
    }
}
