package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34867x366c91de = 113;

    /* renamed from: NAME */
    public static final java.lang.String f34868x24728b = "getStorageInfo";

    public static void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.s sVar, java.util.List list, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i19) {
        sVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("keys", list);
        hashMap.put("currentSize", java.lang.Integer.valueOf(i17));
        hashMap.put("limitSize", java.lang.Integer.valueOf(i18));
        lVar.a(i19, sVar.p("ok", hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        int optInt = jSONObject.optInt("storageId", 0);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.c(optInt)) {
            lVar.a(i17, o("fail:nonexistent storage space"));
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(lVar);
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        int i18 = z0Var.f387386s;
        java.lang.String str = z0Var.f387388u;
        if (i18 != 1) {
            s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.q(this, weakReference, i18, str, optInt, i17, currentTimeMillis, z0Var), "JsApiGetStorageInfo");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12244xe6b9ea89 c12244xe6b9ea89 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12244xe6b9ea89();
        c12244xe6b9ea89.f164878f = D(lVar);
        c12244xe6b9ea89.f164879g = optInt;
        c12244xe6b9ea89.f164883n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.r(this, c12244xe6b9ea89, weakReference, i17, currentTimeMillis, z0Var);
        c12244xe6b9ea89.d();
    }

    public java.lang.String D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        return lVar.mo48798x74292566();
    }
}
