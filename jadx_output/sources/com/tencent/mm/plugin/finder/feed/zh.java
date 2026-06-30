package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class zh extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f111266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.li f111267b;

    public zh(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, com.tencent.mm.plugin.finder.feed.li liVar) {
        this.f111266a = refreshLoadMoreLayout;
        this.f111267b = liVar;
    }

    @Override // ym5.q3
    public void b(int i17) {
        this.f111267b.f107294d.c();
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        this.f111266a.getRecyclerView().setItemAnimator(new androidx.recyclerview.widget.z());
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f111266a;
        com.tencent.mm.view.RefreshLoadMoreLayout.u(refreshLoadMoreLayout, null, 1, null);
        refreshLoadMoreLayout.getRecyclerView().postDelayed(new com.tencent.mm.plugin.finder.feed.yh(refreshLoadMoreLayout), 1000L);
    }
}
