package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.p1077x334da3bc;

/* loaded from: classes.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.w {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public java.lang.String E() {
        return "autoOpenFinderLive";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public boolean J(org.json.JSONObject extInfoJsonObj, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfoJsonObj, "extInfoJsonObj");
        extInfoJsonObj.put("feedID", extInfoJsonObj.optString("feedId"));
        extInfoJsonObj.put("nonceID", extInfoJsonObj.optString("nonceId"));
        extInfoJsonObj.put("showRecommend", extInfoJsonObj.optBoolean("showRecommend", true));
        return true;
    }
}
