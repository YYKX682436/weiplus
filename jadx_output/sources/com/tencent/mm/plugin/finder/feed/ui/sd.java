package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class sd implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI f110532d;

    public sd(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI finderLiveVisitorRoleUI) {
        this.f110532d = finderLiveVisitorRoleUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI finderLiveVisitorRoleUI = this.f110532d;
        kotlinx.coroutines.l.d(finderLiveVisitorRoleUI.f109422x, null, null, new com.tencent.mm.plugin.finder.feed.ui.rd(finderLiveVisitorRoleUI, null), 3, null);
        return true;
    }
}
