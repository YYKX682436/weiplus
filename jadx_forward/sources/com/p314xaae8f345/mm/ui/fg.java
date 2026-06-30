package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public abstract class fg {
    public static java.lang.String a(java.lang.String str) {
        java.lang.String c17;
        if (str == null || str.length() <= 4) {
            return str;
        }
        java.lang.String str2 = "";
        if (str.startsWith("+") && (c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.c((str = str.replace("+", "")))) != null) {
            str = str.substring(c17.length());
            str2 = "+".concat(c17);
        }
        int length = str.length() - 2;
        int i17 = str.length() < 10 ? 1 : 2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < str.length(); i18++) {
            char charAt = str.charAt(i18);
            if (i18 <= i17 || i18 >= length) {
                sb6.append(charAt);
            } else {
                sb6.append('*');
            }
        }
        return str2 + sb6.toString();
    }
}
