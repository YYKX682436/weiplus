package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* renamed from: com.google.android.gms.common.util.Strings */
/* loaded from: classes13.dex */
public class C2012xf30f3a62 {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\$\\{(.*?)\\}");

    private C2012xf30f3a62() {
    }

    /* renamed from: emptyToNull */
    public static java.lang.String m18620x47e3164f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* renamed from: isEmptyOrWhitespace */
    public static boolean m18621xab7baa3(java.lang.String str) {
        return str == null || str.trim().isEmpty();
    }
}
