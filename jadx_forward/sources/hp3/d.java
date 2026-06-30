package hp3;

/* loaded from: classes9.dex */
public abstract class d {
    public static boolean a(java.lang.String str) {
        return java.util.regex.Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public static void b(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_product_id", str);
        intent.putExtra("key_product_scene", 5);
        j45.l.j(context, "product", ".ui.MallProductUI", intent, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hp3.d.c(android.content.Context, java.lang.String):boolean");
    }

    public static void d(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (bool.booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11030, str, "", str3, str4);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11030, str, str2, str3, str4);
        }
    }
}
