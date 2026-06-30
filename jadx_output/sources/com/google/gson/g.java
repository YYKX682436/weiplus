package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public abstract class g implements com.google.gson.h {

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.gson.g f44672d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.google.gson.g[] f44673e;

    static {
        com.google.gson.a aVar = new com.google.gson.a("IDENTITY", 0);
        f44672d = aVar;
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
        f44673e = new com.google.gson.g[]{aVar, new com.google.gson.g(str, i17) { // from class: com.google.gson.b
            @Override // com.google.gson.h
            public java.lang.String a(java.lang.reflect.Field field) {
                return com.google.gson.g.d(field.getName());
            }
        }, new com.google.gson.g(str2, i18) { // from class: com.google.gson.c
            @Override // com.google.gson.h
            public java.lang.String a(java.lang.reflect.Field field) {
                return com.google.gson.g.d(com.google.gson.g.b(field.getName(), " "));
            }
        }, new com.google.gson.g(str3, i19) { // from class: com.google.gson.d
            @Override // com.google.gson.h
            public java.lang.String a(java.lang.reflect.Field field) {
                return com.google.gson.g.b(field.getName(), "_").toLowerCase(java.util.Locale.ENGLISH);
            }
        }, new com.google.gson.g(str4, i27) { // from class: com.google.gson.e
            @Override // com.google.gson.h
            public java.lang.String a(java.lang.reflect.Field field) {
                return com.google.gson.g.b(field.getName(), "-").toLowerCase(java.util.Locale.ENGLISH);
            }
        }, new com.google.gson.g(str5, i28) { // from class: com.google.gson.f
            @Override // com.google.gson.h
            public java.lang.String a(java.lang.reflect.Field field) {
                return com.google.gson.g.b(field.getName(), ".").toLowerCase(java.util.Locale.ENGLISH);
            }
        }};
    }

    public g(java.lang.String str, int i17, com.google.gson.a aVar) {
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

    public static com.google.gson.g valueOf(java.lang.String str) {
        return (com.google.gson.g) java.lang.Enum.valueOf(com.google.gson.g.class, str);
    }

    public static com.google.gson.g[] values() {
        return (com.google.gson.g[]) f44673e.clone();
    }
}
