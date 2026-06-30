package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class p9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI f110414d;

    public p9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI finderLiveFansListUI) {
        this.f110414d = finderLiveFansListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110414d.finish();
        return true;
    }
}
