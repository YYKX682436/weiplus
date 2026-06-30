package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class gh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPlayListUI f110088d;

    public gh(com.tencent.mm.plugin.finder.feed.ui.FinderPlayListUI finderPlayListUI) {
        this.f110088d = finderPlayListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110088d.finish();
        return true;
    }
}
