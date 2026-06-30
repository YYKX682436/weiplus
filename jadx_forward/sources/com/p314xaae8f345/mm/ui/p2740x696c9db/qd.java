package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public abstract class qd {
    public static java.lang.String a(java.lang.String str, java.lang.String... strArr) {
        if (strArr == null) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        sb6.append(str.contains("?") ? "&" : "?");
        boolean z17 = true;
        for (java.lang.String str2 : strArr) {
            if (z17) {
                z17 = false;
            } else {
                sb6.append("&");
            }
            sb6.append(str2);
        }
        return sb6.toString();
    }
}
