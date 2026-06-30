package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class j0 implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.k0 f107061d;

    public j0(com.tencent.mm.plugin.finder.feed.k0 k0Var) {
        this.f107061d = k0Var;
    }

    @Override // ym5.m1
    public void onChanged() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107061d.f107157f;
        if (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) {
            return;
        }
        refreshLoadMoreLayout.onChanged();
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107061d.f107157f;
        if (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) {
            return;
        }
        refreshLoadMoreLayout.onItemRangeChanged(i17 + (a1Var != null ? a1Var.o().a0() : 0), i18);
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107061d.f107157f;
        if (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) {
            return;
        }
        refreshLoadMoreLayout.onItemRangeInserted(i17 + (a1Var != null ? a1Var.o().a0() : 0), i18);
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.k0 k0Var = this.f107061d;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = k0Var.f107157f;
        if (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) {
            return;
        }
        int a07 = i17 + (a1Var != null ? a1Var.o().a0() : 0);
        com.tencent.mm.plugin.finder.feed.a1 a1Var2 = k0Var.f107157f;
        refreshLoadMoreLayout.onItemRangeMoved(a07, i18 + (a1Var2 != null ? a1Var2.o().a0() : 0), i19);
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.k0 k0Var = this.f107061d;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = k0Var.f107157f;
        if (a1Var != null && (refreshLoadMoreLayout = a1Var.f106180m) != null) {
            refreshLoadMoreLayout.onItemRangeRemoved(i17 + (a1Var != null ? a1Var.o().a0() : 0), i18);
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var2 = k0Var.f107157f;
        if (a1Var2 != null) {
            a1Var2.M();
        }
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107061d.f107157f;
        if (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) {
            return;
        }
        refreshLoadMoreLayout.O(reason);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107061d.f107157f;
        if (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) {
            return;
        }
        refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(reason);
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107061d.f107157f;
        if (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) {
            return;
        }
        refreshLoadMoreLayout.Q(reason);
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107061d.f107157f;
        if (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) {
            return;
        }
        refreshLoadMoreLayout.onItemRangeChanged(i17 + (a1Var != null ? a1Var.o().a0() : 0), i18, obj);
    }
}
