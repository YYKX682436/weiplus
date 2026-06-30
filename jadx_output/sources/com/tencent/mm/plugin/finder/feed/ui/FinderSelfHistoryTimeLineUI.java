package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSelfHistoryTimeLineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/ts;", "Lcom/tencent/mm/plugin/finder/feed/ss;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderSelfHistoryTimeLineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.ts, com.tencent.mm.plugin.finder.feed.ss> {
    public final int A = 2;
    public final com.tencent.mm.plugin.finder.feed.ui.mk B = new com.tencent.mm.plugin.finder.feed.ui.mk();

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ss f109542x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ts f109543y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f109544z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return com.tencent.mm.plugin.appbrand.jsapi.q3.CTRL_INDEX;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f109544z;
        if (baseFinderFeedLoader != null) {
            return baseFinderFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.ss ssVar = this.f109542x;
        if (ssVar != null) {
            return ssVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.ts tsVar = this.f109543y;
        if (tsVar != null) {
            return tsVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cxd;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        int i17 = this.A;
        com.tencent.mm.plugin.finder.feed.ss ssVar = new com.tencent.mm.plugin.finder.feed.ss(this, i17);
        this.f109542x = ssVar;
        this.f109543y = new com.tencent.mm.plugin.finder.feed.ts(this, ssVar, i17, com.tencent.mm.plugin.appbrand.jsapi.q3.CTRL_INDEX);
        com.tencent.mm.plugin.finder.feed.model.FinderSelfHistoryLoader finderSelfHistoryLoader = new com.tencent.mm.plugin.finder.feed.model.FinderSelfHistoryLoader(getIntent().getIntExtra("history_tab_type", 0), true, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        finderSelfHistoryLoader.initFromCache(getIntent());
        finderSelfHistoryLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.kk(this, finderSelfHistoryLoader));
        finderSelfHistoryLoader.f107646g = new com.tencent.mm.plugin.finder.feed.ui.lk(finderSelfHistoryLoader, this);
        this.f109544z = finderSelfHistoryLoader;
        com.tencent.mm.plugin.finder.feed.ts tsVar = this.f109543y;
        if (tsVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        tsVar.getRecyclerView().i(this.B);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483315aa4)).setIconColor(getResources().getColor(com.tencent.mm.R.color.f479252u4));
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderFavTimelineUI)).Rj(this, iy1.a.Finder);
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
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        return Q0;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.ts tsVar = this.f109543y;
        if (tsVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        tsVar.getRecyclerView().V0(this.B);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.ts tsVar = this.f109543y;
        if (tsVar != null) {
            zy2.zb.Kh(zbVar, tsVar.getRecyclerView(), ml2.x1.f328203g, "324", ml2.y.f328241f, 0, 0L, 0, 112, null);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.ts tsVar = this.f109543y;
        if (tsVar != null) {
            zy2.zb.Kh(zbVar, tsVar.getRecyclerView(), ml2.x1.f328203g, "324", ml2.y.f328240e, 0, 0L, 0, 112, null);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }
}
