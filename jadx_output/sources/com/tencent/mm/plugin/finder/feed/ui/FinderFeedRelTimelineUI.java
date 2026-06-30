package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFeedRelTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedRelTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/k9;", "Lcom/tencent/mm/plugin/finder/feed/j9;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedRelTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader, com.tencent.mm.plugin.finder.feed.k9, com.tencent.mm.plugin.finder.feed.j9> {
    public final int A = 2;
    public long B;
    public int C;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.j9 f109235x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.k9 f109236y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader f109237z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 20;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.f109237z;
        if (finderFeedRelTimelineLoader != null) {
            return finderFeedRelTimelineLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.j9 j9Var = this.f109235x;
        if (j9Var != null) {
            return j9Var;
        }
        kotlin.jvm.internal.o.o("mPresenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.k9 k9Var = this.f109236y;
        if (k9Var != null) {
            return k9Var;
        }
        kotlin.jvm.internal.o.o("mViewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ai7;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        this.B = getIntent().getLongExtra("FEED_ID", 0L);
        this.C = getIntent().getIntExtra("TAB_TYPE", 0);
        setMMTitle("");
        long j17 = this.B;
        int i17 = this.A;
        com.tencent.mm.plugin.finder.feed.j9 j9Var = new com.tencent.mm.plugin.finder.feed.j9(this, j17, i17);
        this.f109235x = j9Var;
        this.f109236y = new com.tencent.mm.plugin.finder.feed.k9(this, j9Var, i17, 20);
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = new com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader(this.B, "", this.C, null, 0, false, null, null, null, null, 0, null, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), 0.0f, 0.0f, 28664, null);
        finderFeedRelTimelineLoader.f107429t = new com.tencent.mm.plugin.finder.feed.ui.i2(this);
        this.f109237z = finderFeedRelTimelineLoader;
    }
}
