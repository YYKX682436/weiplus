package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f73876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f73877e;

    public g5(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f73877e = loginHistoryUI;
        this.f73876d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = this.f73877e;
        if (loginHistoryUI.f73327f.f73194x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        loginHistoryUI.hideVKB();
        if (loginHistoryUI.e7()) {
            q61.j.g(1, 0);
        }
        this.f73876d.v();
        v61.d.g("other_verify_login", 1);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
