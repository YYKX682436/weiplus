package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes5.dex */
public final class u1 extends com.tencent.mm.ui.tools.v4 {

    /* renamed from: h, reason: collision with root package name */
    public final int f91670h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.t4 f91671i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.v1 f91672m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.tencent.mm.plugin.appbrand.widget.input.v1 v1Var, int i17, com.tencent.mm.ui.tools.t4 t4Var) {
        super(i17, t4Var);
        this.f91672m = v1Var;
        this.f91670h = i17;
        this.f91671i = t4Var;
    }

    @Override // com.tencent.mm.ui.tools.v4, android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        java.lang.String str = spanned.subSequence(0, i19).toString() + spanned.subSequence(i27, spanned.length()).toString();
        com.tencent.mm.ui.tools.t4 t4Var = this.f91671i;
        int e17 = com.tencent.mm.ui.tools.v4.e(str, t4Var) + com.tencent.mm.ui.tools.v4.e(charSequence.subSequence(i17, i18).toString(), t4Var);
        int i28 = this.f91670h;
        boolean z17 = e17 > i28;
        com.tencent.mm.plugin.appbrand.widget.input.v1 v1Var = this.f91672m;
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
        if (z17 && com.tencent.mm.sdk.platformtools.t8.J0(charSequence)) {
            java.lang.ref.WeakReference weakReference = v1Var.f42558c;
            android.widget.EditText editText = weakReference == null ? null : (android.widget.EditText) weakReference.get();
            ck5.e eVar = v1Var.f42564i;
            if (editText != null && eVar != null) {
                editText.post(new com.tencent.mm.plugin.appbrand.widget.input.t1(this, eVar, editText.getText() != null ? editText.getText().toString() : ""));
            }
        }
        return charSequence;
    }
}
