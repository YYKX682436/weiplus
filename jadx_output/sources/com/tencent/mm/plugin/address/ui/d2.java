package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public final class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74534d;

    public d2(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74534d = walletAddAddressUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Map map = com.tencent.mm.plugin.address.ui.WalletAddAddressUI.H;
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74534d;
        if (!walletAddAddressUI.X6()) {
            yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        s71.b W6 = walletAddAddressUI.W6();
        o71.l.Bi().i();
        if (walletAddAddressUI.f74462d != 0) {
            kotlinx.coroutines.l.d(v65.m.b(walletAddAddressUI), null, null, new q71.d0(com.tencent.mm.plugin.address.ui.WalletAddAddressUI.U6(walletAddAddressUI, W6), new com.tencent.mm.plugin.address.ui.b2(walletAddAddressUI), null), 3, null);
        } else {
            kotlinx.coroutines.l.d(v65.m.b(walletAddAddressUI), null, null, new q71.a0(com.tencent.mm.plugin.address.ui.WalletAddAddressUI.U6(walletAddAddressUI, W6), new com.tencent.mm.plugin.address.ui.c2(walletAddAddressUI), null), 3, null);
        }
        com.tencent.mm.ui.widget.button.WeButton weButton = walletAddAddressUI.D;
        if (weButton == null) {
            kotlin.jvm.internal.o.o("addrFinish");
            throw null;
        }
        weButton.setEnabled(false);
        walletAddAddressUI.F = com.tencent.mm.ui.widget.dialog.u3.f(walletAddAddressUI.getContext(), walletAddAddressUI.getString(com.tencent.mm.R.string.meq), false, 3, null);
        com.tencent.mm.plugin.report.service.b1.f(4, 7);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
