package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class o7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI f110365d;

    public o7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI finderLiveAnchorCreateVoteUI) {
        this.f110365d = finderLiveAnchorCreateVoteUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI finderLiveAnchorCreateVoteUI = this.f110365d;
        java.lang.String stringExtra = finderLiveAnchorCreateVoteUI.getIntent().getStringExtra("finderlivecreateparamusername");
        long longExtra = finderLiveAnchorCreateVoteUI.getIntent().getLongExtra("finderlivecreateparamobjectid", 0L);
        pq5.g l17 = new ly2.c(stringExtra, null, longExtra).l();
        l17.K(new com.tencent.mm.plugin.finder.feed.ui.n7(finderLiveAnchorCreateVoteUI, stringExtra, longExtra));
        l17.f(finderLiveAnchorCreateVoteUI);
        return true;
    }
}
