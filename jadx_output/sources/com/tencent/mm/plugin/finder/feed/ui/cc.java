package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class cc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI f109750d;

    public cc(com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI) {
        this.f109750d = finderLivePrecheckLicenseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI.I;
        this.f109750d.e7();
        return true;
    }
}
