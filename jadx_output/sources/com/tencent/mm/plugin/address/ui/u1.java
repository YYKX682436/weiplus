package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public final class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74630d;

    public u1(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74630d = walletAddAddressUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.CharSequence a17 = com.tencent.mm.sdk.platformtools.b0.a();
        kotlin.jvm.internal.o.f(a17, "getText(...)");
        int length = a17.length();
        if (120 <= length) {
            length = 120;
        }
        java.lang.CharSequence subSequence = a17.subSequence(0, length);
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74630d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = walletAddAddressUI.f74474s;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("addrCaptureET");
            throw null;
        }
        mMEditText.setText(subSequence);
        android.widget.TextView textView = walletAddAddressUI.f74476u;
        if (textView == null) {
            kotlin.jvm.internal.o.o("addrCaptureRecognizeTV");
            throw null;
        }
        textView.performClick();
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
