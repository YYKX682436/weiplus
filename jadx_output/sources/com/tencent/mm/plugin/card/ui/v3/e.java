package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes8.dex */
public final class e implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95309d;

    public e(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI) {
        this.f95309d = cardHomePageV3UI;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f95309d.getString(com.tencent.mm.R.string.f490794at4));
    }
}
