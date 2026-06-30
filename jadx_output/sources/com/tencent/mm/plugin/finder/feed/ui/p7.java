package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class p7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI f110412d;

    public p7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI finderLiveAnchorCreateVoteUI) {
        this.f110412d = finderLiveAnchorCreateVoteUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI finderLiveAnchorCreateVoteUI = this.f110412d;
        finderLiveAnchorCreateVoteUI.hideVKB();
        finderLiveAnchorCreateVoteUI.finish();
        finderLiveAnchorCreateVoteUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
        return true;
    }
}
