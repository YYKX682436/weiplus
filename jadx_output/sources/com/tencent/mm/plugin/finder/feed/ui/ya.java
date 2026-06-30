package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ya implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveNormalOccupyUI3 f110763d;

    public ya(com.tencent.mm.plugin.finder.feed.ui.FinderLiveNormalOccupyUI3 finderLiveNormalOccupyUI3) {
        this.f110763d = finderLiveNormalOccupyUI3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110763d.onBackPressed();
        return true;
    }
}
