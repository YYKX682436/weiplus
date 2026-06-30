package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ph implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f74117d;

    public ph(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        this.f74117d = regSetInfoUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f74117d;
        if (!regSetInfoUI.U.e()) {
            regSetInfoUI.U.d();
        }
        java.lang.String trim = regSetInfoUI.f73630e.getText().toString().trim();
        if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            regSetInfoUI.f73640r.setText(regSetInfoUI.getString(com.tencent.mm.R.string.hxy));
            regSetInfoUI.a7(false, false);
            db5.d5 d5Var = regSetInfoUI.I;
            if (d5Var != null) {
                d5Var.dismiss();
                regSetInfoUI.I = null;
            }
            regSetInfoUI.f73630e.postDelayed(new com.tencent.mm.plugin.account.ui.oh(this), 50L);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(trim) && (regSetInfoUI.X6() || !trim.equals(regSetInfoUI.C))) {
            regSetInfoUI.a7(false, false);
            regSetInfoUI.U.c(500L, 500L);
        }
        regSetInfoUI.C = trim;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
