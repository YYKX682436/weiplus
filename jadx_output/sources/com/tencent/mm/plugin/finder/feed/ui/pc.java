package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class pc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveReservedRecordUI f110418d;

    public pc(com.tencent.mm.plugin.finder.feed.ui.FinderLiveReservedRecordUI finderLiveReservedRecordUI) {
        this.f110418d = finderLiveReservedRecordUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110418d.onBackPressed();
        return true;
    }
}
