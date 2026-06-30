package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class yd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileVerifyUI f74344d;

    public yd(com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI) {
        this.f74344d = mobileVerifyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = this.f74344d;
        if (mobileVerifyUI.f73533p) {
            mobileVerifyUI.T6();
        } else {
            mobileVerifyUI.f73524d.a();
            mobileVerifyUI.f73538u.a(com.tencent.mm.plugin.account.ui.fe.DoSend);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
