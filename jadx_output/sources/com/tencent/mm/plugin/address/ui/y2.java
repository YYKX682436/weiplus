package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public class y2 implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletSelectAddrUI f74650a;

    public y2(com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI) {
        this.f74650a = walletSelectAddrUI;
    }

    @Override // android.view.View.OnScrollChangeListener
    public void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI = this.f74650a;
        if (i18 == 0) {
            walletSelectAddrUI.hideActionbarLine();
        } else {
            walletSelectAddrUI.showActionbarLine();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}
