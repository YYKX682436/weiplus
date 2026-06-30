package db5;

/* loaded from: classes.dex */
public class e3 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final char[] f309857d = {'\n', ',', ';', 12289, 65292, 65307};

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.f3 f309858e;

    public e3(db5.f3 f3Var) {
        this.f309858e = f3Var;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        for (int i28 = i17; i28 < i18; i28++) {
            char[] cArr = new char[i18 - i17];
            android.text.TextUtils.getChars(charSequence, i17, i18, cArr, 0);
            for (char c17 : this.f309857d) {
                char c18 = cArr[i28];
                if (c18 == ' ' && i19 == 0 && i28 == 0) {
                    return "";
                }
                if (c18 == c17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHalfBottomDialog", "MMInputFilter, showInvaildMsg.");
                    db5.f3 f3Var = this.f309858e;
                    f3Var.R.setVisibility(0);
                    f3Var.R.setText(f3Var.P.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571362cx));
                    com.p314xaae8f345.mm.ui.jk.a();
                    return "";
                }
            }
        }
        return null;
    }
}
