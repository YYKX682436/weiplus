package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class q7 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f74134d;

    public q7(com.tencent.mm.plugin.account.ui.LoginUI loginUI) {
        this.f74134d = loginUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        boolean[] zArr = this.f74134d.G;
        boolean z17 = zArr[0];
        fo3.s sVar = fo3.s.INSTANCE;
        if (z17) {
            zArr[0] = false;
            sVar.Ab("ie_login_id");
        }
        sVar.a6("ie_login_id");
    }
}
