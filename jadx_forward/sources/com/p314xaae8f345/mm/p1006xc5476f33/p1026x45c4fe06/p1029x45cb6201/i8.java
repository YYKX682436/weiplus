package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class i8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i8 f157131a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i8();

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(n9Var, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6();
        int i17 = n9Var.f67180x8ecd6328;
        c11667xc7e59dd6.f33456x1c82a56c = i17 == 0 ? n9Var.f67185x8987ca93 : 0;
        c11667xc7e59dd6.f156933e = n9Var.f67179xac3be4e;
        c11667xc7e59dd6.f156932d = i17;
        c11667xc7e59dd6.f33455xe121c411 = n9Var.f67183x55b471cc;
        c11667xc7e59dd6.f156934f = false;
        java.lang.String str = n9Var.f67186x912ff5eb;
        c11667xc7e59dd6.f156905md5 = str == null || str.length() == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6.d(new com.p314xaae8f345.mm.vfs.r6(c11667xc7e59dd6.f33455xe121c411)) : n9Var.f67186x912ff5eb;
        return c11667xc7e59dd6;
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(n9Var, "<this>");
        if (999 == n9Var.f67180x8ecd6328) {
            long j17 = n9Var.f67182x14c61803;
            if (j17 > 0 && j17 <= com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaCommLibVersionUtils", "checkIsValid BETA_LIBRARY expired, endTime:" + n9Var.f67182x14c61803);
                return false;
            }
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(n9Var.f67183x55b471cc)) {
            try {
                java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6.d(new com.p314xaae8f345.mm.vfs.r6(n9Var.f67183x55b471cc));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, n9Var.f67186x912ff5eb) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, n9Var.f67176xd0b3bac3)) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaCommLibVersionUtils", "checkIsValid fileMd5 != md5, fileMd5:" + d17 + ", field_versionMd5:" + n9Var.f67186x912ff5eb + ", field_NewMd5:" + n9Var.f67176xd0b3bac3);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaCommLibVersionUtils", "checkIsValid getFileMD5 failed " + e17 + ", path:" + n9Var.f67183x55b471cc + ", version:" + n9Var.f67185x8987ca93 + ", versionType:" + n9Var.f67180x8ecd6328);
            }
        }
        return false;
    }
}
