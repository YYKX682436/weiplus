package com.tencent.mm.plugin.account.ui;

/* loaded from: classes13.dex */
public class a7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginSmsUI f73712d;

    public a7(com.tencent.mm.plugin.account.ui.LoginSmsUI loginSmsUI) {
        this.f73712d = loginSmsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginSmsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginSmsUI loginSmsUI = this.f73712d;
        if (loginSmsUI.f73327f.f73194x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginSmsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        loginSmsUI.i7();
        loginSmsUI.Z6();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginSmsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
