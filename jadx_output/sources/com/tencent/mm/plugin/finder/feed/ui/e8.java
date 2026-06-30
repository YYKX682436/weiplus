package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class e8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizPrepareUI f109972d;

    public e8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizPrepareUI finderLiveBizPrepareUI) {
        this.f109972d = finderLiveBizPrepareUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f109972d.finish();
        return true;
    }
}
