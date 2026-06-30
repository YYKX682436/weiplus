package sr2;

/* loaded from: classes.dex */
public final class c0 implements android.text.InputFilter {
    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        if (charSequence == null) {
            return charSequence;
        }
        java.lang.String obj = charSequence.toString();
        return r26.n0.D(obj, "\n", false, 2, null) ? r26.i0.v(obj, "\n", "", false, 4, null) : charSequence;
    }
}
