package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFollowTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderTimelineFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/cb;", "Lcom/tencent/mm/plugin/finder/feed/bb;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFollowTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader, com.tencent.mm.plugin.finder.feed.cb, com.tencent.mm.plugin.finder.feed.bb> {
    public final int A = 2;
    public final int B = 3;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.bb f109251x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.cb f109252y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f109253z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 156;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f109253z;
        if (finderTimelineFeedLoader != null) {
            return finderTimelineFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.bb bbVar = this.f109251x;
        if (bbVar != null) {
            return bbVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.cb cbVar = this.f109252y;
        if (cbVar != null) {
            return cbVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488816aj0;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        int i17 = getResources().getConfiguration().orientation;
        int i18 = this.A;
        com.tencent.mm.plugin.finder.feed.bb bbVar = new com.tencent.mm.plugin.finder.feed.bb(this, i18);
        this.f109251x = bbVar;
        this.f109252y = new com.tencent.mm.plugin.finder.feed.cb(this, bbVar, i18, 156);
        com.tencent.mm.plugin.finder.feed.model.internal.m0 a17 = com.tencent.mm.plugin.finder.feed.model.internal.m0.f108015e.a(3);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader(a17, 1, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).W6(this.B), null, null, 24, null);
        finderTimelineFeedLoader.initFromCache(getIntent());
        finderTimelineFeedLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.y2(this, finderTimelineFeedLoader));
        finderTimelineFeedLoader.f107660s = new com.tencent.mm.plugin.finder.feed.ui.a3(this);
        this.f109253z = finderTimelineFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public boolean i7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.finder.viewmodel.component.hs.class);
    }
}
