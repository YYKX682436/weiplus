package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class wi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI f110701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f110702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f110703f;

    public wi(com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI finderProfileTimeLineUI, com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f110701d = finderProfileTimeLineUI;
        this.f110702e = finderLinearLayoutManager;
        this.f110703f = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI finderProfileTimeLineUI = this.f110701d;
        long longExtra = finderProfileTimeLineUI.getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0L);
        float floatExtra = finderProfileTimeLineUI.getIntent().getFloatExtra("KEY_VIDEO_PLAY_SPEED_RATIO", 1.0f);
        boolean z17 = !finderProfileTimeLineUI.getIntent().getBooleanExtra("KEY_VIDEO_IS_PAUSE", false);
        boolean booleanExtra = finderProfileTimeLineUI.getIntent().getBooleanExtra("KEY_VIDEO_CLEAR_VIDEO_CACHE", false);
        if (longExtra > 0 || booleanExtra) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.feed.ui.vi(this.f110702e, this.f110703f, this.f110701d, longExtra, floatExtra, z17));
        }
    }
}
