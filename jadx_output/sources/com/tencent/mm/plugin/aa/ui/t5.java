package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class t5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72814d;

    public t5(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72814d = launchAAUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = com.tencent.mm.plugin.aa.ui.LaunchAAUI.S1;
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72814d;
        launchAAUI.K7();
        launchAAUI.B7(launchAAUI.L, launchAAUI.M);
        launchAAUI.f7(6);
        launchAAUI.D7();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
