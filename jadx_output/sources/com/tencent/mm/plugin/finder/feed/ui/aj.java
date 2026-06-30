package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class aj implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI f109679d;

    public aj(com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI finderProfileTimeLineUI) {
        this.f109679d = finderProfileTimeLineUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI.R;
        this.f109679d.e7();
        return true;
    }
}
