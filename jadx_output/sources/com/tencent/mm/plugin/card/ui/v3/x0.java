package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class x0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95402d;

    public x0(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI) {
        this.f95402d = vipCardListUI;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f95402d.getString(com.tencent.mm.R.string.f490367t0));
    }
}
