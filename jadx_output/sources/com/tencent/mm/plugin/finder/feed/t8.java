package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class t8 extends com.tencent.mm.plugin.finder.feed.dj {
    public final boolean A;
    public final com.tencent.mm.protobuf.g B;
    public long C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public long G;
    public boolean H;
    public yz5.p I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.p f109045J;
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed K;
    public boolean L;
    public int M;
    public boolean N;
    public java.lang.String P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public r45.a34 T;
    public java.lang.String U;
    public int V;
    public java.lang.String W;
    public r45.nv2 X;
    public long Y;
    public boolean Z;

    /* renamed from: y, reason: collision with root package name */
    public final int f109046y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f109047z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(int i17, com.tencent.mm.ui.MMActivity context, boolean z17, boolean z18, int i18, com.tencent.mm.protobuf.g gVar, int i19, kotlin.jvm.internal.i iVar) {
        super(context);
        z17 = (i19 & 4) != 0 ? false : z17;
        z18 = (i19 & 8) != 0 ? false : z18;
        i18 = (i19 & 16) != 0 ? 0 : i18;
        gVar = (i19 & 32) != 0 ? null : gVar;
        kotlin.jvm.internal.o.g(context, "context");
        this.f109046y = i17;
        this.f109047z = z17;
        this.A = z18;
        this.B = gVar;
        this.f106427m = i18;
        this.E = "";
        this.F = "";
        this.H = true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
        com.tencent.mars.xlog.Log.i(((com.tencent.mm.plugin.finder.ui.qm) this).f129749x0, "loadMoreData: needRelatedList=" + this.H + ", isFirstRefreshEnd=" + this.Z);
        if (this.H && this.Z) {
            com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
            int i17 = this.f106427m;
            com.tencent.mm.ui.MMActivity activity = this.f106421d;
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.report.v1.t(v1Var, i17, 2, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), 10L, false, 16, null);
            com.tencent.mm.plugin.finder.report.v1.o(v1Var, this.f106427m, true, null, false, 0L, false, 60, null);
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
            if (baseFeedLoader != null) {
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void D(com.tencent.mm.plugin.finder.feed.i0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.D(callback);
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.class)).P6(callback.getRecyclerView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        if (this.N && this.H && this.S) {
            this.Q = true;
            if (this.R) {
                p0(false);
                return;
            }
            return;
        }
        this.S = true;
        java.lang.String str = this.P;
        if ((str == null || str.length() == 0) == false) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.r8(this));
        }
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        int i17 = this.f106427m;
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.report.v1.t(v1Var, i17, 0, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), 10L, false, 16, null);
        com.tencent.mm.plugin.finder.report.v1.o(v1Var, this.f106427m, true, null, false, 0L, false, 60, null);
        com.tencent.mm.plugin.finder.feed.s8 s8Var = new com.tencent.mm.plugin.finder.feed.s8(this);
        r6 = null;
        java.lang.Long l17 = null;
        if (this.L) {
            com.tencent.mm.plugin.finder.ui.qm qmVar = (com.tencent.mm.plugin.finder.ui.qm) this;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadFirstFeed objectId = 0, localId = ");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.K;
            if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null) {
                l17 = java.lang.Long.valueOf(feedObject.getLocalId());
            }
            sb6.append(l17);
            com.tencent.mars.xlog.Log.i(qmVar.f129749x0, sb6.toString());
            if (this.K == null) {
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.o8(this));
                return;
            }
            return;
        }
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai() && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.O().r()).intValue() == 1) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.p8(this));
            return;
        }
        if (activity.getIntent().getIntExtra("business_type", 0) != 1) {
            Z(s8Var);
            return;
        }
        java.lang.String stringExtra = activity.getIntent().getStringExtra("finder_user_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str2 = stringExtra;
        long j17 = this.C;
        java.lang.String str3 = this.E;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        pq5.g l18 = new db2.n4(j17, str2, str3, 1, nyVar != null ? nyVar.V6() : null).l();
        l18.f(activity);
        l18.h(new com.tencent.mm.plugin.finder.feed.q8(this, s8Var));
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public boolean Q() {
        return this.f109047z;
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void V() {
        super.V();
        java.lang.String stringExtra = this.f106421d.getIntent().getStringExtra("FLOAT_BALL_KEY");
        if (stringExtra == null || stringExtra.length() == 0) {
            return;
        }
        this.Z = true;
    }

    public final void Z(yz5.a aVar) {
        long j17 = this.C;
        java.lang.String str = this.E;
        int i17 = this.f106422e;
        int i18 = this.f109046y;
        java.lang.String str2 = this.F;
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        db2.g4 g4Var = new db2.g4(j17, str, i17, i18, "", true, null, null, 0L, null, false, false, str2, nyVar != null ? nyVar.V6() : null, 0, null, false, null, this.B, null, this.T, this.U, 0, this.V, this.W, this.X, true, this.D, null, 273403840, null);
        com.tencent.mm.plugin.finder.report.v1.f125393a.l(this.f106427m, true, this.C != 0, this.F.length() > 0);
        pq5.g l17 = g4Var.l();
        l17.f(context);
        l17.h(new com.tencent.mm.plugin.finder.feed.m8(this, aVar));
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0, com.tencent.mm.plugin.finder.feed.k8
    public boolean d0() {
        return this.A;
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.fp
    public java.util.ArrayList f() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            return baseFeedLoader.getDataListJustForAdapter();
        }
        return null;
    }

    public final void i0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(feed, "feed");
        java.lang.String str2 = this.P;
        if (!(str2 == null || str2.length() == 0) || feed.getFeedObject().isMemberFeed()) {
            com.tencent.mm.ui.MMActivity context = this.f106421d;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            java.lang.String str3 = this.P;
            if (str3 == null) {
                ya2.b2 contact = feed.getContact();
                java.lang.String D0 = contact != null ? contact.D0() : null;
                if (D0 != null) {
                    str = D0;
                    pm0.v.T(new ho2.c(V6, str, 0, 4, null).l(), new com.tencent.mm.plugin.finder.feed.n8(this, feed)).f(context);
                }
                str3 = "";
            }
            str = str3;
            pm0.v.T(new ho2.c(V6, str, 0, 4, null).l(), new com.tencent.mm.plugin.finder.feed.n8(this, feed)).f(context);
        }
    }

    public final void j0() {
        if (this.R && this.N && this.H) {
            java.lang.String str = ((com.tencent.mm.plugin.finder.ui.qm) this).f129749x0;
            com.tencent.mars.xlog.Log.i(str, "preloadSlideUp");
            long a17 = c01.id.a();
            if (a17 - this.Y <= 3500) {
                com.tencent.mars.xlog.Log.i(str, "ignore preloadSlideUp");
            } else {
                this.Y = a17;
                p0(true);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        super.onDetach();
    }

    public final void p0(boolean z17) {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader) baseFeedLoader : null;
        if (finderFeedShareRelativeListLoader == null || !finderFeedShareRelativeListLoader.L) {
            return;
        }
        finderFeedShareRelativeListLoader.L = false;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.request$default(finderFeedShareRelativeListLoader, finderFeedShareRelativeListLoader.f107440n ? null : new db2.t0(finderFeedShareRelativeListLoader.f107433d, finderFeedShareRelativeListLoader.f107435f, finderFeedShareRelativeListLoader.f107436g, finderFeedShareRelativeListLoader.getLastBuffer(), null, finderFeedShareRelativeListLoader.f107438i, finderFeedShareRelativeListLoader.N, finderFeedShareRelativeListLoader.P, finderFeedShareRelativeListLoader.f107439m, null, finderFeedShareRelativeListLoader.getContextObj(), 0.0f, 0.0f, finderFeedShareRelativeListLoader.f107441o, 0, 19, null, finderFeedShareRelativeListLoader.f107445s, null, 0, finderFeedShareRelativeListLoader.f107446t, finderFeedShareRelativeListLoader.f107447u, finderFeedShareRelativeListLoader.f107448v, null, finderFeedShareRelativeListLoader.f107449w, finderFeedShareRelativeListLoader.f107450x, finderFeedShareRelativeListLoader.f107451y, null, finderFeedShareRelativeListLoader.A, null, 680352256, null), null, 2, null);
    }

    public final void u0(java.lang.String str, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        int i17 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().I;
        if (i17 == 0 || i17 == 1 || i17 != 2) {
        }
        com.tencent.mars.xlog.Log.i(((com.tencent.mm.plugin.finder.ui.qm) this).f129749x0, "startPreloadVideo " + str + " feedId:" + pm0.v.u(finderObject.getId()) + " return for disable");
    }
}
