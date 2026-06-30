package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class x2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f72882d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.ui.formview.WalletFormView f72883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI f72884f;

    public x2(com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI, java.lang.String str, com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        this.f72884f = launchAAByPersonAmountSelectUI;
        this.f72882d = str;
        this.f72883e = walletFormView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        try {
            java.lang.String obj = editable.toString();
            if (obj.startsWith("0") && obj.charAt(1) != '0' && obj.charAt(1) != '.') {
                editable.delete(0, 1);
            }
            if (obj.startsWith(".")) {
                editable.insert(0, "0");
            }
            if (obj.startsWith("0") && obj.charAt(1) == '0') {
                editable.delete(1, obj.length());
            }
            java.lang.String obj2 = editable.toString();
            int indexOf = obj2.indexOf(".");
            int length = obj2.length();
            if (indexOf >= 0 && length - indexOf > 2) {
                editable.delete(indexOf + 3, length);
            }
            int lastIndexOf = obj2.lastIndexOf(".");
            if (lastIndexOf != indexOf && lastIndexOf > 0 && length > lastIndexOf) {
                editable.delete(lastIndexOf, length);
            }
        } catch (java.lang.Exception unused) {
        }
        boolean J0 = com.tencent.mm.sdk.platformtools.t8.J0(editable);
        com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = this.f72884f;
        if (J0 || com.tencent.mm.sdk.platformtools.t8.F(editable.toString(), 0.0d) <= 0.0d) {
            ((java.util.HashMap) launchAAByPersonAmountSelectUI.f72488q).remove(this.f72882d);
        } else {
            ((java.util.HashMap) launchAAByPersonAmountSelectUI.f72488q).put(this.f72882d, editable.toString());
        }
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = this.f72883e;
        if (walletFormView == null || com.tencent.mm.wallet_core.ui.r1.h0(walletFormView.getText(), "100", 2, java.math.RoundingMode.HALF_UP).doubleValue() <= launchAAByPersonAmountSelectUI.f72492u) {
            walletFormView.setContentTextColorRes(com.tencent.mm.R.color.a0c);
        } else {
            walletFormView.setContentTextColorRes(com.tencent.mm.R.color.f478532ac);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = launchAAByPersonAmountSelectUI.f72495x;
        java.lang.Runnable runnable = launchAAByPersonAmountSelectUI.B;
        n3Var.removeCallbacks(runnable);
        launchAAByPersonAmountSelectUI.f72495x.postDelayed(runnable, 50L);
        if (launchAAByPersonAmountSelectUI.f72496y == 6) {
            com.tencent.mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct groupPayPfClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct();
            groupPayPfClickReportStruct.f58395d = 3;
            groupPayPfClickReportStruct.k();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
