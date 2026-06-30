package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/ui/FinderLocalFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "vu2/a", "vu2/b", "vu2/c", "vu2/d", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader */
/* loaded from: classes2.dex */
public final class C15114xedf903f6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f210739d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f210740e;

    /* renamed from: f, reason: collision with root package name */
    public final int f210741f;

    /* renamed from: g, reason: collision with root package name */
    public int f210742g;

    /* renamed from: h, reason: collision with root package name */
    public int f210743h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f210744i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f210745m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f210746n;

    /* renamed from: o, reason: collision with root package name */
    public vu2.d f210747o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15114xedf903f6(java.util.List feedIdList, r45.qt2 qt2Var, int i17, int i18, long j17, boolean z17, boolean z18) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedIdList, "feedIdList");
        this.f210739d = feedIdList;
        this.f210740e = z18;
        this.f210741f = 10;
        this.f210742g = i17;
        this.f210743h = i18;
        this.f210744i = true;
        this.f210745m = z17;
        this.f210746n = z17;
        this.f210747o = vu2.d.f521741d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return this.f210740e ? new vu2.a(this) : new vu2.c(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new vu2.f(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: getPageName */
    public int mo55586xaf11af30() {
        return this.f210740e ? 24 : 25;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: onFetchLoadMoreDone */
    public void mo55588xef36e338(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55588xef36e338(response);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: onFetchRefreshDone */
    public void mo55428xcbba01e2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55428xcbba01e2(response);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: remove */
    public int mo56120xc84af884(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 a17 = getStore().a("0");
        if (a17 != null) {
            java.util.ArrayList arrayList = a17.f189833a;
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((so2.j5) it.next()).mo2128x1ed62e84() == j17) {
                    break;
                }
                i17++;
            }
            if (i17 != -1) {
                arrayList.remove(i17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getB(), "remove from all index:" + i17);
        }
        return super.mo56120xc84af884(j17, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: requestLoadMore */
    public boolean mo55589x84fe90a(boolean z17) {
        if (this.f210745m || this.f210746n) {
            return super.mo55589x84fe90a(z17);
        }
        return false;
    }
}
