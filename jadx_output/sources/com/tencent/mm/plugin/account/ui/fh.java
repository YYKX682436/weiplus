package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class fh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f73866d;

    public fh(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        this.f73866d = regSetInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent;
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f73866d;
        if (regSetInfoUI.N == 2) {
            intent = new android.content.Intent(regSetInfoUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
            intent.putExtra("mobile_input_purpose", 2);
        } else {
            intent = new android.content.Intent(regSetInfoUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.class);
        }
        intent.addFlags(67108864);
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI2 = this.f73866d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(regSetInfoUI2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI$25", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        regSetInfoUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(regSetInfoUI2, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$25", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        regSetInfoUI.finish();
    }
}
