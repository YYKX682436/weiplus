package com.tencent.mm.plugin.account.ui;

/* loaded from: classes12.dex */
public class lh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f74020d;

    public lh(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        this.f74020d = regSetInfoUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f74020d;
        java.lang.String trim = regSetInfoUI.f73629d.getText().toString().trim();
        if (trim != null && trim.length() > 16) {
            regSetInfoUI.f73629d.setText(trim.substring(0, 16));
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = regSetInfoUI.U;
        if (!b4Var.e()) {
            b4Var.d();
        }
        regSetInfoUI.f73631f.setEnabled(!com.tencent.mm.sdk.platformtools.t8.K0(regSetInfoUI.f73629d.getText().toString().trim()));
        if (regSetInfoUI.K) {
            return;
        }
        regSetInfoUI.f73630e.setText(trim);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
