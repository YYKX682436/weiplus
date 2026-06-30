package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class v20 extends com.tencent.mm.plugin.finder.feed.gj {

    /* renamed from: r, reason: collision with root package name */
    public final r45.vx0 f110865r;

    /* renamed from: s, reason: collision with root package name */
    public int f110866s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f110867t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.j20 presenter, int i17, int i18, r45.vx0 vx0Var) {
        super(context, presenter, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f110865r = vx0Var;
        this.f110867t = jz5.h.b(new com.tencent.mm.plugin.finder.feed.p20(context));
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public android.view.View j() {
        int i17 = this.f110866s;
        if (i17 == 16 || i17 == 23 || i17 == 24) {
            return (android.view.View) ((jz5.n) this.f110867t).getValue();
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public void q(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.q(data);
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = o();
        com.tencent.mm.ui.MMActivity mMActivity = this.f106968d;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        o17.setLoadMoreFooter(inflate);
        android.view.View f213435x = o().getF213435x();
        if (f213435x != null) {
            int color = f213435x.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3_White_Mode);
            android.widget.TextView textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili);
            if (textView != null) {
                textView.setTextColor(color);
            }
            android.view.View findViewById = f213435x.findViewById(com.tencent.mm.R.id.bdv);
            if (findViewById != null) {
                findViewById.setBackgroundColor(color);
            }
            android.view.View findViewById2 = f213435x.findViewById(com.tencent.mm.R.id.i0a);
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(color);
            }
            android.view.View findViewById3 = f213435x.findViewById(com.tencent.mm.R.id.m3v);
            if (findViewById3 != null) {
                findViewById3.setBackgroundColor(color);
            }
        }
        r45.vx0 vx0Var = this.f110865r;
        if (vx0Var != null && vx0Var.getInteger(10) == 2) {
            int dimension = (int) mMActivity.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
            int dimension2 = (int) mMActivity.getResources().getDimension(com.tencent.mm.R.dimen.f479679cf);
            android.view.View inflate2 = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.d0x, (android.view.ViewGroup) null);
            android.view.ViewGroup.LayoutParams layoutParams = inflate2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, dimension2);
            }
            layoutParams.height = dimension2;
            inflate2.setMinimumHeight(dimension2);
            inflate2.setLayoutParams(layoutParams);
            o().setEnableRefresh(true);
            o().setRefreshHeaderView(inflate2);
            o().setLimitTopRequest(dimension2 - dimension);
            o().setRefreshTargetY(dimension - dimension2);
            o().setDamping(1.6f);
            o().setActionCallback(new com.tencent.mm.plugin.finder.feed.s20(this));
        }
        this.f110866s = mMActivity.getIntent().getIntExtra("key_topic_type", 0);
        mMActivity.getIntent().getLongExtra("LoaderCacheStoreIntentKey", 0L);
        int i17 = this.f110866s;
        if (i17 == 5) {
            com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = o();
            kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
            ((android.widget.FrameLayout) mMActivity.findViewById(com.tencent.mm.R.id.f484229dg3)).setVisibility(0);
            ((android.widget.ProgressBar) mMActivity.findViewById(com.tencent.mm.R.id.lbi)).setVisibility(0);
            return;
        }
        if (i17 == 16 || i17 == 23 || i17 == 24) {
            ((android.widget.FrameLayout) mMActivity.findViewById(com.tencent.mm.R.id.f484229dg3)).setVisibility(0);
            ((android.widget.ProgressBar) mMActivity.findViewById(com.tencent.mm.R.id.lbi)).setVisibility(0);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.gj, com.tencent.mm.plugin.finder.feed.i0
    public void u() {
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.feed.t20(this));
    }

    @Override // com.tencent.mm.plugin.finder.feed.gj
    public void x(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        int i17 = this.f110866s;
        if (i17 == 5) {
            java.lang.Object obj = reason.f463520e;
            if ((obj instanceof r45.r03) && reason.f463517b != -1) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderTopicInfo");
                y();
                return;
            }
        }
        if (i17 == 16 || i17 == 23 || i17 == 24) {
            y();
            com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f106969e;
            c0Var.onRefreshEnd(reason);
            java.util.ArrayList f17 = c0Var.f();
            if (f17 != null && f17.isEmpty()) {
                com.tencent.mm.ui.MMActivity mMActivity = this.f106968d;
                ((android.widget.FrameLayout) mMActivity.findViewById(com.tencent.mm.R.id.f484229dg3)).setVisibility(0);
                ((android.widget.TextView) mMActivity.findViewById(com.tencent.mm.R.id.dft)).setVisibility(0);
            }
        }
    }

    public final void y() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f106968d;
        ((android.widget.FrameLayout) mMActivity.findViewById(com.tencent.mm.R.id.f484229dg3)).setVisibility(8);
        ((android.widget.ProgressBar) mMActivity.findViewById(com.tencent.mm.R.id.lbi)).setVisibility(8);
    }
}
