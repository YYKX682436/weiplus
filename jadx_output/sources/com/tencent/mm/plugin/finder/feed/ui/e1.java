package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class e1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI f109963d;

    public e1(com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI finderBaseGridFeedUI) {
        this.f109963d = finderBaseGridFeedUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f109963d.onBackPressed();
        return true;
    }
}
