package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class x8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI f110726d;

    public x8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        this.f110726d = finderLiveCreateVisitorModeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f110726d;
        finderLiveCreateVisitorModeUI.hideVKB();
        finderLiveCreateVisitorModeUI.finish();
        return true;
    }
}
