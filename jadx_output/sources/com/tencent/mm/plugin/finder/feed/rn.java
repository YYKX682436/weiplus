package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class rn implements fs2.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI f108928d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.hn f108929e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f108930f;

    /* renamed from: g, reason: collision with root package name */
    public rl5.r f108931g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f108932h;

    public rn(com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI activity, com.tencent.mm.plugin.finder.feed.hn presenter) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f108928d = activity;
        this.f108929e = presenter;
    }

    public static final void a(com.tencent.mm.plugin.finder.feed.rn rnVar, boolean z17) {
        android.view.View findViewById = rnVar.f108928d.findViewById(com.tencent.mm.R.id.f484229dg3);
        if (findViewById != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById.findViewById(com.tencent.mm.R.id.m2c);
            if (!z17) {
                if (weImageView == null) {
                    return;
                }
                weImageView.setVisibility(8);
            } else if (weImageView != null) {
                weImageView.setVisibility(0);
                weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.nn(findViewById));
            }
        }
    }

    public final void g(boolean z17, int i17, int i18) {
        if (i17 < 0 || i18 <= 0) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f108932h;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter.notifyDataSetChanged();
        } else {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f108932h;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter2.notifyItemRangeInserted(i17, i18);
        }
        com.tencent.mm.plugin.finder.feed.hn hnVar = this.f108929e;
        if (z17) {
            ym5.s3 s3Var = new ym5.s3(0);
            s3Var.f463521f = hnVar.f106939n;
            s3Var.f463523h = i18;
            if (i18 > 0) {
                s3Var.f463522g = false;
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f108930f;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(s3Var);
                return;
            } else {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f108930f;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout2.P(0);
        if (hnVar.f106939n) {
            return;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f108930f;
        if (refreshLoadMoreLayout3 != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.I(refreshLoadMoreLayout3, null, 1, null);
        } else {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f108928d;
    }
}
