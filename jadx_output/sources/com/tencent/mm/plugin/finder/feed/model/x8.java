package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class x8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f108462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f108464f;

    public x8(int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader) {
        this.f108462d = i17;
        this.f108463e = baseFinderFeed;
        this.f108464f = finderTimelineFeedLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ym5.s3 s3Var = new ym5.s3(this.f108462d);
        s3Var.f463517b = 1;
        s3Var.f463522g = true;
        s3Var.f463521f = true;
        s3Var.f463525j = false;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = new com.tencent.mm.plugin.finder.feed.model.internal.y0(4, kz5.b0.c(this.f108463e), false, null, 12, null);
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f108464f;
        if (finderTimelineFeedLoader.f107657p) {
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.w8(finderTimelineFeedLoader, y0Var, s3Var));
    }
}
