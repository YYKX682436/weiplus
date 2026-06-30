package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class mo implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI28 f110316d;

    public mo(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI28 occupyFinderUI28) {
        this.f110316d = occupyFinderUI28;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110316d.finish();
        return false;
    }
}
