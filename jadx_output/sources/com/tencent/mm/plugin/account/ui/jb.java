package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class jb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.sa f73958d;

    public jb(com.tencent.mm.plugin.account.ui.sa saVar) {
        this.f73958d = saVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.sa saVar = this.f73958d;
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = saVar.f74188d;
        mobileInputUI.L[1] = 2;
        mobileInputUI.H = 7;
        mobileInputUI.f73483h.b();
        gm0.j1.d().q(145, saVar);
        saVar.f();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
