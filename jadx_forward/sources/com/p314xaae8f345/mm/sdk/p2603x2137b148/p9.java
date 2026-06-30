package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class p9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.m9 f274468a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f274469b;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m9 m9Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.m9();
        f274468a = m9Var;
        f274469b = false;
        m9Var.f274401b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.o9();
    }

    public static boolean a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        char charAt = str.charAt(str.length() - 1);
        char charAt2 = str2.charAt(0);
        if (charAt == ' ' || charAt2 == ' ' || charAt == '\n' || charAt2 == '\n' || c(charAt) || c(charAt2)) {
            return false;
        }
        if (charAt == '-' || charAt == '/' || charAt == '\\') {
            return false;
        }
        if ((charAt2 == '-' || charAt2 == '/' || charAt2 == '\\') || d(charAt2)) {
            return false;
        }
        if (!d(charAt)) {
            if (b(charAt) || java.lang.Character.isDigit(charAt)) {
                if (str.charAt(str.length() - 1) == 'n' && str.length() > 1 && str.charAt(str.length() + (-2)) == '\\') {
                    return false;
                }
                if ((str.charAt(str.length() - 1) == 's' && str.length() > 1 && str.charAt(str.length() + (-2)) == '%') && !b(charAt2)) {
                    return false;
                }
            } else if (!b(charAt2) && !java.lang.Character.isDigit(charAt2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(char c17) {
        return (c17 >= 'a' && c17 <= 'z') || (c17 >= 'A' && c17 <= 'Z');
    }

    public static boolean c(char c17) {
        return c17 == 65292 || c17 == 12290 || c17 == 65281 || c17 == 65311 || c17 == 65306 || c17 == 65307 || c17 == 12289 || c17 == 12300 || c17 == 12301;
    }

    public static boolean d(char c17) {
        return c17 == '.' || c17 == ',' || c17 == '?' || c17 == '!' || c17 == ';' || c17 == ':';
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.Object obj;
        java.lang.String str2;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m9 m9Var = f274468a;
        m9Var.getClass();
        if (str == null) {
            str2 = null;
        } else if (str.length() == 0) {
            str2 = "";
        } else {
            try {
                obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.m9.a(str, m9Var.f274400a);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeChatBrands", th6, "compute place holders error: " + th6.getMessage() + ", input = " + str, new java.lang.Object[0]);
                obj = str;
            }
            str2 = obj instanceof java.lang.String ? (java.lang.String) obj : (java.lang.String) m9Var.f274401b.mo1850x58b836e((java.util.List) obj);
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            if (str2.contains("帐") || str2.contains("帳")) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("string value [%s] is wrong", str2));
            }
        }
        return str2;
    }
}
