package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class qc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34715x366c91de = 755;

    /* renamed from: NAME */
    public static final java.lang.String f34716x24728b = "returnCopyUrl";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) lVar;
        if (yVar != null) {
            java.lang.String optString = jSONObject != null ? jSONObject.optString("url") : null;
            if (optString == null) {
                optString = "";
            }
            if (jSONObject != null && jSONObject.optBoolean("shortLinkEnable", false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.vf.f165052a.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d1.f162264d, optString);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.vf.f165052a.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d1.f162265e, optString);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, null, optString, null);
            yVar.a(i17, o(optString.length() == 0 ? "fail:empty url" : "ok"));
        }
    }
}
