package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class aw extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.cw f106327a;

    public aw(com.tencent.mm.plugin.finder.feed.cw cwVar) {
        this.f106327a = cwVar;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mm.plugin.finder.feed.xv xvVar = (com.tencent.mm.plugin.finder.feed.xv) this.f106327a.f106506e;
        r45.r03 r03Var = xvVar.f111113o;
        if (r03Var == null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(xvVar.f111114p, false, 1, null);
            return;
        }
        java.util.Objects.toString(r03Var);
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = xvVar.f111105d;
        r45.r03 r03Var2 = xvVar.f111113o;
        finderFeedRelTimelineLoader.f107419g = r03Var2 != null ? r03Var2.getString(0) : null;
        finderFeedRelTimelineLoader.f107420h = 1;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(finderFeedRelTimelineLoader, false, 1, null);
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.tencent.mm.plugin.finder.feed.xv xvVar = (com.tencent.mm.plugin.finder.feed.xv) this.f106327a.f106506e;
        r45.r03 r03Var = xvVar.f111113o;
        if (r03Var == null) {
            xvVar.f111114p.requestRefresh();
            return;
        }
        java.util.Objects.toString(r03Var);
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = xvVar.f111105d;
        r45.r03 r03Var2 = xvVar.f111113o;
        finderFeedRelTimelineLoader.f107419g = r03Var2 != null ? r03Var2.getString(0) : null;
        finderFeedRelTimelineLoader.f107420h = 1;
        finderFeedRelTimelineLoader.requestRefresh();
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.xv xvVar = (com.tencent.mm.plugin.finder.feed.xv) this.f106327a.f106506e;
        xvVar.getClass();
        if (reason.f463523h <= 0) {
            ((com.tencent.mm.plugin.finder.feed.cw) xvVar.c()).j().W(com.tencent.mm.plugin.finder.storage.t70.f127590a.Q1(), com.tencent.mm.plugin.finder.feed.sv.f109010d);
        }
    }
}
