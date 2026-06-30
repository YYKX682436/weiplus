package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public enum l1 {
    /* JADX INFO: Fake field, exist only in values array */
    X5,
    Sys,
    XWalk,
    Skyline,
    Invalid;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.l1 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        boolean m120171x1f05d274;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.l1 l1Var = Invalid;
        if (n7Var == null) {
            z17 = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.x0();
            m120171x1f05d274 = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0();
        } else {
            if (n7Var.p2()) {
                return Skyline;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 S3 = n7Var.S3();
            if (S3 == null) {
                return l1Var;
            }
            boolean m120170x43962b60 = S3.m120170x43962b60();
            m120171x1f05d274 = S3.m120171x1f05d274();
            z17 = m120170x43962b60;
        }
        boolean[] zArr = {z17, m120171x1f05d274, false};
        int i17 = 0;
        for (int i18 = 0; i18 < 3; i18++) {
            if (zArr[i18]) {
                i17++;
            }
        }
        if (i17 == 1) {
            return m120171x1f05d274 ? XWalk : Sys;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return l1Var;
    }
}
