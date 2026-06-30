package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class pk implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryUI f110426d;

    public pk(com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryUI finderSelfHistoryUI) {
        this.f110426d = finderSelfHistoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110426d.finish();
        return true;
    }
}
