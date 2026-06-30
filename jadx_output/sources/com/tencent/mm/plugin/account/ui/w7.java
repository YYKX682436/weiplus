package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class w7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f74293d;

    public w7(com.tencent.mm.plugin.account.ui.LoginUI loginUI) {
        this.f74293d = loginUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginUI loginUI = this.f74293d;
        if (loginUI.f73415s.f73194x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (fp.h.c(31)) {
            android.view.View decorView = loginUI.getWindow().getDecorView();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.b1.a(decorView).f(8)) {
                loginUI.hideVKB();
                loginUI.f73422z = java.lang.Boolean.TRUE;
                yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        loginUI.W6();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
