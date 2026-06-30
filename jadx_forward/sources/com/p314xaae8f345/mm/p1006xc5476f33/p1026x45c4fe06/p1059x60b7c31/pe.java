package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class pe extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34670x366c91de = 283;

    /* renamed from: NAME */
    public static final java.lang.String f34671x24728b = "traceEvent";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("events");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.f((ze.n) yVar.mo32091x9a3f0ba2()) || optJSONArray == null) {
            yVar.a(i17, o("fail"));
            return;
        }
        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString("category");
                java.lang.String optString2 = optJSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                long optLong = optJSONObject.optLong("start");
                long optLong2 = optJSONObject.optLong("end");
                java.lang.String optString3 = optJSONObject.optString("phase");
                java.lang.String optString4 = optJSONObject.optString("args");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.e(yVar.mo48798x74292566(), optString, optString2, optString3, optLong, optLong2, optString4);
                }
            }
        }
        yVar.a(i17, o("ok"));
    }
}
