package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class em extends com.tencent.mm.plugin.finder.feed.dj {
    public final int A;
    public final int B;
    public final com.tencent.mm.plugin.finder.feed.model.l0 C;
    public final zy2.h8 D;
    public final com.tencent.mm.plugin.finder.feed.FinderMemberTimelineUIContract$Presenter$feedProgressListener$1 E;

    /* renamed from: y, reason: collision with root package name */
    public final int f106661y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f106662z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.tencent.mm.plugin.finder.feed.FinderMemberTimelineUIContract$Presenter$feedProgressListener$1] */
    public em(final com.tencent.mm.ui.MMActivity context, int i17, java.lang.String authorFinderUsername, int i18, int i19) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        this.f106661y = i17;
        this.f106662z = authorFinderUsername;
        this.A = i18;
        this.B = i19;
        this.C = ((com.tencent.mm.plugin.finder.viewmodel.component.w6) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d;
        this.D = ((te2.e4) ((zy2.g8) pf5.z.f353948a.a(context).c(zy2.g8.class))).f417974d;
        this.E = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(context, this) { // from class: com.tencent.mm.plugin.finder.feed.FinderMemberTimelineUIContract$Presenter$feedProgressListener$1

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ com.tencent.mm.plugin.finder.feed.em f106103d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((com.tencent.mm.plugin.finder.ui.MMFinderUI) context);
                this.f106103d = this;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.feed.em emVar = this.f106103d;
                java.lang.String str = emVar.f106569s;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f54250g;
                sb6.append(gaVar.f6749a);
                sb6.append(", progress:");
                sb6.append(gaVar.f6750b);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = emVar.f106570t;
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) baseFeedLoader : null;
                if (baseFinderFeedLoader == null) {
                    return true;
                }
                baseFinderFeedLoader.updateProgressByLocalId(gaVar.f6749a);
                return true;
            }
        };
    }

    public static final void Z(com.tencent.mm.plugin.finder.feed.em emVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, db5.g4 g4Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        java.lang.String string;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.ui.MMActivity mMActivity = emVar.f106421d;
        y4Var.k(mMActivity, g4Var, baseFinderFeed);
        y4Var.s(mMActivity, g4Var, baseFinderFeed);
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = baseFinderFeed.getFeedObject().getFeedObject();
        if ((feedObject != null ? hc2.o0.r(feedObject) : false) || baseFinderFeed.h() != 4) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var = emVar.f106424g;
        if (i0Var == null || (recyclerView = i0Var.getRecyclerView()) == null) {
            string = mMActivity.getString(com.tencent.mm.R.string.gue);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        } else {
            string = com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.f133635x.a(recyclerView);
        }
        g4Var.g(116, string, com.tencent.mm.R.raw.icons_outlined_play_control_2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0, com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 A0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.bm(feed, this, sheet, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        int i17 = this.B;
        if (!((i17 == 9 || i17 == 10 || !eo2.f.f255565a.d(java.lang.Integer.valueOf(this.A))) ? false : true) || (baseFeedLoader = this.f106570t) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public boolean F() {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataList;
        boolean F = super.F();
        if (!F) {
            com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
            com.tencent.mm.plugin.finder.feed.hm hmVar = i0Var instanceof com.tencent.mm.plugin.finder.feed.hm ? (com.tencent.mm.plugin.finder.feed.hm) i0Var : null;
            if (hmVar != null) {
                int i17 = hmVar.f106928r;
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
                if (i17 == ((baseFeedLoader == null || (dataList = baseFeedLoader.getDataList()) == 0) ? 0 : dataList.size()) - 1 && hmVar.f106929s) {
                    com.tencent.mm.ui.MMActivity activity = this.f106421d;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    ((com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).f134505d = false;
                    activity.finish();
                    return true;
                }
            }
        }
        return F;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        fc2.c n17;
        fc2.c n18;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        com.tencent.mm.plugin.finder.feed.cm cmVar = new com.tencent.mm.plugin.finder.feed.cm(this);
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.C;
        l0Var.N0(this.f106661y, this.f106422e, cmVar);
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.a(l0Var);
        }
        zy2.h8 h8Var = this.D;
        com.tencent.mm.plugin.finder.feed.dm dmVar = new com.tencent.mm.plugin.finder.feed.dm(this);
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).N0(dmVar, i0Var != null ? i0Var.getRecyclerView() : null);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar2 != null && (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) != null) {
            com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
            s3Var.getClass();
            n17.a(s3Var);
        }
        alive();
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0, com.tencent.mm.plugin.finder.feed.k8
    public boolean d0() {
        return kotlin.jvm.internal.o.b(this.f106662z, xy2.c.e(this.f106421d)) && this.A == 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        fc2.c n17;
        fc2.c n18;
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.C;
        l0Var.onDetach();
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.d(l0Var);
        }
        zy2.h8 h8Var = this.D;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).onDetach();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar2 != null && (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) != null) {
            com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
            s3Var.getClass();
            n17.d(s3Var);
        }
        dead();
        super.onDetach();
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void p(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, android.view.MenuItem menuItem, int i17, int i18, in5.s0 holder) {
        m92.b j37;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.p(feed, menuItem, i17, i18, holder);
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        if (itemId == 205) {
            if (feed.getFeedObject().getStickyTime() != 0) {
                db5.t7.f(activity, activity.getString(com.tencent.mm.R.string.exx), com.tencent.mm.plugin.finder.feed.xl.f111085a);
                return;
            } else if ((feed.getFeedObject().getFeedObject().getAdFlag() & 1) == 1) {
                db5.e1.n(activity, com.tencent.mm.R.string.cq7, 0, new com.tencent.mm.plugin.finder.feed.yl(this, feed), null);
                return;
            } else {
                y4Var.J(activity, feed.getFeedObject(), true);
                return;
            }
        }
        if (itemId == 206) {
            y4Var.J(activity, feed.getFeedObject(), false);
            return;
        }
        if (itemId == 303 || itemId == 304) {
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            int integer = (!hc2.t.d(context) || (j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null)) == null) ? 0 : j37.u0().getInteger(48);
            if (!(integer == 2 || integer == 3)) {
                db5.t7.g(activity, activity.getResources().getString(com.tencent.mm.R.string.cw8));
                return;
            }
            boolean z17 = menuItem.getItemId() == 304;
            bb2.p0.f18940a.b(activity, feed, z17, new com.tencent.mm.plugin.finder.feed.am(this, z17, feed, holder));
            bb2.m0 m0Var = bb2.m0.f18918a;
            kotlin.jvm.internal.o.g(activity, "activity");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            java.lang.String str = z17 ? "close_bullet_screen" : "open_bullet_screen";
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", pm0.v.u(feed.getItemId()));
            m0Var.a(activity, V6, str, true, jSONObject, (r17 & 32) != 0 ? false : true, (r17 & 64) != 0 ? -1 : 0);
        }
    }
}
