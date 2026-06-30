package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class j3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI f110173d;

    public j3(com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI finderFriendLikeTimelineUI) {
        this.f110173d = finderFriendLikeTimelineUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI.E;
        com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI finderFriendLikeTimelineUI = this.f110173d;
        finderFriendLikeTimelineUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) finderFriendLikeTimelineUI, 1, false);
        k0Var.f211872n = com.tencent.mm.plugin.finder.feed.ui.l3.f110255d;
        k0Var.f211881s = new com.tencent.mm.plugin.finder.feed.ui.m3(finderFriendLikeTimelineUI);
        k0Var.v();
        return true;
    }
}
