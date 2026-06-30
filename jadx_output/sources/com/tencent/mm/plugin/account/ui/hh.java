package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class hh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f73915d;

    public hh(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        this.f73915d = regSetInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        n71.a.e("R400_100_signup");
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f73915d;
        android.content.Intent intent = new android.content.Intent(regSetInfoUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginUI.class);
        intent.addFlags(67108864);
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI2 = this.f73915d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(regSetInfoUI2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI$27", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        regSetInfoUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(regSetInfoUI2, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$27", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        regSetInfoUI.finish();
    }
}
