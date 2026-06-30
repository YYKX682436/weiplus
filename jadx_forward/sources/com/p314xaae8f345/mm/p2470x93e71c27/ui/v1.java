package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes5.dex */
public class v1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.z1 f273564d;

    public v1(com.p314xaae8f345.mm.p2470x93e71c27.ui.z1 z1Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030) {
        this.f273564d = z1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.z1 z1Var = this.f273564d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = z1Var.f273637e;
        int i27 = com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030.f271316x;
        c19642xb279030.b();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b2 b2Var = z1Var.f273637e.f271322i;
        if (b2Var != null) {
            b2Var.L(charSequence.toString());
        }
    }
}
