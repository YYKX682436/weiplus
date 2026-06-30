package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI f74283d;

    public w3(com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI) {
        this.f74283d = loginByMobileSendSmsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI = this.f74283d;
        loginByMobileSendSmsUI.f73312x.setEnabled(false);
        loginByMobileSendSmsUI.B = true;
        com.tencent.mm.sdk.platformtools.b4 b4Var = loginByMobileSendSmsUI.A;
        if (b4Var != null) {
            b4Var.d();
            loginByMobileSendSmsUI.C = 15;
            loginByMobileSendSmsUI.f73310v = 0;
            loginByMobileSendSmsUI.A.c(0L, 1000L);
        } else {
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.account.ui.t3(loginByMobileSendSmsUI), true);
            loginByMobileSendSmsUI.A = b4Var2;
            b4Var2.c(0L, 1000L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
