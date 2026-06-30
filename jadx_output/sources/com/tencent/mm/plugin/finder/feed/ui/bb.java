package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class bb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePersonalCenterUI f109702d;

    public bb(com.tencent.mm.plugin.finder.feed.ui.FinderLivePersonalCenterUI finderLivePersonalCenterUI) {
        this.f109702d = finderLivePersonalCenterUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f109702d.onBackPressed();
        return true;
    }
}
