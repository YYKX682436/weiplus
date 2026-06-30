package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class ro implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 f110510d;

    public ro(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 occupyFinderUI31) {
        this.f110510d = occupyFinderUI31;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110510d.finish();
        return true;
    }
}
