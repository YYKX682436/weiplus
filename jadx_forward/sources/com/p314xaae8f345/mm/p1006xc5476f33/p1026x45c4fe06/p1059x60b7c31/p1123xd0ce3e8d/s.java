package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public final class s implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f165386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f165387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.t f165388f;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.t tVar) {
        this.f165386d = lVar;
        this.f165387e = i17;
        this.f165388f = tVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.C12289xc35496e5) obj).f165327d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.t tVar = this.f165388f;
        int i18 = this.f165387e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f165386d;
        if (i17 == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("isDownload", java.lang.Boolean.TRUE);
            hashMap.put("errCode", 1008);
            tVar.getClass();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            lVar.a(i18, tVar.t("ok", hashMap));
            return;
        }
        if (i17 == 1) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("isDownload", java.lang.Boolean.FALSE);
            hashMap2.put("errCode", 1009);
            tVar.getClass();
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 0);
            lVar.a(i18, tVar.t("ok", hashMap2));
            return;
        }
        if (i17 == 2) {
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("isDownload", java.lang.Boolean.FALSE);
            hashMap3.put("errCode", 1010);
            tVar.getClass();
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap3.put("errno", 0);
            lVar.a(i18, tVar.t("ok", hashMap3));
            return;
        }
        if (i17 == 3) {
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put("isDownload", java.lang.Boolean.FALSE);
            hashMap4.put("errCode", 1011);
            tVar.getClass();
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap4.put("errno", 0);
            lVar.a(i18, tVar.t("ok", hashMap4));
            return;
        }
        if (i17 == 4) {
            java.util.HashMap hashMap5 = new java.util.HashMap();
            hashMap5.put("isDownload", java.lang.Boolean.FALSE);
            hashMap5.put("errCode", 1012);
            tVar.getClass();
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap5.put("errno", 0);
            lVar.a(i18, tVar.t("ok", hashMap5));
            return;
        }
        if (i17 != 5) {
            return;
        }
        java.util.HashMap hashMap6 = new java.util.HashMap();
        hashMap6.put("isDownload", java.lang.Boolean.FALSE);
        hashMap6.put("errCode", 1013);
        tVar.getClass();
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap6.put("errno", 0);
        lVar.a(i18, tVar.t("ok", hashMap6));
    }
}
