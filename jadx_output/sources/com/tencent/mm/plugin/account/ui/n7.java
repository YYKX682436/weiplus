package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class n7 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f74060d;

    public n7(com.tencent.mm.plugin.account.ui.LoginUI loginUI) {
        this.f74060d = loginUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.account.ui.LoginUI loginUI = this.f74060d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(loginUI.f73403d.getText().toString()) || com.tencent.mm.sdk.platformtools.t8.K0(loginUI.f73404e.getText().toString())) {
            loginUI.f73415s.setEnabled(false);
        } else {
            loginUI.f73415s.setEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
