package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public class f3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletSelectAddrUI f74547d;

    public f3(com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI) {
        this.f74547d = walletSelectAddrUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.B;
        this.f74547d.U6(0, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
