package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ef implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI f109982d;

    public ef(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI finderLiveVoteHistoryUI) {
        this.f109982d = finderLiveVoteHistoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI finderLiveVoteHistoryUI = this.f109982d;
        finderLiveVoteHistoryUI.finish();
        finderLiveVoteHistoryUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
        return true;
    }
}
