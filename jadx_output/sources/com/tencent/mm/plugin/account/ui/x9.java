package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public final class x9 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI f74317d;

    public x9(com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI mMLoginVerifyPwdUI) {
        this.f74317d = mMLoginVerifyPwdUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI.f73470t;
        this.f74317d.a7();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
