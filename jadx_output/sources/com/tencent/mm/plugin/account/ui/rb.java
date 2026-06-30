package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class rb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileInputUI f74166d;

    public rb(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI) {
        this.f74166d = mobileInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileInputUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.tencent.mm.sdk.platformtools.x9.b()) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74166d;
            intent.putExtra("country_name", mobileInputUI.C);
            intent.putExtra("couttry_code", mobileInputUI.D);
            intent.putExtra("iso_code", mobileInputUI.E);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.o(intent, mobileInputUI, 100);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileInputUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
