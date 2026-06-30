package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class pz extends fc2.d implements com.tencent.mm.plugin.finder.feed.bt, im5.b {
    public static final com.tencent.mm.plugin.finder.feed.ew M1 = new com.tencent.mm.plugin.finder.feed.ew(null);
    public static final java.util.concurrent.ConcurrentHashMap N1 = new java.util.concurrent.ConcurrentHashMap();
    public static final java.util.concurrent.CopyOnWriteArrayList O1 = new java.util.concurrent.CopyOnWriteArrayList();
    public final jz5.g A;
    public boolean A1;
    public final jz5.g B;
    public boolean B1;
    public final com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader C;
    public long C1;
    public final jz5.g D;
    public int D1;
    public final androidx.recyclerview.widget.y2 E;
    public int E1;
    public final cw2.f8 F;
    public int F1;
    public final ym5.q1 G;
    public long G1;
    public com.tencent.mm.plugin.finder.view.ContactUninterestEventListener H;
    public long H1;
    public final jz5.g I;
    public final com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$feedProgressListener$1 I1;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f108754J;
    public java.util.List J1;
    public final com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$commentChangeEventListener$1 K;
    public r45.lx2 K1;
    public final com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$autoRefreshEventListener$1 L;
    public com.tencent.mm.protobuf.g L1;
    public final com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$liveFeedRemoveEventListener$1 M;
    public final com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$finderStreamReRankEventListener$1 N;
    public com.tencent.mm.sdk.event.IListener P;
    public com.tencent.mm.sdk.event.IListener Q;
    public final com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$finderPersonalizedUpdateEventListener$1 R;
    public final jz5.g S;
    public boolean T;
    public final java.lang.String U;
    public final jz5.g V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$feedExposeInfoChangeListener$1 Z;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f108755g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment f108756h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f108757i;

    /* renamed from: l1, reason: collision with root package name */
    public final in5.w f108758l1;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ct f108759m;

    /* renamed from: n, reason: collision with root package name */
    public final ey2.t0 f108760n;

    /* renamed from: o, reason: collision with root package name */
    public ey2.o0 f108761o;

    /* renamed from: p, reason: collision with root package name */
    public final int f108762p;

    /* renamed from: p0, reason: collision with root package name */
    public final so2.t f108763p0;

    /* renamed from: p1, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f108764p1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f108765q;

    /* renamed from: r, reason: collision with root package name */
    public final o25.y1 f108766r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f108767s;

    /* renamed from: t, reason: collision with root package name */
    public i35.e f108768t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f108769u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f108770v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f108771w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f108772x;

    /* renamed from: x0, reason: collision with root package name */
    public final so2.u f108773x0;

    /* renamed from: x1, reason: collision with root package name */
    public final so2.a2 f108774x1;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f108775y;

    /* renamed from: y0, reason: collision with root package name */
    public final in5.w f108776y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f108777y1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f108778z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.Integer f108779z1;

    /* JADX WARN: Type inference failed for: r2v17, types: [com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$feedExposeInfoChangeListener$1] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$commentChangeEventListener$1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$autoRefreshEventListener$1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$liveFeedRemoveEventListener$1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$finderStreamReRankEventListener$1] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$finderPersonalizedUpdateEventListener$1] */
    public pz(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment, com.tencent.mm.protobuf.g gVar) {
        boolean z17;
        boolean z18;
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        kotlin.jvm.internal.o.g(context, "context");
        this.f108755g = context;
        this.f108756h = finderHomeTabFragment;
        this.f108757i = new java.util.concurrent.CopyOnWriteArraySet();
        pf5.u uVar = pf5.u.f353936a;
        androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ey2.t0 t0Var = (ey2.t0) a17;
        this.f108760n = t0Var;
        boolean z19 = false;
        int i17 = finderHomeTabFragment != null ? finderHomeTabFragment.f129265p : 0;
        this.f108762p = i17;
        if (t0Var.R6(i17) && !context.getIntent().getBooleanExtra("KEY_FORCE_NOT_REFRESH_FIRST_TIME", false)) {
            z19 = true;
        }
        this.f108765q = z19;
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.f108766r = new com.tencent.mm.pluginsdk.forward.m();
        jz5.g b17 = jz5.h.b(new com.tencent.mm.plugin.finder.feed.wx(this));
        jz5.g b18 = jz5.h.b(new com.tencent.mm.plugin.finder.feed.kw(this));
        jz5.g b19 = jz5.h.b(new com.tencent.mm.plugin.finder.feed.mz(this));
        jz5.g b27 = jz5.h.b(new com.tencent.mm.plugin.finder.feed.lw(this));
        jz5.g b28 = jz5.h.b(new com.tencent.mm.plugin.finder.feed.lz(this));
        this.f108771w = jz5.h.b(new com.tencent.mm.plugin.finder.feed.cy(this));
        jz5.g b29 = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ay(this));
        this.f108772x = b29;
        this.f108775y = jz5.h.b(new com.tencent.mm.plugin.finder.feed.yx(this));
        this.A = jz5.h.b(com.tencent.mm.plugin.finder.feed.nz.f108605d);
        jz5.g b37 = jz5.h.b(new com.tencent.mm.plugin.finder.feed.hz(this));
        jz5.g b38 = jz5.h.b(new com.tencent.mm.plugin.finder.feed.gz(this));
        this.B = jz5.h.b(com.tencent.mm.plugin.finder.feed.tw.f109110d);
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader(com.tencent.mm.plugin.finder.feed.model.internal.m0.f108015e.a(i17), !this.f108765q ? 1 : 0, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.c(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).W6(i17), null, new com.tencent.mm.plugin.finder.feed.uw(this), 8, null);
        java.lang.Integer num = (java.lang.Integer) ((jz5.n) b19).getValue();
        eb2.f0 f0Var = finderTimelineFeedLoader.f107650f;
        if (num != null && num.intValue() == i17) {
            f0Var.f250743b = gVar;
            f0Var.f250742a = (java.lang.Long) ((jz5.n) b17).getValue();
            java.lang.String str = (java.lang.String) ((jz5.n) b18).getValue();
            if (str != null) {
                str = (str.length() == 0) ^ true ? str : null;
                if (str != null) {
                    byte[] bytes = str.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    f0Var.f250744c = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
                }
            }
            f0Var.f250747f = ((java.lang.Number) ((jz5.n) b28).getValue()).intValue();
            f0Var.f250745d = Y0();
            java.lang.String str2 = (java.lang.String) ((jz5.n) b29).getValue();
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            f0Var.f250746e = str2;
            if (c1() && i17 == 4) {
                f0Var.f250749h = 1;
            }
            f0Var.f250751j = ((java.lang.Number) ((jz5.n) b38).getValue()).intValue() == 15 ? 6 : ((java.lang.Number) ((jz5.n) b37).getValue()).intValue() < 0 ? 3 : ((java.lang.Number) ((jz5.n) b37).getValue()).intValue();
            java.lang.String stringExtra = context.getIntent().getStringExtra("FLOAT_BALL_KEY");
            f0Var.f250752k = !(stringExtra == null || stringExtra.length() == 0);
        }
        if (finderHomeTabFragment == null || (bundle3 = finderHomeTabFragment.f129268s) == null) {
            z17 = false;
            z18 = false;
        } else {
            z17 = false;
            z18 = bundle3.getBoolean("IsFirstEnterTab", false);
        }
        f0Var.f250748g = z18;
        if (finderHomeTabFragment != null && (bundle2 = finderHomeTabFragment.f129268s) != null) {
            z17 = bundle2.getBoolean("shouldSilentLoading", z17);
        }
        f0Var.f250753l = z17;
        int i18 = -1;
        if (finderHomeTabFragment != null && (bundle = finderHomeTabFragment.f129268s) != null) {
            i18 = bundle.getInt("showUnreadCacheFeedTabType", -1);
        }
        java.util.HashSet hashSet = f0Var.f250754m;
        if (i18 > 0) {
            hashSet.add(java.lang.Integer.valueOf(i18));
        }
        com.tencent.mars.xlog.Log.i(finderTimelineFeedLoader.getF123427d(), "tabType=" + i17 + " requestArgs(" + f0Var.hashCode() + "): isFirstEnterFetch=" + f0Var.f250748g + " showUnreadCacheFeed=" + f0Var.f250753l + " showUnreadCacheFeedAtTabTypes=" + hashSet);
        finderTimelineFeedLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.zw(this, finderTimelineFeedLoader));
        this.C = finderTimelineFeedLoader;
        this.D = jz5.h.b(new com.tencent.mm.plugin.finder.feed.az(this));
        this.E = ((ey2.o1) uVar.c(context).a(ey2.o1.class)).f257456e;
        this.F = new cw2.f8(i17);
        this.I = jz5.h.b(new com.tencent.mm.plugin.finder.feed.sw(this));
        this.f108754J = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ax(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.K = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCommentChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$commentChangeEventListener$1
            {
                this.__eventId = 449554913;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderCommentChangeEvent finderCommentChangeEvent) {
                dm.w3 w3Var;
                dm.w3 w3Var2;
                com.tencent.mm.autogen.events.FinderCommentChangeEvent event = finderCommentChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.feed.pz pzVar = com.tencent.mm.plugin.finder.feed.pz.this;
                if (1 == pzVar.f108762p) {
                    am.ta taVar = event.f54263g;
                    if ((taVar == null || (w3Var2 = taVar.f7996d) == null || w3Var2.field_state != -1) ? false : true) {
                        pm0.v.K(null, new com.tencent.mm.plugin.finder.feed.qw(pzVar));
                        if (taVar != null && taVar.f7995c == com.tencent.mm.plugin.finder.storage.wj0.S) {
                            java.util.Iterator it = pzVar.f108764p1.iterator();
                            while (it.hasNext()) {
                                so2.r rVar = (so2.r) it.next();
                                if (taVar != null && rVar.f410563d == taVar.f7993a) {
                                    rVar.f410566g = (taVar == null || (w3Var = taVar.f7996d) == null) ? 0 : w3Var.field_canRemove;
                                }
                            }
                            pm0.v.X(new com.tencent.mm.plugin.finder.feed.rw(pzVar));
                        }
                    }
                }
                return false;
            }
        };
        this.L = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTimelineRefreshEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$autoRefreshEventListener$1
            {
                this.__eventId = 999423702;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderTimelineRefreshEvent finderTimelineRefreshEvent) {
                com.tencent.mm.autogen.events.FinderTimelineRefreshEvent event = finderTimelineRefreshEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.fw(event, com.tencent.mm.plugin.finder.feed.pz.this));
                return false;
            }
        };
        this.M = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiveFeedRemoveEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$liveFeedRemoveEventListener$1
            {
                this.__eventId = 1477379388;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiveFeedRemoveEvent liveFeedRemoveEvent) {
                androidx.recyclerview.widget.RecyclerView recyclerView;
                com.tencent.mm.autogen.events.LiveFeedRemoveEvent event = liveFeedRemoveEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.wi wiVar = event.f54473g;
                boolean z27 = wiVar.f8287b;
                long j17 = wiVar.f8286a;
                com.tencent.mm.plugin.finder.feed.pz pzVar = com.tencent.mm.plugin.finder.feed.pz.this;
                com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
                if (ctVar == null || (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) == null) {
                    return false;
                }
                if (z27) {
                    pzVar.l1(recyclerView);
                }
                recyclerView.postDelayed(new com.tencent.mm.plugin.finder.feed.fz(pzVar, j17), 500L);
                return false;
            }
        };
        this.N = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderStreamReRankEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$finderStreamReRankEventListener$1
            {
                this.__eventId = 760048005;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderStreamReRankEvent finderStreamReRankEvent) {
                com.tencent.mm.autogen.events.FinderStreamReRankEvent event = finderStreamReRankEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.feed.pz pzVar = com.tencent.mm.plugin.finder.feed.pz.this;
                if (pzVar.f108762p != 4) {
                    return false;
                }
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.cx(pzVar, event));
                return false;
            }
        };
        this.R = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderPersonalizedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$finderPersonalizedUpdateEventListener$1
            {
                this.__eventId = -270597589;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderPersonalizedUpdateEvent finderPersonalizedUpdateEvent) {
                com.tencent.mm.autogen.events.FinderPersonalizedUpdateEvent event = finderPersonalizedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.bx(com.tencent.mm.plugin.finder.feed.pz.this));
                return false;
            }
        };
        this.S = jz5.h.b(new com.tencent.mm.plugin.finder.feed.jz(this));
        this.U = "Finder.TimelinePresenter#" + i17;
        this.G = new com.tencent.mm.plugin.finder.feed.dw(this);
        this.V = jz5.h.b(new com.tencent.mm.plugin.finder.feed.oz(this));
        this.W = true;
        this.X = true;
        this.Z = new com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener() { // from class: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$feedExposeInfoChangeListener$1

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.String f106120d;

            {
                this.f106120d = com.tencent.mm.plugin.finder.feed.pz.this.U;
            }

            @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
            public com.tencent.mm.plugin.finder.storage.FinderItem c(long j17) {
                androidx.recyclerview.widget.RecyclerView recyclerView;
                com.tencent.mm.plugin.finder.feed.pz pzVar = com.tencent.mm.plugin.finder.feed.pz.this;
                com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
                if (ctVar == null || (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) == null) {
                    return null;
                }
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
                androidx.recyclerview.widget.k3 Y = in5.n0.Y((in5.n0) adapter, j17, false, 2, null);
                if (Y == null) {
                    return null;
                }
                int adapterPosition = Y.getAdapterPosition();
                androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
                kotlin.jvm.internal.o.e(adapter2, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
                so2.j5 j5Var = (so2.j5) pzVar.C.safeGet(adapterPosition - ((in5.n0) adapter2).a0());
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    return ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject();
                }
                return null;
            }

            @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
            /* renamed from: d, reason: from getter */
            public java.lang.String getF106120d() {
                return this.f106120d;
            }

            @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
            public void e(long j17, r45.yl2 yl2Var) {
                androidx.recyclerview.widget.RecyclerView recyclerView;
                com.tencent.mm.plugin.finder.feed.ct ctVar = com.tencent.mm.plugin.finder.feed.pz.this.f108759m;
                if (ctVar == null || (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) == null) {
                    return;
                }
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
                androidx.recyclerview.widget.k3 Y = in5.n0.Y((in5.n0) adapter, j17, false, 2, null);
                if (Y != null) {
                    int adapterPosition = Y.getAdapterPosition();
                    androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemChanged(adapterPosition, new jz5.l(1, yl2Var));
                    }
                }
            }
        };
        so2.t tVar = new so2.t();
        this.f108763p0 = tVar;
        so2.w4 w4Var = new so2.w4();
        this.f108773x0 = new so2.u();
        this.f108776y0 = new so2.s(null, 0, 0, null, 15, null);
        this.f108758l1 = new so2.q();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f108764p1 = concurrentLinkedQueue;
        this.f108774x1 = new so2.a2(tVar, w4Var, concurrentLinkedQueue, null, null, null, 56, null);
        this.A1 = true;
        this.I1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$feedProgressListener$1
            {
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.feed.pz.this.C.updateProgressByLocalId(event.f54250g.f6749a);
                return true;
            }
        };
    }

    public static final void I0(com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, db5.g4 g4Var, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var) {
        java.lang.String string;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.ui.MMActivity mMActivity = pzVar.f108755g;
        y4Var.k(mMActivity, g4Var, baseFinderFeed);
        y4Var.s(mMActivity, g4Var, baseFinderFeed);
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        if ((finderVideoLayout != null ? finderVideoLayout.getVideoView() : null) instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) {
            com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
            if (ctVar == null || (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) == null) {
                string = mMActivity.getString(com.tencent.mm.R.string.gue);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            } else {
                string = com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.f133635x.a(recyclerView);
            }
            y4Var.G(g4Var, baseFinderFeed, string);
        }
        y4Var.y(pzVar.f108755g, baseFinderFeed, g4Var, k0Var, 200);
    }

    public static final void J0(com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, db5.g4 g4Var) {
        java.lang.Object obj;
        pzVar.getClass();
        if (baseFinderFeed instanceof so2.h1) {
            java.util.List list = g4Var.f228344d;
            kotlin.jvm.internal.o.f(list, "getItemList(...)");
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((android.view.MenuItem) obj).getItemId() == 99) {
                        break;
                    }
                }
            }
            if (obj != null) {
                com.tencent.mm.autogen.events.LiveNotInterestedExposeEvent liveNotInterestedExposeEvent = new com.tencent.mm.autogen.events.LiveNotInterestedExposeEvent();
                liveNotInterestedExposeEvent.f54475g.f8464a = baseFinderFeed.getItemId();
                liveNotInterestedExposeEvent.e();
            }
        }
    }

    public static final void L0(com.tencent.mm.plugin.finder.feed.pz pzVar, java.lang.String str) {
        pzVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataList = pzVar.C.getDataList();
        long j17 = pzVar.G1;
        java.util.Iterator it = dataList.iterator();
        int i17 = -1;
        int i18 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) next;
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                if (i17 != -1 && kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getUserName(), str)) {
                    arrayList.add(j5Var);
                }
                if (((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() == j17) {
                    i17 = i18;
                }
            }
            i18 = i19;
        }
        com.tencent.mars.xlog.Log.i(pzVar.U, "removeUnFollow currentId " + j17 + " findIndex " + i17 + " size " + arrayList.size());
        if (!(!arrayList.isEmpty()) || i17 == -1) {
            return;
        }
        int i27 = i17 + 1;
        java.util.List subList = dataList.subList(i27, dataList.size());
        kotlin.jvm.internal.o.f(subList, "subList(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = dataList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            so2.j5 j5Var2 = (so2.j5) next2;
            if (((j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).getFeedObject().getUserName(), str)) ? false : true) {
                arrayList2.add(next2);
            }
        }
        int size = subList.size();
        subList.clear();
        in5.n0 T0 = pzVar.T0();
        if (T0 != null) {
            T0.notifyItemRangeRemoved(i27, size);
        }
        dataList.addAll(arrayList2);
        in5.n0 T02 = pzVar.T0();
        if (T02 != null) {
            T02.notifyItemRangeInserted(i27, arrayList2.size());
        }
    }

    public static final int g1(java.util.List list, java.util.List list2) {
        boolean z17;
        if (list.size() == list2.size()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((so2.j5) it.next()).getItemId()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                arrayList2.add(java.lang.Long.valueOf(((so2.j5) it6.next()).getItemId()));
            }
            java.util.List<jz5.l> a17 = kz5.n0.a1(arrayList, arrayList2);
            if (!a17.isEmpty()) {
                for (jz5.l lVar : a17) {
                    if (((java.lang.Number) lVar.f302833d).longValue() != ((java.lang.Number) lVar.f302834e).longValue()) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                return list.size();
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            arrayList3.add(java.lang.Long.valueOf(((so2.j5) it7.next()).getItemId()));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList4.add(java.lang.Long.valueOf(((so2.j5) it8.next()).getItemId()));
        }
        java.util.Iterator it9 = ((java.util.ArrayList) kz5.n0.a1(arrayList3, arrayList4)).iterator();
        int i17 = 0;
        while (it9.hasNext()) {
            jz5.l lVar2 = (jz5.l) it9.next();
            if (((java.lang.Number) lVar2.f302833d).longValue() != ((java.lang.Number) lVar2.f302834e).longValue()) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    public static final java.lang.String h1(r45.jx2 jx2Var) {
        return "[" + pm0.v.u(jx2Var.getLong(0)) + ' ' + hc2.o0.m((com.tencent.mm.protocal.protobuf.FinderObject) jx2Var.getCustom(1));
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 A0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.hx(this, feed, sheet, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public boolean A3() {
        com.tencent.mm.ui.MMActivity activity = this.f108755g;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.view.f5 O6 = ((com.tencent.mm.plugin.finder.viewmodel.component.u6) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).O6();
        return O6 != null && O6.b();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 D1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder, yz5.a aVar) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.tx(this, feed, aVar, holder, i17);
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        if (event instanceof fc2.t) {
            int i17 = ((fc2.t) event).f260985d;
            return i17 == 0 || i17 == 5;
        }
        if (!(event instanceof ec2.a)) {
            return false;
        }
        int i18 = ((ec2.a) event).f250946d;
        return i18 == 1 || i18 == 2;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        in5.n0 T0;
        in5.s0 s0Var;
        in5.n0 T02;
        fc2.t tVar;
        int i17;
        com.tencent.mm.plugin.finder.extension.reddot.jb L0;
        kotlin.jvm.internal.o.g(ev6, "ev");
        this.E1 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_PRELOAD_NUM_INT_SYNC, 3);
        boolean z17 = true;
        if (!(ev6 instanceof fc2.t) || ((i17 = (tVar = (fc2.t) ev6).f260985d) != 0 && i17 != 5)) {
            if (ev6 instanceof ec2.a) {
                ec2.a aVar = (ec2.a) ev6;
                int i18 = aVar.f250946d;
                if ((i18 != 1 && i18 != 2) || (T0 = T0()) == null || (s0Var = (in5.s0) in5.n0.Y(T0, aVar.f250947e, false, 2, null)) == null || (T02 = T0()) == null) {
                    return;
                }
                T02.notifyItemChanged(s0Var.getAdapterPosition(), new jz5.l(9, java.lang.Long.valueOf(aVar.f250947e)));
                return;
            }
            return;
        }
        long j17 = this.G1;
        long j18 = tVar.f260992k;
        java.lang.String str = this.U;
        int i19 = this.f108762p;
        if (j17 != j18 || i17 == 5) {
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            if (!((com.tencent.mm.plugin.finder.extension.reddot.x2) nk6).f105976d && (L0 = nk6.L0("FinderEntrance")) != null) {
                r45.xs2 xs2Var = L0.N;
                if (xs2Var.getLong(3) == tVar.f260992k) {
                    if (xs2Var.getInteger(9) == i19) {
                        nk6.N("FinderEntrance");
                    }
                    com.tencent.mars.xlog.Log.i(str, "redDot depose on expose " + tVar.f260992k + " redDotTab " + xs2Var.getInteger(9) + " tabType " + i19 + ' ');
                }
            }
        }
        this.G1 = tVar.f260992k;
        if (this.E1 > 0) {
            in5.n0 T03 = T0();
            int itemCount = T03 != null ? T03.getItemCount() - T03.a0() : 0;
            this.F1 = (itemCount - 1) - this.E1;
            ey2.o0 N6 = ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).N6(i19);
            if (this.D1 == 1 && !this.B1 && tVar.f260989h >= this.F1 && !N6.f257452l && b1()) {
                d1(tVar.f260992k);
                if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    z17 = false;
                }
                if (z17) {
                    pm0.v.X(com.tencent.mm.plugin.finder.feed.ny.f108604d);
                }
                com.tencent.mars.xlog.Log.i(str, "[onAutoToLoadMore] tabType=" + i19 + " configPosition=" + this.E1 + ", lastPosition=" + tVar.f260989h + ", preLoadBeginPosition=" + this.F1 + ", count=" + itemCount);
            }
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.oy(this, ev6));
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: H1 */
    public cw2.f8 getS() {
        return this.F;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.s4 K0(com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.jx(this, i17, feed, bottomSheet, holder);
    }

    public boolean M0(boolean z17, boolean z18, long j17) {
        boolean z19;
        com.tencent.mm.plugin.finder.feed.ct ctVar;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.RecyclerView recyclerView3;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment;
        bs2.b0 b0Var;
        bs2.g0 g0Var;
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore = (com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
        int i17 = this.f108762p;
        bs2.n1 R6 = finderStreamTabPreloadCore.R6(i17);
        boolean R62 = this.f108760n.R6(i17);
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.C;
        boolean z27 = false;
        boolean z28 = R62 && finderTimelineFeedLoader.f107649e == 0;
        boolean z29 = (R6 != null && (g0Var = R6.f23927u) != null && g0Var.f23842a) && R6.f23927u.f23843b == bs2.h0.f23853p;
        bs2.h0 h0Var = (R6 == null || (b0Var = R6.f23925s) == null) ? null : b0Var.f23807c;
        bs2.h0 h0Var2 = bs2.h0.f23853p;
        boolean z37 = h0Var == h0Var2;
        java.lang.String str = this.U;
        if (z28 && z29) {
            if (R6 != null) {
                R6.x(false, h0Var2);
            }
            com.tencent.mars.xlog.Log.w(str, "[checkAutoFlingToRefresh] reset loadingState tabType=" + i17);
        } else if (z28 && z37) {
            if (R6 != null) {
                R6.e(true, "HasRefreshContinueCache");
            }
            com.tencent.mars.xlog.Log.w(str, "[checkAutoFlingToRefresh] clear last refresh response. tabType=" + i17);
        }
        boolean z38 = !z28 && (z29 || z37);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        long j18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.S2).getValue()).r()).intValue() == 1 ? 0L : j17;
        com.tencent.mars.xlog.Log.i(str, "[checkAutoFlingToRefresh] isContinueRefresh=" + z38 + ",isAutoRefresh=" + z28 + ",isHard=" + z17);
        if (z38 || z28 || z17) {
            com.tencent.mm.plugin.finder.feed.ct ctVar2 = this.f108759m;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (ctVar2 == null || (recyclerView3 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar2).getRecyclerView()) == null) ? null : recyclerView3.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            int w17 = linearLayoutManager != null ? linearLayoutManager.w() : 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkAutoFlingToRefresh] isHard=");
            sb6.append(z17);
            sb6.append(" isWithRefresh=");
            sb6.append(z18);
            sb6.append(" isContinueRefresh=");
            sb6.append(z38);
            sb6.append(" offset=");
            sb6.append(w17);
            sb6.append(" delayMs=");
            sb6.append(j18);
            sb6.append(" tabType=");
            sb6.append(i17);
            sb6.append(" isFromShareToTimeline=");
            sb6.append(c1());
            sb6.append(" size=");
            sb6.append(finderTimelineFeedLoader.getDataList().size());
            sb6.append(" showUnreadCacheFeed=");
            eb2.f0 f0Var = finderTimelineFeedLoader.f107650f;
            sb6.append(f0Var.f250753l);
            sb6.append(", isFinishFirstRefresh=");
            sb6.append(finderTimelineFeedLoader.f107656o);
            sb6.append(" requestArgs=");
            sb6.append(f0Var.hashCode());
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            com.tencent.mm.plugin.finder.feed.ct ctVar3 = this.f108759m;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = (ctVar3 == null || (recyclerView2 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar3).getRecyclerView()) == null) ? null : recyclerView2.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2 : null;
            if (linearLayoutManager2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager3 = linearLayoutManager2;
                yj0.a.d(linearLayoutManager3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "checkAutoFlingToRefresh", "(ZZJ)Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager2.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(linearLayoutManager3, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "checkAutoFlingToRefresh", "(ZZJ)Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            if (w17 <= -1 && (ctVar = this.f108759m) != null && (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) != null) {
                recyclerView.post(new com.tencent.mm.plugin.finder.feed.mw(linearLayoutManager2));
            }
            if (z18) {
                com.tencent.mm.plugin.finder.report.v1.f125393a.b(i17);
                if (((f0Var.f250753l || c1()) && !finderTimelineFeedLoader.f107656o && f0Var.f250754m.contains(java.lang.Integer.valueOf(i17)) && (!finderTimelineFeedLoader.getDataList().isEmpty())) || this.f108778z) {
                    com.tencent.mm.plugin.finder.feed.ct ctVar4 = this.f108759m;
                    if (ctVar4 != null) {
                        com.tencent.mm.plugin.finder.feed.ct.i(ctVar4, 0L, true, true, null, 8, null);
                    }
                } else {
                    com.tencent.mm.plugin.finder.feed.ct ctVar5 = this.f108759m;
                    if (ctVar5 != null) {
                        com.tencent.mm.plugin.finder.feed.ct.i(ctVar5, j18, false, false, null, 12, null);
                    }
                }
                this.f108767s = true;
                z19 = true;
            } else {
                z19 = false;
            }
            this.f108765q = false;
            z27 = z19;
        } else {
            com.tencent.mm.ui.MMActivity activity = this.f108755g;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.h80) ((zy2.rb) pf5.z.f353948a.a(activity).c(zy2.rb.class))).O6();
        }
        if (i17 == 4 && (finderHomeTabFragment = this.f108756h) != null) {
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            so2.a2 a2Var = this.f108774x1;
            if (z27 && (nk6.G() == 7 || nk6.G() == 8 || nk6.G() == 10)) {
                a2Var.f410250g.f410345a = org.chromium.net.NetError.ERR_CERT_COMMON_NAME_INVALID;
            } else {
                a2Var.f410250g.f410345a = -100;
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.d1) uVar.d(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).Q6();
        }
        com.tencent.mm.plugin.finder.report.v1.f125393a.c();
        return z27;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0088 A[LOOP:1: B:19:0x004d->B:38:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c A[EDGE_INSN: B:39:0x008c->B:40:0x008c BREAK  A[LOOP:1: B:19:0x004d->B:38:0x0088], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.pz.N0():void");
    }

    public final void O0(java.lang.String source) {
        so2.j5 j5Var;
        com.tencent.mm.plugin.finder.feed.ct ctVar;
        kotlin.jvm.internal.o.g(source, "source");
        if (this.f108762p == 4 && (j5Var = (so2.j5) kz5.n0.k0(this.C.getDataListJustForAdapter())) != null && (j5Var instanceof so2.n1) && ((so2.n1) j5Var).g2(7) && (ctVar = this.f108759m) != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout l17 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l();
            l17.setEnableLoadMore(false);
            l17.setHasBottomMore(false);
            android.view.View inflate = com.tencent.mm.ui.id.b(l17.getContext()).inflate(com.tencent.mm.R.layout.dxa, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            l17.setLoadMoreFooter(inflate);
            android.view.View findViewById = l17.findViewById(com.tencent.mm.R.id.m6l);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "checkCloseRecommendDisableLoadMore", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "checkCloseRecommendDisableLoadMore", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = l17.findViewById(com.tencent.mm.R.id.ile);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "checkCloseRecommendDisableLoadMore", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "checkCloseRecommendDisableLoadMore", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mars.xlog.Log.i(this.U, "close rec disable loadmore, source".concat(source));
        }
    }

    public final void P0(ym5.s3 s3Var) {
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.nw(s3Var, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q0(ym5.s3 s3Var, boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f108759m;
        androidx.recyclerview.widget.f2 adapter = (ctVar == null || (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) == null) ? null : recyclerView.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        java.lang.Object[] objArr = (wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0) <= 0;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (objArr == true) {
            return;
        }
        int i17 = this.f108762p;
        if ((i17 == 3 || i17 == 1 || i17 == 35) && s3Var != null) {
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.V).getValue()).r()).intValue() == 1 && hc2.e.a()) {
                if (objArr != true && !s3Var.f463521f) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.feed.ow(wxRecyclerAdapter, this));
                    N1.put(S0(), s3Var);
                    return;
                }
                if (!z17 || wxRecyclerAdapter == null) {
                    return;
                }
                in5.w info = this.f108758l1;
                kotlin.jvm.internal.o.g(info, "info");
                if (wxRecyclerAdapter.f293103m.contains(info)) {
                    in5.n0.h0(wxRecyclerAdapter, ((so2.q) info).hashCode(), false, 2, null);
                }
                com.tencent.mm.plugin.finder.feed.ct ctVar2 = this.f108759m;
                com.tencent.mm.view.RefreshLoadMoreLayout l17 = ctVar2 != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar2).l() : null;
                if (l17 != null) {
                    l17.setCanLoadMore(true);
                }
                com.tencent.mm.plugin.finder.feed.ct ctVar3 = this.f108759m;
                com.tencent.mm.view.RefreshLoadMoreLayout l18 = ctVar3 != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar3).l() : null;
                if (l18 == null) {
                    return;
                }
                l18.setHasBottomMore(true);
                return;
            }
            if (objArr == true || s3Var.f463521f) {
                return;
            }
            com.tencent.mm.plugin.finder.feed.ct ctVar4 = this.f108759m;
            android.view.View findViewById = ctVar4 != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar4).l().findViewById(com.tencent.mm.R.id.m6l) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "checkNoMoreFooter", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "checkNoMoreFooter", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.feed.ct ctVar5 = this.f108759m;
            android.view.View findViewById2 = ctVar5 != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar5).l().findViewById(com.tencent.mm.R.id.ile) : null;
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            android.view.View view2 = findViewById2;
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "checkNoMoreFooter", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "checkNoMoreFooter", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void R0(as2.k kVar, boolean z17, java.lang.String str) {
        long Y0 = Y0();
        kVar.getClass();
        bu2.j.f24534a.l(Y0);
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f108759m;
        if (ctVar != null) {
            ((com.tencent.mm.plugin.finder.feed.v00) ctVar).q(true);
        }
        com.tencent.mm.plugin.finder.feed.zy zyVar = new com.tencent.mm.plugin.finder.feed.zy(this);
        com.tencent.mars.xlog.Log.i(this.U, "load share feed no hit cache objectId=" + Y0() + " isMegaVideo=" + z17 + " username=" + str);
        long Y02 = Y0();
        java.lang.String str2 = (java.lang.String) ((jz5.n) this.f108772x).getValue();
        com.tencent.mm.ui.MMActivity context = this.f108755g;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        int i17 = nyVar != null ? nyVar.f135380n : 0;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kVar.Q6(Y02, str2, i17, nyVar2 != null ? nyVar2.V6() : null, z17, str, zyVar, 6);
    }

    public final java.lang.String S0() {
        java.util.List<E> listOfType = this.C.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
        boolean z17 = listOfType.size() == 0;
        long id6 = z17 ? 0L : ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) listOfType.get(0)).getFeedObject().getId();
        long id7 = z17 ? 0L : ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) listOfType.get(listOfType.size() - 1)).getFeedObject().getId();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f108762p);
        sb6.append('_');
        sb6.append(id6);
        sb6.append('_');
        sb6.append(id7);
        sb6.append('_');
        sb6.append(listOfType.size());
        return sb6.toString();
    }

    public final in5.n0 T0() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f108759m;
        androidx.recyclerview.widget.f2 adapter = (ctVar == null || (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) == null) ? null : recyclerView.getAdapter();
        if (adapter instanceof in5.n0) {
            return (in5.n0) adapter;
        }
        return null;
    }

    public java.lang.String U0() {
        com.tencent.mm.ui.MMActivity activity = this.f108755g;
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
        return str == null ? "" : str;
    }

    public final int V0() {
        in5.n0 T0 = T0();
        if (T0 != null) {
            return T0.getItemCount() - T0.a0();
        }
        return 0;
    }

    public so2.j5 W0() {
        in5.n0 T0 = T0();
        if (T0 != null) {
            int X0 = X0() - T0.a0();
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.C;
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter = finderTimelineFeedLoader.getDataListJustForAdapter();
            if (X0 >= 0 && X0 < dataListJustForAdapter.size()) {
                return (so2.j5) finderTimelineFeedLoader.getDataListJustForAdapter().get(X0);
            }
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer W3() {
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f108759m;
        if (!(ctVar instanceof com.tencent.mm.plugin.finder.feed.v00)) {
            return null;
        }
        kotlin.jvm.internal.o.e(ctVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTimelineViewCallback");
        com.tencent.mm.plugin.finder.feed.v00 v00Var = (com.tencent.mm.plugin.finder.feed.v00) ctVar;
        if (v00Var.f110852m == null) {
            com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
            com.tencent.mm.ui.MMActivity mMActivity = v00Var.f110846d;
            android.view.Window window = mMActivity.getWindow();
            kotlin.jvm.internal.o.f(window, "getWindow(...)");
            v00Var.f110852m = com.tencent.mm.plugin.finder.view.vc.a(vcVar, mMActivity, window, 4, true, false, 16, null);
        }
        return v00Var.f110852m;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void W4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, boolean z18, int i17, boolean z19, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.ui.MMActivity activity = this.f108755g;
        kotlin.jvm.internal.o.g(activity, "activity");
        so2.e2.f410328a.b(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), i17, feed.getFeedObject(), z17, z18, 2, feed.getShowLikeTips(), z19, hc2.s.f(feed.getContact()), bc1Var);
    }

    public final int X0() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f108759m;
        if (((ctVar == null || (recyclerView2 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) == null) ? 0 : recyclerView2.getChildCount()) <= 0) {
            return 0;
        }
        com.tencent.mm.plugin.finder.feed.ct ctVar2 = this.f108759m;
        java.lang.Object layoutManager = (ctVar2 == null || (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar2).getRecyclerView()) == null) ? null : recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.y();
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 Y(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.ix(this, feed);
    }

    public final long Y0() {
        return ((java.lang.Number) this.f108771w.getValue()).longValue();
    }

    public final com.tencent.mm.plugin.finder.feed.g00 Z0() {
        return (com.tencent.mm.plugin.finder.feed.g00) this.D.getValue();
    }

    public final void a1(long j17, boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.RecyclerView recyclerView3;
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f108759m;
        androidx.recyclerview.widget.f2 adapter = (ctVar == null || (recyclerView3 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) == null) ? null : recyclerView3.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        so2.u uVar = this.f108773x0;
        if ((wxRecyclerAdapter == null || wxRecyclerAdapter.W(uVar)) ? false : true) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.ct ctVar2 = this.f108759m;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (ctVar2 == null || (recyclerView2 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar2).getRecyclerView()) == null) ? null : recyclerView2.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        in5.n0 T0 = T0();
        if ((T0 == null || T0.W(uVar)) ? false : true) {
            return;
        }
        if (!z17 && linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(1);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "hideSearchBar", "(JZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "hideSearchBar", "(JZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        com.tencent.mm.plugin.finder.feed.ct ctVar3 = this.f108759m;
        if (ctVar3 == null || (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar3).getRecyclerView()) == null) {
            return;
        }
        recyclerView.postDelayed(new com.tencent.mm.plugin.finder.feed.xx(this, z17, linearLayoutManager, j17), j17);
    }

    public final boolean b1() {
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader;
        boolean z17;
        return (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.r1().r()).booleanValue() && (z17 = (finderTimelineFeedLoader = this.C).f107666y) && (!z17 || !finderTimelineFeedLoader.f107665x)) ? false : true;
    }

    public final boolean c1() {
        return ((java.lang.Boolean) this.f108775y.getValue()).booleanValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 c4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.vx(this, feed, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public boolean d0() {
        return false;
    }

    public void d1(long j17) {
        if (this.B1) {
            return;
        }
        java.util.Iterator it = O1.iterator();
        while (it.hasNext()) {
            ((ni3.a) it.next()).b(this.f108762p);
        }
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f108759m;
        if (ctVar != null) {
            ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l().J(true);
        }
        this.C1 = java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.events.TestPreloadPreviewNotifyEvent testPreloadPreviewNotifyEvent = new com.tencent.mm.autogen.events.TestPreloadPreviewNotifyEvent();
        am.uy uyVar = testPreloadPreviewNotifyEvent.f54889g;
        uyVar.getClass();
        uyVar.f8143a = 1;
        uyVar.f8146d = j17;
        testPreloadPreviewNotifyEvent.e();
        this.B1 = true;
    }

    public boolean e1() {
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f108759m;
        if (ctVar == null) {
            return false;
        }
        kotlin.jvm.internal.o.d(ctVar);
        com.tencent.mm.plugin.finder.feed.v00 v00Var = (com.tencent.mm.plugin.finder.feed.v00) ctVar;
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = v00Var.f110851i;
        if (!(finderLikeDrawer != null && finderLikeDrawer.q())) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer2 = v00Var.f110851i;
        if (finderLikeDrawer2 != null) {
            finderLikeDrawer2.u();
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: e2 */
    public androidx.recyclerview.widget.y2 getG() {
        return this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f1(java.util.List r39, r45.lx2 r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 2841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.pz.f1(java.util.List, r45.lx2, boolean):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: getActivity */
    public com.tencent.mm.ui.MMActivity getF122643d() {
        return this.f108755g;
    }

    public final void i1(int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        in5.w wVar = this.f108776y0;
        so2.s sVar = wVar instanceof so2.s ? (so2.s) wVar : null;
        if (sVar != null && sVar.f410583e == i17) {
            com.tencent.mm.plugin.finder.feed.ct ctVar = this.f108759m;
            java.lang.Object adapter = (ctVar == null || (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) == null) ? null : recyclerView.getAdapter();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            if (wxRecyclerAdapter != null) {
                com.tencent.mars.xlog.Log.i(this.U, "remove empty header for reason:" + i17);
                wxRecyclerAdapter.i0((long) ((so2.s) wVar).hashCode(), false);
            }
        }
    }

    public void j1(rn5.a aVar, com.tencent.mm.plugin.finder.feed.model.e eVar, boolean z17, boolean z18) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = this.U;
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.C;
        int i18 = this.f108762p;
        if (i18 == 3 || i18 == 1 || i18 == 35) {
            java.util.List<E> listOfType = finderTimelineFeedLoader.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
            java.util.List d17 = hc2.f0.d(finderTimelineFeedLoader.getDataList().getBuffer(), com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
            com.tencent.mars.xlog.Log.i(str, "[requestRefresh] tabType=" + i18 + ", dataList=" + listOfType.size() + " buffer=" + ((java.util.ArrayList) d17).size());
            listOfType.addAll(d17);
            arrayList.addAll(hc2.v.b(listOfType, i18));
            java.util.Iterator it = kz5.n0.x0(arrayList).iterator();
            while (it.hasNext()) {
                finderTimelineFeedLoader.remove(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it.next()).getFeedObject().field_id, true);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[requestRefresh] tabType=");
            sb6.append(i18);
            sb6.append(", unreadList=");
            sb6.append(arrayList.size());
            sb6.append(" first=");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.n0.k0(arrayList);
            sb6.append(pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
            sb6.append(" isFirstLoad=");
            sb6.append(finderTimelineFeedLoader.f107649e);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
        }
        if (i18 == 4) {
            if (this.f108755g.getIntent().getIntExtra("KEY_SOURCE_TYPE", 0) == 2 && finderTimelineFeedLoader.f107649e == 0) {
                com.tencent.mm.plugin.finder.feed.ct ctVar = this.f108759m;
                androidx.recyclerview.widget.RecyclerView recyclerView = ctVar != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView() : null;
                if (recyclerView != null) {
                    recyclerView.setLayoutFrozen(true);
                }
            }
            androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            long j17 = ((ey2.t0) a17).N6(i18).f257447g;
            if (j17 != 0) {
                java.util.Iterator it6 = finderTimelineFeedLoader.getDataList().iterator();
                i17 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = -1;
                        break;
                    } else {
                        if (((so2.j5) it6.next()).getItemId() == j17) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
            } else {
                i17 = 0;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("shouldSilentLoading=");
            eb2.f0 f0Var = finderTimelineFeedLoader.f107650f;
            sb7.append(f0Var != null && f0Var.f250753l);
            sb7.append(" lastIndex=");
            sb7.append(i17);
            com.tencent.mars.xlog.Log.i(str, sb7.toString());
        }
        com.tencent.mm.plugin.finder.feed.g00 Z0 = Z0();
        int V0 = V0();
        java.util.concurrent.CopyOnWriteArrayList cgiActionCallbackList = O1;
        Z0.getClass();
        kotlin.jvm.internal.o.g(cgiActionCallbackList, "cgiActionCallbackList");
        if (Z0.f()) {
            Z0.i(new com.tencent.mm.plugin.finder.feed.e00(Z0, aVar, eVar, V0, z18, z17, arrayList, cgiActionCallbackList));
        } else {
            Z0.k(aVar, eVar, V0, z18, z17, arrayList, cgiActionCallbackList);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public com.tencent.mm.plugin.finder.view.f5 j2() {
        com.tencent.mm.ui.MMActivity activity = this.f108755g;
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((com.tencent.mm.plugin.finder.viewmodel.component.u6) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).P6();
    }

    public final void k1(r45.px2 px2Var) {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = this.f108756h;
        if (finderHomeTabFragment != null) {
            so2.a2 a2Var = this.f108774x1;
            if (px2Var == null || px2Var.getInteger(0) == 0) {
                a2Var.f410250g.f410345a = -100;
                ((com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).Q6();
            } else {
                so2.f5 f5Var = a2Var.f410250g;
                f5Var.f410347c = px2Var;
                f5Var.f410345a = 1;
                ((com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).Q6();
            }
        }
    }

    @Override // im5.b
    public void keep(im5.a p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f108757i.add(p07);
    }

    public final void l1(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        int w17 = ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).w() + 1;
        f0Var.f310116d = w17;
        if (this.f108777y1) {
            f0Var.f310116d = w17 - 1;
        }
        com.tencent.mars.xlog.Log.i(this.U, "[smoothScrollToNextPosition] nextPosition=" + f0Var.f310116d + ", hasOpenRecommendLoadMore=" + this.f108777y1);
        recyclerView.post(new com.tencent.mm.plugin.finder.feed.kz(recyclerView, f0Var));
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void n0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, int i17, r45.qt2 qt2Var) {
        int i18;
        kotlin.jvm.internal.o.g(feed, "feed");
        if (qt2Var == null) {
            com.tencent.mm.ui.MMActivity activity = this.f108755g;
            kotlin.jvm.internal.o.g(activity, "activity");
            qt2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        so2.z1.b(so2.z1.f410730a, this.f108755g, qt2Var, feed, z17 ? 1 : 2, false, i17, 16, null);
        ya2.g gVar = ya2.h.f460484a;
        ya2.b2 contact = feed.getContact();
        java.lang.String D0 = contact != null ? contact.D0() : "";
        if (z17) {
            l75.e0 e0Var = ya2.b2.O2;
            i18 = ya2.b2.Q2;
        } else {
            l75.e0 e0Var2 = ya2.b2.O2;
            i18 = 0;
        }
        gVar.i(D0, i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:256:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x08ab  */
    @Override // fs2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttach(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 2485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.pz.onAttach(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x052f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2 A[LOOP:0: B:17:0x00a8->B:27:0x00d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8 A[EDGE_INSN: B:28:0x00d8->B:29:0x00d8 BREAK  A[LOOP:0: B:17:0x00a8->B:27:0x00d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b A[LOOP:1: B:42:0x0111->B:61:0x015b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0165 A[EDGE_INSN: B:62:0x0165->B:63:0x0165 BREAK  A[LOOP:1: B:42:0x0111->B:61:0x015b], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.tencent.mm.sdk.event.IListener, i35.e] */
    @Override // fs2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDetach() {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.pz.onDetach():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x05fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x05a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRefreshEnd(ym5.s3 r37) {
        /*
            Method dump skipped, instructions count: 2305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.pz.onRefreshEnd(ym5.s3):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 p1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.gx(feed, this, sheet);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void s0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        java.util.Collection listOfType = this.C.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
        java.util.LinkedList<jz5.l> linkedList = new java.util.LinkedList();
        synchronized (listOfType) {
            int i17 = 0;
            for (java.lang.Object obj : listOfType) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
                if ((baseFinderFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && baseFinderFeed.getFeedObject().getId() == feed.getFeedObject().getId()) {
                    linkedList.add(0, new jz5.l(java.lang.Integer.valueOf(i17), baseFinderFeed));
                }
                i17 = i18;
            }
        }
        for (jz5.l lVar : linkedList) {
            this.C.getDataListJustForAdapter().remove(lVar.f302834e);
            ((com.tencent.mm.plugin.finder.feed.dw) this.G).onItemRangeRemoved(((java.lang.Number) lVar.f302833d).intValue(), 1);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer s6() {
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f108759m;
        if (!(ctVar instanceof com.tencent.mm.plugin.finder.feed.v00)) {
            return null;
        }
        kotlin.jvm.internal.o.e(ctVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTimelineViewCallback");
        com.tencent.mm.plugin.finder.feed.v00 v00Var = (com.tencent.mm.plugin.finder.feed.v00) ctVar;
        if (v00Var.f110851i == null) {
            com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
            com.tencent.mm.ui.MMActivity mMActivity = v00Var.f110846d;
            android.view.Window window = mMActivity.getWindow();
            kotlin.jvm.internal.o.f(window, "getWindow(...)");
            v00Var.f110851i = com.tencent.mm.plugin.finder.view.vc.a(vcVar, mMActivity, window, 1, true, false, 16, null);
        }
        return v00Var.f110851i;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void u2(com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, in5.s0 s0Var, int i17, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        so2.v0.d(so2.v0.f410644a, this.f108755g, feed, z17, 2, i17, null, bc1Var, 32, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 w4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.fx(this, feed, i17, sheet);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.r4 z6(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.ux(this, feed);
    }
}
