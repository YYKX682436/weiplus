package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class e9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI f109973d;

    public e9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI) {
        this.f109973d = finderLiveDelManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI.f109360m;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI = this.f109973d;
        finderLiveDelManagerUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        bm2.m2 m2Var = finderLiveDelManagerUI.f109361d;
        intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(m2Var.x(), ","));
        finderLiveDelManagerUI.setResult(-1, intent);
        finderLiveDelManagerUI.finish();
        finderLiveDelManagerUI.T6();
        m2Var.notifyDataSetChanged();
        return true;
    }
}
