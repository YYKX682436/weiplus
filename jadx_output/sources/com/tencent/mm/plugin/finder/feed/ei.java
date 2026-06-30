package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes9.dex */
public final class ei implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.li f106655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f106656e;

    public ei(com.tencent.mm.plugin.finder.feed.li liVar, android.view.View view) {
        this.f106655d = liVar;
        this.f106656e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(1, this.f106655d.f107305r, 0, this.f106656e.getResources().getString(com.tencent.mm.R.string.ev_));
    }
}
