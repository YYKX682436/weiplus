package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class dk implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSelectIdentityUI f109949d;

    public dk(com.tencent.mm.plugin.finder.feed.ui.FinderSelectIdentityUI finderSelectIdentityUI) {
        this.f109949d = finderSelectIdentityUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f109949d.onBackPressed();
        return true;
    }
}
