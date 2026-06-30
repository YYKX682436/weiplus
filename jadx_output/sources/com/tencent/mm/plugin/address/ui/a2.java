package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public final class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74518d;

    public a2(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74518d = walletAddAddressUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("couttry_code", "86");
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.o(intent, this.f74518d, 100);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
