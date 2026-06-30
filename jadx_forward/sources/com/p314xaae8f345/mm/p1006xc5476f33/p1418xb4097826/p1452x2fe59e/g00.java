package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class g00 {

    /* renamed from: o, reason: collision with root package name */
    public static final long f188327o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f188328p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f188329a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188330b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct f188331c;

    /* renamed from: d, reason: collision with root package name */
    public final int f188332d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 f188333e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f188334f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f188335g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f188336h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f188337i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f188338j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f188339k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f188340l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tz f188341m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f188342n;

    static {
        boolean z17;
        boolean z18 = false;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
        }
        f188327o = z18 ? 30000L : 300000L;
    }

    public g00(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz presenter, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 feedLoader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLoader, "feedLoader");
        this.f188329a = context;
        this.f188330b = presenter;
        this.f188331c = ctVar;
        this.f188332d = i17;
        this.f188333e = feedLoader;
        this.f188334f = "FinderTimelinePresenterHelper#" + i17;
        this.f188335g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vz.f192471d);
        this.f188337i = true;
        this.f188338j = true;
        this.f188342n = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wz.f192548d);
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var) {
        g00Var.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tz tzVar = g00Var.f188341m;
        if (tzVar != null) {
            g00Var.e().mo50300x3fa464aa(tzVar);
        }
        g00Var.f188341m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tz(new java.lang.ref.WeakReference(g00Var));
        g00Var.e().mo50297x7c4d7ca2(g00Var.f188341m, f188327o);
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var, java.lang.String str) {
        g00Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g00Var.f188334f, str + " requestPoiDialog,hasShowPoiRequestDialog=" + g00Var.f188340l);
        if (g00Var.f188340l) {
            return;
        }
        g00Var.f188340l = true;
        g00Var.j();
    }

    public static void g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var, java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz rzVar, so2.g5 g5Var, long j17, int i18, java.lang.Object obj) {
        if ((i18 & 16) != 0) {
            j17 = 200;
        }
        g00Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g00Var.f188334f, str + " notifyFinish with reason=" + i17 + ", loaderType=" + rzVar + ", lbsSameCityPageType=" + g5Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = g00Var.f188331c;
        if (ctVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xz(g00Var, i17, g5Var, rzVar), j17);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qz c() {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qz.f190391e;
        }
        cq.k1.a();
        boolean W2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.W2();
        boolean z17 = false;
        boolean z18 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LBS_SAMECITY_SWITCH_CONFIG_INT_SYNC, 0) == 1;
        if (W2 && z18) {
            z17 = true;
        }
        if (z17) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qz.f190390d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f188334f, "getForbiddenStatus config forbidden");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qz.f190392f;
    }

    public final ey2.k0 d() {
        return (ey2.k0) ((jz5.n) this.f188335g).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 e() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f188342n).mo141623x754a37bb();
    }

    public final boolean f() {
        return this.f188332d == 35;
    }

    public final void h() {
        if (f()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qz c17 = c();
            if (c17.h()) {
                l(-4, c17.i());
                return;
            }
            boolean N6 = ((ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class))).N6();
            java.lang.String str = this.f188334f;
            if (N6) {
                d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
                d85.g0 g0Var = d85.g0.LOCAION;
                d85.f0 f0Var = d85.f0.f308696n;
                if (!((d85.d1) m0Var).Ri(g0Var, f0Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onClickPermission success");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz rzVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz.f190485e;
                    d85.m0 m0Var2 = (d85.m0) i95.n0.c(d85.m0.class);
                    ((d85.d1) m0Var2).Bi(this.f188329a, g0Var, f0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zz(this, rzVar));
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onClickPermission fail");
            j();
        }
    }

    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz uzVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qz c17 = c();
        if (c17.h()) {
            uzVar.d(c17);
            return;
        }
        boolean N6 = ((ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class))).N6();
        boolean Ri = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308696n);
        if (N6 && Ri) {
            uzVar.b(true);
            return;
        }
        jz5.l P6 = d().P6();
        ey2.d0 O6 = d().O6();
        if (((java.lang.Number) P6.f384366d).floatValue() == 0.0f) {
            if (((java.lang.Number) P6.f384367e).floatValue() == 0.0f) {
                if (O6.f338872b == 0.0f) {
                    if (O6.f338871a == 0.0f) {
                        if (N6) {
                            uzVar.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz.f190550e);
                            return;
                        } else {
                            uzVar.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz.f190549d);
                            return;
                        }
                    }
                }
            }
        }
        if (N6) {
            uzVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz.f190550e);
        } else {
            uzVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz.f190549d);
        }
        uzVar.b(false);
    }

    public final void j() {
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LBS_SAMECITY_HAVE_DENIED_LOCATION_PERMISSION_BOOLEAN_SYNC, false);
        java.lang.String str = this.f188334f;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f188329a;
        if (o17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "requestLocationPermission with Lbs Manager");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n3.f183932a.c(abstractActivityC21394xb3d2c0cf, false);
            return;
        }
        java.lang.Boolean bool = null;
        java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
        if (u11.c.f(l17 instanceof java.lang.String ? (java.lang.String) l17 : null)) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            bool = java.lang.Boolean.valueOf(j35.u.d(abstractActivityC21394xb3d2c0cf, "android.permission.ACCESS_FINE_LOCATION", true));
            if (!bool.booleanValue()) {
                if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, false)) {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    j35.u.i(abstractActivityC21394xb3d2c0cf, "android.permission.ACCESS_FINE_LOCATION", 79);
                } else {
                    js.s0 s0Var = (js.s0) i95.n0.c(js.s0.class);
                    java.lang.String string = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573932gh2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
                    ((is.h) s0Var).getClass();
                    c71.b.c(abstractActivityC21394xb3d2c0cf, string, 30764, true);
                }
            }
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.l(abstractActivityC21394xb3d2c0cf, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 79);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "requestLocationPermission checkLocation:" + bool);
    }

    public final void k(rn5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e eVar, int i17, boolean z17, boolean z18, java.util.List list, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0 y0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206975a;
        int X0 = this.f188330b.X0();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f188329a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean a17 = y0Var.a();
        int i18 = this.f188332d;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeActionReporter", "[onRefreshStart] tabType:" + i18 + " itemCount:" + i17 + " curPosition:" + X0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206979e = i18;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w0 c17 = y0Var.c(i18);
            c17.f206946a = i17;
            c17.f206948c = true;
            c17.f206947b = X0;
            y0Var.h(i18, 5, false);
            y0Var.g(context, i18, new jz5.l(5, 0), false);
        }
        if (this.f188333e.f189182e == 0) {
            ((ey2.r1) pf5.u.f435469a.e(c61.l7.class).a(ey2.r1.class)).f339023e.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.a(i18));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3.f206511a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2 z2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2) ((java.util.HashMap) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3.f206512b).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i18));
            if (z2Var != null) {
                z2Var.f207017a = false;
                z2Var.f207018b = null;
            }
        }
        if (!z17 && !z18 && ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.r1().r()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = this.f188331c;
            android.view.View f294968x = ctVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l().getF294968x() : null;
            if (f294968x != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                android.view.View view = f294968x;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenterHelper", "requestRefreshImpl", "(Lcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Lcom/tencent/mm/plugin/finder/feed/model/FeedRequestExtInfo;IZZLjava/util/List;Ljava/util/concurrent/CopyOnWriteArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f294968x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenterHelper", "requestRefreshImpl", "(Lcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Lcom/tencent/mm/plugin/finder/feed/model/FeedRequestExtInfo;IZZLjava/util/List;Ljava/util/concurrent/CopyOnWriteArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 l17 = ctVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l() : null;
            if (l17 != null) {
                l17.m82706xe54b3ae2(false);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 l18 = ctVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l() : null;
            if (l18 != null) {
                l18.m82698x62664cef(false);
            }
        }
        pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f00(this, copyOnWriteArrayList, list, aVar, eVar));
    }

    public final void l(int i17, so2.g5 g5Var) {
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f545050b = i17;
        s3Var.f545053e = g5Var;
        this.f188330b.P0(s3Var);
    }

    public final boolean m() {
        if (!this.f188339k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f188334f, "tryRequestLocation but fragment invisible");
            return false;
        }
        ey2.k0 d17 = d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "<get-locationVM>(...)");
        ya2.o1.t4(d17, false, null, 2, null);
        return true;
    }
}
