package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ec;", "Lcom/tencent/mm/plugin/finder/feed/dc;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLbsStreamFeedUI extends com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI<com.tencent.mm.plugin.finder.feed.ec, com.tencent.mm.plugin.finder.feed.dc> {

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.dc f109309t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ec f109310u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f109311v;

    /* renamed from: w, reason: collision with root package name */
    public final int f109312w = 2;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f109313x = "";

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.P1).getValue()).r()).intValue() != 0 ? 43 : 16;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public com.tencent.mm.plugin.finder.feed.k0 c7() {
        com.tencent.mm.plugin.finder.feed.dc dcVar = this.f109309t;
        if (dcVar != null) {
            return dcVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public com.tencent.mm.plugin.finder.feed.a1 d7() {
        com.tencent.mm.plugin.finder.feed.ec ecVar = this.f109310u;
        if (ecVar != null) {
            return ecVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public void e7() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public void f7() {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_UI_TITLE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f109313x = stringExtra;
        setMMTitle(stringExtra);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader(xy2.c.e(context), ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        finderLbsStreamFeedLoader.initFromCache(getIntent());
        finderLbsStreamFeedLoader.f107470e = new com.tencent.mm.plugin.finder.feed.ui.q6(this);
        this.f109311v = finderLbsStreamFeedLoader;
        int d17 = getD();
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f109311v;
        if (baseFinderFeedLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        int i17 = this.f109312w;
        this.f109309t = new com.tencent.mm.plugin.finder.feed.dc(this, i17, d17, baseFinderFeedLoader);
        com.tencent.mm.plugin.finder.feed.ec ecVar = new com.tencent.mm.plugin.finder.feed.ec(this, i17, getD(), this.f109313x);
        this.f109310u = ecVar;
        com.tencent.mm.plugin.finder.feed.dc dcVar = this.f109309t;
        if (dcVar != null) {
            ecVar.f106182o = dcVar;
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.akw;
    }
}
