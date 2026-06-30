package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class be implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileVerifyUI f73752d;

    public be(com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI) {
        this.f73752d = mobileVerifyUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = this.f73752d;
        if (mobileVerifyUI.f73525e.getText() == null || mobileVerifyUI.f73525e.getText().toString().length() <= 0) {
            mobileVerifyUI.f73527g.setEnabled(false);
        } else {
            mobileVerifyUI.f73527g.setEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
