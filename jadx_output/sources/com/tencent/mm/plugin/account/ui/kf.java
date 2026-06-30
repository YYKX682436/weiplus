package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class kf implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f73986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI f73987e;

    public kf(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI, boolean[] zArr) {
        this.f73987e = regByMobileRegAIOUI;
        this.f73986d = zArr;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.Y;
        this.f73987e.V6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        boolean[] zArr = this.f73986d;
        boolean z17 = zArr[0];
        fo3.s sVar = fo3.s.INSTANCE;
        if (z17) {
            zArr[0] = false;
            sVar.Ab("ie_reg");
        }
        sVar.a6("ie_reg");
    }
}
