package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class w8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f108434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var) {
        super(0);
        this.f108434d = finderTimelineFeedLoader;
        this.f108435e = y0Var;
        this.f108436f = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f108434d;
        finderTimelineFeedLoader.f107658q = true;
        com.tencent.mm.plugin.finder.feed.model.internal.a0 merger = finderTimelineFeedLoader.getMerger();
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f108435e;
        com.tencent.mm.plugin.finder.feed.model.internal.u0 mergeDataAndNotify = merger.mergeDataAndNotify(y0Var.f108070a, y0Var.f108071b, y0Var.f108072c, y0Var.f108073d);
        ym5.s3 s3Var = this.f108436f;
        s3Var.f463519d = mergeDataAndNotify;
        s3Var.f463523h = mergeDataAndNotify.f108053b;
        s3Var.f463527l = y0Var.f108070a;
        finderTimelineFeedLoader.getDispatcher().g(s3Var);
        return jz5.f0.f302826a;
    }
}
