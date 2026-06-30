package com.google.android.gms.auth;

/* loaded from: classes8.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    public static java.lang.String getCookieUrl(java.lang.String str, java.lang.Boolean bool) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        java.lang.String str2 = zzd(bool) ? "https" : "http";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str2.length() + 3 + java.lang.String.valueOf(str).length());
        sb6.append(str2);
        sb6.append("://");
        sb6.append(str);
        return sb6.toString();
    }

    public static java.lang.String getCookieValue(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Long l17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        sb6.append('=');
        if (!android.text.TextUtils.isEmpty(str2)) {
            sb6.append(str2);
        }
        if (zzd(bool)) {
            sb6.append(";HttpOnly");
        }
        if (zzd(bool2)) {
            sb6.append(";Secure");
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            sb6.append(";Domain=");
            sb6.append(str3);
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            sb6.append(";Path=");
            sb6.append(str4);
        }
        if (l17 != null && l17.longValue() > 0) {
            sb6.append(";Max-Age=");
            sb6.append(l17);
        }
        return sb6.toString();
    }

    private static boolean zzd(java.lang.Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
