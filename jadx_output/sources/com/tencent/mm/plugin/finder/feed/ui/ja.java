package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class ja implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI f110184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f110185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f110186f;

    public ja(com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI finderLiveKTVReplayUI, java.util.List list, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f110184d = finderLiveKTVReplayUI;
        this.f110185e = list;
        this.f110186f = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            int i18 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI.D;
            this.f110184d.d7(this.f110185e);
        }
        this.f110186f.u();
    }
}
