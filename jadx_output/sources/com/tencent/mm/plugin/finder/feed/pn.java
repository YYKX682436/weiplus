package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class pn implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.rn f108737d;

    public pn(com.tencent.mm.plugin.finder.feed.rn rnVar) {
        this.f108737d = rnVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 10002, 0, this.f108737d.f108928d.getString(com.tencent.mm.R.string.eu9));
    }
}
