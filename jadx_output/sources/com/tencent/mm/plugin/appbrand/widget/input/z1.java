package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class z1 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.a2 f91732d;

    public z1(com.tencent.mm.plugin.appbrand.widget.input.a2 a2Var) {
        this.f91732d = a2Var;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.widget.input.a2 a2Var = this.f91732d;
        if (a2Var.A == null) {
            return null;
        }
        android.text.Spannable spannableStringBuilder = charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : new android.text.SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(a2Var.A, 0, spannableStringBuilder.length(), 18);
        return spannableStringBuilder;
    }
}
