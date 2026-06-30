package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[][] f172136a = {new java.lang.String[]{"\\", "\\\\"}, new java.lang.String[]{"'", "\\'"}, new java.lang.String[]{"\"", "\\\""}, new java.lang.String[]{"\n", "\\n"}, new java.lang.String[]{"\t", "\\t"}, new java.lang.String[]{"\b", "\\b"}, new java.lang.String[]{"\f", "\\f"}, new java.lang.String[]{"\r", "\\r"}, new java.lang.String[]{"\u2028", "\\u2028"}, new java.lang.String[]{"\u2029", "\\u2029"}};

    public static java.lang.String a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str;
        }
        java.lang.String[][] strArr = f172136a;
        for (int i17 = 0; i17 < 10; i17++) {
            java.lang.String[] strArr2 = strArr[i17];
            str = str.replace(strArr2[0], strArr2[1]);
        }
        return str;
    }
}
