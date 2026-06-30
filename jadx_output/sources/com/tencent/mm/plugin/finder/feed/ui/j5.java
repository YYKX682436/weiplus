package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class j5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI f110175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f110176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f110177f;

    public j5(com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI, com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f110175d = finderHorizontalVideoHalfFeedUI;
        this.f110176e = finderLinearLayoutManager;
        this.f110177f = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long longExtra = this.f110175d.getContext().getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0L);
        if (longExtra > 0) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.feed.ui.i5(this.f110176e, this.f110177f, longExtra));
        }
    }
}
