package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class u8 implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f109144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.w8 f109145e;

    public u8(com.tencent.mm.plugin.finder.feed.w8 w8Var) {
        this.f109145e = w8Var;
        this.f109144d = w8Var.o();
    }

    @Override // ym5.m1
    public void onChanged() {
        com.tencent.mm.plugin.finder.feed.w8 w8Var = this.f109145e;
        if (w8Var.f110959r) {
            w8Var.o().onChanged();
        }
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.w8 w8Var = this.f109145e;
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = w8Var.o();
        w8Var.getClass();
        o17.onItemRangeChanged(i17 + 0, i18);
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.w8 w8Var = this.f109145e;
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = w8Var.o();
        w8Var.getClass();
        o17.onItemRangeInserted(i17 + 0, i18);
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        com.tencent.mm.plugin.finder.feed.w8 w8Var = this.f109145e;
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = w8Var.o();
        w8Var.getClass();
        w8Var.getClass();
        o17.onItemRangeMoved(i17 + 0, i18 + 0, i19);
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.w8 w8Var = this.f109145e;
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = w8Var.o();
        w8Var.getClass();
        o17.onItemRangeRemoved(i17 + 0, i18);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f109144d;
        refreshLoadMoreLayout.getClass();
        refreshLoadMoreLayout.O(reason);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f109144d.onPreFinishLoadMoreSmooth(reason);
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f109144d;
        refreshLoadMoreLayout.getClass();
        refreshLoadMoreLayout.Q(reason);
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.w8 w8Var = this.f109145e;
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = w8Var.o();
        w8Var.getClass();
        o17.onItemRangeChanged(i17 + 0, i18, obj);
    }
}
