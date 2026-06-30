package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class mb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI f110302d;

    public mb(com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI finderLivePostSecurityUI) {
        this.f110302d = finderLivePostSecurityUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110302d.finish();
        return true;
    }
}
