package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class l4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f74002d;

    public l4(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f74002d = loginHistoryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = this.f74002d;
        if (loginHistoryUI.f73327f.f73194x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.account.ui.LoginHistoryUI.T6(loginHistoryUI);
        v61.d.f(1);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
