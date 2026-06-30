package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public enum m5 {
    ;


    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Class f173082d;

    static {
        java.lang.Class<?> cls;
        try {
            cls = java.lang.Class.forName("android.view.inputmethod.ComposingText");
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.InputUtil", "class for ComposingText e = %s", e17);
            cls = null;
        }
        f173082d = cls;
    }

    public static void a(android.view.View view) {
        java.lang.String format;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.InputUtil", "dumpImmDebugInfo skip >=30");
            return;
        }
        android.view.inputmethod.InputMethodManager b17 = b(view);
        if (b17 == null) {
            format = "NULL Imm";
        } else {
            try {
                format = java.lang.String.format(java.util.Locale.US, "mServedView=%s, mNextServedView=%s", (android.view.View) d56.b.h(b17).f("mServedView"), (android.view.View) d56.b.h(b17).f("mNextServedView"));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.InputUtil", "dumpImmDebugInfo reflect failed %s", e17);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.InputUtil", "dumpImmDebugInfo: %s", format);
    }

    public static android.view.inputmethod.InputMethodManager b(android.view.View view) {
        android.content.Context context;
        if (view == null || (context = view.getContext()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        return (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method");
    }

    public static boolean d(java.lang.Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static boolean e(java.lang.CharSequence charSequence) {
        if (!(charSequence instanceof android.text.Spanned)) {
            return false;
        }
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        java.lang.Object[] spans = spanned.getSpans(0, spanned.length(), f173082d);
        return spans != null && spans.length > 0;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5 m53499xdce0328(java.lang.String str) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Enum.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.class, str));
        return null;
    }
}
