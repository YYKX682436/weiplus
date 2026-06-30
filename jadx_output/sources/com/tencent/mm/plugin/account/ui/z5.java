package com.tencent.mm.plugin.account.ui;

/* loaded from: classes8.dex */
public class z5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginIndepPass f74356d;

    public z5(com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass) {
        this.f74356d = loginIndepPass;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass = this.f74356d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(loginIndepPass.f73352d.getText().toString().trim())) {
            loginIndepPass.enableOptionMenu(false);
        } else {
            loginIndepPass.enableOptionMenu(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
