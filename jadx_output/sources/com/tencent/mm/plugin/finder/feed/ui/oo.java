package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class oo implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI29 f110387d;

    public oo(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI29 occupyFinderUI29) {
        this.f110387d = occupyFinderUI29;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110387d.finish();
        return false;
    }
}
