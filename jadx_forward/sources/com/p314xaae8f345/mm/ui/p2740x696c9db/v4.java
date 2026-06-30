package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes5.dex */
public class v4 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f292371d;

    /* renamed from: e, reason: collision with root package name */
    public final int f292372e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.t4 f292373f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.u4 f292374g;

    public v4(int i17, com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var) {
        this.f292371d = true;
        this.f292372e = i17;
        this.f292373f = t4Var;
    }

    public static int a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("[\\u4e00-\\u9fa5]").matcher(str);
        int i17 = 0;
        while (matcher.find()) {
            for (int i18 = 0; i18 <= matcher.groupCount(); i18++) {
                i17++;
            }
        }
        return i17;
    }

    public static int b(int i17, java.lang.String str) {
        return i17 - (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? f(str) : f(str));
    }

    public static int c(int i17, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return -1;
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[\\u4e00-\\u9fa5]");
        int i18 = 0;
        for (int i19 = 0; i19 < str.length(); i19++) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            sb6.append(str.charAt(i19));
            i18 = compile.matcher(sb6.toString()).find() ? i18 + 2 : i18 + 1;
            if (i18 >= i17) {
                return i19;
            }
        }
        return -1;
    }

    public static int d(int i17, java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? java.lang.Math.round((java.lang.Math.round(f(str)) - i17) / 2.0f) : f(str) - i17;
    }

    public static int e(java.lang.String str, com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var) {
        if (t4Var == com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return 0;
            }
            return str.length();
        }
        if (t4Var == com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2) {
            return f(str);
        }
        if (t4Var == com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_3) {
            return g(str);
        }
        return 0;
    }

    public static int f(java.lang.String str) {
        int i17 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        int length = str.length() + a(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            int i18 = 0;
            while (i17 < str.length()) {
                char charAt = str.charAt(i17);
                if (charAt >= 0 && charAt <= 127) {
                    i18++;
                }
                i17++;
            }
            i17 = str.length() - (a(str) + i18);
        }
        return length + i17;
    }

    public static int g(java.lang.String str) {
        int i17 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        int length = str.length();
        int i18 = 0;
        while (true) {
            int i19 = 1;
            if (i17 >= length) {
                break;
            }
            if (str.charAt(i17) > 127) {
                i19 = 2;
            }
            i18 += i19;
            i17++;
        }
        return i18 % 2 != 0 ? (i18 + 1) / 2 : i18 / 2;
    }

    public static java.lang.String h(java.lang.String str, int i17) {
        int i18 = 0;
        for (int i19 = 0; i19 < str.length(); i19++) {
            i18 += str.charAt(i19) > 127 ? 2 : 1;
            if (i18 > i17) {
                return str.substring(0, i19);
            }
        }
        return str;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        ck5.f fVar;
        ck5.e eVar;
        boolean z17 = this.f292371d;
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = this.f292373f;
        int e17 = z17 ? e(spanned.toString(), t4Var) : e(spanned.subSequence(0, i19).toString(), t4Var);
        int e18 = e(charSequence.toString(), t4Var) + e17;
        int i28 = this.f292372e;
        if (e18 <= i28) {
            return charSequence;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.u4 u4Var = this.f292374g;
        if (u4Var != null && (eVar = (fVar = ((ck5.d) u4Var).f124088a).f124097i) != null) {
            eVar.w0(fVar.f124092d);
        }
        for (int min = java.lang.Math.min(i28 - e17, charSequence.length()); min > 0; min--) {
            if (e(charSequence.subSequence(0, min).toString(), t4Var) + e17 <= i28) {
                return charSequence.subSequence(0, min);
            }
        }
        return "";
    }

    public v4(int i17, com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var, boolean z17, com.p314xaae8f345.mm.ui.p2740x696c9db.u4 u4Var) {
        this.f292371d = true;
        this.f292372e = i17;
        this.f292373f = t4Var;
        this.f292371d = z17;
        this.f292374g = u4Var;
    }
}
