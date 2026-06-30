package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class w6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLikeFeedGridUI f110687d;

    public w6(com.tencent.mm.plugin.finder.feed.ui.FinderLikeFeedGridUI finderLikeFeedGridUI) {
        this.f110687d = finderLikeFeedGridUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110687d.onBackPressed();
        return true;
    }
}
