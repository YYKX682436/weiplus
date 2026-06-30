package com.tencent.mm.plugin.address.ui;

/* loaded from: classes.dex */
public final class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74651d;

    public z1(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74651d = walletAddAddressUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74651d;
        com.tencent.mm.plugin.address.ui.l1 l1Var = walletAddAddressUI.f74464f;
        if (l1Var != null) {
            kotlin.jvm.internal.o.d(l1Var);
            if (l1Var.isShowing()) {
                yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        com.tencent.mm.plugin.address.ui.l1 l1Var2 = walletAddAddressUI.f74464f;
        if (l1Var2 != null) {
            l1Var2.dismiss();
        }
        androidx.appcompat.app.AppCompatActivity context = walletAddAddressUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView = walletAddAddressUI.f74480y;
        if (addrItemView == null) {
            kotlin.jvm.internal.o.o("addrRegion");
            throw null;
        }
        java.lang.String text = addrItemView.getText();
        com.tencent.mm.plugin.address.ui.x1 x1Var = new com.tencent.mm.plugin.address.ui.x1(walletAddAddressUI);
        q71.f0 Bi = o71.l.Bi();
        kotlin.jvm.internal.o.f(Bi, "getWalletAddr(...)");
        walletAddAddressUI.f74464f = new com.tencent.mm.plugin.address.ui.l1(context, text, x1Var, Integer.MAX_VALUE, Bi, true, new com.tencent.mm.plugin.address.ui.y1(walletAddAddressUI));
        com.tencent.mm.plugin.address.ui.l1 l1Var3 = walletAddAddressUI.f74464f;
        if (l1Var3 != null) {
            l1Var3.show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
