package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class vi implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.VerifyPwdUI f74279d;

    public vi(com.tencent.mm.plugin.account.ui.VerifyPwdUI verifyPwdUI) {
        this.f74279d = verifyPwdUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(editable.toString());
        com.tencent.mm.plugin.account.ui.VerifyPwdUI verifyPwdUI = this.f74279d;
        if (!K0) {
            verifyPwdUI.f73678f.setEnabled(true);
        } else {
            verifyPwdUI.f73678f.setEnabled(false);
            verifyPwdUI.T6("");
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
