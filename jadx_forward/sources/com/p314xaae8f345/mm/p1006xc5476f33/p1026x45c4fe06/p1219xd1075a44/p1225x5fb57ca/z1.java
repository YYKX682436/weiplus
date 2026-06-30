package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class z1 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a2 f173265d;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a2 a2Var) {
        this.f173265d = a2Var;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a2 a2Var = this.f173265d;
        if (a2Var.A == null) {
            return null;
        }
        android.text.Spannable spannableStringBuilder = charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : new android.text.SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(a2Var.A, 0, spannableStringBuilder.length(), 18);
        return spannableStringBuilder;
    }
}
