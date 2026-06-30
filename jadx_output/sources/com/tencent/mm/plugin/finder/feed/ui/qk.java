package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class qk implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSettingGameRankUI f110460d;

    public qk(com.tencent.mm.plugin.finder.feed.ui.FinderSettingGameRankUI finderSettingGameRankUI) {
        this.f110460d = finderSettingGameRankUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110460d.finish();
        return true;
    }
}
