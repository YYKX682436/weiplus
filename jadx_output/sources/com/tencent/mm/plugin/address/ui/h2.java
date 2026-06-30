package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public final class h2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74555d;

    public h2(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74555d = walletAddAddressUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable == null) {
            return;
        }
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74555d;
        android.widget.TextView textView = walletAddAddressUI.f74475t;
        if (textView == null) {
            kotlin.jvm.internal.o.o("addrCaptureClearTV");
            throw null;
        }
        textView.setVisibility(editable.length() > 0 ? 0 : 8);
        android.widget.TextView textView2 = walletAddAddressUI.f74476u;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("addrCaptureRecognizeTV");
            throw null;
        }
        textView2.setVisibility(editable.length() > 0 ? 0 : 8);
        android.widget.TextView textView3 = walletAddAddressUI.f74477v;
        if (textView3 != null) {
            textView3.setVisibility(editable.length() == 0 ? 0 : 8);
        } else {
            kotlin.jvm.internal.o.o("addrCapturePasteRecognizeTV");
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
