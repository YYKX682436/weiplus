package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public final class m1 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74588a;

    public m1(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74588a = walletAddAddressUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74588a;
        if (!z17) {
            walletAddAddressUI.setResult(0);
            walletAddAddressUI.finish();
            return;
        }
        com.tencent.mm.ui.widget.button.WeButton weButton = walletAddAddressUI.D;
        if (weButton != null) {
            weButton.performClick();
        } else {
            kotlin.jvm.internal.o.o("addrFinish");
            throw null;
        }
    }
}
