package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class x3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI f74313d;

    public x3(com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI) {
        this.f74313d = loginByMobileSendSmsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SENDTO");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("smsto:");
        com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI = this.f74313d;
        sb6.append(loginByMobileSendSmsUI.f73297f);
        intent.setData(android.net.Uri.parse(sb6.toString()));
        intent.putExtra("sms_body", loginByMobileSendSmsUI.f73296e);
        try {
            com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI2 = this.f74313d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(loginByMobileSendSmsUI2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            loginByMobileSendSmsUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(loginByMobileSendSmsUI2, "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            loginByMobileSendSmsUI.overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LoginByMobileSendSmsUI", e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
