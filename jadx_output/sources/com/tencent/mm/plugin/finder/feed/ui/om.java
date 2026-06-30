package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class om implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI f110383d;

    public om(com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI finderTimelineLbsUI) {
        this.f110383d = finderTimelineLbsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110383d.finish();
        return true;
    }
}
