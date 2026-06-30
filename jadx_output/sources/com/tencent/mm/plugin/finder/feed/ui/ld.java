package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ld implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI f110269d;

    public ld(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI finderLiveVisitorRoleUI) {
        this.f110269d = finderLiveVisitorRoleUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110269d.onBackPressed();
        return true;
    }
}
