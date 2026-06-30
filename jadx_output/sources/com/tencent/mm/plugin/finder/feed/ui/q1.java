package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class q1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFavFeedUI f110437d;

    public q1(com.tencent.mm.plugin.finder.feed.ui.FinderFavFeedUI finderFavFeedUI) {
        this.f110437d = finderFavFeedUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110437d.onBackPressed();
        return true;
    }
}
