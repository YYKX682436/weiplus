package zl2;

/* loaded from: classes3.dex */
public final class q0 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public static final zl2.q0 f555459d = new zl2.q0();

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        java.lang.String obj = charSequence.toString();
        while (i17 < charSequence.length()) {
            int codePointAt = obj.codePointAt(i17);
            int charCount = java.lang.Character.charCount(codePointAt);
            if (zl2.r4.f555484b.contains(java.lang.Integer.valueOf(java.lang.Character.getType(codePointAt)))) {
                return "";
            }
            i17 += charCount;
        }
        return charSequence;
    }
}
