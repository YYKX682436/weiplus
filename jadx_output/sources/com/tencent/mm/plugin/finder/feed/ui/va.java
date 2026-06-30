package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class va implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveMoreOptionSettingUI f110646d;

    public va(com.tencent.mm.plugin.finder.feed.ui.FinderLiveMoreOptionSettingUI finderLiveMoreOptionSettingUI) {
        this.f110646d = finderLiveMoreOptionSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110646d.onBackPressed();
        return true;
    }
}
