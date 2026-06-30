package com.p176xb6135e39.p280x308fcb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public abstract class g implements com.p176xb6135e39.p280x308fcb.h {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.g f126205d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.p176xb6135e39.p280x308fcb.g[] f126206e;

    static {
        com.p176xb6135e39.p280x308fcb.a aVar = new com.p176xb6135e39.p280x308fcb.a("IDENTITY", 0);
        f126205d = aVar;
        final java.lang.String str = "UPPER_CAMEL_CASE";
        final int i17 = 1;
        final java.lang.String str2 = "UPPER_CAMEL_CASE_WITH_SPACES";
        final int i18 = 2;
        final java.lang.String str3 = "LOWER_CASE_WITH_UNDERSCORES";
        final int i19 = 3;
        final java.lang.String str4 = "LOWER_CASE_WITH_DASHES";
        final int i27 = 4;
        final java.lang.String str5 = "LOWER_CASE_WITH_DOTS";
        final int i28 = 5;
        f126206e = new com.p176xb6135e39.p280x308fcb.g[]{aVar, new com.p176xb6135e39.p280x308fcb.g(str, i17) { // from class: com.google.gson.b
            @Override // com.p176xb6135e39.p280x308fcb.h
            public java.lang.String a(java.lang.reflect.Field field) {
                return com.p176xb6135e39.p280x308fcb.g.d(field.getName());
            }
        }, new com.p176xb6135e39.p280x308fcb.g(str2, i18) { // from class: com.google.gson.c
            @Override // com.p176xb6135e39.p280x308fcb.h
            public java.lang.String a(java.lang.reflect.Field field) {
                return com.p176xb6135e39.p280x308fcb.g.d(com.p176xb6135e39.p280x308fcb.g.b(field.getName(), " "));
            }
        }, new com.p176xb6135e39.p280x308fcb.g(str3, i19) { // from class: com.google.gson.d
            @Override // com.p176xb6135e39.p280x308fcb.h
            public java.lang.String a(java.lang.reflect.Field field) {
                return com.p176xb6135e39.p280x308fcb.g.b(field.getName(), "_").toLowerCase(java.util.Locale.ENGLISH);
            }
        }, new com.p176xb6135e39.p280x308fcb.g(str4, i27) { // from class: com.google.gson.e
            @Override // com.p176xb6135e39.p280x308fcb.h
            public java.lang.String a(java.lang.reflect.Field field) {
                return com.p176xb6135e39.p280x308fcb.g.b(field.getName(), "-").toLowerCase(java.util.Locale.ENGLISH);
            }
        }, new com.p176xb6135e39.p280x308fcb.g(str5, i28) { // from class: com.google.gson.f
            @Override // com.p176xb6135e39.p280x308fcb.h
            public java.lang.String a(java.lang.reflect.Field field) {
                return com.p176xb6135e39.p280x308fcb.g.b(field.getName(), ".").toLowerCase(java.util.Locale.ENGLISH);
            }
        }};
    }

    public g(java.lang.String str, int i17, com.p176xb6135e39.p280x308fcb.a aVar) {
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            char charAt = str.charAt(i17);
            if (java.lang.Character.isUpperCase(charAt) && sb6.length() != 0) {
                sb6.append(str2);
            }
            sb6.append(charAt);
        }
        return sb6.toString();
    }

    public static java.lang.String d(java.lang.String str) {
        int length = str.length() - 1;
        int i17 = 0;
        while (!java.lang.Character.isLetter(str.charAt(i17)) && i17 < length) {
            i17++;
        }
        char charAt = str.charAt(i17);
        if (java.lang.Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = java.lang.Character.toUpperCase(charAt);
        if (i17 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i17) + upperCase + str.substring(i17 + 1);
    }

    /* renamed from: valueOf */
    public static com.p176xb6135e39.p280x308fcb.g m20470xdce0328(java.lang.String str) {
        return (com.p176xb6135e39.p280x308fcb.g) java.lang.Enum.valueOf(com.p176xb6135e39.p280x308fcb.g.class, str);
    }

    /* renamed from: values */
    public static com.p176xb6135e39.p280x308fcb.g[] m20471xcee59d22() {
        return (com.p176xb6135e39.p280x308fcb.g[]) f126206e.clone();
    }
}
