package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedRelTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/l1", "com/tencent/mm/plugin/finder/feed/model/m1", "com/tencent/mm/plugin/finder/feed/model/n1", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader */
/* loaded from: classes2.dex */
public class C13860x3630fe09 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public final long f188949d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f188950e;

    /* renamed from: f, reason: collision with root package name */
    public final int f188951f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f188952g;

    /* renamed from: h, reason: collision with root package name */
    public int f188953h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f188954i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.kd3 f188955m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f188956n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.vd6 f188957o;

    /* renamed from: p, reason: collision with root package name */
    public final int f188958p;

    /* renamed from: q, reason: collision with root package name */
    public r45.z91 f188959q;

    /* renamed from: r, reason: collision with root package name */
    public final float f188960r;

    /* renamed from: s, reason: collision with root package name */
    public final float f188961s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.l f188962t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.l f188963u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.l f188964v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13860x3630fe09(long j17, java.lang.String str, int i17, java.lang.String str2, int i18, boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.kd3 kd3Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, r45.vd6 vd6Var, int i19, r45.z91 z91Var, r45.qt2 qt2Var, float f17, float f18, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(qt2Var);
        long j18 = (i27 & 1) != 0 ? 0L : j17;
        java.lang.String nonceId = (i27 & 2) != 0 ? "" : str;
        int i28 = (i27 & 4) != 0 ? 0 : i17;
        java.lang.String str3 = (i27 & 8) == 0 ? str2 : "";
        int i29 = (i27 & 16) != 0 ? 0 : i18;
        boolean z18 = (i27 & 32) != 0 ? true : z17;
        r45.kd3 kd3Var2 = (i27 & 128) != 0 ? null : kd3Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = (i27 & 256) != 0 ? null : gVar2;
        r45.vd6 vd6Var2 = (i27 & 512) != 0 ? null : vd6Var;
        int i37 = (i27 & 1024) == 0 ? i19 : 0;
        r45.z91 z91Var2 = (i27 & 2048) == 0 ? z91Var : null;
        float f19 = (i27 & 8192) != 0 ? 0.0f : f17;
        float f27 = (i27 & 16384) == 0 ? f18 : 0.0f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        this.f188949d = j18;
        this.f188950e = nonceId;
        this.f188951f = i28;
        this.f188952g = str3;
        this.f188953h = i29;
        this.f188954i = z18;
        this.f188955m = kd3Var2;
        this.f188956n = gVar3;
        this.f188957o = vd6Var2;
        this.f188958p = i37;
        this.f188959q = z91Var2;
        this.f188960r = f19;
        this.f188961s = f27;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l1(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: isObservePostEvent */
    public boolean mo55621xcb60d968() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13704xa673085b);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        if (m56362x40f3992d(response) || response.getHasMore() || (lVar = this.f188962t) == null) {
            return;
        }
        lVar.mo146xb9724478(response);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: onFetchInitDone */
    public void mo56111x8401e9ed(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa initResponse) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initResponse, "initResponse");
        super.mo56111x8401e9ed(initResponse);
        if (initResponse.getHasMore() || (lVar = this.f188962t) == null) {
            return;
        }
        lVar.mo146xb9724478(initResponse);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: onFetchLoadMoreDone */
    public void mo55588xef36e338(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55588xef36e338(response);
        yz5.l lVar = this.f188964v;
        if (lVar != null) {
            lVar.mo146xb9724478(response);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: onFetchRefreshDone */
    public void mo55428xcbba01e2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55428xcbba01e2(response);
        yz5.l lVar = this.f188963u;
        if (lVar != null) {
            lVar.mo146xb9724478(response);
        }
    }
}
