package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class qj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.WelcomeActivity f74151d;

    public qj(com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity) {
        this.f74151d = welcomeActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/WelcomeActivity$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity = this.f74151d;
        com.tencent.mm.plugin.account.ui.WelcomeActivity.S6(welcomeActivity);
        com.tencent.mm.plugin.account.ui.GateWayMobileUI.f73277p.a(welcomeActivity, new android.content.Intent(welcomeActivity, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.class));
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
