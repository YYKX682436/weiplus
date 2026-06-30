package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class x3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72885d;

    public x3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72885d = launchAAUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72885d;
        if (indexOf >= 0 && length - indexOf > 3) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(launchAAUI.D.getContentEt(), obj, indexOf + 3, length);
        } else if (indexOf > 6) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(launchAAUI.D.getContentEt(), obj, 6, indexOf);
        } else if (indexOf == -1 && length > 6) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(launchAAUI.D.getContentEt(), obj, 6, length);
        }
        double F = com.tencent.mm.sdk.platformtools.t8.F(editable.toString(), 0.0d);
        java.util.List list = launchAAUI.H;
        if (list == null || list.size() <= 0 || (F * 100.0d) / launchAAUI.H.size() <= launchAAUI.W.b()) {
            launchAAUI.f72509o = false;
        } else {
            launchAAUI.f72509o = true;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13722, 2);
        }
        if (by5.b.a(launchAAUI.getContext()).b()) {
            if (obj.length() == 0) {
                launchAAUI.D.getContentEt().setHint(launchAAUI.getString(com.tencent.mm.R.string.g_r));
            } else {
                launchAAUI.D.getContentEt().setHint((java.lang.CharSequence) null);
            }
        }
        launchAAUI.D.post(new com.tencent.mm.plugin.aa.ui.w3(this));
        launchAAUI.K7();
        launchAAUI.J7();
        launchAAUI.I7();
        launchAAUI.f7(3);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
