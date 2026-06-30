package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34853x366c91de = 18;

    /* renamed from: NAME */
    public static final java.lang.String f34854x24728b = "clearStorageSync";

    public final java.lang.String B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.mo48798x74292566(), z0Var.f387386s, z0Var.f387388u).k(i17, lVar.mo48798x74292566());
        return o("ok");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        int i17 = ((k91.z0) lVar.b(k91.z0.class)).f387386s;
        int optInt = jSONObject.optInt("storageId", 0);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.c(optInt)) {
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:nonexistent storage space" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 800001);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            return u(str, jSONObject2);
        }
        if (k91.z0.a(i17)) {
            return B(lVar, optInt);
        }
        if (i17 != 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12243x1ec17c24 c12243x1ec17c24 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12243x1ec17c24();
            c12243x1ec17c24.f164876f = lVar.mo48798x74292566();
            c12243x1ec17c24.f164877g = optInt;
            c12243x1ec17c24.s();
            return o("ok");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12243x1ec17c24 c12243x1ec17c242 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12243x1ec17c24();
        c12243x1ec17c242.f164876f = lVar.mo48798x74292566();
        c12243x1ec17c242.f164877g = optInt;
        c12243x1ec17c242.s();
        o("ok");
        return B(lVar, optInt);
    }
}
