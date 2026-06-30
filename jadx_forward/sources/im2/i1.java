package im2;

/* loaded from: classes.dex */
public final class i1 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373917d;

    public i1(im2.z3 z3Var) {
        this.f373917d = z3Var;
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        im2.z3 z3Var = this.f373917d;
        android.text.Editable text = z3Var.d7().getText();
        if (!charSequence.toString().contentEquals("\n")) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(text);
        if (!r26.n0.F(text, "\n", false, 2, null)) {
            int i28 = 0;
            for (int i29 = 0; i29 < text.length(); i29++) {
                if (text.charAt(i29) == '\n') {
                    i28++;
                }
            }
            if (i28 < 7) {
                return charSequence;
            }
            db5.t7.m(z3Var.m158354x19263085(), z3Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0r));
        }
        return "";
    }
}
