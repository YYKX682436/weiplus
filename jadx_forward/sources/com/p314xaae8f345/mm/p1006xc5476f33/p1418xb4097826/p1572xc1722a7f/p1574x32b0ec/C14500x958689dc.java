package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/NearbyLiveFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "cp2/g", "cp2/k", "cp2/l", "cp2/m", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader */
/* loaded from: classes2.dex */
public class C14500x958689dc extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public final int f202996d;

    /* renamed from: e, reason: collision with root package name */
    public final int f202997e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f202998f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f202999g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f203000h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f203001i;

    /* renamed from: m, reason: collision with root package name */
    public int f203002m;

    /* renamed from: n, reason: collision with root package name */
    public r45.dd2 f203003n;

    /* renamed from: o, reason: collision with root package name */
    public int f203004o;

    /* renamed from: p, reason: collision with root package name */
    public int f203005p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f203006q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f203007r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f203008s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f203009t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f203010u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f203011v;

    /* renamed from: w, reason: collision with root package name */
    public long f203012w;

    /* renamed from: x, reason: collision with root package name */
    public final cp2.k f203013x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys f203014y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14500x958689dc(r45.qt2 qt2Var, int i17, int i18, int i19, java.lang.String by_pass, java.lang.String str, yz5.a aVar) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(by_pass, "by_pass");
        this.f202996d = i17;
        this.f202997e = i18;
        this.f202998f = by_pass;
        this.f202999g = str;
        this.f203000h = aVar;
        this.f203002m = 1;
        this.f203004o = i18;
        this.f203005p = i19;
        this.f203010u = new java.util.LinkedList();
        this.f203013x = new cp2.k(this);
        mo56017xca0293d8("NearbyLiveFeedLoader." + i17);
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc, boolean z17, boolean z18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14500x958689dc.getTAG(), "checkIfSetFetchMoreFollowFeed " + str + " isFetchFollowMoreResp:" + z17 + " hasMoreFollowList:" + z18);
        c14500x958689dc.f203009t = z17 && z18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return this.f203013x;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new cp2.q(this);
    }

    public final void d(int i17, int i18, r45.dd2 dd2Var) {
        this.f203004o = i17;
        this.f203005p = i18;
        this.f203003n = dd2Var;
        super.mo56368x4487ec3f(false);
    }

    public final void e(r45.dd2 dd2Var, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, long j17) {
        tq2.c.f502753i.a(this.f203004o).f502757c = java.lang.System.currentTimeMillis();
        this.f203013x.b("requestRefresh");
        this.f203003n = dd2Var;
        this.f203002m = i17;
        this.f203012w = j17;
        this.f203007r = gVar;
        this.f203008s = z17;
        super.mo56155xd210094c();
        this.f203011v = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        pm0.v.X(new cp2.r(this, response));
        rq2.s sVar = rq2.s.f480412a;
        int i17 = this.f202997e;
        rq2.q b17 = sVar.b(i17);
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "onDbStart tabType: " + i17);
            b17.f480396d = c01.id.c();
        }
        super.mo55587xb461ee3d(response);
        rq2.q b18 = sVar.b(i17);
        if (b18 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "onDbEnd tabType: " + i17);
            b18.f480397e = c01.id.c();
            rq2.q b19 = sVar.b(i17);
            if (b19 != null) {
                b19.f480398f = c01.id.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "onUIShowBegin tabType: " + i17);
            }
        }
        tq2.c.f502753i.a(this.f203004o).f502760f = java.lang.System.currentTimeMillis();
        tq2.a aVar = tq2.d.f502763a;
        tq2.d.f502763a.c("fetchLivesDone");
        m56362x40f3992d(response);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: requestLoadMore */
    public void mo56123x84fe90a(r45.dd2 dd2Var) {
        if (this.f203011v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getTAG(), "requestLoadMore return for isFetchingLoadMore");
            this.f203013x.b("requestLoadMore");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getTAG(), "requestLoadMore isFetchMoreFollowFeed:" + this.f203009t);
        this.f203003n = dd2Var;
        if (this.f203009t) {
            this.f203003n = dd2Var;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f203006q;
            int i17 = this.f203004o;
            int i18 = this.f202997e;
            int i19 = this.f202996d;
            java.lang.String str = this.f202998f;
            java.lang.String str2 = this.f202999g;
            yz5.a aVar = this.f203000h;
            super.m56369x42423a28(new cp2.l(2, dd2Var, gVar, i17, i18, i19, str, 1, 0L, str2, aVar != null ? ((java.lang.Number) aVar.mo152xb9724478()).intValue() : -1, 256, null));
        } else {
            mo55589x84fe90a(false);
        }
        this.f203011v = true;
    }
}
