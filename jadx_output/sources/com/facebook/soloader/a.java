package com.facebook.soloader;

/* loaded from: classes4.dex */
public abstract class a {
    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if ((str + str2 + str3).length() <= 127 || str2 == null) {
            return;
        }
        str2.substring(0, (127 - str.length()) - str3.length());
    }
}
