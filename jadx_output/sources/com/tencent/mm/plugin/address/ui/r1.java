package com.tencent.mm.plugin.address.ui;

/* loaded from: classes.dex */
public final class r1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74618d;

    public r1(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74618d = walletAddAddressUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f74618d.f74474s;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("addrCaptureET");
            throw null;
        }
        mMEditText.setText("");
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
