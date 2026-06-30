package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class af implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryItemUI f109674d;

    public af(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryItemUI finderLiveVoteHistoryItemUI) {
        this.f109674d = finderLiveVoteHistoryItemUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryItemUI finderLiveVoteHistoryItemUI = this.f109674d;
        finderLiveVoteHistoryItemUI.finish();
        finderLiveVoteHistoryItemUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
        return true;
    }
}
