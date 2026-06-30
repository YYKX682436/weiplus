package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class c0 implements fs2.a, com.tencent.mm.plugin.finder.feed.k8, im5.b, com.tencent.mm.plugin.finder.feed.fp {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f106421d;

    /* renamed from: e, reason: collision with root package name */
    public final int f106422e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f106423f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.i0 f106424g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.y2 f106425h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f106426i;

    /* renamed from: m, reason: collision with root package name */
    public int f106427m;

    /* renamed from: n, reason: collision with root package name */
    public final o25.y1 f106428n;

    /* renamed from: o, reason: collision with root package name */
    public final cw2.f8 f106429o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.FinderBaseFeedUIContract$Presenter$feedExposeInfoChangeListener$1 f106430p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.FinderBaseFeedUIContract$Presenter$noInterestFeedScrollListener$1 f106431q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.FinderBaseFeedUIContract$Presenter$feedDislikeListener$1 f106432r;

    /* JADX WARN: Type inference failed for: r4v11, types: [com.tencent.mm.plugin.finder.feed.FinderBaseFeedUIContract$Presenter$feedExposeInfoChangeListener$1] */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.tencent.mm.plugin.finder.feed.FinderBaseFeedUIContract$Presenter$noInterestFeedScrollListener$1] */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.tencent.mm.plugin.finder.feed.FinderBaseFeedUIContract$Presenter$feedDislikeListener$1] */
    public c0(final com.tencent.mm.ui.MMActivity context, int i17, int i18, kotlin.jvm.internal.i iVar) {
        int i19 = 0;
        if ((i18 & 2) != 0) {
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            i17 = nyVar != null ? nyVar.f135380n : 0;
        }
        kotlin.jvm.internal.o.g(context, "context");
        this.f106421d = context;
        this.f106422e = i17;
        this.f106423f = "Finder.FinderLoaderFeedUIContract.Presenter";
        this.f106426i = new java.util.concurrent.CopyOnWriteArraySet();
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.f106428n = new com.tencent.mm.pluginsdk.forward.m();
        androidx.recyclerview.widget.y2 y2Var = new androidx.recyclerview.widget.y2();
        this.f106425h = y2Var;
        y2Var.e(1, 10);
        y2Var.e(2, 10);
        this.f106429o = new cw2.f8(i19, 1, null);
        this.f106430p = new com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener() { // from class: com.tencent.mm.plugin.finder.feed.FinderBaseFeedUIContract$Presenter$feedExposeInfoChangeListener$1

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.String f106077d;

            {
                this.f106077d = com.tencent.mm.plugin.finder.feed.c0.this.v();
            }

            @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
            public com.tencent.mm.plugin.finder.storage.FinderItem c(long j17) {
                androidx.recyclerview.widget.RecyclerView recyclerView;
                com.tencent.mm.plugin.finder.feed.c0 c0Var = com.tencent.mm.plugin.finder.feed.c0.this;
                com.tencent.mm.plugin.finder.feed.i0 i0Var = c0Var.f106424g;
                if (i0Var == null || (recyclerView = i0Var.getRecyclerView()) == null) {
                    return null;
                }
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
                androidx.recyclerview.widget.k3 Y = in5.n0.Y((in5.n0) adapter, j17, false, 2, null);
                if (Y == null) {
                    return null;
                }
                int adapterPosition = Y.getAdapterPosition();
                kotlin.jvm.internal.o.d(c0Var.f106424g);
                so2.j5 s17 = c0Var.s(adapterPosition + 0);
                if (s17 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    return ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) s17).getFeedObject();
                }
                return null;
            }

            @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
            /* renamed from: d, reason: from getter */
            public java.lang.String getF106077d() {
                return this.f106077d;
            }

            @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
            public void e(long j17, r45.yl2 yl2Var) {
                androidx.recyclerview.widget.RecyclerView recyclerView;
                com.tencent.mm.plugin.finder.feed.i0 i0Var = com.tencent.mm.plugin.finder.feed.c0.this.f106424g;
                if (i0Var == null || (recyclerView = i0Var.getRecyclerView()) == null) {
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
        this.f106431q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent>(context) { // from class: com.tencent.mm.plugin.finder.feed.FinderBaseFeedUIContract$Presenter$noInterestFeedScrollListener$1
            {
                this.__eventId = 1966115342;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent finderNoInterestFeedScrollEvent) {
                com.tencent.mm.plugin.finder.feed.i0 i0Var;
                com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent event = finderNoInterestFeedScrollEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.tc tcVar = event.f54314g;
                if (tcVar == null) {
                    return false;
                }
                boolean z17 = tcVar.f7998a;
                com.tencent.mm.plugin.finder.feed.c0 c0Var = com.tencent.mm.plugin.finder.feed.c0.this;
                if (c0Var.g() && (i0Var = c0Var.f106424g) != null) {
                    i0Var.v(z17);
                }
                return true;
            }
        };
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f106432r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderFeedDislikeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderBaseFeedUIContract$Presenter$feedDislikeListener$1
            {
                this.__eventId = -633386071;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderFeedDislikeEvent finderFeedDislikeEvent) {
                com.tencent.mm.autogen.events.FinderFeedDislikeEvent event = finderFeedDislikeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.eb ebVar = event.f54274g;
                if (ebVar == null) {
                    return false;
                }
                return com.tencent.mm.plugin.finder.feed.c0.this.z(ebVar.f6547a);
            }
        };
    }

    public void A(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        int c17 = c(feed);
        if (c17 >= 0) {
            bd2.r.f19284a.e(this.f106421d, feed.getFeedObject().getId(), feed.getFeedObject().getDupFlag(), feed.getFeedObject().getObjectNonceId(), feed.getFeedObject().isLiveFeed(), holder);
            return;
        }
        com.tencent.mars.xlog.Log.i(v(), "[handleNoInterest] pos error " + c17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 A0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.u(this, feed, sheet, holder);
    }

    public abstract void B();

    public abstract void C();

    public void D(com.tencent.mm.plugin.finder.feed.i0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f106424g = callback;
        B();
        alive();
        if (bd2.r.f19284a.b()) {
            alive();
        }
        alive();
        cw2.f8 f8Var = this.f106429o;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        kotlin.jvm.internal.o.d(i0Var);
        cw2.f8.L0(f8Var, i0Var.f106968d, null, new com.tencent.mm.plugin.finder.feed.a0(this), false, 8, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 D1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder, yz5.a aVar) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.x(aVar, this, feed, i17, holder);
    }

    public boolean F() {
        com.tencent.mm.plugin.finder.view.f5 g17;
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.v6 v6Var = (com.tencent.mm.plugin.finder.viewmodel.component.v6) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.v6.class);
        if (v6Var != null && v6Var.O6()) {
            return true;
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        if (i0Var != null && (g17 = i0Var.g()) != null && g17.b()) {
            g17.a();
            return true;
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var2 = this.f106424g;
        if (i0Var2 != null) {
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer l17 = i0Var2.l();
            if (l17.q()) {
                l17.u();
                return true;
            }
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var3 = this.f106424g;
        if (i0Var3 != null) {
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = i0Var3.f106972h;
            if (finderLikeDrawer == null) {
                kotlin.jvm.internal.o.o("friendLikeDrawer");
                throw null;
            }
            if (finderLikeDrawer.q()) {
                finderLikeDrawer.u();
                return true;
            }
        }
        return false;
    }

    public void G(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: H1 */
    public cw2.f8 getF122653q() {
        return this.f106429o;
    }

    public void I() {
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.uo) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.uo.class)).P6();
        this.f106428n.getClass();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.s4 K0(com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.w(this, feed, bottomSheet, holder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0.isShown() == true) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M() {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.feed.i0 r0 = r4.f106424g
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 == 0) goto L12
            com.tencent.mm.plugin.finder.feed.b0 r1 = new com.tencent.mm.plugin.finder.feed.b0
            r1.<init>(r4)
            r0.post(r1)
        L12:
            com.tencent.mm.plugin.finder.feed.i0 r0 = r4.f106424g
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2b
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer r0 = r0.f106972h
            if (r0 == 0) goto L25
            boolean r0 = r0.isShown()
            if (r0 != r2) goto L2b
            r0 = r2
            goto L2c
        L25:
            java.lang.String r0 = "friendLikeDrawer"
            kotlin.jvm.internal.o.o(r0)
            throw r1
        L2b:
            r0 = r3
        L2c:
            if (r0 != 0) goto L46
            com.tencent.mm.plugin.finder.feed.i0 r0 = r4.f106424g
            if (r0 == 0) goto L43
            com.tencent.mm.plugin.finder.view.FinderFavDrawer r0 = r0.f106973i
            if (r0 == 0) goto L3d
            boolean r0 = r0.isShown()
            if (r0 != r2) goto L43
            goto L44
        L3d:
            java.lang.String r0 = "favDrawer"
            kotlin.jvm.internal.o.o(r0)
            throw r1
        L43:
            r2 = r3
        L44:
            if (r2 == 0) goto L5e
        L46:
            com.tencent.mm.ui.MMActivity r0 = r4.f106421d
            java.lang.String r1 = "activity"
            kotlin.jvm.internal.o.g(r0, r1)
            pf5.z r1 = pf5.z.f353948a
            pf5.v r0 = r1.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.uo> r1 = com.tencent.mm.plugin.finder.viewmodel.component.uo.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.uo r0 = (com.tencent.mm.plugin.finder.viewmodel.component.uo) r0
            r0.O6()
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.c0.M():void");
    }

    public abstract void P();

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void W4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, boolean z18, int i17, boolean z19, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        so2.e2.f410328a.b(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), i17, feed.getFeedObject(), z17, z18, 2, feed.getShowLikeTips(), z19, hc2.s.f(feed.getContact()), bc1Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 Y(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.v(this, feed);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 c4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.z(this, feed, holder);
    }

    public boolean d0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public androidx.recyclerview.widget.y2 e2() {
        return this.f106425h;
    }

    public boolean g() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: getActivity */
    public com.tencent.mm.ui.MMActivity getF122643d() {
        return this.f106421d;
    }

    public abstract in5.s h();

    public void i(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet, int i17) {
        ec2.d e27;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.plugin.finder.assist.i4 N = com.tencent.mm.plugin.finder.assist.y4.N(y4Var, this.f106421d, feed, 0, com.tencent.mm.plugin.finder.feed.i.f106967d, new com.tencent.mm.plugin.finder.feed.j(menu, sheet, this), 4, null);
        if (feed instanceof so2.h1) {
            if (i17 == 1) {
                feed.getFeedObject().setShareScene(7);
            } else if (i17 == 3) {
                feed.getFeedObject().setShareScene(1);
            }
        }
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        y4Var.B(context, menu, feed, N);
        y4Var.C(context, menu, feed, N);
        y4Var.l(context, menu, feed);
        y4Var.E(menu, N);
        y4Var.i(context, menu, feed, N);
        y4Var.o(context, menu, feed);
        y4Var.A(context, menu, feed);
        y4Var.D(context, menu, feed);
        y4Var.w(context, menu, feed);
        y4Var.v(context, feed, menu);
        y4Var.F(context, feed, menu);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bj(feed.getItemId(), this.f106422e);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (e27 = zy2.ra.e2(nyVar, 0, 1, null)) != null) {
            e27.a(new ec2.a(16, feed.getItemId(), feed.w()));
        }
        com.tencent.mm.plugin.finder.report.x3.f125432a.a(menu);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public com.tencent.mm.plugin.finder.view.f5 j2() {
        com.tencent.mm.plugin.finder.view.f5 g17;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        return (i0Var == null || (g17 = i0Var.g()) == null) ? new com.tencent.mm.plugin.finder.view.f5() : g17;
    }

    @Override // im5.b
    public void keep(im5.a aVar) {
        this.f106426i.add(aVar);
    }

    public void m(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        java.lang.String string;
        android.content.Intent intent;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        y4Var.k(activity, menu, feed);
        y4Var.s(activity, menu, feed);
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        if (i0Var == null || (recyclerView = i0Var.getRecyclerView()) == null) {
            string = activity.getString(com.tencent.mm.R.string.gue);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        } else {
            string = com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.f133635x.a(recyclerView);
        }
        y4Var.G(menu, feed, string);
        y4Var.y(this.f106421d, feed, menu, sheet, 200);
        y4Var.x(activity, feed, menu);
        if (feed.N0()) {
            y4Var.t(activity, menu, feed);
            y4Var.g(activity, menu, feed);
            android.content.Intent intent2 = activity.getIntent();
            if (intent2 != null && intent2.getBooleanExtra("KEY_FINDER_SELF_FLAG", false)) {
                y4Var.a(activity, menu, feed);
            }
        }
        bd2.r rVar = bd2.r.f19284a;
        kotlin.jvm.internal.o.g(activity, "context");
        if (!feed.N0() && ((intent = activity.getIntent()) == null || intent.getIntExtra("key_topic_type", 0) != 16)) {
            y4Var.h(activity, menu, feed);
        }
        if (!hc2.b0.i(feed)) {
            zl2.q4 q4Var = zl2.q4.f473933a;
            if (q4Var.C(feed)) {
                q4Var.a(menu);
                kotlin.jvm.internal.o.g(activity, "activity");
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.T2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1")), V6.getString(1), java.lang.Integer.valueOf(V6.getInteger(5)).toString(), null, null, false, 112, null);
            }
            menu.g(101, activity.getString(com.tencent.mm.R.string.gys), com.tencent.mm.R.raw.icons_outlined_report_problem);
        }
        y4Var.q(activity, menu, feed);
        y4Var.m(activity, menu, feed);
        com.tencent.mm.plugin.finder.feed.i0 i0Var2 = this.f106424g;
        if (i0Var2 != null && i0Var2.f106977p) {
            y4Var.c(activity, menu, feed, holder);
        }
        y4Var.z(activity, feed, menu);
        y4Var.H(activity, feed, menu);
        y4Var.b(activity, feed, menu);
        y4Var.r(activity, feed, menu);
        y4Var.p(activity, feed, menu);
        y4Var.e(activity, feed, menu);
        y4Var.j(activity, feed, menu);
        y4Var.f(activity, feed, menu);
        y4Var.n(activity, menu, feed);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void n0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, int i17, r45.qt2 qt2Var) {
        int i18;
        kotlin.jvm.internal.o.g(feed, "feed");
        if (qt2Var == null) {
            com.tencent.mm.ui.MMActivity activity = this.f106421d;
            kotlin.jvm.internal.o.g(activity, "activity");
            qt2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        r45.qt2 qt2Var2 = qt2Var;
        so2.z1 z1Var = so2.z1.f410730a;
        com.tencent.mm.ui.MMActivity mMActivity = this.f106421d;
        int i19 = db2.m0.f228066v;
        z1Var.a(mMActivity, qt2Var2, feed, z17 ? 1 : 2, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : i17);
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

    @Override // fs2.a
    public void onDetach() {
        bu2.n.f24550a.c();
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f106426i;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).dead();
        }
        copyOnWriteArraySet.clear();
        dead();
        if (bd2.r.f19284a.b()) {
            dead();
        }
        dead();
        this.f106424g = null;
    }

    public void onRefreshEnd(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    public void p(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, android.view.MenuItem menuItem, int i17, int i18, in5.s0 holder) {
        java.lang.String string;
        r45.q23 video_tmpl_info;
        java.lang.String str;
        r45.tz0 tz0Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        cw2.da videoView;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i(v(), "getMoreMenuItemSelectedListener feed " + feed + ' ' + i17 + " menuItem:" + menuItem.getItemId());
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        if (itemId == 215) {
            y4Var.e0(context, feed);
            return;
        }
        if (itemId == 216) {
            kotlin.jvm.internal.o.g(context, "context");
            r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
            if (object_extend == null || (string = object_extend.getString(46)) == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", string);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (itemId == 218) {
            y4Var.g0(context, feed);
            return;
        }
        if (itemId == 219) {
            y4Var.d0(context, feed, holder);
            return;
        }
        if (itemId == 301 || itemId == 302) {
            kotlin.jvm.internal.o.g(context, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.Q6((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) a17, holder, false, true, false, 8, null);
            return;
        }
        com.tencent.mm.plugin.finder.report.x3 x3Var = com.tencent.mm.plugin.finder.report.x3.f125432a;
        if (itemId == 99) {
            if (c(feed) > 0) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_uninterest_clk", holder.itemView, null, 24617);
            }
            A(feed, i17, holder);
            x3Var.c(this.f106421d, "button_uninterested", feed.getItemId(), i18);
            return;
        }
        if (itemId == 116) {
            if (this.f106424g != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.view.View p17 = holder.p(com.tencent.mm.R.id.f484486ee3);
                if (p17 != null) {
                    arrayList.add(p17);
                }
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
                cw2.da videoView2 = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView2 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView2 : null;
                if (finderThumbPlayerProxy != null) {
                    kotlin.jvm.internal.o.g(context, "activity");
                    androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
                    kotlin.jvm.internal.o.f(a18, "get(...)");
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.a7((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) a18, holder, arrayList, finderThumbPlayerProxy, null, null, null, 56, null);
                }
            }
            x3Var.c(this.f106421d, "button_speedplay", feed.getItemId(), i18);
            return;
        }
        if (itemId == 213) {
            com.tencent.mm.plugin.finder.assist.k2 k2Var = com.tencent.mm.plugin.finder.assist.k2.f102306a;
            k2Var.a(feed.getFeedObject());
            k2Var.b(context);
            return;
        }
        if (itemId == 403) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            r45.s02 s02Var = new r45.s02();
            s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
            s02Var.set(3, 1);
            ((b92.d1) zbVar).uj(context, s02Var);
            kotlin.jvm.internal.o.g(context, "activity");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.W2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1")), V6.getString(1), java.lang.Integer.valueOf(V6.getInteger(5)).toString(), null, null, false, 112, null);
            return;
        }
        if (itemId == 406) {
            y4Var.U(context, feed.getItemId());
            return;
        }
        if (itemId == 312) {
            y4Var.M(context, holder, feed, this.f106429o);
            return;
        }
        if (itemId == 313) {
            y4Var.K(context, feed, holder, menuItem);
            return;
        }
        boolean z17 = false;
        switch (itemId) {
            case 118:
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = feed.getFeedObject().getFeedObject().getObjectDesc();
                r45.q23 video_tmpl_info2 = objectDesc != null ? objectDesc.getVideo_tmpl_info() : null;
                if (video_tmpl_info2 == null) {
                    db5.t7.g(context, context.getString(com.tencent.mm.R.string.d0c));
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    int i19 = video_tmpl_info2.f383586e;
                    int i27 = i19 != 1 ? i19 != 3 ? -1 : 16 : 13;
                    com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                    p2Var.W(p2Var.i(context, 53, false));
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("shoot_same_feedid", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(feed.getFeedObject().getFeedObject().getId()));
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    p2Var.V(r26.i0.t(jSONObject2, ",", ";", false));
                    zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                    intent2.putExtra("key_maas_entrance", 5);
                    intent2.putExtra("key_ref_feed_id", feed.getFeedObject().getFeedObject().getId());
                    intent2.putExtra("key_ref_feed_dup_flag", feed.w());
                    intent2.putExtra("KEY_FINDER_NEED_POST_TO_COMMENT", true);
                    intent2.putExtra("KEY_FINDER_TARGET_TEMPLATE_ID", video_tmpl_info2.f383585d);
                    intent2.putExtra("KEY_FINDER_TARGET_TEMPLATE_TYPE", video_tmpl_info2.f383586e);
                    ((c61.l7) b6Var).tj(context, video_tmpl_info2, intent2, i27);
                    com.tencent.mm.plugin.finder.report.p2.L(p2Var, this.f106421d, 93, video_tmpl_info2, 0L, 0, 24, null);
                }
                kotlin.jvm.internal.o.g(context, "activity");
                r45.qt2 V62 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                com.tencent.mm.plugin.finder.report.b6 b6Var2 = com.tencent.mm.plugin.finder.report.b6.f124969a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = feed.getFeedObject().getFeedObject().getObjectDesc();
                java.lang.Object obj = (objectDesc2 == null || (video_tmpl_info = objectDesc2.getVideo_tmpl_info()) == null) ? null : video_tmpl_info.f383585d;
                if (obj == null) {
                    obj = 0;
                }
                jSONObject3.put("templateId", obj);
                b6Var2.c(V62, "shoot_same_video", true, jSONObject3);
                return;
            case 119:
                y4Var.X(context, feed);
                return;
            case 120:
                kotlin.jvm.internal.o.g(context, "activity");
                fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
                byte[] byteArray = feed.getFeedObject().getFeedObject().toByteArray();
                ((ee0.n4) k4Var).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                if (byteArray == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                    return;
                } else {
                    je4.a.f299315a.a(context, 2, byteArray, 0, 9);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                    return;
                }
            case 121:
                y4Var.Q(context, feed);
                return;
            case 122:
                y4Var.P(context, feed);
                return;
            default:
                vs5.a aVar = vs5.a.f439924a;
                com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
                switch (itemId) {
                    case 101:
                        boolean C = zl2.q4.f473933a.C(feed);
                        bd2.b bVar = bd2.b.f19244a;
                        if (C) {
                            r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
                            if (liveInfo != null) {
                                long j17 = liveInfo.getLong(0);
                                kotlin.jvm.internal.o.g(context, "activity");
                                bd2.b.k(bVar, context, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), j17, feed.getFeedObject().getUserName(), null, 0, null, 112, null);
                            }
                        } else {
                            bd2.b.c(bVar, this.f106421d, feed, 0L, 0, 12, null);
                        }
                        x3Var.c(this.f106421d, "button_complaint", feed.getItemId(), i18);
                        return;
                    case 102:
                        android.os.Bundle bundle = new android.os.Bundle();
                        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                        ml2.t1 t1Var = ml2.t1.f327954i;
                        kotlin.jvm.internal.o.g(context, "activity");
                        ((b92.d1) zbVar2).rj(t1Var, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
                        n7Var.B(this.f106421d, feed.getFeedObject(), bundle, 3, new com.tencent.mm.plugin.finder.feed.p(feed));
                        x3Var.c(this.f106421d, "button_forward_friend", feed.getItemId(), i18);
                        c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
                        kotlin.jvm.internal.o.g(context, "activity");
                        ((b92.d1) zbVar3).rj(t1Var, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
                        return;
                    case 103:
                        com.tencent.mm.plugin.finder.assist.n7.F(n7Var, this.f106421d, feed, null, 0, 0, 28, null);
                        if (feed.getFeedObject().isLiveFeed()) {
                            r45.nw1 liveInfo2 = feed.getFeedObject().getLiveInfo();
                            java.lang.String valueOf = java.lang.String.valueOf(liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null);
                            java.lang.String valueOf2 = java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId());
                            java.lang.String username = feed.getFeedObject().getFeedObject().getUsername();
                            java.lang.String str2 = com.tencent.mm.plugin.finder.convert.zf.D1;
                            aVar.a(valueOf, valueOf2, username, com.tencent.mm.plugin.finder.convert.zf.D1, "2", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
                        }
                        x3Var.c(this.f106421d, "button_forward_friendcircle", feed.getItemId(), i18);
                        c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
                        ml2.t1 t1Var2 = ml2.t1.f327964m;
                        kotlin.jvm.internal.o.g(context, "activity");
                        ((b92.d1) zbVar4).rj(t1Var2, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
                        return;
                    case 104:
                        so2.v0.b(so2.v0.f410644a, feed, this.f106421d, null, null, 12, null);
                        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                        com.tencent.mm.plugin.finder.report.o3.Rk((com.tencent.mm.plugin.finder.report.o3) c18, this.f106421d, true, feed.getItemId(), false, 8, null);
                        return;
                    default:
                        cu2.m mVar = cu2.m.f222420a;
                        switch (itemId) {
                            case 106:
                                mVar.b(context, feed, false, new com.tencent.mm.plugin.finder.feed.r(this));
                                return;
                            case 107:
                                mVar.b(context, feed, true, new com.tencent.mm.plugin.finder.feed.q(this));
                                return;
                            case 108:
                                com.tencent.mm.plugin.finder.assist.y4.R(y4Var, this.f106421d, feed, 0, new com.tencent.mm.plugin.finder.feed.m(this), 4, null);
                                return;
                            case 109:
                                com.tencent.mm.plugin.finder.assist.y4.T(y4Var, this.f106421d, feed, holder, i18, 0, 16, null);
                                return;
                            default:
                                switch (itemId) {
                                    case 112:
                                        android.content.Intent intent3 = new android.content.Intent();
                                        intent3.putExtra("KEY_FROM_SCENE", 1);
                                        intent3.putExtra("KEY_USERNAME", xy2.c.e(context));
                                        intent3.putExtra("KEY_FINDER_SELF_FLAG", true);
                                        intent3.putExtra("KEY_IS_FULLSCREEN", true);
                                        intent3.putExtra("KEY_ENABLE_SWITCH_PREVIEW_MODE", false);
                                        hc2.e0.b(intent3, 0, kz5.b0.c(feed), null, null);
                                        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).al(context, intent3);
                                        return;
                                    case 113:
                                        com.tencent.mm.plugin.finder.assist.n7.H(n7Var, this.f106421d, feed, null, 0, 12, null);
                                        x3Var.c(this.f106421d, "textstatus_in_menu", feed.getItemId(), i18);
                                        if (feed.getFeedObject().isLiveFeed()) {
                                            r45.nw1 liveInfo3 = feed.getFeedObject().getLiveInfo();
                                            java.lang.String valueOf3 = java.lang.String.valueOf(liveInfo3 != null ? java.lang.Long.valueOf(liveInfo3.getLong(0)) : null);
                                            java.lang.String valueOf4 = java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId());
                                            java.lang.String username2 = feed.getFeedObject().getFeedObject().getUsername();
                                            java.lang.String str3 = com.tencent.mm.plugin.finder.convert.zf.D1;
                                            aVar.a(valueOf3, valueOf4, username2, com.tencent.mm.plugin.finder.convert.zf.D1, "3", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
                                        }
                                        c61.zb zbVar5 = (c61.zb) i95.n0.c(c61.zb.class);
                                        ml2.t1 t1Var3 = ml2.t1.f327967n;
                                        kotlin.jvm.internal.o.g(context, "activity");
                                        ((b92.d1) zbVar5).rj(t1Var3, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
                                        return;
                                    case 114:
                                        android.view.View view = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) holder.p(com.tencent.mm.R.id.ghd);
                                        if (view == null) {
                                            view = holder.p(com.tencent.mm.R.id.frt);
                                        }
                                        if (view != null) {
                                            cw2.ca.d((cw2.ca) view, null, false, 3, null);
                                        }
                                        android.content.Intent intent4 = context.getIntent();
                                        if (intent4 == null || (str = intent4.getStringExtra("KEY_RINGTONE_REPORT_JSON")) == null) {
                                            str = "";
                                        }
                                        kotlin.jvm.internal.o.g(context, "activity");
                                        com.tencent.mm.plugin.finder.assist.y5.e(com.tencent.mm.plugin.finder.assist.y5.f102716a, this.f106421d, feed, 2L, false, null, str, ((com.tencent.mm.plugin.finder.viewmodel.component.je) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.je.class)).f134268h, holder, new com.tencent.mm.plugin.finder.feed.k(view, this), 24, null);
                                        x3Var.c(this.f106421d, "button_set_bell", feed.getItemId(), i18);
                                        return;
                                    default:
                                        switch (itemId) {
                                            case 200:
                                                y4Var.Y(feed, context, cu2.f0.f222391a.f(feed.getFeedObject().getFromAppId()));
                                                return;
                                            case 201:
                                                y4Var.h0(context, feed);
                                                return;
                                            case 202:
                                                xc2.y2.f453343a.V(context, feed, i18, d0());
                                                return;
                                            default:
                                                switch (itemId) {
                                                    case 207:
                                                        y4Var.f0(context, feed, i18);
                                                        return;
                                                    case 208:
                                                        n7Var.I(context, feed.getFeedObject());
                                                        return;
                                                    case 209:
                                                        kotlin.jvm.internal.o.g(context, "context");
                                                        r45.dm2 object_extend2 = feed.getFeedObject().getFeedObject().getObject_extend();
                                                        if (object_extend2 == null || (tz0Var = (r45.tz0) object_extend2.getCustom(11)) == null || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) tz0Var.getCustom(0)) == null) {
                                                            return;
                                                        }
                                                        xc2.y2.i(xc2.y2.f453343a, context, new xc2.p0(finderJumpInfo), 0, null, 12, null);
                                                        return;
                                                    case 210:
                                                        y4Var.j0(context, feed, holder);
                                                        return;
                                                    default:
                                                        switch (itemId) {
                                                            case 305:
                                                                y4Var.L(holder, true, feed, i18, y());
                                                                return;
                                                            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET /* 306 */:
                                                                y4Var.L(holder, false, feed, i18, y());
                                                                return;
                                                            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE /* 307 */:
                                                                kotlin.jvm.internal.o.g(context, "activity");
                                                                androidx.lifecycle.c1 a19 = pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.f2.class);
                                                                kotlin.jvm.internal.o.f(a19, "get(...)");
                                                                ((com.tencent.mm.plugin.finder.viewmodel.component.f2) a19).Q6(holder, false);
                                                                x3Var.c(this.f106421d, "button_minimize", feed.getItemId(), i18);
                                                                return;
                                                            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR /* 308 */:
                                                                y4Var.I(context, feed);
                                                                return;
                                                            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL /* 309 */:
                                                                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
                                                                float currentPlayMs = (finderVideoLayout2 == null || (videoView = finderVideoLayout2.getVideoView()) == null) ? 0.0f : ((float) videoView.getCurrentPlayMs()) / ((float) videoView.getVideoDurationMs());
                                                                vn2.u0 u0Var = vn2.u0.f438387a;
                                                                java.lang.String v17 = v();
                                                                com.tencent.mm.ui.MMActivity mMActivity = this.f106421d;
                                                                android.content.Intent intent5 = mMActivity.getIntent();
                                                                if (intent5 != null && intent5.getIntExtra("key_comment_scene", 0) == 285) {
                                                                    z17 = true;
                                                                }
                                                                u0Var.a(v17, "FeedUIPresenter", mMActivity, feed, true, true ^ z17, currentPlayMs);
                                                                return;
                                                            default:
                                                                ((com.tencent.mm.pluginsdk.forward.m) this.f106428n).aj((db5.h4) menuItem, new com.tencent.mm.plugin.finder.feed.o(feed, this, menuItem, i18));
                                                                return;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 p1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.t(this, feed, sheet);
    }

    public boolean q() {
        return !(this instanceof ac2.t);
    }

    public abstract so2.j5 s(int i17);

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void s0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(feed, "feed");
        java.util.ArrayList f17 = f();
        if (f17 != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : f17) {
                if (obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = new java.util.ArrayList();
        }
        java.util.LinkedList<jz5.l> linkedList = new java.util.LinkedList();
        synchronized (arrayList) {
            int i17 = 0;
            for (java.lang.Object obj2 : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2;
                if ((baseFinderFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && baseFinderFeed.getFeedObject().getId() == feed.getFeedObject().getId()) {
                    linkedList.add(0, new jz5.l(java.lang.Integer.valueOf(i17), baseFinderFeed));
                }
                i17 = i18;
            }
        }
        for (jz5.l lVar : linkedList) {
            java.util.ArrayList f18 = f();
            if (f18 != null) {
                f18.remove(lVar.f302834e);
            }
            com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
            if (i0Var != null) {
                i0Var.a().notifyItemRangeRemoved(((java.lang.Number) lVar.f302833d).intValue(), 1);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void u2(com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, in5.s0 s0Var, int i17, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        so2.v0.d(so2.v0.f410644a, this.f106421d, feed, z17, 2, i17, null, bc1Var, 32, null);
    }

    public java.lang.String v() {
        return this.f106423f;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 w4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.s(this, feed, sheet, i17);
    }

    public abstract com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer y();

    public boolean z(long j17) {
        com.tencent.mm.plugin.finder.feed.i0 i0Var;
        java.util.ArrayList f17 = f();
        boolean z17 = false;
        if (f17 == null) {
            return false;
        }
        java.util.Iterator it = f17.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() == j17) {
                break;
            }
            i17++;
        }
        if (i17 < 0) {
            return false;
        }
        java.lang.Object obj = f17.get(i17);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
        bd2.r rVar = bd2.r.f19284a;
        boolean z18 = !rVar.b() && q();
        boolean z19 = i17 < f17.size() - 1;
        if (z18 && z19) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i(v(), "[handleNoInterest] feedId=" + ((java.lang.Object) jz5.x.a(j17)) + " isNeedDeleteFeed=" + z17);
        if (z17) {
            com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent = new com.tencent.mm.autogen.events.FeedDeleteEvent();
            feedDeleteEvent.f54247g.f6437a = baseFinderFeed.getFeedObject().getId();
            feedDeleteEvent.e();
        } else if (z19 && !rVar.b() && (i0Var = this.f106424g) != null) {
            i0Var.v(true);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.r4 z6(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.y(this, feed);
    }
}
