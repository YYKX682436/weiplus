package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderColumnFeedListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/r", "com/tencent/mm/plugin/finder/feed/model/s", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderColumnFeedListLoader */
/* loaded from: classes2.dex */
public final class C13853x7a09fceb extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f188928d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f188929e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f188930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13853x7a09fceb(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, r45.qt2 qt2Var, java.lang.String feedVMKey) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedVMKey, "feedVMKey");
        this.f188928d = feedVMKey;
        this.f188929e = new java.lang.Object();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF204960d(), "FinderGlobalVMStore getViewModel init:".concat(feedVMKey));
        ey2.u uVar = (ey2.u) ey2.l0.f338955a.a(feedVMKey, ey2.u.class, null);
        if (uVar != null) {
            uVar.f339075x.mo7806x9d92d11c(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.q(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        java.lang.String f204960d = getF204960d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderGlobalVMStore getViewModel createDataFetch:");
        java.lang.String str = this.f188928d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f204960d, sb6.toString());
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r(this, (ey2.u) ey2.l0.f338955a.a(str, ey2.u.class, null));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        if (m56362x40f3992d(response) || (lVar = this.f188930f) == null) {
            return;
        }
        lVar.mo146xb9724478(response);
    }
}
