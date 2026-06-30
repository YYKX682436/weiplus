package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class ke implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI f73985d;

    public ke(com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI) {
        this.f73985d = regAffiliateAccountUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI = this.f73985d;
        regAffiliateAccountUI.f73559r = regAffiliateAccountUI.f73549e.getText().toString().trim();
        com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI.T6(regAffiliateAccountUI);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
