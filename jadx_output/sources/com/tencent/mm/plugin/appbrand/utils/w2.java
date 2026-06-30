package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[][] f90603a = {new java.lang.String[]{"\\", "\\\\"}, new java.lang.String[]{"'", "\\'"}, new java.lang.String[]{"\"", "\\\""}, new java.lang.String[]{"\n", "\\n"}, new java.lang.String[]{"\t", "\\t"}, new java.lang.String[]{"\b", "\\b"}, new java.lang.String[]{"\f", "\\f"}, new java.lang.String[]{"\r", "\\r"}, new java.lang.String[]{"\u2028", "\\u2028"}, new java.lang.String[]{"\u2029", "\\u2029"}};

    public static java.lang.String a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        java.lang.String[][] strArr = f90603a;
        for (int i17 = 0; i17 < 10; i17++) {
            java.lang.String[] strArr2 = strArr[i17];
            str = str.replace(strArr2[0], strArr2[1]);
        }
        return str;
    }
}
