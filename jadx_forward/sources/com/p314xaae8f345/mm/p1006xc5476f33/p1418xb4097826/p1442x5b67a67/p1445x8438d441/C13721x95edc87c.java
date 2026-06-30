package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "ac2/z", "ac2/a0", "ac2/b0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader */
/* loaded from: classes2.dex */
public final class C13721x95edc87c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public final long f186822d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186823e;

    /* renamed from: f, reason: collision with root package name */
    public final int f186824f;

    /* renamed from: g, reason: collision with root package name */
    public final int f186825g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f186826h;

    /* renamed from: i, reason: collision with root package name */
    public ac2.z f186827i;

    /* renamed from: m, reason: collision with root package name */
    public ac2.z f186828m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.tj2 f186829n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186830o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.l f186831p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f186832q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13721x95edc87c(r45.qt2 qt2Var, long j17, java.lang.String str, int i17, int i18, java.util.List loaderInfoList, ac2.z upLoaderInfo, ac2.z downLoaderInfo, r45.tj2 tj2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loaderInfoList, "loaderInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(upLoaderInfo, "upLoaderInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downLoaderInfo, "downLoaderInfo");
        this.f186822d = j17;
        this.f186823e = str;
        this.f186824f = i17;
        this.f186825g = i18;
        this.f186826h = loaderInfoList;
        this.f186827i = upLoaderInfo;
        this.f186828m = downLoaderInfo;
        this.f186829n = tj2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new ac2.b0(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new ac2.c0(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        if (m56362x40f3992d(response) || !(response instanceof ac2.a0) || (lVar = this.f186831p) == null) {
            return;
        }
        lVar.mo146xb9724478(response);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: requestJumper */
    public void mo55749x445724ca(java.util.List itemList, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        xc2.k0 k0Var = (xc2.k0) a17;
        r45.qt2 m56354xfe9224be = m56354xfe9224be();
        xc2.k0.f7(k0Var, itemList, m56354xfe9224be != null ? m56354xfe9224be.m75939xb282bd08(5) : 0, m56354xfe9224be(), 0, gVar, this.f186829n, 8, null);
    }
}
