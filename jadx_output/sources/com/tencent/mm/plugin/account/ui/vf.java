package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class vf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI f74276d;

    public vf(com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI) {
        this.f74276d = regByMobileSendSmsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI = this.f74276d;
        regByMobileSendSmsUI.f73594q.setEnabled(false);
        regByMobileSendSmsUI.f73596s = true;
        com.tencent.mm.sdk.platformtools.b4 b4Var = regByMobileSendSmsUI.f73595r;
        if (b4Var != null) {
            b4Var.d();
            regByMobileSendSmsUI.f73597t = 15;
            regByMobileSendSmsUI.f73592o = 0;
            regByMobileSendSmsUI.f73595r.c(0L, 1000L);
        } else {
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.account.ui.tf(regByMobileSendSmsUI), true);
            regByMobileSendSmsUI.f73595r = b4Var2;
            b4Var2.c(0L, 1000L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
