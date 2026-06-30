package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class f6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    private static final int f34154x366c91de = 97;

    /* renamed from: NAME */
    private static final java.lang.String f34155x24728b = "getPublicLibVersion";

    public java.util.Map B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 c3899xf952a052 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) yVar.b(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052.class);
        hashMap.put("appDebug", java.lang.Boolean.valueOf(c3899xf952a052.f387385r.f156932d != 0));
        java.lang.String str = c3899xf952a052.f387385r.f156905md5;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        hashMap.put("appMd5", str);
        hashMap.put("appVersion", java.lang.Integer.valueOf(c3899xf952a052.f387385r.f33456x1c82a56c));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = yVar.x();
        if (x17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) x17.getF172191d();
            hashMap.put("libDebug", java.lang.Boolean.valueOf(c11667xc7e59dd6.f156932d != 0));
            java.lang.String str2 = c11667xc7e59dd6.f156905md5;
            hashMap.put("libMd5", str2 != null ? str2 : "");
            hashMap.put("libVersion", java.lang.Integer.valueOf(c11667xc7e59dd6.f33456x1c82a56c));
        }
        hashMap.put("system", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        hashMap.put("systemVersion", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        return hashMap;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        return !yVar.mo50262x39e05d35() ? o("fail js context not running") : p("ok", B(yVar));
    }
}
