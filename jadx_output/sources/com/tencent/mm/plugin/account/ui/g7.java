package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class g7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f73879d;

    public g7(com.tencent.mm.plugin.account.ui.LoginUI loginUI) {
        this.f73879d = loginUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginUI loginUI = this.f73879d;
        if (loginUI.f73415s.f73194x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        j45.l.h(loginUI, "login_exdevice", ".ui.LoginAsExDeviceUI");
        loginUI.overridePendingTransition(com.tencent.mm.R.anim.f477810c4, com.tencent.mm.R.anim.f477728p);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.J(1570L, 2L);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
