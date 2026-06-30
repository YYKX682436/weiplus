package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class yb implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f74341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileInputUI f74342e;

    public yb(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI, boolean[] zArr) {
        this.f74342e = mobileInputUI;
        this.f74341d = zArr;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        d71.e eVar;
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74342e;
        if (mobileInputUI.f73481f.isEnabled() && (eVar = mobileInputUI.K) != null && editable != null) {
            eVar.a(editable);
        }
        mobileInputUI.f73490r.setEnabled(!com.tencent.mm.sdk.platformtools.t8.K0(mobileInputUI.f73481f.getText().toString()));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        boolean[] zArr = this.f74341d;
        boolean z17 = zArr[0];
        fo3.s sVar = fo3.s.INSTANCE;
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74342e;
        if (z17) {
            zArr[0] = false;
            int i27 = com.tencent.mm.plugin.account.ui.MobileInputUI.W;
            if (mobileInputUI.X6()) {
                sVar.Ab("ie_reg_eu");
            }
            if (mobileInputUI.W6()) {
                sVar.Ab("ie_login");
            }
        }
        int i28 = com.tencent.mm.plugin.account.ui.MobileInputUI.W;
        if (mobileInputUI.X6()) {
            sVar.a6("ie_reg_eu");
        }
        if (mobileInputUI.W6()) {
            sVar.a6("ie_login");
        }
    }
}
