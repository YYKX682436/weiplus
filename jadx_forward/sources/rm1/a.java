package rm1;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final rm1.a f478961a = new rm1.a();

    public final java.lang.String a(android.text.TextPaint textPaint, java.lang.String str, int i17, int i18) {
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(i19, 0, i19.length(), textPaint, i17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (new android.text.StaticLayout(i19, 0, i19.length(), textPaint, i18, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
            return str;
        }
        java.lang.String substring = str.substring(0, staticLayout.getLineEnd(0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring.concat("...");
    }
}
