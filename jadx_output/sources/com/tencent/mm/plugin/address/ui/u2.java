package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class u2 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletSelectAddrUI f74631a;

    public u2(com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI) {
        this.f74631a = walletSelectAddrUI;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI = this.f74631a;
        g4Var.g(1, walletSelectAddrUI.getString(com.tencent.mm.R.string.htg), com.tencent.mm.R.raw.pencil_rectangle_filled);
        if (view.findViewById(com.tencent.mm.R.id.sbg).getVisibility() == 8) {
            g4Var.g(2, walletSelectAddrUI.getString(com.tencent.mm.R.string.f489855g10), com.tencent.mm.R.raw.copy_filled);
        }
        g4Var.g(3, walletSelectAddrUI.getString(com.tencent.mm.R.string.hte), com.tencent.mm.R.raw.trash_on_filled);
    }
}
