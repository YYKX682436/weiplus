package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes8.dex */
public class c9 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ViewOnClickListenerC19124xee857e0b f261711d;

    public c9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ViewOnClickListenerC19124xee857e0b viewOnClickListenerC19124xee857e0b) {
        this.f261711d = viewOnClickListenerC19124xee857e0b;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ViewOnClickListenerC19124xee857e0b viewOnClickListenerC19124xee857e0b = this.f261711d;
        at4.j1 item = viewOnClickListenerC19124xee857e0b.f261641f.getItem(i17);
        at4.j1 j1Var = viewOnClickListenerC19124xee857e0b.f261641f.f261810f;
        viewOnClickListenerC19124xee857e0b.getClass();
        if (item != null && (j1Var == null || !j1Var.f66182x601e0edb.equals(item.f66182x601e0edb))) {
            viewOnClickListenerC19124xee857e0b.f261642g = item;
            java.lang.String str = item.f66182x601e0edb;
            viewOnClickListenerC19124xee857e0b.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "doSetUserWallet walletid = " + str);
            viewOnClickListenerC19124xee857e0b.m83096xe7b1ccf7(new ss4.v(str));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
