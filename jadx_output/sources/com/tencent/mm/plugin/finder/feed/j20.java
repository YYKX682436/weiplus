package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class j20 extends com.tencent.mm.plugin.finder.feed.dj {
    public final boolean A;
    public final sc2.i B;
    public final com.tencent.mm.plugin.finder.feed.model.l0 C;
    public final zy2.h8 D;
    public com.tencent.mm.sdk.event.IListener E;
    public com.tencent.mm.sdk.event.IListener F;
    public java.lang.String G;
    public boolean H;
    public final com.tencent.mm.plugin.finder.feed.i20 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f107072J;
    public float K;
    public final yz5.l L;

    /* renamed from: y, reason: collision with root package name */
    public final int f107073y;

    /* renamed from: z, reason: collision with root package name */
    public final int f107074z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j20(com.tencent.mm.ui.MMActivity context, int i17, int i18, boolean z17, boolean z18) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f107073y = i17;
        this.f107074z = i18;
        this.A = z17;
        this.B = new sc2.i();
        this.C = ((com.tencent.mm.plugin.finder.viewmodel.component.w6) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d;
        this.D = ((te2.e4) ((zy2.g8) pf5.z.f353948a.a(context).c(zy2.g8.class))).f417974d;
        this.I = new com.tencent.mm.plugin.finder.feed.i20(this, context);
        this.L = new com.tencent.mm.plugin.finder.feed.d20(context, this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void G(ym5.s3 reason) {
        java.util.ArrayList f17;
        int i17;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        if (i0Var instanceof com.tencent.mm.plugin.finder.feed.v20) {
            kotlin.jvm.internal.o.e(i0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract.ViewCallback");
            com.tencent.mm.plugin.finder.feed.v20 v20Var = (com.tencent.mm.plugin.finder.feed.v20) i0Var;
            com.tencent.mm.plugin.finder.feed.c0 c0Var = v20Var.f106969e;
            boolean z17 = c0Var instanceof com.tencent.mm.plugin.finder.feed.j20;
            com.tencent.mm.plugin.finder.feed.j20 j20Var = z17 ? (com.tencent.mm.plugin.finder.feed.j20) c0Var : null;
            boolean z18 = j20Var != null ? j20Var.H : false;
            if (!z18 && reason.f463521f) {
                androidx.recyclerview.widget.RecyclerView recyclerView = v20Var.o().getRecyclerView();
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                int w17 = ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).w() + 1;
                if (w17 < v20Var.a().getData().size()) {
                    recyclerView.post(new com.tencent.mm.plugin.finder.feed.u20(recyclerView, w17));
                }
            }
            int i18 = v20Var.f110866s;
            if ((i18 == 16 || i18 == 23 || i18 == 24) && !reason.f463521f && (f17 = c0Var.f()) != null) {
                java.util.ListIterator listIterator = f17.listIterator(f17.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i17 = -1;
                        break;
                    } else if (((so2.j5) listIterator.previous()) instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                        i17 = listIterator.nextIndex();
                        break;
                    }
                }
                if (i17 != -1) {
                    java.lang.Object obj = f17.get(i17);
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
                    if (baseFinderFeed.getFeedObject().isMemberFeed() && baseFinderFeed.getShowMemberScroll()) {
                        baseFinderFeed.W1(false);
                        com.tencent.mm.plugin.finder.feed.i0 i0Var2 = c0Var.f106424g;
                        if (i0Var2 != null) {
                            i0Var2.a().notifyItemRangeChanged(i17, 1, new jz5.l(39, 1));
                        }
                    }
                }
            }
            if (z18) {
                com.tencent.mm.plugin.finder.feed.j20 j20Var2 = z17 ? (com.tencent.mm.plugin.finder.feed.j20) c0Var : null;
                if (j20Var2 == null) {
                    return;
                }
                j20Var2.H = false;
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            baseFeedLoader.requestRefresh();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        fc2.c n17;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        fc2.c n18;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        com.tencent.mm.plugin.finder.feed.e20 e20Var = new com.tencent.mm.plugin.finder.feed.e20(this);
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.C;
        l0Var.N0(this.f107073y, this.f106422e, e20Var);
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.a(l0Var);
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) baseFeedLoader : null;
        sc2.i iVar = this.B;
        iVar.f405955a = baseFinderFeedLoader;
        zy2.h8 h8Var = this.D;
        com.tencent.mm.plugin.finder.feed.f20 f20Var = new com.tencent.mm.plugin.finder.feed.f20(this);
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).N0(f20Var, i0Var != null ? i0Var.getRecyclerView() : null);
        if (this.A) {
            com.tencent.mm.plugin.finder.feed.i0 i0Var2 = this.f106424g;
            if (i0Var2 != null && (recyclerView = i0Var2.getRecyclerView()) != null) {
                recyclerView.i(this.I);
            }
            com.tencent.mm.plugin.finder.feed.i0 i0Var3 = this.f106424g;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = i0Var3 != null ? i0Var3.getRecyclerView() : null;
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = recyclerView2 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView2 : null;
            if (finderRecyclerView != null) {
                finderRecyclerView.setInterceptTouchEventListener(this.L);
            }
        }
        if (this.f107074z == 7) {
            iVar.f405956b = context.getIntent().getIntExtra("key_activity_max_top_count", 3);
            this.G = context.getIntent().getStringExtra("key_creator_finder_name");
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivityFeedRemoveEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivityFeedRemoveEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter$onAttach$3
                {
                    this.__eventId = -478908231;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.ActivityFeedRemoveEvent activityFeedRemoveEvent) {
                    com.tencent.mm.autogen.events.ActivityFeedRemoveEvent event = activityFeedRemoveEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    pm0.v.X(new com.tencent.mm.plugin.finder.feed.g20(event, com.tencent.mm.plugin.finder.feed.j20.this));
                    return false;
                }
            };
            this.E = iListener;
            iListener.alive();
        }
        final com.tencent.mm.app.a0 a0Var2 = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MemberStatusEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MemberStatusEvent>(a0Var2) { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter$onAttach$4
            {
                this.__eventId = -616994146;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MemberStatusEvent memberStatusEvent) {
                com.tencent.mm.autogen.events.MemberStatusEvent event = memberStatusEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.rj rjVar = event.f54494g;
                if (!rjVar.f7822a || !eo2.f.f255565a.d(java.lang.Integer.valueOf(rjVar.f7824c))) {
                    return false;
                }
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.h20(com.tencent.mm.plugin.finder.feed.j20.this, event));
                return false;
            }
        };
        this.F = iListener2;
        iListener2.alive();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar2 == null || (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
        s3Var.getClass();
        n17.a(s3Var);
    }

    public final void Z() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader finderTopicTimelineUIContract$RelativeLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader ? (com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader) baseFeedLoader : null;
        if (finderTopicTimelineUIContract$RelativeLoader == null || !finderTopicTimelineUIContract$RelativeLoader.f106156x) {
            return;
        }
        finderTopicTimelineUIContract$RelativeLoader.f106156x = false;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.request$default(finderTopicTimelineUIContract$RelativeLoader, new db2.t0(finderTopicTimelineUIContract$RelativeLoader.f106147o, finderTopicTimelineUIContract$RelativeLoader.f106148p, finderTopicTimelineUIContract$RelativeLoader.f106151s, finderTopicTimelineUIContract$RelativeLoader.getLastBuffer(), null, finderTopicTimelineUIContract$RelativeLoader.f106150r, finderTopicTimelineUIContract$RelativeLoader.f106152t, finderTopicTimelineUIContract$RelativeLoader.f106153u, finderTopicTimelineUIContract$RelativeLoader.f106154v, null, finderTopicTimelineUIContract$RelativeLoader.getContextObj(), 0.0f, 0.0f, 0, 0, 19, null, null, finderTopicTimelineUIContract$RelativeLoader.f106149q, 0, null, null, null, null, null, null, null, null, null, null, 1073445376, null), null, 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public java.lang.String b2(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        ya2.b2 contact;
        if (this.A) {
            boolean z17 = false;
            if (baseFinderFeed != null && (contact = baseFinderFeed.getContact()) != null && ya2.d.f(contact)) {
                z17 = true;
            }
            if (z17) {
                java.lang.String string = this.f106421d.getString(com.tencent.mm.R.string.mhe);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                return string;
            }
        }
        return "";
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0, com.tencent.mm.plugin.finder.feed.k8
    public boolean d0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void m(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        int i17 = this.f107074z;
        if (i17 == 7) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.G);
            com.tencent.mm.ui.MMActivity context = this.f106421d;
            if (!K0 && kotlin.jvm.internal.o.b(this.G, xy2.c.e(context))) {
                if (feed.getFeedObject().isPostFinish()) {
                    menu.g(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT, context.getString(com.tencent.mm.R.string.cjf), com.tencent.mm.R.raw.icons_outlined_remove_from_list);
                }
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
                kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract.Loader");
                if (((com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader) baseFeedLoader).f106144z == 1) {
                    this.B.getClass();
                    kotlin.jvm.internal.o.g(context, "context");
                    if (feed.getFeedObject().getStickyTime() > 0) {
                        menu.g(5003, context.getString(com.tencent.mm.R.string.cn6), com.tencent.mm.R.raw.icons_outlined_top_off);
                    } else {
                        menu.g(5002, context.getString(com.tencent.mm.R.string.f49), com.tencent.mm.R.raw.icons_outlined_top);
                    }
                }
            }
        }
        super.m(feed, menu, sheet, holder);
        if (i17 == 16 || i17 == 23 || i17 == 24) {
            menu.removeItem(305);
            menu.removeItem(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        fc2.c n17;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2;
        java.util.Iterator it;
        java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> cls;
        com.tencent.mm.ui.MMActivity mMActivity;
        fc2.c n18;
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.C;
        l0Var.onDetach();
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> cls2 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(cls2);
        boolean z17 = false;
        int i17 = 1;
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.d(l0Var);
        }
        if (this.A && (baseFeedLoader = this.f106570t) != null && (baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader)) {
            java.util.Iterator it6 = baseFeedLoader.getDataListJustForAdapter().iterator();
            while (it6.hasNext()) {
                so2.j5 j5Var = (so2.j5) it6.next();
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                    if (baseFinderFeed.getFeedObject().getMediaType() != 15 && baseFinderFeed.getFeedObject().getMediaType() != 2) {
                        com.tencent.mm.plugin.finder.storage.rj0 tk6 = ((c61.l7) i95.n0.c(c61.l7.class)).tk();
                        long id6 = baseFinderFeed.getFeedObject().getId();
                        tk6.getClass();
                        long j17 = ((com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader) baseFeedLoader).f106135q;
                        if (j17 != 0 && id6 != 0) {
                            androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class);
                            kotlin.jvm.internal.o.f(a17, "get(...)");
                            ey2.v2 v2Var = (ey2.v2) a17;
                            ey2.q2 R6 = v2Var.R6(id6, z17, ey2.t2.f257517g);
                            ey2.r2 r2Var = (ey2.r2) v2Var.f257557g.get(java.lang.Long.valueOf(id6));
                            if (R6 != null && R6.f257480c != 0) {
                                dm.e5 e5Var = new dm.e5();
                                e5Var.field_businessId = i17;
                                e5Var.field_courseId = j17;
                                e5Var.field_feedId = R6.f257478a;
                                e5Var.field_progress = R6.f257480c;
                                e5Var.field_speedRatio = R6.f257483f;
                                e5Var.field_playTimeMs = R6.f257481d;
                                e5Var.field_maxProgress = r2Var != null ? r2Var.f257495c : 0;
                                e5Var.field_completePlayCnt = r2Var != null ? r2Var.f257493a : 0;
                                java.util.LinkedList linkedList = new java.util.LinkedList();
                                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                                p75.d dVar = dm.e5.f236618r;
                                p75.m0 i18 = dVar.i(java.lang.Long.valueOf(j17));
                                baseFeedLoader2 = baseFeedLoader;
                                p75.d dVar2 = dm.e5.f236617q;
                                it = it6;
                                p75.m c17 = i18.c(dVar2.i(java.lang.Long.valueOf(id6)));
                                p75.n0 n0Var = dm.e5.f236615o;
                                p75.i0 g17 = n0Var.g(linkedList);
                                g17.f352657d = c17;
                                g17.f352659f = linkedList2;
                                g17.f352660g = linkedList3;
                                p75.l0 a18 = g17.a();
                                l75.k0 k0Var = tk6.f127496d;
                                dm.e5 e5Var2 = (dm.e5) a18.o(k0Var, dm.e5.class);
                                if (e5Var2 == null) {
                                    tk6.insertNotify(e5Var, false);
                                    mMActivity = context;
                                    cls = cls2;
                                    context = mMActivity;
                                    baseFeedLoader = baseFeedLoader2;
                                    it6 = it;
                                    cls2 = cls;
                                    z17 = false;
                                    i17 = 1;
                                } else {
                                    android.content.ContentValues contentValues = new android.content.ContentValues();
                                    cls = cls2;
                                    contentValues.put("businessId", (java.lang.Integer) 1);
                                    contentValues.put("courseId", java.lang.Long.valueOf(j17));
                                    contentValues.put("feedId", java.lang.Long.valueOf(id6));
                                    contentValues.put("progress", java.lang.Integer.valueOf(e5Var.field_progress));
                                    contentValues.put("speedRatio", java.lang.Float.valueOf(e5Var.field_speedRatio));
                                    mMActivity = context;
                                    contentValues.put("playTimeMs", java.lang.Long.valueOf(e5Var.field_playTimeMs));
                                    int i19 = e5Var2.field_maxProgress;
                                    int i27 = e5Var.field_maxProgress;
                                    if (i19 < i27) {
                                        i19 = i27;
                                    }
                                    contentValues.put("maxProgress", java.lang.Integer.valueOf(i19));
                                    int i28 = e5Var2.field_completePlayCnt;
                                    int i29 = e5Var.field_completePlayCnt;
                                    if (i28 < i29) {
                                        i28 = i29;
                                    }
                                    contentValues.put("completePlayCnt", java.lang.Integer.valueOf(i28));
                                    p75.m c18 = dVar.i(java.lang.Long.valueOf(j17)).c(dVar2.i(java.lang.Long.valueOf(id6)));
                                    p75.h1 j18 = n0Var.j(contentValues);
                                    j18.f352651c = c18;
                                    j18.a().f(k0Var);
                                    context = mMActivity;
                                    baseFeedLoader = baseFeedLoader2;
                                    it6 = it;
                                    cls2 = cls;
                                    z17 = false;
                                    i17 = 1;
                                }
                            }
                        }
                        baseFeedLoader2 = baseFeedLoader;
                        it = it6;
                        mMActivity = context;
                        cls = cls2;
                        context = mMActivity;
                        baseFeedLoader = baseFeedLoader2;
                        it6 = it;
                        cls2 = cls;
                        z17 = false;
                        i17 = 1;
                    }
                }
                baseFeedLoader2 = baseFeedLoader;
                it = it6;
                mMActivity = context;
                cls = cls2;
                context = mMActivity;
                baseFeedLoader = baseFeedLoader2;
                it6 = it;
                cls2 = cls;
                z17 = false;
                i17 = 1;
            }
        }
        com.tencent.mm.ui.MMActivity mMActivity2 = context;
        java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> cls3 = cls2;
        com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) this.D;
        s3Var.onDetach();
        com.tencent.mm.sdk.event.IListener iListener = this.E;
        if (iListener != null) {
            iListener.dead();
        }
        com.tencent.mm.sdk.event.IListener iListener2 = this.F;
        if (iListener2 != null) {
            iListener2.dead();
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMActivity2).a(cls3);
        if (nyVar2 != null && (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) != null) {
            s3Var.getClass();
            n17.d(s3Var);
        }
        super.onDetach();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    @Override // com.tencent.mm.plugin.finder.feed.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRefreshEnd(ym5.s3 r24) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.j20.onRefreshEnd(ym5.s3):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void p(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, android.view.MenuItem menuItem, int i17, int i18, in5.s0 holder) {
        r45.xl2 event;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        kotlin.jvm.internal.o.g(holder, "holder");
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        if (itemId == 101) {
            if (this.f107074z != 7) {
                super.p(feed, menuItem, i17, i18, holder);
                return;
            }
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = feed.getFeedObject().getFeedObject().getObjectDesc();
            long j17 = (objectDesc == null || (event = objectDesc.getEvent()) == null) ? 0L : event.getLong(0);
            kotlin.jvm.internal.o.g(context, "context");
            java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&topic_id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{68, pm0.v.u(j17)}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mm.plugin.finder.report.x3.f125432a.c(this.f106421d, "button_complaint", feed.getItemId(), i18);
            return;
        }
        sc2.i iVar = this.B;
        switch (itemId) {
            case com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT /* 5001 */:
                iVar.getClass();
                kotlin.jvm.internal.o.g(context, "context");
                iVar.f405959e = feed;
                if (iVar.f405958d == null) {
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, true);
                    k0Var.r(context.getResources().getString(com.tencent.mm.R.string.cjh), 17, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479930ja), null);
                    k0Var.f211872n = new sc2.f(context);
                    k0Var.f211881s = new sc2.g(iVar, context);
                    k0Var.f211854d = new sc2.h(iVar);
                    iVar.f405958d = k0Var;
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = iVar.f405958d;
                if (k0Var2 == null || k0Var2.i()) {
                    return;
                }
                k0Var2.v();
                return;
            case 5002:
                iVar.a(context, true, feed);
                return;
            case 5003:
                iVar.a(context, false, feed);
                return;
            default:
                super.p(feed, menuItem, i17, i18, holder);
                return;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public boolean q() {
        return false;
    }
}
