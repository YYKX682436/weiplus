package cp2;

/* loaded from: classes2.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f302453a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 f302454b;

    /* renamed from: c, reason: collision with root package name */
    public final int f302455c;

    /* renamed from: d, reason: collision with root package name */
    public final cp2.c f302456d;

    /* renamed from: e, reason: collision with root package name */
    public int f302457e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f302458f;

    public u1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf baseContext, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301, int i17, cp2.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseContext, "baseContext");
        this.f302453a = baseContext;
        this.f302454b = abstractC14499x6ba3301;
        this.f302455c = i17;
        this.f302456d = cVar;
        this.f302457e = -1;
    }

    public static void d(cp2.u1 u1Var, so2.j5 feed, int i17, int i18, android.view.View view, java.util.ArrayList data, java.lang.String contextId, java.lang.String clickTabContextId, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, long j17, int i19, java.lang.Object obj) {
        boolean z17;
        gp2.l0 l0Var;
        java.lang.String s07;
        long elapsedRealtime = (i19 & 256) != 0 ? android.os.SystemClock.elapsedRealtime() : j17;
        u1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickTabContextId, "clickTabContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = u1Var.f302453a;
        if (z17 || abstractActivityC21394xb3d2c0cf.mo78538xecd98af8()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveViewCallback", "onItemClick pos:" + i17 + " feed:" + feed + " return for fastClick isPause: " + abstractActivityC21394xb3d2c0cf.mo78538xecd98af8());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveViewCallback", "onItemClick pos:" + i17 + " feed:" + feed);
        boolean z18 = feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
        cp2.c cVar = u1Var.f302456d;
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed;
            if (zl2.q4.f555466a.C(abstractC14490x69736cb5)) {
                ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                long j18 = i17;
                ml2.x1 x1Var = ml2.x1.f409740n;
                java.lang.String c17 = u1Var.c();
                java.lang.String m75945x2fec8307 = u1Var.b().m75945x2fec8307(2);
                java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301 = u1Var.f302454b;
                j0Var.sj(abstractC14490x69736cb5, j18, x1Var, c17, str, (abstractC14499x6ba3301 == null || (s07 = abstractC14499x6ba3301.s0()) == null) ? "" : s07, u1Var.a(i18, view, "onItemClick"));
                yo2.e.f545670a.a(new cp2.t1(abstractC14490x69736cb5.getFeedObject(), u1Var));
                int i27 = c61.dc.f120480a;
                boolean wh6 = ((pg2.j0) i95.n0.c(pg2.j0.class)).wh();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ILiveEnterAnimStrategy", "createLiveEnterAnimImpl isSupport=" + wh6);
                (wh6 ? new c61.c8() : c61.y7.f120962b).a(view, u1Var.f302453a, abstractC14490x69736cb5, ez2.a.f339392h, new cp2.r1(u1Var, i18, feed, data, view, contextId, clickTabContextId, elapsedRealtime));
                if ((cVar == null || (l0Var = ((cp2.v0) cVar).f302474u) == null || !l0Var.x(i18)) ? false : true) {
                    rq2.p.f480391a.a((so2.h1) feed, i18, 2L);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareTabLifeCycleReport", "enterLiveRoom");
                ip2.a.f375148d = "page_live_flow";
                if (cp2.b.f302307w) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.b(u1Var.b(), feed, 18);
                return;
            }
        }
        if (feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) feed;
            u1Var.f302457e = ysVar.f192729h;
            if (cVar != null) {
                cp2.v0 v0Var = (cp2.v0) cVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "onLoadMoreFollowFeed.");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = v0Var.f302476w;
                if (c14500x958689dc != null) {
                    r45.dd2 dd2Var = v0Var.f302467n;
                    if (c14500x958689dc.f203011v) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14500x958689dc.getF204960d(), "requestMoreFollowFeed return for isFetchingLoadMore");
                        c14500x958689dc.f203013x.b("requestMoreFollowFeed");
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14500x958689dc.getF204960d(), "requestMoreFollowFeed pos:" + ysVar.f192729h + " continueAtTheEnd:" + ysVar.f192725d.m75933x41a8a7f2(10) + " rvFeedList:" + ysVar.f192727f.size());
                    c14500x958689dc.f203014y = ysVar;
                    cp2.m mVar = new cp2.m(0, 0, "LOCAL_OK", null, null, 0, 56, null);
                    mVar.m56420x2a5f836b(new java.util.LinkedList(ysVar.f192727f));
                    mVar.m56423xd4b4a5a1(2);
                    mVar.m56421x73095078(c14500x958689dc.f203006q);
                    mVar.m56419xdac5ee4d(ysVar.f192725d.m75933x41a8a7f2(10));
                    mVar.m56425xf28d7bcd(new cp2.l(2, dd2Var, c14500x958689dc.f203006q, c14500x958689dc.f203004o, c14500x958689dc.f202997e, c14500x958689dc.f202996d, c14500x958689dc.f202998f, 1, 0L, c14500x958689dc.f202999g, 0, 1280, null));
                    c14500x958689dc.f203011v = true;
                    c14500x958689dc.mo55587xb461ee3d(mVar);
                }
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318 c6463x6ead4318 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c6463x6ead4318.f138055d = java.lang.System.currentTimeMillis();
            c6463x6ead4318.u("");
            c6463x6ead4318.p(u1Var.a(i18, view, "onItemClick"));
            c6463x6ead4318.B("");
            c6463x6ead4318.y("");
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            c6463x6ead4318.w(Ri);
            c6463x6ead4318.r(u1Var.b().m75945x2fec8307(1));
            c6463x6ead4318.q(java.lang.String.valueOf(u1Var.b().m75939xb282bd08(5)));
            c6463x6ead4318.A(clickTabContextId);
            c6463x6ead4318.x("");
            c6463x6ead4318.v("");
            c6463x6ead4318.s("all_my_follow");
            c6463x6ead4318.t("");
            c6463x6ead4318.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
            c6463x6ead4318.k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0113, code lost:
    
        if ((r16.f302457e <= r17 && r17 < r7) != false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(int r17, android.view.View r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp2.u1.a(int, android.view.View, java.lang.String):java.lang.String");
    }

    public final r45.qt2 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301 = this.f302454b;
        if (abstractC14499x6ba3301 != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(abstractC14499x6ba3301).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f302453a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
    }

    public final java.lang.String c() {
        if (this.f302455c != 15) {
            return java.lang.String.valueOf(b().m75939xb282bd08(5));
        }
        ml2.q1 q1Var = ml2.q1.f409345e;
        return "temp_32";
    }
}
