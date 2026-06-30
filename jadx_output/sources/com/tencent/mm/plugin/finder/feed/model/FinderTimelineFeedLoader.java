package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderTimelineFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/b8", "com/tencent/mm/plugin/finder/feed/model/h8", "com/tencent/mm/plugin/finder/feed/model/m8", "com/tencent/mm/plugin/finder/feed/model/n8", "com/tencent/mm/plugin/finder/feed/model/o8", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderTimelineFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {
    public static final /* synthetic */ int B = 0;
    public yz5.l A;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.m0 f107648d;

    /* renamed from: e, reason: collision with root package name */
    public int f107649e;

    /* renamed from: f, reason: collision with root package name */
    public final eb2.f0 f107650f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f107651g;

    /* renamed from: h, reason: collision with root package name */
    public final eb2.m0 f107652h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f107653i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f107654m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f107655n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f107656o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f107657p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f107658q;

    /* renamed from: r, reason: collision with root package name */
    public int f107659r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.p f107660s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f107661t;

    /* renamed from: u, reason: collision with root package name */
    public long f107662u;

    /* renamed from: v, reason: collision with root package name */
    public long f107663v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f107664w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f107665x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f107666y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f107667z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderTimelineFeedLoader(com.tencent.mm.plugin.finder.feed.model.internal.m0 scene, int i17, r45.qt2 qt2Var, eb2.f0 requestArgs, yz5.p pVar, int i18, kotlin.jvm.internal.i iVar) {
        super(qt2Var);
        i17 = (i18 & 2) != 0 ? 0 : i17;
        requestArgs = (i18 & 8) != 0 ? new eb2.f0() : requestArgs;
        pVar = (i18 & 16) != 0 ? null : pVar;
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(requestArgs, "requestArgs");
        this.f107648d = scene;
        this.f107649e = i17;
        this.f107650f = requestArgs;
        this.f107651g = pVar;
        this.f107652h = new eb2.m0(scene.f108034d, qt2Var, requestArgs);
        this.f107661t = jz5.h.b(com.tencent.mm.plugin.finder.feed.model.v8.f108416d);
    }

    public final void c() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        getDataList().clear();
        java.lang.ref.WeakReference weakReference = this.f107654m;
        if (weakReference == null || (recyclerView = (androidx.recyclerview.widget.RecyclerView) weakReference.get()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public java.util.List colletExtraPageName() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(4);
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        com.tencent.mm.plugin.finder.feed.model.internal.m0 m0Var = com.tencent.mm.plugin.finder.feed.model.internal.m0.f108020m;
        eb2.m0 m0Var2 = this.f107652h;
        com.tencent.mm.plugin.finder.feed.model.internal.m0 m0Var3 = this.f107648d;
        return m0Var3 == m0Var ? new com.tencent.mm.plugin.finder.feed.model.h8(this, m0Var2, m0Var3) : new com.tencent.mm.plugin.finder.feed.model.m8(this, m0Var2, m0Var3);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.u8(this);
    }

    public final void d() {
        int size = getDataList().size();
        com.tencent.mars.xlog.Log.i(getF123427d(), "[clearKeepFirst] len:" + size);
        if (size > 1) {
            so2.j5 j5Var = (so2.j5) kz5.n0.X(getDataList());
            getDataList().clear();
            getDataList().add(j5Var);
            getDispatcher().e(1, size - 1);
        }
    }

    public final boolean e(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        if (!baseFinderFeed.N0()) {
            return false;
        }
        if (!baseFinderFeed.getFeedObject().isPostFinish()) {
            return true;
        }
        long j17 = this.f107662u;
        return j17 != 0 && j17 == baseFinderFeed.getFeedObject().getLocalId();
    }

    public final void f(int i17, java.util.List list) {
        com.tencent.mm.plugin.finder.viewmodel.component.j1 j1Var;
        kotlin.jvm.internal.o.g(list, "list");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                if (hc2.o0.D(baseFinderFeed.getFeedObject().getFeedObject(), false)) {
                    com.tencent.mm.plugin.finder.viewmodel.component.m1 a17 = com.tencent.mm.plugin.finder.viewmodel.component.m1.f135109d.a();
                    com.tencent.mm.protocal.protobuf.FinderObject feed = baseFinderFeed.getFeedObject().getFeedObject();
                    a17.getClass();
                    kotlin.jvm.internal.o.g(feed, "feed");
                    if (com.tencent.mm.plugin.finder.viewmodel.component.m1.f135110e.contains(java.lang.Integer.valueOf(i17))) {
                        java.util.Set set = a17.f135114c;
                        if (!set.contains(java.lang.Long.valueOf(feed.getId())) && (j1Var = (com.tencent.mm.plugin.finder.viewmodel.component.j1) a17.f135112a.get(new com.tencent.mm.plugin.finder.viewmodel.component.k1(feed.getId(), i17))) != null) {
                            if (j1Var.f134794f < 2) {
                                j1Var.f134794f = 2;
                            }
                            j1Var.f134796h = java.lang.System.currentTimeMillis();
                            com.tencent.mars.xlog.Log.i("Finder.AdTraceMgr", "onFeedLoaderConsume dispatchFeed=" + j1Var + " [consume-dispatch]=" + (j1Var.f134796h - j1Var.f134795g) + "ms");
                            set.add(java.lang.Long.valueOf(feed.getId()));
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.finder.viewmodel.component.m1 a18 = com.tencent.mm.plugin.finder.viewmodel.component.m1.f135109d.a();
        a18.getClass();
        if (com.tencent.mm.plugin.finder.viewmodel.component.m1.f135110e.contains(java.lang.Integer.valueOf(i17))) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.finder.viewmodel.component.l1 l1Var = new com.tencent.mm.plugin.finder.viewmodel.component.l1(a18, i17);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(l1Var, 1000L, false);
        }
    }

    public final void g(java.util.List list, rn5.a aVar, com.tencent.mm.plugin.finder.feed.model.e eVar, boolean z17) {
        this.f107658q = false;
        this.f107657p = false;
        int i17 = this.f107649e;
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.plugin.finder.feed.model.internal.m0 m0Var = this.f107648d;
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (t70Var.M0().f126614b > 0) {
                java.lang.Object Z = kz5.n0.Z(getDataList());
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = Z instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) Z : null;
                if (baseFinderFeed == null || !e(baseFinderFeed)) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed N6 = ((ey2.b1) uVar.e(c61.l7.class).a(ey2.b1.class)).N6(i17, hc2.d0.b(m0Var.f108034d));
                    if (N6 != null) {
                        N6.N1(3);
                        com.tencent.mars.xlog.Log.i(getF123427d(), "[useLocalBackupFeedIfNeeded] feedId=" + N6.getFeedObject().getFinderObject().getId());
                        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.finder.feed.model.x8(i17, N6, this), (long) (t70Var.M0().f126613a * 1000.0d));
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(getF123427d(), "has self posting feed, return");
                }
            }
        }
        int i18 = this.f107649e;
        com.tencent.mm.plugin.finder.feed.model.n8 n8Var = new com.tencent.mm.plugin.finder.feed.model.n8(i18, list);
        n8Var.f108212a = i18;
        n8Var.f108216e = aVar;
        n8Var.f108218g = z17;
        if (z17 && i18 == 1) {
            setInnerLoadingMore(false);
        }
        com.tencent.mars.xlog.Log.i(getF123427d(), "[requestRefresh] tabtype=" + m0Var.f108034d + " pullType=" + n8Var.f108212a + " cancelLoadMore:" + z17);
        super.request(n8Var, this);
        if (this.f107649e == 0) {
            this.f107666y = true;
            this.f107649e = 1;
            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127636c7).getValue()).r()).intValue() == 0 && m0Var.f108034d == 4) {
                androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(ey2.t0.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                ey2.t0 t0Var = (ey2.t0) a17;
                ey2.o0 N62 = t0Var.N6(4);
                if (N62.f257448h < 0 || !t0Var.R6(4)) {
                    return;
                }
                N62.f257452l = false;
                com.tencent.mars.xlog.Log.i(getF123427d(), "stateCache=" + N62.hashCode() + " reset isAtAppPush");
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int getPageName() {
        return hc2.d0.a(hc2.d0.d(this.f107648d.f108034d));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public boolean isObservePostEvent() {
        return this.f107648d == (((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).qj() ? com.tencent.mm.plugin.finder.feed.model.internal.m0.f108023p : com.tencent.mm.plugin.finder.feed.model.internal.m0.f108022o) || ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() != 1;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public void onDataChanged() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public void onDead() {
        super.onDead();
        if (this.f107652h.f250831s && !this.f107650f.f250753l && (this.f107652h.f250832t == 0 || this.f107652h.f250832t == 4 || this.f107652h.f250832t == 1)) {
            int i17 = this.f107648d.f108034d;
            bs2.n1 R6 = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).R6(i17);
            if (R6 != null) {
                R6.x(true, bs2.h0.f23853p);
            }
            com.tencent.mars.xlog.Log.w(getF123427d(), "[onDead] but finderstream is running. tabType=" + i17 + " pullType=" + this.f107652h.f250832t);
        }
        this.f107652h.f250825m.dead();
        kotlinx.coroutines.z0.d(this.f107652h.f250826n, getF123427d() + ":onDead", null, 2, null);
        this.f107651g = null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchLoadMoreDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchLoadMoreDone(response);
        yz5.p pVar = this.f107660s;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.FALSE, response);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchRefreshDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchRefreshDone(response);
        eb2.f0 f0Var = this.f107650f;
        boolean z17 = f0Var != null && f0Var.f250749h == 1;
        com.tencent.mm.plugin.finder.feed.model.internal.m0 m0Var = this.f107648d;
        if (z17 && m0Var.f108034d == 4) {
            this.f107656o = true;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = null;
        com.tencent.mm.plugin.finder.feed.model.o8 o8Var = response instanceof com.tencent.mm.plugin.finder.feed.model.o8 ? (com.tencent.mm.plugin.finder.feed.model.o8) response : null;
        if (o8Var != null && o8Var.getPullType() == 0) {
            if (response.getErrType() == 0 && response.getErrCode() == 0) {
                this.f107665x = true;
            }
            java.util.List incrementList = o8Var.getIncrementList();
            if (incrementList != null) {
                java.util.Iterator it = incrementList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it.next();
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                    if (baseFinderFeed2 != null) {
                        baseFinderFeed = baseFinderFeed2;
                        break;
                    }
                }
                if (baseFinderFeed != null) {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = baseFinderFeed.getFeedObject().getFeedObject();
                    int i17 = m0Var.f108034d;
                    kotlin.jvm.internal.o.g(finderObject, "finderObject");
                    if (com.tencent.mm.plugin.finder.extension.reddot.e2.f105487b != 0 && i17 == com.tencent.mm.plugin.finder.extension.reddot.e2.f105486a) {
                        pm0.z.b(xy2.b.f458155b, "finderEnterRefreshWrongRedDotFeed", finderObject.getId() == com.tencent.mm.plugin.finder.extension.reddot.e2.f105487b, null, null, false, false, new com.tencent.mm.plugin.finder.extension.reddot.d2(finderObject, i17), 60, null);
                        com.tencent.mm.plugin.finder.extension.reddot.e2.f105486a = -1;
                        com.tencent.mm.plugin.finder.extension.reddot.e2.f105487b = 0L;
                        com.tencent.mm.plugin.finder.extension.reddot.e2.f105488c = "";
                    }
                }
            }
        }
        yz5.p pVar = this.f107660s;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.TRUE, response);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed onPostStart(long j17, boolean z17) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed onPostStart = super.onPostStart(j17, z17);
        this.f107653i = true;
        return onPostStart;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int removeByLocalId(long j17, boolean z17) {
        if (j17 == this.f107662u) {
            this.f107662u = 0L;
        }
        return super.removeByLocalId(j17, z17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void requestPreload(com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        super.requestPreload(n0Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int supportMemberFeedType() {
        return ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).qj() ? 1 : 0;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, mv2.w0
    public void onPostStart(long j17) {
        super.onPostStart(j17);
        this.f107653i = true;
        com.tencent.mars.xlog.Log.i(getF123427d(), "onPostStart postFeedFlag true");
    }
}
