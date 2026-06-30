package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class sc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelfLotteryHistoryResultUI f110531d;

    public sc(com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelfLotteryHistoryResultUI finderLiveSelfLotteryHistoryResultUI) {
        this.f110531d = finderLiveSelfLotteryHistoryResultUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110531d.onBackPressed();
        return true;
    }
}
