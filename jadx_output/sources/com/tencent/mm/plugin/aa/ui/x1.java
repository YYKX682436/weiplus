package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f72880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.z1 f72881e;

    public x1(com.tencent.mm.plugin.aa.ui.z1 z1Var, android.view.View view) {
        this.f72881e = z1Var;
        this.f72880d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow;
        com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow2;
        com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow3;
        com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow4;
        com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow5;
        boolean z17;
        com.tencent.mm.plugin.aa.ui.z1 z1Var = this.f72881e;
        view = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) z1Var.f72909i).mKBLayout;
        boolean isShown = view.isShown();
        android.view.View view2 = this.f72880d;
        if (!isShown && view2.isShown()) {
            if (z1Var.f72905e) {
                z1Var.f72909i.showTenpayKB();
            } else {
                z17 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) z1Var.f72909i).isVKBFirstTimeShown;
                if (!z17) {
                    z1Var.f72909i.showTenpayKB();
                }
            }
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) z1Var.f72909i).isVKBFirstTimeShown = false;
            com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity.Z6(z1Var.f72909i, z1Var.f72906f);
        }
        android.view.View view3 = z1Var.f72907g;
        if (view3 instanceof com.tencent.mm.wallet_core.ui.formview.WalletFormView) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) view3;
            if ((c01.z1.I() || walletFormView.getEncrptType() == 100) && (!c01.z1.I() || walletFormView.getEncrptType() == 0)) {
                myKeyboardWindow4 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) z1Var.f72909i).mKeyboard;
                myKeyboardWindow4.resetSecureAccessibility();
                z1Var.f72906f.setAccessibilityDelegate(null);
            } else {
                com.tencent.mm.wallet_core.e eVar = new com.tencent.mm.wallet_core.e(true);
                myKeyboardWindow5 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) z1Var.f72909i).mKeyboard;
                myKeyboardWindow5.setSecureAccessibility(eVar);
                z1Var.f72906f.setAccessibilityDelegate(eVar);
            }
        }
        if (z1Var.f72907g instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) {
            com.tencent.mm.wallet_core.e eVar2 = new com.tencent.mm.wallet_core.e(true);
            z1Var.f72909i.getContext();
            java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
            myKeyboardWindow3 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) z1Var.f72909i).mKeyboard;
            myKeyboardWindow3.setSecureAccessibility(eVar2);
            z1Var.f72906f.setAccessibilityDelegate(eVar2);
        }
        android.view.View view4 = z1Var.f72907g;
        java.util.regex.Pattern pattern2 = com.tencent.mm.wallet_core.ui.r1.f214222a;
        if (view4 instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) {
            myKeyboardWindow2 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) z1Var.f72909i).mKeyboard;
            com.tencent.mm.wallet_core.ui.r1.N(view4, myKeyboardWindow2);
        }
        z1Var.f72909i.setKBMode(z1Var.f72908h);
        myKeyboardWindow = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) z1Var.f72909i).mKeyboard;
        myKeyboardWindow.setInputEditText((android.widget.EditText) view2);
        ((android.view.inputmethod.InputMethodManager) z1Var.f72909i.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
    }
}
