package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class ba implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI f109701d;

    public ba(com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI finderLiveHistoryUI) {
        this.f109701d = finderLiveHistoryUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f109701d.f109376z;
        if (finderRefreshLayout != null) {
            finderRefreshLayout.c();
        }
    }
}
