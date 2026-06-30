package ky2;

/* loaded from: classes3.dex */
public final class u extends com.p314xaae8f345.mm.ui.p2740x696c9db.v4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f395115h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i17, com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var) {
        super(i17, t4Var);
        this.f395115h = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.v4, android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        int e17;
        int length = spanned != null ? spanned.length() : 0;
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        if (length > i19) {
            e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(java.lang.String.valueOf(spanned != null ? spanned.subSequence(0, i19) : null), t4Var);
        } else {
            e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(java.lang.String.valueOf(spanned), t4Var);
        }
        int e18 = (spanned == null || spanned.length() <= i27) ? 0 : com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(spanned.subSequence(i27, spanned.length()).toString(), t4Var);
        int e19 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(java.lang.String.valueOf(charSequence), t4Var);
        int i28 = (this.f395115h - e17) - e18;
        return e19 > i28 ? zl2.r4.f555483a.c1(java.lang.String.valueOf(charSequence), i28, false) : charSequence == null ? "" : charSequence;
    }
}
