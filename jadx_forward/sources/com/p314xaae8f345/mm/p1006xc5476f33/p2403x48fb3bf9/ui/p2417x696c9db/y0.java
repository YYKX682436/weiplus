package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f269218a;

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        return j62.e.g().a(str, str2, false, true);
    }

    public static boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(8);
        try {
            sb6.append(tp3.b.a("²¾º¯«©\u0090¹¨£\u0094\u00ad¶\u0099¥¬®¡¨"));
            java.lang.String sb7 = sb6.toString();
            sb6.delete(0, sb6.length());
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.y0.class.hashCode() >>> 31) | 1) ^ 1);
            return !sb6.toString().equals(a(sb7, sb6.toString()));
        } catch (java.lang.Throwable unused) {
            java.lang.String sb8 = sb6.toString();
            sb6.delete(0, sb6.length());
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.y0.class.hashCode() >>> 31) | 1) ^ 1);
            return !sb6.toString().equals(a(sb8, sb6.toString()));
        }
    }

    public static boolean c() {
        if (f269218a == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(8);
            try {
                sb6.append(tp3.b.a("´¼¸±µ«\u0092¿®¡\u0096£¸\u009b ¨¦¢\u00ad§§"));
            } catch (java.lang.Throwable unused) {
            }
            java.lang.String sb7 = sb6.toString();
            sb6.delete(0, sb6.length());
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.y0.class.hashCode() >>> 31) | 1) ^ 1);
            f269218a = java.lang.Boolean.valueOf(!sb6.toString().equals(a(sb7, sb6.toString())));
        }
        return f269218a.booleanValue();
    }
}
