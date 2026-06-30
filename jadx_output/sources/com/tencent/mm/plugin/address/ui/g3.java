package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class g3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletSelectAddrUI f74551d;

    public g3(com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI) {
        this.f74551d = walletSelectAddrUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI = this.f74551d;
        s71.b bVar = walletSelectAddrUI.f74491g;
        if (bVar != null) {
            walletSelectAddrUI.setResult(0, t71.a.a(bVar));
        } else {
            walletSelectAddrUI.setResult(0);
        }
        walletSelectAddrUI.finish();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectAddrUI", "[setResult] Cancel, Back");
        return true;
    }
}
