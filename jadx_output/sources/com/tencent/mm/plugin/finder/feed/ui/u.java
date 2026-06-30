package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class u implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI f110588d;

    public u(com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI) {
        this.f110588d = finderAlbumTimelineUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI.L;
        com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI = this.f110588d;
        finderAlbumTimelineUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) finderAlbumTimelineUI, 0, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.feed.ui.n(finderAlbumTimelineUI);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.feed.ui.o(finderAlbumTimelineUI);
        k0Var.f211854d = new com.tencent.mm.plugin.finder.feed.ui.p(finderAlbumTimelineUI);
        k0Var.v();
        return true;
    }
}
