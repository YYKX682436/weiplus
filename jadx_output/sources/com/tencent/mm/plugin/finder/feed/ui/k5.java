package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class k5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI f110213d;

    public k5(com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI) {
        this.f110213d = finderHorizontalVideoHalfFeedUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110213d.onBackPressed();
        return true;
    }
}
