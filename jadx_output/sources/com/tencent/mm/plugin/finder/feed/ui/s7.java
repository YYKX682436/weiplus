package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class s7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorSettingUI f110526d;

    public s7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorSettingUI finderLiveAnchorSettingUI) {
        this.f110526d = finderLiveAnchorSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110526d.onBackPressed();
        return true;
    }
}
