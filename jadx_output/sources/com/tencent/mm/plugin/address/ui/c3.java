package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class c3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletSelectAddrUI f74529d;

    public c3(com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI) {
        this.f74529d = walletSelectAddrUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI = this.f74529d;
        java.lang.String string = walletSelectAddrUI.getString(com.tencent.mm.R.string.f489936fz, walletSelectAddrUI.f74498q.toString());
        com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI2 = this.f74529d;
        db5.e1.K(walletSelectAddrUI, true, string, "", walletSelectAddrUI2.getString(com.tencent.mm.R.string.f489937g0), walletSelectAddrUI2.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.address.ui.b3(this), null);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
