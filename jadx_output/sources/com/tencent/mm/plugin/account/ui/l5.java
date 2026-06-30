package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class l5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f74003d;

    public l5(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f74003d = loginHistoryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = this.f74003d;
        if (loginHistoryUI.f73327f.f73194x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if ((loginHistoryUI instanceof com.tencent.mm.plugin.account.ui.LoginPasswordUI) || (loginHistoryUI instanceof com.tencent.mm.plugin.account.ui.LoginSmsUI)) {
            loginHistoryUI.getClass();
            v61.d.g("login_forget_password", 1);
        }
        com.tencent.mm.plugin.account.ui.LoginHistoryUI.k7(loginHistoryUI, loginHistoryUI.getString(com.tencent.mm.R.string.mtg) + com.tencent.mm.sdk.platformtools.m2.d());
        v61.d.f(1);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
