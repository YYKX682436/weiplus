package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class xb implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f74319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileInputUI f74320e;

    public xb(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI, boolean[] zArr) {
        this.f74320e = mobileInputUI;
        this.f74319d = zArr;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            this.f74319d[0] = true;
            return;
        }
        int i17 = com.tencent.mm.plugin.account.ui.MobileInputUI.W;
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74320e;
        boolean X6 = mobileInputUI.X6();
        fo3.s sVar = fo3.s.INSTANCE;
        if (X6) {
            sVar.E7("ie_reg_eu");
        }
        if (mobileInputUI.W6()) {
            sVar.E7("ie_login");
        }
    }
}
