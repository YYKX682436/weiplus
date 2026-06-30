package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8;

/* renamed from: com.google.android.gms.auth.CookieUtil */
/* loaded from: classes8.dex */
public final class C1635x18a678a6 {
    private C1635x18a678a6() {
    }

    /* renamed from: getCookieUrl */
    public static java.lang.String m17293xce7e9b5(java.lang.String str, java.lang.Boolean bool) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        java.lang.String str2 = zzd(bool) ? "https" : "http";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str2.length() + 3 + java.lang.String.valueOf(str).length());
        sb6.append(str2);
        sb6.append("://");
        sb6.append(str);
        return sb6.toString();
    }

    /* renamed from: getCookieValue */
    public static java.lang.String m17294x729abc37(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Long l17) {
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
