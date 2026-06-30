package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public abstract class k3 {
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r3 a() {
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.c();
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.d();
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(c17, true);
        java.lang.String b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(d17, true);
        java.lang.String str = java.io.File.separator;
        java.lang.String[] q17 = u46.l.q(b17, str);
        java.lang.String[] q18 = u46.l.q(b18, str);
        if (q17 == null || q17.length <= 0 || q18 == null || q18.length <= 0) {
            iz5.a.h("invalid path " + b17 + ", " + b18);
            throw null;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < java.lang.Math.min(q17.length, q18.length) && u46.l.c(q17[i18], q18[i18]); i18++) {
            i17++;
        }
        if (i17 <= 0) {
            iz5.a.h("not same parent dir " + b17 + ", " + b18);
            throw null;
        }
        android.os.StatFs statFs = new android.os.StatFs(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.c());
        long blockCountLong = statFs.getBlockCountLong();
        long c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.c())) + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.d()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r3 r3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r3();
        r3Var.f157466a = c18;
        r3Var.f157467b = (c18 / statFs.getBlockSizeLong()) / blockCountLong;
        r3Var.f157468c = blockCountLong;
        r3Var.f157469d = statFs.getBlockSizeLong();
        return r3Var;
    }

    public static void b(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.w6.h(str);
        try {
            java.lang.Runtime.getRuntime().exec("rm -r " + str + "_xdir");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgCleanupLogic.CleanupUtil", "rm -r %s, e = %s", str + "_xdir", e17);
        }
    }
}
