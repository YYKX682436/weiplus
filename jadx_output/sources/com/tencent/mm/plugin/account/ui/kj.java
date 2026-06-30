package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class kj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.WelcomeActivity f73990d;

    public kj(com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity) {
        this.f73990d = welcomeActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/WelcomeActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("not_auth_setting", true);
        intent.putExtra("from_login_history", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.getClass();
        com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity = this.f73990d;
        if (welcomeActivity != null) {
            j45.l.j(welcomeActivity, "setting", ".ui.setting.SettingsLanguageUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
