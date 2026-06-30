package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class e10 implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.r10 f106617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f106618e;

    public e10(com.tencent.mm.plugin.finder.feed.r10 r10Var, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f106617d = r10Var;
        this.f106618e = mMActivity;
    }

    @Override // ym5.m1
    public void onChanged() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f106617d;
        java.lang.String str = r10Var.f108865i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChanged ");
        com.tencent.mm.plugin.finder.feed.a1 a1Var = r10Var.f107157f;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = a1Var != null ? a1Var.f106180m : null;
        if (!(refreshLoadMoreLayout2 instanceof com.tencent.mm.view.RefreshLoadMoreLayout)) {
            refreshLoadMoreLayout2 = null;
        }
        sb6.append(refreshLoadMoreLayout2 != null ? java.lang.Integer.valueOf(refreshLoadMoreLayout2.getVisibility()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.plugin.finder.feed.a1 a1Var2 = r10Var.f107157f;
        if (a1Var2 == null || (refreshLoadMoreLayout = a1Var2.f106180m) == null) {
            return;
        }
        refreshLoadMoreLayout.onChanged();
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f106617d.f107157f;
        if (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) {
            return;
        }
        refreshLoadMoreLayout.onItemRangeChanged(i17 + (a1Var != null ? a1Var.o().a0() : 0), i18);
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f106617d.f107157f;
        if (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) {
            return;
        }
        refreshLoadMoreLayout.onItemRangeInserted(i17 + (a1Var != null ? a1Var.o().a0() : 0), i18);
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f106617d;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = r10Var.f107157f;
        if (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) {
            return;
        }
        int a07 = i17 + (a1Var != null ? a1Var.o().a0() : 0);
        com.tencent.mm.plugin.finder.feed.a1 a1Var2 = r10Var.f107157f;
        refreshLoadMoreLayout.onItemRangeMoved(a07, i18 + (a1Var2 != null ? a1Var2.o().a0() : 0), i19);
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f106617d;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = r10Var.f107157f;
        if (a1Var != null && (refreshLoadMoreLayout = a1Var.f106180m) != null) {
            refreshLoadMoreLayout.onItemRangeRemoved(i17 + (a1Var != null ? a1Var.o().a0() : 0), i18);
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var2 = r10Var.f107157f;
        if (a1Var2 != null) {
            a1Var2.M();
        }
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f106617d;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = r10Var.f107157f;
        if (a1Var != null && (refreshLoadMoreLayout = a1Var.f106180m) != null) {
            refreshLoadMoreLayout.O(reason);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.b10(r10Var, reason));
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f106617d;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = r10Var.f107157f;
        if (a1Var != null && (refreshLoadMoreLayout = a1Var.f106180m) != null) {
            refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(reason);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.c10(r10Var, reason));
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.d10(reason, this.f106617d, this.f106618e));
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f106617d.f107157f;
        if (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) {
            return;
        }
        refreshLoadMoreLayout.onItemRangeChanged(i17 + (a1Var != null ? a1Var.o().a0() : 0), i18, obj);
    }
}
