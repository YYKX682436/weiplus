package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class y6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginSmsUI f74336d;

    public y6(com.tencent.mm.plugin.account.ui.LoginSmsUI loginSmsUI) {
        this.f74336d = loginSmsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginSmsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginSmsUI loginSmsUI = this.f74336d;
        java.lang.String str = loginSmsUI.f73345y;
        int i17 = com.tencent.mm.plugin.account.ui.LoginSmsUI.f73395p1;
        loginSmsUI.m7(str);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginSmsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
