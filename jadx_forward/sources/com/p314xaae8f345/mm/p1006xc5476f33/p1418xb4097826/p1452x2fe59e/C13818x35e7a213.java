package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$RelativeLoader", "Lcom/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$TopicLoader;", "com/tencent/mm/plugin/finder/feed/k20", "com/tencent/mm/plugin/finder/feed/l20", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader */
/* loaded from: classes2.dex */
public final class C13818x35e7a213 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.AbstractC13819x84acce8e {

    /* renamed from: o, reason: collision with root package name */
    public final long f187680o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f187681p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.vx0 f187682q;

    /* renamed from: r, reason: collision with root package name */
    public final int f187683r;

    /* renamed from: s, reason: collision with root package name */
    public final int f187684s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f187685t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f187686u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f187687v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f187688w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f187689x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13818x35e7a213(long j17, java.lang.String objectNonceId, r45.vx0 vx0Var, int i17, int i18, java.lang.String fromUsername, java.lang.String toUsername, java.lang.String sessionId, r45.qt2 qt2Var, boolean z17, boolean z18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        this.f187680o = j17;
        this.f187681p = objectNonceId;
        this.f187682q = vx0Var;
        this.f187683r = i17;
        this.f187684s = i18;
        this.f187685t = fromUsername;
        this.f187686u = toUsername;
        this.f187687v = sessionId;
        this.f187688w = gVar;
        this.f187690d = z17;
        this.f187691e = z18;
        this.f187689x = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.AbstractC13819x84acce8e
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        return !response.getHasMore() && response.getPullType() == 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l20(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.n20(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.AbstractC13819x84acce8e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        java.lang.String b17 = getB();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFetchDone pullType=");
        sb6.append(response.getPullType());
        sb6.append(" hasMore=");
        sb6.append(response.getHasMore());
        sb6.append(" objList=[");
        java.util.List<so2.j5> m56409x97891cf7 = response.m56409x97891cf7();
        java.lang.String str = null;
        if (m56409x97891cf7 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m56409x97891cf7, 10));
            for (so2.j5 j5Var : m56409x97891cf7) {
                arrayList.add(j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null);
            }
            str = kz5.n0.g0(arrayList, null, null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.o20.f190150d, 31, null);
        }
        sb6.append(str);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b17, sb6.toString());
        if (response.getPullType() == 19) {
            this.f187689x = true;
        }
    }
}
