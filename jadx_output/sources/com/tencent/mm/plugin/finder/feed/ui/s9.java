package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class s9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveGiftPkgUI f110528d;

    public s9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveGiftPkgUI finderLiveGiftPkgUI) {
        this.f110528d = finderLiveGiftPkgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110528d.finish();
        return true;
    }
}
