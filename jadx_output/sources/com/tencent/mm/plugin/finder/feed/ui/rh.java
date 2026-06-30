package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class rh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI f110502d;

    public rh(com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI finderPoiRelateListUI) {
        this.f110502d = finderPoiRelateListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110502d.finish();
        return true;
    }
}
