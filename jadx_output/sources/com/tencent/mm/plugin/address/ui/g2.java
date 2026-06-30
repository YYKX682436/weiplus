package com.tencent.mm.plugin.address.ui;

/* loaded from: classes.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74550d;

    public g2(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74550d = walletAddAddressUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74550d;
        android.widget.TextView textView = walletAddAddressUI.f74477v;
        if (textView == null) {
            kotlin.jvm.internal.o.o("addrCapturePasteRecognizeTV");
            throw null;
        }
        textView.performClick();
        com.tencent.mm.ui.widget.MMEditText mMEditText = walletAddAddressUI.f74474s;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("addrCaptureET");
            throw null;
        }
        android.text.Editable text = mMEditText.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        if (text.length() > 0) {
            android.widget.LinearLayout linearLayout = walletAddAddressUI.f74473r;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("addrCaptureContainer");
                throw null;
            }
            linearLayout.setVisibility(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
