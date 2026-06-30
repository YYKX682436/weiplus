package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class lh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI f110276d;

    public lh(com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI finderPoiAddGuideUI) {
        this.f110276d = finderPoiAddGuideUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110276d.finish();
        return true;
    }
}
