package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class r6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginPasswordUI f74156d;

    public r6(com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI) {
        this.f74156d = loginPasswordUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = this.f74156d;
        android.content.Intent intent = new android.content.Intent(loginPasswordUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
        intent.putExtra("mobile_input_purpose", 1);
        com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI2 = this.f74156d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(loginPasswordUI2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginPasswordUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        loginPasswordUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(loginPasswordUI2, "com/tencent/mm/plugin/account/ui/LoginPasswordUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        loginPasswordUI.finish();
    }
}
