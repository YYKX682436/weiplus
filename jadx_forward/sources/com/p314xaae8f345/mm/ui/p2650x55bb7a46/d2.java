package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.d2 f281944a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.d2();

    public final void a(java.lang.String str, java.lang.String str2, android.widget.TextView textView, android.content.Context context) {
        int breakText;
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                if (context == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2cAppMsgRemittanceUtil", "setMiddleEllipsizeTextForRemittance: context is null");
                    return;
                }
                jz5.f0 f0Var = null;
                if (textView != null) {
                    int width = textView.getWidth() * 2;
                    android.text.TextPaint textPaint = new android.text.TextPaint();
                    textPaint.setTextSize(textView.getTextSize());
                    float f17 = width;
                    if (f17 < textPaint.measureText(str + str2) && (breakText = textPaint.breakText(str, true, ((f17 - textPaint.measureText(str2)) - textPaint.measureText("...")) - 16, null)) > 0) {
                        java.lang.String substring = str.substring(0, breakText);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        str = substring.concat("...");
                    }
                    int breakText2 = textPaint.breakText(str, true, textView.getWidth(), null);
                    if (breakText2 > 0) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.lang.String substring2 = str.substring(0, breakText2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                        sb6.append(substring2);
                        sb6.append((char) 8203);
                        java.lang.String substring3 = str.substring(breakText2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
                        sb6.append(substring3);
                        str = sb6.toString();
                    }
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                    spannableStringBuilder.append((java.lang.CharSequence) str);
                    spannableStringBuilder.append((java.lang.CharSequence) str2);
                    spannableStringBuilder.setSpan(((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).wi(context, null, 0, -1, null, null), str.length(), spannableStringBuilder.length(), 18);
                    textView.setText(spannableStringBuilder);
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2cAppMsgRemittanceUtil", "setMiddleEllipsizeTextForRemittance: textView is null");
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2cAppMsgRemittanceUtil", "setMiddleEllipsizeTextForRemittance: prefixContent or feeDesc is empty");
    }
}
