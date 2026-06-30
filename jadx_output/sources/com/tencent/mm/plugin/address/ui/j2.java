package com.tencent.mm.plugin.address.ui;

/* loaded from: classes10.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74567d;

    public j2(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74567d = walletAddAddressUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74567d;
        com.tencent.mm.plugin.address.ui.MMScrollView mMScrollView = walletAddAddressUI.f74469n;
        if (mMScrollView == null) {
            kotlin.jvm.internal.o.o("addrContainerSV");
            throw null;
        }
        int height = mMScrollView.getChildAt(0).getHeight();
        com.tencent.mm.plugin.address.ui.MMScrollView mMScrollView2 = walletAddAddressUI.f74469n;
        if (mMScrollView2 == null) {
            kotlin.jvm.internal.o.o("addrContainerSV");
            throw null;
        }
        int max = java.lang.Math.max(0, height - mMScrollView2.getHeight());
        com.tencent.mm.plugin.address.ui.MMScrollView mMScrollView3 = walletAddAddressUI.f74469n;
        if (mMScrollView3 != null) {
            mMScrollView3.smoothScrollTo(0, max);
        } else {
            kotlin.jvm.internal.o.o("addrContainerSV");
            throw null;
        }
    }
}
