package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/ds;", "Lcom/tencent/mm/plugin/finder/feed/cs;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class OccupyFinderUI5 extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.ds, com.tencent.mm.plugin.finder.feed.cs> {
    public final int A = 1;
    public final com.tencent.mm.plugin.finder.feed.ui.cq B = new com.tencent.mm.plugin.finder.feed.ui.cq();

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.cs f109625x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ds f109626y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f109627z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 337;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f109627z;
        if (baseFinderFeedLoader != null) {
            return baseFinderFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.cs csVar = this.f109625x;
        if (csVar != null) {
            return csVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.ds dsVar = this.f109626y;
        if (dsVar != null) {
            return dsVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dny;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        int i17 = this.A;
        com.tencent.mm.plugin.finder.feed.cs csVar = new com.tencent.mm.plugin.finder.feed.cs(this, i17);
        this.f109625x = csVar;
        this.f109626y = new com.tencent.mm.plugin.finder.feed.ds(this, csVar, i17, 337);
        com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader finderRecommendReasonLoader = new com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        finderRecommendReasonLoader.initFromCache(getIntent());
        finderRecommendReasonLoader.f107622d = getIntent().getStringExtra("get_by_pass");
        finderRecommendReasonLoader.f107623e = java.lang.Integer.valueOf(getIntent().getIntExtra("prefetchType", 0));
        finderRecommendReasonLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.aq(this, finderRecommendReasonLoader));
        finderRecommendReasonLoader.f107632q = new com.tencent.mm.plugin.finder.feed.ui.bq(finderRecommendReasonLoader, this);
        this.f109627z = finderRecommendReasonLoader;
        com.tencent.mm.plugin.finder.feed.ds dsVar = this.f109626y;
        if (dsVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        dsVar.getRecyclerView().i(this.B);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483315aa4)).setIconColor(getResources().getColor(com.tencent.mm.R.color.f479252u4));
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public boolean i7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet Q0 = kz5.n0.Q0(super.importUIComponents());
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.h80.class);
        Q0.add(hy2.f.class);
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
        return Q0;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.ds dsVar = this.f109626y;
        if (dsVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        dsVar.getRecyclerView().V0(this.B);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
