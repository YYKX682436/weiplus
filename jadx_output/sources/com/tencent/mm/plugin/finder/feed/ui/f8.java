package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class f8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI f110008d;

    public f8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI finderLiveBizSearchUI) {
        this.f110008d = finderLiveBizSearchUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110008d.finish();
        return true;
    }
}
