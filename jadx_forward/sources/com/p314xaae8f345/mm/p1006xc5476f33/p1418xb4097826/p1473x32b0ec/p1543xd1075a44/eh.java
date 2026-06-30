package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class eh implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.eh f199784d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.eh();

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        java.lang.String obj = charSequence.toString();
        while (i17 < charSequence.length()) {
            int codePointAt = obj.codePointAt(i17);
            int charCount = java.lang.Character.charCount(codePointAt);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xh.H.contains(java.lang.Integer.valueOf(java.lang.Character.getType(codePointAt)))) {
                return "";
            }
            i17 += charCount;
        }
        return charSequence;
    }
}
