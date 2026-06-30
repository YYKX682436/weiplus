package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class ra implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionSettingUI f110489d;

    public ra(com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionSettingUI finderLiveMentionSettingUI) {
        this.f110489d = finderLiveMentionSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionSettingUI.f109383d;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionSettingUI finderLiveMentionSettingUI = this.f110489d;
        if (finderLiveMentionSettingUI.isFinishing()) {
            return true;
        }
        finderLiveMentionSettingUI.finish();
        return true;
    }
}
