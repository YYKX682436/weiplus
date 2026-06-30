package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderPoiFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/g5", "com/tencent/mm/plugin/finder/feed/model/h5", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader */
/* loaded from: classes2.dex */
public class C13879x1453fa95 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f189067d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f96 f189068e;

    /* renamed from: f, reason: collision with root package name */
    public zy2.o9 f189069f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Integer f189070g;

    /* renamed from: h, reason: collision with root package name */
    public int f189071h;

    /* renamed from: i, reason: collision with root package name */
    public int f189072i;

    /* renamed from: m, reason: collision with root package name */
    public int f189073m;

    /* renamed from: n, reason: collision with root package name */
    public long f189074n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f189075o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f189076p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f189077q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f189078r;

    /* renamed from: s, reason: collision with root package name */
    public r45.bp2 f189079s;

    /* renamed from: t, reason: collision with root package name */
    public int f189080t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa f189081u;

    /* renamed from: v, reason: collision with root package name */
    public long f189082v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f189083w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f189084x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.g5 f189065y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.g5(null);

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.HashMap f189066z = new java.util.HashMap();
    public static final java.util.concurrent.locks.ReentrantLock A = new java.util.concurrent.locks.ReentrantLock();

    public C13879x1453fa95() {
        this(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ha) ((jz5.n) this.f189067d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.j5(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: onFeedUpdateEventCallback */
    public void mo55427x3506b359(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        super.mo55427x3506b359(event);
        if (this.f189073m == 2) {
            am.ia iaVar = event.f135785g;
            if (iaVar.f88452b == 4) {
                java.util.Iterator it = m56387xe6796cde().iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it.next();
                    if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59251x5db1b11() == iaVar.f88451a) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i17 != -1) {
                    getDispatcher().c(i17, 1, new jz5.l(3, 1));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        this.f189078r = false;
        if (!m56362x40f3992d(response) && this.f189081u == null) {
            this.f189082v = java.lang.System.currentTimeMillis() / 1000;
            this.f189081u = response;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: requestLoadMore */
    public boolean mo55589x84fe90a(boolean z17) {
        this.f189078r = true;
        return super.mo55589x84fe90a(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: requestRefresh */
    public void mo56155xd210094c() {
        getTAG();
        m56357x44e5026c();
        if (this.f189081u != null && this.f189083w) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l5(this));
            return;
        }
        if (this.f189078r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(getTAG(), "requestRefresh() skip since it is requesting");
            return;
        }
        this.f189079s = null;
        this.f189080t = 0;
        ((java.util.ArrayList) this.f189077q).clear();
        this.f189075o = null;
        this.f189076p = null;
        this.f189081u = null;
        this.f189082v = 0L;
        this.f189078r = true;
        m56357x44e5026c();
        super.mo56155xd210094c();
    }

    public C13879x1453fa95(r45.qt2 qt2Var) {
        super(qt2Var);
        this.f189067d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.k5(this));
        this.f189077q = new java.util.ArrayList();
        this.f189084x = "";
    }
}
