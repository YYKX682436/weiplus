package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class x7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI f110725d;

    public x7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI finderLiveBizListUI) {
        this.f110725d = finderLiveBizListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110725d.finish();
        return true;
    }
}
