package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/preview/FinderPreviewFeedListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/member/preview/p0", "com/tencent/mm/plugin/finder/member/preview/q0", "com/tencent/mm/plugin/finder/member/preview/r0", "com/tencent/mm/plugin/finder/member/preview/s0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader */
/* loaded from: classes2.dex */
public final class C14469x166b17d1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f202693d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f202694e;

    /* renamed from: f, reason: collision with root package name */
    public final int f202695f;

    /* renamed from: g, reason: collision with root package name */
    public final long f202696g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f202697h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14469x166b17d1(r45.qt2 qt2Var, java.lang.String memberTicket, java.lang.String authorFinderUsername, int i17, long j17) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberTicket, "memberTicket");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        this.f202693d = memberTicket;
        this.f202694e = authorFinderUsername;
        this.f202695f = i17;
        this.f202696g = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        int i17 = this.f202695f;
        return i17 != 6 ? i17 != 7 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.s0(this) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.r0(this) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.q0(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.u0(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        if (m56362x40f3992d(response) || (lVar = this.f202697h) == null) {
            return;
        }
        lVar.mo146xb9724478(response);
    }
}
