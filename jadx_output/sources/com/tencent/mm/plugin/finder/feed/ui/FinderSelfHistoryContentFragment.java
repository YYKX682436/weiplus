package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSelfHistoryContentFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderSelfHistoryContract$PlayHistoryViewCallback;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderSelfHistoryContract$PlayHistoryPresenter;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderSelfHistoryContentFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment<com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback, com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryPresenter> {

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f109537y = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: u, reason: collision with root package name */
    public final int f109538u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryPresenter f109539v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback f109540w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f109541x;

    public FinderSelfHistoryContentFragment(int i17) {
        this.f109538u = i17;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.a1 A0() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback playHistoryViewCallback = this.f109540w;
        if (playHistoryViewCallback != null) {
            return playHistoryViewCallback;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public void B0() {
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public void C0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        f109537y.clear();
        com.tencent.mm.plugin.finder.feed.model.FinderSelfHistoryLoader finderSelfHistoryLoader = new com.tencent.mm.plugin.finder.feed.model.FinderSelfHistoryLoader(this.f109538u, false, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        finderSelfHistoryLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.gk(this));
        finderSelfHistoryLoader.f107646g = new com.tencent.mm.plugin.finder.feed.ui.hk(this);
        finderSelfHistoryLoader.f107647h = new com.tencent.mm.plugin.finder.feed.ui.ik(this);
        this.f109541x = finderSelfHistoryLoader;
        com.tencent.mm.ui.MMActivity y07 = y0();
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f109541x;
        if (baseFinderFeedLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        this.f109539v = new com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryPresenter(y07, 0, com.tencent.mapsdk.internal.km.f50100e, baseFinderFeedLoader);
        com.tencent.mm.plugin.finder.feed.ui.jk jkVar = new com.tencent.mm.plugin.finder.feed.ui.jk(this, view, this.f109538u, y0(), com.tencent.mapsdk.internal.km.f50100e);
        this.f109540w = jkVar;
        com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryPresenter playHistoryPresenter = this.f109539v;
        if (playHistoryPresenter == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        jkVar.T(playHistoryPresenter);
        com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback playHistoryViewCallback = this.f109540w;
        if (playHistoryViewCallback == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        playHistoryViewCallback.getRecyclerView().i(playHistoryViewCallback.f123256z);
        com.tencent.mm.ui.MMActivity context = y0();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(this);
        cy1.a aVar2 = (cy1.a) aVar.ak(this, iy1.c.FinderSelfHistoryUI);
        aVar2.dk(this, "recently_browse_page");
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("ref_commentscene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(7)) : null);
        lVarArr[1] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[2] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr[4] = new jz5.l("finder_username", xy2.c.e(y0()));
        aVar2.gk(this, kz5.c1.k(lVarArr));
        aVar2.Tj(this, 12, 1, false);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489091dp1;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        f109537y.clear();
        com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback playHistoryViewCallback = this.f109540w;
        if (playHistoryViewCallback != null) {
            playHistoryViewCallback.getRecyclerView().V0(playHistoryViewCallback.f123256z);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getF121515s() {
        return com.tencent.mapsdk.internal.km.f50100e;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public int x0() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.k0 z0() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryPresenter playHistoryPresenter = this.f109539v;
        if (playHistoryPresenter != null) {
            return playHistoryPresenter;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }
}
