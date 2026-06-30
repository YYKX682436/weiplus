package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class sg implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI f110535d;

    public sg(com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI finderNewManagementUI) {
        this.f110535d = finderNewManagementUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110535d.onBackPressed();
        return true;
    }
}
