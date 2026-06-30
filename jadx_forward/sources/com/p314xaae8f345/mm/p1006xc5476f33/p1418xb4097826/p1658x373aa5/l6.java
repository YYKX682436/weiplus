package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes8.dex */
public final class l6 extends com.p314xaae8f345.mm.ui.p2740x696c9db.v4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f214075h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m6 f214076i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(int i17, com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m6 m6Var) {
        super(i17, t4Var);
        this.f214075h = i17;
        this.f214076i = m6Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.v4, android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned dest, int i19, int i27) {
        int i28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        if (charSequence == null) {
            return "";
        }
        java.lang.String obj = dest.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m6 m6Var = this.f214076i;
        int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(obj, m6Var.f124095g);
        int e18 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(charSequence.toString(), m6Var.f124095g);
        int i29 = e17 + e18;
        int i37 = this.f214075h;
        if (i29 <= i37 || (i28 = i37 - e17) >= e18) {
            return charSequence;
        }
        int i38 = 1;
        while (i38 <= charSequence.length() && com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(charSequence.subSequence(0, i38).toString(), m6Var.f124095g) <= i28) {
            i38++;
        }
        int i39 = i38 - 1;
        if (i39 <= 0 || i39 > charSequence.length()) {
            return "";
        }
        com.p314xaae8f345.mm.p2614xca6eae71.r0 r0Var = (com.p314xaae8f345.mm.p2614xca6eae71.r0) kz5.z.O(android.text.SpannableString.valueOf(charSequence).getSpans(0, i39, com.p314xaae8f345.mm.p2614xca6eae71.r0.class));
        return charSequence.subSequence(0, java.lang.Math.min(i39 + (r0Var != null ? r0Var.f274887h - r0Var.f274886g : 0), charSequence.length()));
    }
}
