package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.i1 f260298d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.i1 i1Var) {
        this.f260298d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.i1 i1Var = this.f260298d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i1Var.f260304a.f260307d.f260245d, "Balance amount not meet, after favor selection! payWithNewBankcard");
        i1Var.f260304a.f260307d.n7(false, 0, "");
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
