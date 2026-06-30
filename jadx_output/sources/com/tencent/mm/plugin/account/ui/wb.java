package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class wb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileInputUI f74296d;

    public wb(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI) {
        this.f74296d = mobileInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileInputUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74296d;
        j45.l.h(mobileInputUI, "login_exdevice", ".ui.LoginAsExDeviceUI");
        mobileInputUI.overridePendingTransition(com.tencent.mm.R.anim.f477810c4, com.tencent.mm.R.anim.f477728p);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.J(1570L, 3L);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileInputUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
