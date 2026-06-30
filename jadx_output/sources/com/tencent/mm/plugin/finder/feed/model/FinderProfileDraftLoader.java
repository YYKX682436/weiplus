package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileDraftLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderProfileFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/f6", "com/tencent/mm/plugin/finder/feed/model/g6", "com/tencent/mm/plugin/finder/feed/model/h6", "com/tencent/mm/plugin/finder/feed/model/i6", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileDraftLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderProfileFeedLoader {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f107579o = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f107580d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f107581e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f107582f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f107583g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.finder.feed.model.f6 f107584h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$draftAddListener$1 f107585i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$draftProgressListener$1 f107586m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.m6 f107587n;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$draftAddListener$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$draftProgressListener$1] */
    public FinderProfileDraftLoader(java.lang.String str, r45.qt2 qt2Var, boolean z17) {
        super(qt2Var);
        this.f107580d = str;
        this.f107581e = z17;
        this.f107584h = com.tencent.mm.plugin.finder.feed.model.f6.f107856d;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f107585i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderDraftOpEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$draftAddListener$1
            {
                this.__eventId = -1184188978;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderDraftOpEvent finderDraftOpEvent) {
                com.tencent.mm.autogen.events.FinderDraftOpEvent event = finderDraftOpEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.V(0L, new com.tencent.mm.plugin.finder.feed.model.l6(event, com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader.this));
                return false;
            }
        };
        this.f107586m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$draftProgressListener$1
            {
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ga gaVar = event.f54250g;
                if (gaVar == null) {
                    return true;
                }
                long j17 = gaVar.f6749a;
                int i17 = com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader.f107579o;
                com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader = com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader.this;
                finderProfileDraftLoader.getClass();
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.o6(finderProfileDraftLoader, j17, false));
                return true;
            }
        };
        this.f107587n = new com.tencent.mm.plugin.finder.feed.model.m6(this);
    }

    public static final java.util.ArrayList c(com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader, java.util.ArrayList arrayList, java.lang.String str) {
        finderProfileDraftLoader.getClass();
        if ((str.length() == 0) || !kotlin.jvm.internal.o.b(str, xy2.c.f(finderProfileDraftLoader.getContextObj()))) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.util.List a17 = cq.n1.a((cq.k) c17, null, java.lang.Boolean.FALSE);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            arrayList3.add(com.tencent.mm.plugin.finder.storage.x80.N.a((ni0.h) it.next()));
        }
        arrayList2.addAll(kz5.n0.F0(arrayList3, new com.tencent.mm.plugin.finder.feed.model.n6()));
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        Oj.getClass();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        android.database.Cursor f17 = Oj.f222428i.f("SELECT * FROM FinderDraftItem  WHERE " + Oj.f222424e + " AND " + Oj.f222426g + " AND " + Oj.f222427h + " ORDER BY " + Oj.f222423d + ".localId DESC", null, 2);
        while (f17.moveToNext()) {
            com.tencent.mm.plugin.finder.storage.x80 x80Var = new com.tencent.mm.plugin.finder.storage.x80();
            x80Var.convertFrom(f17);
            arrayList4.add(x80Var);
        }
        f17.close();
        arrayList2.addAll(arrayList4);
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.finder.storage.x80 x80Var2 = (com.tencent.mm.plugin.finder.storage.x80) it6.next();
            java.util.Iterator it7 = arrayList4.iterator();
            int i17 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((com.tencent.mm.plugin.finder.storage.x80) it7.next()).field_objectId == x80Var2.field_objectId) {
                    break;
                }
                i17++;
            }
            if (i17 >= 0) {
                com.tencent.mars.xlog.Log.i(finderProfileDraftLoader.getB(), "object exist in local: " + x80Var2.field_objectId);
            } else {
                arrayList2.add(x80Var2);
            }
        }
        return arrayList2;
    }

    public static final void d(com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader, boolean z17, java.util.ArrayList arrayList) {
        finderProfileDraftLoader.getClass();
        if (z17) {
            return;
        }
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        Oj.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.database.Cursor f17 = Oj.f222428i.f("SELECT * FROM FinderDraftItem  WHERE dbversion=0 ORDER BY " + Oj.f222423d + ".localId DESC", null, 2);
        while (f17.moveToNext()) {
            com.tencent.mm.plugin.finder.storage.x80 x80Var = new com.tencent.mm.plugin.finder.storage.x80();
            x80Var.convertFrom(f17);
            arrayList2.add(x80Var);
        }
        f17.close();
        arrayList.addAll(arrayList2);
        com.tencent.mars.xlog.Log.i(finderProfileDraftLoader.getB(), "append originalVersionItems size:" + arrayList2.size());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return this.f107581e ? new com.tencent.mm.plugin.finder.feed.model.i6(this) : new com.tencent.mm.plugin.finder.feed.model.g6(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.k6(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public void onAlive() {
        super.onAlive();
        alive();
        alive();
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0 f0Var = mv2.f0.f331561a;
        pm0.v.X(new mv2.r(this.f107587n));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public void onDead() {
        super.onDead();
        dead();
        dead();
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0 f0Var = mv2.f0.f331561a;
        pm0.v.X(new mv2.b0(this.f107587n));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderProfileFeedLoader, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.a aVar;
        kotlin.jvm.internal.o.g(response, "response");
        if (2 == response.getPullType()) {
            this.f107582f = false;
        }
        super.onFetchDone(response);
        if (2 != response.getPullType()) {
            com.tencent.mm.plugin.finder.feed.model.f6 f6Var = this.f107584h;
            com.tencent.mm.plugin.finder.feed.model.f6 f6Var2 = com.tencent.mm.plugin.finder.feed.model.f6.f107858f;
            if (f6Var != f6Var2) {
                java.util.List incrementList = response.getIncrementList();
                if ((incrementList != null ? incrementList.size() : 0) <= 0) {
                    f6Var2 = com.tencent.mm.plugin.finder.feed.model.f6.f107857e;
                }
                this.f107584h = f6Var2;
                com.tencent.mars.xlog.Log.i(getB(), "onFetchDone cachedState :" + this.f107584h);
            }
        }
        if (response.getHasMore() || (aVar = this.f107583g) == null) {
            return;
        }
        aVar.invoke();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public boolean requestLoadMore(boolean z17) {
        if (this.f107582f) {
            com.tencent.mars.xlog.Log.i(getB(), "isLoadingMore return");
            return false;
        }
        this.f107582f = true;
        return super.requestLoadMore(z17);
    }
}
