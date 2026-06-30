package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class fb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePostPendingUI f110011d;

    public fb(com.tencent.mm.plugin.finder.feed.ui.FinderLivePostPendingUI finderLivePostPendingUI) {
        this.f110011d = finderLivePostPendingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110011d.finish();
        return true;
    }
}
