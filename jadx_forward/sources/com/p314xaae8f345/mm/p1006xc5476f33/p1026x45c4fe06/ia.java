package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class ia implements gb1.k {
    @Override // gb1.k
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t Q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) lVar;
        }
        if (!(lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9)) {
            return null;
        }
        boolean z17 = false;
        if (jSONObject != null && jSONObject.optInt("dest", 0) == 3) {
            z17 = true;
        }
        return z17 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar).Y0() : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar).V0();
    }
}
