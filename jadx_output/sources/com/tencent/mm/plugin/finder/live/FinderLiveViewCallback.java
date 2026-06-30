package com.tencent.mm.plugin.finder.live;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/FinderLiveViewCallback;", "Lvd2/u1;", "Ltd2/c;", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "rfLayout", "Landroid/view/View;", "liveContainer", "Lcom/tencent/mm/ui/MMActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroidx/fragment/app/Fragment;", "fragment", "Lvd2/t1;", "presenter", "", "isFromFloat", "autoScrollToNext", "<init>", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout;Landroid/view/View;Lcom/tencent/mm/ui/MMActivity;Landroidx/fragment/app/Fragment;Lvd2/t1;ZZ)V", "vd2/u3", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveViewCallback implements vd2.u1, td2.c {
    public static int N;
    public final int A;
    public boolean B;
    public boolean C;
    public com.tencent.mm.plugin.finder.live.view.u7 D;
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f111481J;
    public long K;
    public boolean L;
    public long M;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f111482d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f111483e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f111484f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f111485g;

    /* renamed from: h, reason: collision with root package name */
    public final vd2.t1 f111486h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f111487i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f111488m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f111489n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.o f111490o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f111491p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView f111492q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager f111493r;

    /* renamed from: s, reason: collision with root package name */
    public final r45.qt2 f111494s;

    /* renamed from: t, reason: collision with root package name */
    public final vd2.z4 f111495t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f111496u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f111497v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f111498w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$LiveUninterestedListener$1 f111499x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$LiveSwipeToNextListener$1 f111500y;

    /* renamed from: z, reason: collision with root package name */
    public final int f111501z;

    /* JADX WARN: Type inference failed for: r2v13, types: [com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$LiveUninterestedListener$1] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$LiveSwipeToNextListener$1] */
    public FinderLiveViewCallback(com.tencent.mm.view.RefreshLoadMoreLayout rfLayout, android.view.View liveContainer, final com.tencent.mm.ui.MMActivity activity, androidx.fragment.app.Fragment fragment, vd2.t1 t1Var, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(rfLayout, "rfLayout");
        kotlin.jvm.internal.o.g(liveContainer, "liveContainer");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f111482d = rfLayout;
        this.f111483e = liveContainer;
        this.f111484f = activity;
        this.f111485g = fragment;
        this.f111486h = t1Var;
        this.f111487i = z17;
        this.f111488m = z18;
        this.f111489n = kotlinx.coroutines.z0.b();
        this.f111490o = fragment != null ? fragment.mo133getLifecycle() : null;
        this.f111491p = jz5.h.b(vd2.x4.f436005d);
        androidx.recyclerview.widget.RecyclerView recyclerView = rfLayout.getRecyclerView();
        kotlin.jvm.internal.o.e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView");
        this.f111492q = (com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView) recyclerView;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class))).V6();
        this.f111494s = V6;
        this.f111495t = new vd2.z4(activity, V6);
        this.f111496u = jz5.h.b(new vd2.a4(this));
        this.f111497v = jz5.h.b(vd2.b4.f435665d);
        this.f111499x = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveUninterestedEvent>(activity) { // from class: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$LiveUninterestedListener$1
            {
                this.__eventId = -1131845930;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveUninterestedEvent finderLiveUninterestedEvent) {
                com.tencent.mm.autogen.events.FinderLiveUninterestedEvent event = finderLiveUninterestedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new vd2.y3(event, com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.this));
                return true;
            }
        };
        this.f111500y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveSwipeToNextEvent>(activity) { // from class: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$LiveSwipeToNextListener$1
            {
                this.__eventId = 698339348;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveSwipeToNextEvent finderLiveSwipeToNextEvent) {
                com.tencent.mm.autogen.events.FinderLiveSwipeToNextEvent event = finderLiveSwipeToNextEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new vd2.w3(event, com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.this));
                return true;
            }
        };
        this.f111501z = activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479667c4) + activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) + com.tencent.mm.ui.bl.h(activity);
        this.A = activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479667c4) + com.tencent.mm.ui.bl.c(activity);
        this.E = true;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.M = -1L;
    }

    public static final void a(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, int i17, boolean z17) {
        android.view.View findViewByPosition;
        com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager = finderLiveViewCallback.f111493r;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = (finderLiveLayoutManager == null || (findViewByPosition = finderLiveLayoutManager.findViewByPosition(i17)) == null) ? null : (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) findViewByPosition.findViewById(com.tencent.mm.R.id.f484854fq1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyViewShowFinderNewGuide viewPos:");
        sb6.append(i17);
        sb6.append(",view:");
        sb6.append(finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", sb6.toString());
        if (finderLiveVisitorPluginLayout != null) {
            finderLiveVisitorPluginLayout.showFinderNewGuide(z17);
        }
    }

    public static final void j(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, int i17, java.util.ArrayList arrayList) {
        km2.n nVar;
        finderLiveViewCallback.getClass();
        arrayList.remove(i17);
        androidx.recyclerview.widget.f2 adapter = finderLiveViewCallback.f111492q.getAdapter();
        if (adapter != null) {
            adapter.notifyItemRemoved(i17);
        }
        if (finderLiveViewCallback.f111486h == null || (nVar = dk2.ef.H) == null || i17 >= nVar.d()) {
            return;
        }
        nVar.h(nVar.d() - 1);
    }

    public static final void l(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, int i17) {
        km2.m E;
        com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager;
        android.view.View findViewByPosition;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        androidx.recyclerview.widget.f2 adapter = finderLiveViewCallback.f111492q.getAdapter();
        if (!(adapter instanceof vd2.s1) || (E = ((vd2.s1) adapter).E(i17)) == null || (finderLiveLayoutManager = finderLiveViewCallback.f111493r) == null || (findViewByPosition = finderLiveLayoutManager.findViewByPosition(i17)) == null || (finderLiveVisitorPluginLayout = (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) findViewByPosition.findViewById(com.tencent.mm.R.id.f484854fq1)) == null) {
            return;
        }
        r45.nw1 Gj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(E.f309129d.f68537e);
        if (Gj != null && Gj.getInteger(2) == 2) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "pre startPlay pos = " + i17 + ", live name = " + E.f309129d.M + ", live id = " + E.f309129d.f68537e + " fail, live is finish!");
            return;
        }
        com.tencent.mm.live.api.LiveConfig liveConfig = E.f309129d;
        boolean preloadNextLive = finderLiveVisitorPluginLayout.preloadNextLive(liveConfig.f68537e, liveConfig.f68545p, java.lang.Integer.valueOf(liveConfig.f68547q));
        finderLiveViewCallback.G = true;
        E.f309134i = preloadNextLive;
        E.f309138p = true;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "pre startPlay pos = " + i17 + ", live name = " + E.f309129d.M + ", live id = " + E.f309129d.f68537e + ", preloadSuccess:" + preloadNextLive);
    }

    public static final void o(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, int i17) {
        km2.m E;
        android.view.View findViewByPosition;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        androidx.recyclerview.widget.f2 adapter = finderLiveViewCallback.f111492q.getAdapter();
        if ((adapter instanceof vd2.s1) && (E = ((vd2.s1) adapter).E(i17)) != null) {
            r45.nw1 Gj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(E.f309129d.f68537e);
            if (!(Gj != null && Gj.getInteger(2) == 2)) {
                long j17 = E.f309129d.f68537e;
                com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager = finderLiveViewCallback.f111493r;
                if (finderLiveLayoutManager == null || (findViewByPosition = finderLiveLayoutManager.findViewByPosition(i17)) == null || (finderLiveVisitorPluginLayout = (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) findViewByPosition.findViewById(com.tencent.mm.R.id.f484854fq1)) == null) {
                    return;
                }
                finderLiveVisitorPluginLayout.notifyShowCommentStorage(j17);
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "startPreShowComment pos = " + i17 + ", live name = " + E.f309129d.M + ", live id = " + E.f309129d.f68537e + " fail, live is finish!");
        }
    }

    public static final void s(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, int i17) {
        km2.m E;
        androidx.recyclerview.widget.f2 adapter = finderLiveViewCallback.f111492q.getAdapter();
        if ((adapter instanceof vd2.s1) && (E = ((vd2.s1) adapter).E(i17)) != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "pre stopPlay pos = " + i17 + ", live name = " + E.f309129d.M + ", live id = " + E.f309129d.f68537e + ", audienceMode:" + E.f309129d.f68547q);
            co0.b c17 = co0.b.f43709e2.c(E.f309129d.f68537e);
            if (c17 != null) {
                c17.T0(false);
            }
        }
    }

    public final void A(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#setNewGuide itemCount=" + i17 + " isRealHistory=" + z17);
        android.content.Context context = this.f111482d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#setNewGuide inSideBarStatus, return");
            return;
        }
        if (z17) {
            ae2.in inVar = ae2.in.f3688a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3840p1).getValue()).r()).intValue() == 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#setNewGuide FINDER_LIVE_REAL_HISTORY_GUIDE_ENABLE false, return");
                return;
            }
        } else if (!z17) {
            ae2.in inVar2 = ae2.in.f3688a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3820n1).getValue()).r()).intValue() == 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#setNewGuide FINDER_LIVE_GUIDE_ENABLE false, return");
                return;
            }
        }
        if (z17) {
            zl2.q4 q4Var = zl2.q4.f473933a;
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((java.lang.Boolean) m17).booleanValue()) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#setNewGuide is show history guide but more guide not showed, return");
                return;
            }
        }
        if (z17) {
            zl2.q4 q4Var2 = zl2.q4.f473933a;
            java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOW_LIVE_REAL_HISTORY_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.e(m18, "null cannot be cast to non-null type kotlin.Boolean");
            if (((java.lang.Boolean) m18).booleanValue()) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#setNewGuide you was showed, return");
                return;
            }
        } else {
            zl2.q4 q4Var3 = zl2.q4.f473933a;
            java.lang.Object m19 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_SERVER_FLAG_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.e(m19, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((java.lang.Boolean) m19).booleanValue()) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#setNewGuide you was showed, return");
                return;
            }
        }
        if (!(z17 || i17 > 1)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#setNewGuide isCanBeShow is false, return");
            return;
        }
        if (this.B) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#setNewGuide hasShowNewGuide is true, return");
            return;
        }
        this.B = true;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#setNewGuide finally come in!!!");
        vd2.s4 s4Var = new vd2.s4(this, z17);
        com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView finderLiveRecyclerView = this.f111492q;
        finderLiveRecyclerView.i(s4Var);
        finderLiveRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new vd2.v4(this, z17));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:165|(3:(1:282)(2:276|(2:278|(1:280)))|281|(0))(1:171)|172|(2:174|(6:176|177|(4:179|(1:181)(1:192)|182|(5:184|(1:186)(1:191)|187|(1:189)|190))|193|194|(2:196|(17:198|199|(1:201)(1:264)|202|(1:204)(1:263)|(1:206)|207|(1:209)(1:262)|210|(1:261)(1:216)|217|(6:241|242|(3:247|(2:(1:253)|255)|256)|258|(0)|256)|219|(1:221)(1:240)|222|(1:239)(2:226|(2:228|(3:230|(1:232)(1:235)|(1:234)))(2:237|238))|236)(2:265|266))(2:267|268)))(1:272)|271|177|(0)|193|194|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x043e, code lost:
    
        if (r9 != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0380, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0381, code lost:
    
        com.tencent.mars.xlog.Log.w(r6, "setReportParams e:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
    
        if (r0 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x030b A[Catch: all -> 0x0380, TryCatch #0 {all -> 0x0380, blocks: (B:194:0x0307, B:196:0x030b, B:198:0x0348, B:265:0x036c, B:266:0x0375, B:267:0x0376, B:268:0x037f), top: B:193:0x0307 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x040c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0376 A[Catch: all -> 0x0380, TryCatch #0 {all -> 0x0380, blocks: (B:194:0x0307, B:196:0x030b, B:198:0x0348, B:265:0x036c, B:266:0x0375, B:267:0x0376, B:268:0x037f), top: B:193:0x0307 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0674  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(int r42, com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r43, km2.m r44, boolean r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.B(int, com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout, km2.m, boolean, boolean):void");
    }

    @Override // km2.u
    public void g(int i17, int i18) {
        androidx.recyclerview.widget.f2 adapter;
        km2.n nVar;
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "onItemRemove startIndex=" + i17 + " count=" + i18);
        com.tencent.mm.ui.MMActivity mMActivity = this.f111484f;
        boolean isDestroyed = mMActivity.isDestroyed() | mMActivity.isFinishing();
        boolean z17 = false;
        int size = (this.f111486h == null || (nVar = dk2.ef.H) == null || (arrayList = nVar.f309153e) == null) ? 0 : arrayList.size();
        if (isDestroyed) {
            return;
        }
        if (i17 >= 0 && i17 < size) {
            z17 = true;
        }
        if (!z17 || (adapter = this.f111492q.getAdapter()) == null) {
            return;
        }
        adapter.notifyItemRangeRemoved(i17, i18);
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f111484f;
    }

    @Override // td2.c
    public void onCreate(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        alive();
        alive();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onCreate " + this + ", lifecycleOwner:" + var1);
        mn0.i0.H.b("LiveOnCreate", android.os.SystemClock.elapsedRealtime());
    }

    @Override // td2.c
    public void onDestroy(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onDestroy " + this + ", lifecycleOwner:" + var1);
        androidx.recyclerview.widget.f2 adapter = this.f111492q.getAdapter();
        vd2.s1 s1Var = adapter instanceof vd2.s1 ? (vd2.s1) adapter : null;
        if (s1Var != null) {
            java.lang.String str = s1Var.f435907m;
            com.tencent.mars.xlog.Log.i(str, "releasePAG");
            java.util.Vector vector = new java.util.Vector();
            vector.addAll(s1Var.f435909o);
            java.util.Iterator it = vector.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) ((java.lang.ref.WeakReference) it.next()).get();
                if (finderLiveVisitorPluginLayout != null) {
                    int uiState = finderLiveVisitorPluginLayout.getUiState();
                    int i17 = qs5.r.f366463a;
                    if (uiState != 3) {
                        com.tencent.mars.xlog.Log.i(str, "releasePAG onDestroy");
                        finderLiveVisitorPluginLayout.releasePAG();
                        com.tencent.mars.xlog.Log.i(str, "releasePAG done");
                    }
                }
            }
        }
        this.f111493r = null;
        kotlinx.coroutines.z0.e(this.f111489n, null, 1, null);
        dead();
        dead();
        N = 0;
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        a52.a.f1578f.clear();
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f111482d;
        android.content.Context context = refreshLoadMoreLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((pl2.x) uVar.b(context).a(pl2.x.class)).P6(false);
        android.content.Context context2 = refreshLoadMoreLayout.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        if (kotlin.jvm.internal.o.b(((pl2.x) uVar.b(context2).a(pl2.x.class)).f356685h, this.f111486h)) {
            android.content.Context context3 = refreshLoadMoreLayout.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            pl2.s sVar = ((pl2.x) uVar.b(context3).a(pl2.x.class)).f356684g;
            if (sVar != null) {
                sVar.k();
            }
            android.content.Context context4 = refreshLoadMoreLayout.getContext();
            kotlin.jvm.internal.o.f(context4, "getContext(...)");
            ((pl2.x) uVar.b(context4).a(pl2.x.class)).f356684g = null;
            android.content.Context context5 = refreshLoadMoreLayout.getContext();
            kotlin.jvm.internal.o.f(context5, "getContext(...)");
            ((pl2.x) uVar.b(context5).a(pl2.x.class)).f356685h = null;
        }
    }

    @Override // td2.c
    public void onPause(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onPause " + this + ", lifecycleOwner:" + var1);
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = this.f111495t.f436054e;
        if (finderLiveVisitorPluginLayout != null) {
            finderLiveVisitorPluginLayout.pause();
        }
    }

    @Override // td2.c
    public void onResume(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onResume " + this + ", lifecycleOwner:" + var1);
        vd2.z4 z4Var = this.f111495t;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = z4Var.f436054e;
        if (finderLiveVisitorPluginLayout != null) {
            km2.m data = finderLiveVisitorPluginLayout.getData();
            dk2.ef efVar = dk2.ef.f233372a;
            gk2.e o07 = efVar.o0(data);
            boolean shouldReactiveAfterResume = finderLiveVisitorPluginLayout.getShouldReactiveAfterResume();
            if (o07 != null && shouldReactiveAfterResume) {
                efVar.g0(finderLiveVisitorPluginLayout.getLiveDataForReactiveAfterResume());
                gk2.e liveContextForReactiveAfterResume = finderLiveVisitorPluginLayout.getLiveContextForReactiveAfterResume();
                if (liveContextForReactiveAfterResume != null) {
                    o07 = liveContextForReactiveAfterResume;
                }
                efVar.g(o07, data.f309131f, finderLiveVisitorPluginLayout, 0, this.f111494s);
                finderLiveVisitorPluginLayout.bindData(data);
                com.tencent.mm.live.api.LiveConfig liveConfig = data.f309129d;
                finderLiveVisitorPluginLayout.preloadLive(liveConfig.f68537e, liveConfig.f68545p, java.lang.Integer.valueOf(liveConfig.f68547q), (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? false : true);
                finderLiveVisitorPluginLayout.activate(data, false, false);
                finderLiveVisitorPluginLayout.mount();
                finderLiveVisitorPluginLayout.setShouldReactiveAfterResume(false);
                finderLiveVisitorPluginLayout.setLiveDataForReactiveAfterResume(null);
                finderLiveVisitorPluginLayout.setLiveContextForReactiveAfterResume(null);
            }
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout2 = z4Var.f436054e;
        if (finderLiveVisitorPluginLayout2 != null) {
            finderLiveVisitorPluginLayout2.resume();
        }
        dk2.ef efVar2 = dk2.ef.f233372a;
        mm2.c1 c1Var = (mm2.c1) efVar2.i(mm2.c1.class);
        if (c1Var != null) {
            c1Var.O1 = true;
        }
        mm2.c1 c1Var2 = (mm2.c1) efVar2.i(mm2.c1.class);
        if (c1Var2 == null) {
            return;
        }
        c1Var2.K8(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if ((!((mm2.c1) r9.a(mm2.c1.class)).a8()) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // td2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart(androidx.lifecycle.y r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.onStart(androidx.lifecycle.y):void");
    }

    @Override // td2.c
    public void onStop(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onStop " + this + ", lifecycleOwner:" + var1);
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = this.f111495t.f436054e;
        if (finderLiveVisitorPluginLayout != null) {
            finderLiveVisitorPluginLayout.stop();
        }
    }

    @Override // km2.u
    public void q(int i17, int i18) {
        androidx.recyclerview.widget.f2 adapter;
        km2.n nVar;
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "onItemInserted position=" + i17 + " count=" + i18);
        com.tencent.mm.ui.MMActivity mMActivity = this.f111484f;
        boolean isDestroyed = mMActivity.isDestroyed() | mMActivity.isFinishing();
        boolean z17 = false;
        int size = (this.f111486h == null || (nVar = dk2.ef.H) == null || (arrayList = nVar.f309153e) == null) ? 0 : arrayList.size();
        if (isDestroyed) {
            return;
        }
        if (i17 >= 0 && i17 <= size) {
            z17 = true;
        }
        if (!z17 || (adapter = this.f111492q.getAdapter()) == null) {
            return;
        }
        adapter.notifyItemRangeInserted(i17, i18);
    }

    public final void t() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#attachSnapHelperToRV");
        ((com.tencent.mm.plugin.finder.ui.o6) ((jz5.n) this.f111491p).getValue()).b(this.f111492q);
    }

    public final void u(int i17) {
        android.view.View findViewByPosition;
        com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager = this.f111493r;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = (finderLiveLayoutManager == null || (findViewByPosition = finderLiveLayoutManager.findViewByPosition(i17)) == null) ? null : (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) findViewByPosition.findViewById(com.tencent.mm.R.id.f484854fq1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyViewHideFinderNewGuide viewPos:");
        sb6.append(i17);
        sb6.append(",view:");
        sb6.append(finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", sb6.toString());
        if (finderLiveVisitorPluginLayout != null) {
            finderLiveVisitorPluginLayout.hideFinderNewGuide();
        }
    }

    public final void v(int i17, java.lang.String str, int i18) {
        com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC finderLiveVisitorUIC;
        if (!((java.lang.Boolean) ((jz5.n) this.f111497v).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "prepareNextLive: switch off");
            return;
        }
        androidx.fragment.app.Fragment fragment = this.f111485g;
        com.tencent.mm.ui.MMActivity activity = this.f111484f;
        if (fragment == null || (finderLiveVisitorUIC = (com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.class)) == null) {
            kotlin.jvm.internal.o.g(activity, "activity");
            finderLiveVisitorUIC = (com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.class);
        }
        if (finderLiveVisitorUIC == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveViewCallback", "prepareNextLive: uic is null, source=" + str + ", activity=" + activity + ", fragment=" + fragment);
            return;
        }
        if (finderLiveVisitorUIC.f117003h) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveViewCallback", "prepareNextLive: has been uninited, source=" + str + ", isFinishing=" + activity.isFinishing());
            return;
        }
        int i19 = i18 >= 0 ? i18 : i17 + 1;
        if (java.lang.Math.abs(i19 - i17) != 1) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveViewCallback", "prepareNextLive: pos error, source=" + str + ", curPos=" + i17 + ", nextPos=" + i18 + ", realNextPos=" + i19);
            return;
        }
        androidx.recyclerview.widget.f2 adapter = this.f111492q.getAdapter();
        if (!(adapter instanceof vd2.s1)) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveViewCallback", "prepareNextLive: source=" + str + ", realNextPos=" + i19 + " liveAdapter cast err!");
            return;
        }
        km2.m E = ((vd2.s1) adapter).E(i19);
        if (E == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveViewCallback", "prepareNextLive: source=" + str + ", realNextPos=" + i19 + " data is empty!");
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager = this.f111493r;
        android.view.View findViewByPosition = finderLiveLayoutManager != null ? finderLiveLayoutManager.findViewByPosition(i19) : null;
        if (findViewByPosition == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveViewCallback", "prepareNextLive: source=" + str + ", realNextPos=" + i19 + " layout manager child is empty!");
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) findViewByPosition.findViewById(com.tencent.mm.R.id.f484854fq1);
        if (finderLiveVisitorPluginLayout == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveViewCallback", "prepareNextLive: source=" + str + ", realNextPos=" + i19 + " pluginLayout is null!");
            return;
        }
        com.tencent.mm.live.api.LiveConfig liveConfig = E.f309129d;
        long j17 = liveConfig.f68537e;
        java.lang.String str2 = liveConfig.f68545p;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "prepareNextLive: trigger preload, ret=" + finderLiveVisitorPluginLayout.prepareNextLive(j17, str2, liveConfig.f68547q) + ", source=" + str + ", curPos=" + i17 + ", realNextPos=" + i19 + ", liveId=" + pm0.v.u(j17) + ", url=" + str2);
    }

    public final void w() {
        java.lang.Boolean bool;
        km2.r rVar;
        vd2.t1 t1Var = this.f111486h;
        if (t1Var != null) {
            vd2.v2 v2Var = (vd2.v2) t1Var;
            km2.n nVar = dk2.ef.H;
            boolean z17 = (nVar == null || (rVar = nVar.f309151c) == null || rVar.f309207l != 1) ? false : true;
            com.tencent.mars.xlog.Log.i("FinderLivePresenter", "isEnableNestedScroll hasLoadMore:" + v2Var.f435945g + ", canPullMore:" + z17);
            boolean z18 = v2Var.f435945g || z17;
            com.tencent.mars.xlog.Log.i("FinderLivePresenter", "isEnableNestedScroll " + z18);
            bool = java.lang.Boolean.valueOf(z18);
        } else {
            bool = null;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "refreshLoadMoreAbility:" + bool);
        this.f111482d.setEnableNestedScroll(true ^ kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE));
    }

    public final void x(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "reportScrollEvent isLoadMore=" + z17 + " isExposure=" + z18);
        if (z18 || !this.C) {
            if (!z18) {
                this.C = true;
            }
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            r0Var.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("event", z17 ? 1 : 2);
            jSONObject.put("event_res", z18 ? 1 : 2);
            ml2.r0.hj(r0Var, ml2.b4.W, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    public final void y(boolean z17) {
        if (N == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "#cancelNewGuide isRealHistory=" + z17);
        N = 0;
        if (z17) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOW_LIVE_REAL_HISTORY_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            return;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        zl2.q4 q4Var = zl2.q4.f473933a;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_SERVER_FLAG_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
    }

    public final void z(int i17, int i18) {
        vd2.u3 u3Var = new vd2.u3(this, i18);
        u3Var.f12049a = i17;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f111492q.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(u3Var);
        }
    }

    public /* synthetic */ FinderLiveViewCallback(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, android.view.View view, com.tencent.mm.ui.MMActivity mMActivity, androidx.fragment.app.Fragment fragment, vd2.t1 t1Var, boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        this(refreshLoadMoreLayout, view, mMActivity, fragment, t1Var, z17, (i17 & 64) != 0 ? false : z18);
    }
}
