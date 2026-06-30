package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class z9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI f110796d;

    public z9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI finderLiveHistoryUI) {
        this.f110796d = finderLiveHistoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110796d.finish();
        return true;
    }
}
