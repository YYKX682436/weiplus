package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes5.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 f260302d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 activityC19031x1cc5b0e9) {
        this.f260302d = activityC19031x1cc5b0e9;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletChangeBankcardUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f260302d.dispatchKeyEvent(new android.view.KeyEvent(1, 4));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletChangeBankcardUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
