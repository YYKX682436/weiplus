package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class ma implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileInputUI f74041d;

    public ma(com.tencent.mm.plugin.account.ui.ra raVar, com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI) {
        this.f74041d = mobileInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileInputRegLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74041d;
        c71.b.c(mobileInputUI, mobileInputUI.getString(com.tencent.mm.R.string.k4f, com.tencent.mm.sdk.platformtools.m2.d(), u11.b.d(mobileInputUI.D)), 0, false);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileInputRegLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
