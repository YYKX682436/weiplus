package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFeedRelTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedRelTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/k9;", "Lcom/tencent/mm/plugin/finder/feed/j9;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelTimelineUI */
/* loaded from: classes2.dex */
public final class ActivityC13950xd36d476a extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k9, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j9> {
    public final int A = 2;
    public long B;
    public int C;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j9 f190768x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k9 f190769y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09 f190770z;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 20;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09 c13860x3630fe09 = this.f190770z;
        if (c13860x3630fe09 != null) {
            return c13860x3630fe09;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j9 j9Var = this.f190768x;
        if (j9Var != null) {
            return j9Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPresenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k9 k9Var = this.f190769y;
        if (k9Var != null) {
            return k9Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ai7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public void h7() {
        this.B = getIntent().getLongExtra("FEED_ID", 0L);
        this.C = getIntent().getIntExtra("TAB_TYPE", 0);
        mo54450xbf7c1df6("");
        long j17 = this.B;
        int i17 = this.A;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j9 j9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j9(this, j17, i17);
        this.f190768x = j9Var;
        this.f190769y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k9(this, j9Var, i17, 20);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09 c13860x3630fe09 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09(this.B, "", this.C, null, 0, false, null, null, null, null, 0, null, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), 0.0f, 0.0f, 28664, null);
        c13860x3630fe09.f188962t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.i2(this);
        this.f190770z = c13860x3630fe09;
    }
}
