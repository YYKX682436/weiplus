package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public enum m5 {
    ;


    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Class f91549d;

    static {
        java.lang.Class<?> cls;
        try {
            cls = java.lang.Class.forName("android.view.inputmethod.ComposingText");
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.InputUtil", "class for ComposingText e = %s", e17);
            cls = null;
        }
        f91549d = cls;
    }

    public static void a(android.view.View view) {
        java.lang.String format;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.InputUtil", "dumpImmDebugInfo skip >=30");
            return;
        }
        android.view.inputmethod.InputMethodManager b17 = b(view);
        if (b17 == null) {
            format = "NULL Imm";
        } else {
            try {
                format = java.lang.String.format(java.util.Locale.US, "mServedView=%s, mNextServedView=%s", (android.view.View) d56.b.h(b17).f("mServedView"), (android.view.View) d56.b.h(b17).f("mNextServedView"));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.InputUtil", "dumpImmDebugInfo reflect failed %s", e17);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.InputUtil", "dumpImmDebugInfo: %s", format);
    }

    public static android.view.inputmethod.InputMethodManager b(android.view.View view) {
        android.content.Context context;
        if (view == null || (context = view.getContext()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
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
        java.lang.Object[] spans = spanned.getSpans(0, spanned.length(), f91549d);
        return spans != null && spans.length > 0;
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.m5 valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.widget.input.m5.class, str));
        return null;
    }
}
