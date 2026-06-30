package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class q3 extends dm.zc {
    public static final java.lang.String[] Q;
    public static final l75.e0 R = dm.zc.m125783x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3.class);

    static {
        java.lang.String[] strArr = {"arch", "wxaPkgPath", "snapshotCategory"};
        Q = strArr;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PRIMARY KEY ( ");
        int i17 = 0;
        int i18 = 0;
        while (i17 < 3) {
            java.lang.String str = strArr[i17];
            int i19 = i18 + 1;
            if (i18 != 0) {
                sb6.append(", ");
            }
            sb6.append(str);
            i17++;
            i18 = i19;
        }
        sb6.append(" )");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        R.f398489e += ", " + sb7;
    }
}
