package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$TopicLoader", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader */
/* loaded from: classes2.dex */
public abstract class AbstractC13819x84acce8e extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f187690d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f187691e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f187692f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f187693g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f187694h;

    /* renamed from: i, reason: collision with root package name */
    public long f187695i;

    /* renamed from: m, reason: collision with root package name */
    public r45.xn5 f187696m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f187697n;

    public AbstractC13819x84acce8e() {
        this(null);
    }

    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        return !response.getHasMore();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        yz5.a aVar;
        yz5.l lVar;
        yz5.l lVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        xc2.k0 k0Var = (xc2.k0) pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class);
        java.util.List m56409x97891cf7 = response.m56409x97891cf7();
        r45.qt2 m56354xfe9224be = m56354xfe9224be();
        k0Var.h7(m56409x97891cf7, m56354xfe9224be != null ? m56354xfe9224be.m75939xb282bd08(5) : 0);
        if (m56362x40f3992d(response)) {
            return;
        }
        if (response.getPullType() == 19 && (lVar2 = this.f187693g) != null) {
            lVar2.mo146xb9724478(response);
        }
        if (response.getPullType() == 0 && (lVar = this.f187694h) != null) {
            lVar.mo146xb9724478(response);
        }
        if (c(response) && (aVar = this.f187692f) != null) {
            aVar.mo152xb9724478();
        }
        if (response.getPullType() == 2) {
            this.f187691e = response.getHasMore();
        } else if (response.getPullType() == 19) {
            this.f187690d = response.getHasMore();
        }
    }

    public AbstractC13819x84acce8e(r45.qt2 qt2Var) {
        super(qt2Var);
        this.f187690d = true;
        this.f187691e = true;
    }
}
