package eq1;

/* loaded from: classes9.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final eq1.b0 f337322a = new eq1.b0();

    public final java.lang.CharSequence a(int i17, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.l4 conv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conv, "conv");
        if (!(conv.d2(1073741824) || conv.d2(Integer.MIN_VALUE))) {
            return null;
        }
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c58);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
        if (conv.d2(Integer.MIN_VALUE)) {
            drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c4k);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
        }
        drawable.setBounds(0, 0, i17, i17);
        al5.w wVar = new al5.w(drawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("@");
        spannableString.setSpan(wVar, 0, 1, 33);
        return android.text.TextUtils.concat(spannableString, "", conv.y0());
    }
}
