package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class j4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f73947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f73948e;

    public j4(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f73948e = loginHistoryUI;
        this.f73947d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = this.f73948e;
        if (loginHistoryUI.f73327f.f73194x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        loginHistoryUI.hideVKB();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f73947d;
        k0Var.v();
        v61.d.h("login_other_account", 1);
        db5.g4 g4Var = k0Var.L;
        if (g4Var.findItem(7003) != null) {
            v61.d.h("register_account", 1);
        }
        if (g4Var.findItem(7011) != null) {
            v61.d.h("export_chat_history_login", 1);
        }
        if (g4Var.findItem(7004) != null) {
            v61.d.h("security_center_login", 1);
        }
        if (g4Var.findItem(7012) != null) {
            v61.d.h("frozen_account_login", 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
