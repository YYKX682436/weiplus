package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class w1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34253x366c91de = 117;

    /* renamed from: NAME */
    private static final java.lang.String f34254x24728b = "removeSavedFile";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "");
        lVar.a(i17, o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) ? "fail:invalid data" : !lVar.mo50354x59eafec1().mo49625x51687e99(optString) ? "fail not a store filePath" : lVar.mo50354x59eafec1().mo49628x8907b87f(optString) ? "ok" : "fail"));
    }
}
