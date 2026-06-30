package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class mh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI f110310d;

    public mh(com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI finderPoiManageUI) {
        this.f110310d = finderPoiManageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110310d.finish();
        return true;
    }
}
