package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class k4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI f110212d;

    public k4(com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI finderGalleryUI) {
        this.f110212d = finderGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI finderGalleryUI = this.f110212d;
        finderGalleryUI.c7().j();
        finderGalleryUI.finish();
        return true;
    }
}
