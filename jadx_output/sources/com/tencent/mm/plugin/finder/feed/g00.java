package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class g00 {

    /* renamed from: o, reason: collision with root package name */
    public static final long f106794o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f106795p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f106796a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.pz f106797b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ct f106798c;

    /* renamed from: d, reason: collision with root package name */
    public final int f106799d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f106800e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f106801f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f106802g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f106803h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f106804i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f106805j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f106806k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f106807l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.tz f106808m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f106809n;

    static {
        boolean z17;
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        f106794o = z18 ? 30000L : 300000L;
    }

    public g00(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.pz presenter, com.tencent.mm.plugin.finder.feed.ct ctVar, int i17, com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader feedLoader) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        this.f106796a = context;
        this.f106797b = presenter;
        this.f106798c = ctVar;
        this.f106799d = i17;
        this.f106800e = feedLoader;
        this.f106801f = "FinderTimelinePresenterHelper#" + i17;
        this.f106802g = jz5.h.b(com.tencent.mm.plugin.finder.feed.vz.f110938d);
        this.f106804i = true;
        this.f106805j = true;
        this.f106809n = jz5.h.b(com.tencent.mm.plugin.finder.feed.wz.f111015d);
    }

    public static final void a(com.tencent.mm.plugin.finder.feed.g00 g00Var) {
        g00Var.m();
        com.tencent.mm.plugin.finder.feed.tz tzVar = g00Var.f106808m;
        if (tzVar != null) {
            g00Var.e().removeCallbacks(tzVar);
        }
        g00Var.f106808m = new com.tencent.mm.plugin.finder.feed.tz(new java.lang.ref.WeakReference(g00Var));
        g00Var.e().postDelayed(g00Var.f106808m, f106794o);
    }

    public static final void b(com.tencent.mm.plugin.finder.feed.g00 g00Var, java.lang.String str) {
        g00Var.getClass();
        com.tencent.mars.xlog.Log.i(g00Var.f106801f, str + " requestPoiDialog,hasShowPoiRequestDialog=" + g00Var.f106807l);
        if (g00Var.f106807l) {
            return;
        }
        g00Var.f106807l = true;
        g00Var.j();
    }

    public static void g(com.tencent.mm.plugin.finder.feed.g00 g00Var, java.lang.String str, int i17, com.tencent.mm.plugin.finder.feed.rz rzVar, so2.g5 g5Var, long j17, int i18, java.lang.Object obj) {
        if ((i18 & 16) != 0) {
            j17 = 200;
        }
        g00Var.getClass();
        com.tencent.mars.xlog.Log.i(g00Var.f106801f, str + " notifyFinish with reason=" + i17 + ", loaderType=" + rzVar + ", lbsSameCityPageType=" + g5Var);
        com.tencent.mm.plugin.finder.feed.ct ctVar = g00Var.f106798c;
        if (ctVar != null) {
            ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l().postDelayed(new com.tencent.mm.plugin.finder.feed.xz(g00Var, i17, g5Var, rzVar), j17);
        }
    }

    public final com.tencent.mm.plugin.finder.feed.qz c() {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            return com.tencent.mm.plugin.finder.feed.qz.f108858e;
        }
        cq.k1.a();
        boolean W2 = com.tencent.mm.plugin.finder.storage.t70.f127590a.W2();
        boolean z17 = false;
        boolean z18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LBS_SAMECITY_SWITCH_CONFIG_INT_SYNC, 0) == 1;
        if (W2 && z18) {
            z17 = true;
        }
        if (z17) {
            return com.tencent.mm.plugin.finder.feed.qz.f108857d;
        }
        com.tencent.mars.xlog.Log.i(this.f106801f, "getForbiddenStatus config forbidden");
        return com.tencent.mm.plugin.finder.feed.qz.f108859f;
    }

    public final ey2.k0 d() {
        return (ey2.k0) ((jz5.n) this.f106802g).getValue();
    }

    public final com.tencent.mm.sdk.platformtools.n3 e() {
        return (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f106809n).getValue();
    }

    public final boolean f() {
        return this.f106799d == 35;
    }

    public final void h() {
        if (f()) {
            com.tencent.mm.plugin.finder.feed.qz c17 = c();
            if (c17.h()) {
                l(-4, c17.i());
                return;
            }
            boolean N6 = ((ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class))).N6();
            java.lang.String str = this.f106801f;
            if (N6) {
                d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
                d85.g0 g0Var = d85.g0.LOCAION;
                d85.f0 f0Var = d85.f0.f227163n;
                if (!((d85.d1) m0Var).Ri(g0Var, f0Var)) {
                    com.tencent.mars.xlog.Log.i(str, "onClickPermission success");
                    com.tencent.mm.plugin.finder.feed.rz rzVar = com.tencent.mm.plugin.finder.feed.rz.f108952e;
                    d85.m0 m0Var2 = (d85.m0) i95.n0.c(d85.m0.class);
                    ((d85.d1) m0Var2).Bi(this.f106796a, g0Var, f0Var, new com.tencent.mm.plugin.finder.feed.zz(this, rzVar));
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i(str, "onClickPermission fail");
            j();
        }
    }

    public final void i(com.tencent.mm.plugin.finder.feed.uz uzVar) {
        com.tencent.mm.plugin.finder.feed.qz c17 = c();
        if (c17.h()) {
            uzVar.d(c17);
            return;
        }
        boolean N6 = ((ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class))).N6();
        boolean Ri = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227163n);
        if (N6 && Ri) {
            uzVar.b(true);
            return;
        }
        jz5.l P6 = d().P6();
        ey2.d0 O6 = d().O6();
        if (((java.lang.Number) P6.f302833d).floatValue() == 0.0f) {
            if (((java.lang.Number) P6.f302834e).floatValue() == 0.0f) {
                if (O6.f257339b == 0.0f) {
                    if (O6.f257338a == 0.0f) {
                        if (N6) {
                            uzVar.c(com.tencent.mm.plugin.finder.feed.sz.f109017e);
                            return;
                        } else {
                            uzVar.c(com.tencent.mm.plugin.finder.feed.sz.f109016d);
                            return;
                        }
                    }
                }
            }
        }
        if (N6) {
            uzVar.a(com.tencent.mm.plugin.finder.feed.sz.f109017e);
        } else {
            uzVar.a(com.tencent.mm.plugin.finder.feed.sz.f109016d);
        }
        uzVar.b(false);
    }

    public final void j() {
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LBS_SAMECITY_HAVE_DENIED_LOCATION_PERMISSION_BOOLEAN_SYNC, false);
        java.lang.String str = this.f106801f;
        com.tencent.mm.ui.MMActivity mMActivity = this.f106796a;
        if (o17) {
            com.tencent.mars.xlog.Log.i(str, "requestLocationPermission with Lbs Manager");
            com.tencent.mm.plugin.finder.assist.n3.f102399a.c(mMActivity, false);
            return;
        }
        java.lang.Boolean bool = null;
        java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
        if (u11.c.f(l17 instanceof java.lang.String ? (java.lang.String) l17 : null)) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            bool = java.lang.Boolean.valueOf(j35.u.d(mMActivity, "android.permission.ACCESS_FINE_LOCATION", true));
            if (!bool.booleanValue()) {
                if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, false)) {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    j35.u.i(mMActivity, "android.permission.ACCESS_FINE_LOCATION", 79);
                } else {
                    js.s0 s0Var = (js.s0) i95.n0.c(js.s0.class);
                    java.lang.String string = mMActivity.getString(com.tencent.mm.R.string.f492399gh2, com.tencent.mm.sdk.platformtools.m2.d());
                    ((is.h) s0Var).getClass();
                    c71.b.c(mMActivity, string, 30764, true);
                }
            }
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.l(mMActivity, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 79);
        }
        com.tencent.mars.xlog.Log.i(str, "requestLocationPermission checkLocation:" + bool);
    }

    public final void k(rn5.a aVar, com.tencent.mm.plugin.finder.feed.model.e eVar, int i17, boolean z17, boolean z18, java.util.List list, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList) {
        com.tencent.mm.plugin.finder.report.y0 y0Var = com.tencent.mm.plugin.finder.report.y0.f125442a;
        int X0 = this.f106797b.X0();
        com.tencent.mm.ui.MMActivity context = this.f106796a;
        kotlin.jvm.internal.o.g(context, "context");
        boolean a17 = y0Var.a();
        int i18 = this.f106799d;
        if (!a17) {
            com.tencent.mars.xlog.Log.i("Finder.HomeActionReporter", "[onRefreshStart] tabType:" + i18 + " itemCount:" + i17 + " curPosition:" + X0);
            com.tencent.mm.plugin.finder.report.y0.f125446e = i18;
            com.tencent.mm.plugin.finder.report.w0 c17 = y0Var.c(i18);
            c17.f125413a = i17;
            c17.f125415c = true;
            c17.f125414b = X0;
            y0Var.h(i18, 5, false);
            y0Var.g(context, i18, new jz5.l(5, 0), false);
        }
        if (this.f106800e.f107649e == 0) {
            ((ey2.r1) pf5.u.f353936a.e(c61.l7.class).a(ey2.r1.class)).f257490e.add(com.tencent.mm.plugin.finder.extension.reddot.ba.a(i18));
            com.tencent.mm.plugin.finder.report.c3 c3Var = com.tencent.mm.plugin.finder.report.c3.f124978a;
            com.tencent.mm.plugin.finder.report.z2 z2Var = (com.tencent.mm.plugin.finder.report.z2) ((java.util.HashMap) ((jz5.n) com.tencent.mm.plugin.finder.report.c3.f124979b).getValue()).get(java.lang.Integer.valueOf(i18));
            if (z2Var != null) {
                z2Var.f125484a = false;
                z2Var.f125485b = null;
            }
        }
        if (!z17 && !z18 && ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.r1().r()).booleanValue()) {
            com.tencent.mm.plugin.finder.feed.ct ctVar = this.f106798c;
            android.view.View f213435x = ctVar != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l().getF213435x() : null;
            if (f213435x != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                android.view.View view = f213435x;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenterHelper", "requestRefreshImpl", "(Lcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Lcom/tencent/mm/plugin/finder/feed/model/FeedRequestExtInfo;IZZLjava/util/List;Ljava/util/concurrent/CopyOnWriteArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenterHelper", "requestRefreshImpl", "(Lcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Lcom/tencent/mm/plugin/finder/feed/model/FeedRequestExtInfo;IZZLjava/util/List;Ljava/util/concurrent/CopyOnWriteArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.view.RefreshLoadMoreLayout l17 = ctVar != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l() : null;
            if (l17 != null) {
                l17.setShowLoadMoreLoading(false);
            }
            com.tencent.mm.view.RefreshLoadMoreLayout l18 = ctVar != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l() : null;
            if (l18 != null) {
                l18.setLoadingMore(false);
            }
        }
        pm0.v.K(null, new com.tencent.mm.plugin.finder.feed.f00(this, copyOnWriteArrayList, list, aVar, eVar));
    }

    public final void l(int i17, so2.g5 g5Var) {
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f463517b = i17;
        s3Var.f463520e = g5Var;
        this.f106797b.P0(s3Var);
    }

    public final boolean m() {
        if (!this.f106806k) {
            com.tencent.mars.xlog.Log.i(this.f106801f, "tryRequestLocation but fragment invisible");
            return false;
        }
        ey2.k0 d17 = d();
        kotlin.jvm.internal.o.f(d17, "<get-locationVM>(...)");
        ya2.o1.t4(d17, false, null, 2, null);
        return true;
    }
}
