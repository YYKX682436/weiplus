package bm2;

/* loaded from: classes3.dex */
public final class e3 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.g3 f21862d;

    public e3(bm2.g3 g3Var) {
        this.f21862d = g3Var;
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        boolean contentEquals = charSequence.toString().contentEquals("\n");
        bm2.g3 g3Var = this.f21862d;
        if (contentEquals) {
            g3Var.f21913i = false;
            return "";
        }
        if (!charSequence.toString().contentEquals(" ")) {
            g3Var.f21913i = false;
        } else {
            if (g3Var.f21913i) {
                return "";
            }
            g3Var.f21913i = true;
        }
        return null;
    }
}
