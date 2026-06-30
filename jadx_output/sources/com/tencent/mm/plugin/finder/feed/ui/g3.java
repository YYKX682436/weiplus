package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class g3 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI f110073a;

    public g3(com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI finderFriendLikeTimelineUI) {
        this.f110073a = finderFriendLikeTimelineUI;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22010, this.f110073a.B, 1);
    }
}
