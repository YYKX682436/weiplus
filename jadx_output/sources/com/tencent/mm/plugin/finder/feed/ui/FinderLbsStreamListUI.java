package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamListUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderLbsStreamFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/ic;", "Lcom/tencent/mm/plugin/finder/feed/hc;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLbsStreamListUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader, com.tencent.mm.plugin.finder.feed.ic, com.tencent.mm.plugin.finder.feed.hc> {
    public boolean A;
    public final int B = 2;
    public final com.tencent.mm.plugin.finder.feed.ui.v6 C = new com.tencent.mm.plugin.finder.feed.ui.v6();

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.hc f109314x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ic f109315y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader f109316z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 16;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = this.f109316z;
        if (finderLbsStreamFeedLoader != null) {
            return finderLbsStreamFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.hc hcVar = this.f109314x;
        if (hcVar != null) {
            return hcVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (this.A) {
            com.tencent.mm.plugin.finder.feed.ic icVar = this.f109315y;
            if (icVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = icVar.getRecyclerView().getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = this.f109316z;
                if (finderLbsStreamFeedLoader == null) {
                    kotlin.jvm.internal.o.o("feedLoader");
                    throw null;
                }
                setResult(-1, finderLbsStreamFeedLoader.createIntentWithCache((androidx.recyclerview.widget.LinearLayoutManager) layoutManager));
            }
        }
        super.finish();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.ic icVar = this.f109315y;
        if (icVar != null) {
            return icVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.akx;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_UI_TITLE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        setTitle(stringExtra);
        setMMTitle(getTitle());
        this.A = getIntent().getBooleanExtra("KEY_SAVE_RESULT", false);
        com.tencent.mm.plugin.finder.feed.hc hcVar = new com.tencent.mm.plugin.finder.feed.hc(this, this.B, 0, 4, null);
        this.f109314x = hcVar;
        this.f109315y = new com.tencent.mm.plugin.finder.feed.ic(this, hcVar, this.B, 16);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader(xy2.c.e(context), ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        finderLbsStreamFeedLoader.initFromCache(getIntent());
        finderLbsStreamFeedLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.r6(this, finderLbsStreamFeedLoader));
        finderLbsStreamFeedLoader.f107470e = new com.tencent.mm.plugin.finder.feed.ui.t6(this);
        this.f109316z = finderLbsStreamFeedLoader;
        com.tencent.mm.plugin.finder.feed.ic icVar = this.f109315y;
        if (icVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        icVar.getRecyclerView().i(this.C);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "FinderLbsStreamListUI");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 40, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.feed.ui.u6(this));
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.ic icVar = this.f109315y;
        if (icVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        icVar.getRecyclerView().V0(this.C);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f328202f, "16", ml2.y.f328241f, 0, 0L, 0, 112, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f328202f, "16", ml2.y.f328240e, 0, 0L, 0, 112, null);
    }
}
