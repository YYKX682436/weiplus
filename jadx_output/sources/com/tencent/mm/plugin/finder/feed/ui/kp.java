package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class kp implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 f110247d;

    public kp(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI39) {
        this.f110247d = occupyFinderUI39;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110247d.finish();
        return true;
    }
}
