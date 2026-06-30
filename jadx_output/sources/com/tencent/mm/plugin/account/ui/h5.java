package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f73902d;

    public h5(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f73902d = loginHistoryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = this.f73902d;
        if (loginHistoryUI.f73327f.f73194x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        loginHistoryUI.hideVKB();
        if (fp.h.c(31)) {
            android.view.View decorView = loginHistoryUI.getWindow().getDecorView();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.b1.a(decorView).f(8)) {
                loginHistoryUI.U = true;
                yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        loginHistoryUI.f7(((db5.h4) ((java.util.ArrayList) loginHistoryUI.V).get(0)).f228366g);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
