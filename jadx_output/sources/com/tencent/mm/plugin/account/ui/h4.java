package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginFastSwitchUI f73901d;

    public h4(com.tencent.mm.plugin.account.ui.LoginFastSwitchUI loginFastSwitchUI) {
        this.f73901d = loginFastSwitchUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginFastSwitchUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.LoginFastSwitchUI loginFastSwitchUI = this.f73901d;
        loginFastSwitchUI.getClass();
        q61.j.e(q61.j.f360268h, 2, 2, 2, 0);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        loginFastSwitchUI.U6("自己取消", bool, bool);
        q61.j.h();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginFastSwitchUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
