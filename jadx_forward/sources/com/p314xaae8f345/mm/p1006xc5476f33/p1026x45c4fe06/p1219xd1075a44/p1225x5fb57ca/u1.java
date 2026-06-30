package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes5.dex */
public final class u1 extends com.p314xaae8f345.mm.ui.p2740x696c9db.v4 {

    /* renamed from: h, reason: collision with root package name */
    public final int f173203h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.t4 f173204i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v1 f173205m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v1 v1Var, int i17, com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var) {
        super(i17, t4Var);
        this.f173205m = v1Var;
        this.f173203h = i17;
        this.f173204i = t4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.v4, android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        java.lang.String str = spanned.subSequence(0, i19).toString() + spanned.subSequence(i27, spanned.length()).toString();
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = this.f173204i;
        int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(str, t4Var) + com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(charSequence.subSequence(i17, i18).toString(), t4Var);
        int i28 = this.f173203h;
        boolean z17 = e17 > i28;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v1 v1Var = this.f173205m;
        if (z17) {
            int max = java.lang.Math.max(i17, java.lang.Math.min(i28 - (spanned.length() - (i27 - i19)), i18));
            v1Var.getClass();
            while (max > i17 && charSequence.length() >= max) {
                int i29 = max - 1;
                if (!java.lang.Character.isHighSurrogate(charSequence.charAt(i29))) {
                    break;
                }
                max = i29;
            }
            charSequence = charSequence.subSequence(i17, max);
        }
        if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence)) {
            java.lang.ref.WeakReference weakReference = v1Var.f124091c;
            android.widget.EditText editText = weakReference == null ? null : (android.widget.EditText) weakReference.get();
            ck5.e eVar = v1Var.f124097i;
            if (editText != null && eVar != null) {
                editText.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t1(this, eVar, editText.getText() != null ? editText.getText().toString() : ""));
            }
        }
        return charSequence;
    }
}
