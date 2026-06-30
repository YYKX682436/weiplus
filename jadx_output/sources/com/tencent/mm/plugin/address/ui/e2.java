package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public final class e2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74541d;

    public e2(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74541d = walletAddAddressUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        java.util.Map map = com.tencent.mm.plugin.address.ui.WalletAddAddressUI.H;
        this.f74541d.V6();
        return false;
    }
}
