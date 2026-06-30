package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class zb implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileInputUI f74362d;

    public zb(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI) {
        this.f74362d = mobileInputUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        this.f74362d.f73490r.setEnabled(true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
