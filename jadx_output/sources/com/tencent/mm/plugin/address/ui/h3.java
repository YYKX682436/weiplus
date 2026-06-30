package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class h3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletSelectAddrUI f74556d;

    public h3(com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI) {
        this.f74556d = walletSelectAddrUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI = this.f74556d;
        hashMap.put("enter_scene_address", java.lang.Integer.valueOf(walletSelectAddrUI.f74503v));
        hashMap.put("page_state", java.lang.Integer.valueOf(walletSelectAddrUI.f74505x ? 2 : 1));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("add_address", "view_clk", hashMap, 33328);
        walletSelectAddrUI.U6(0, 1);
        return true;
    }
}
