package aq2;

/* loaded from: classes2.dex */
public class b extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final aq2.a f94652t;

    /* renamed from: u, reason: collision with root package name */
    public final int f94653u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f94654v;

    /* renamed from: w, reason: collision with root package name */
    public int f94655w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f94656x;

    /* renamed from: y, reason: collision with root package name */
    public final r45.ck2 f94657y;

    public /* synthetic */ b(aq2.a aVar, r45.qt2 qt2Var, im5.b bVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(aVar, (i17 & 2) != 0 ? null : qt2Var, (i17 & 4) != 0 ? null : bVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.lang.String m76197x6c03c64c;
        r45.h32 h32Var;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558;
        o45.ah mo13821x7f35c2d1;
        r45.dk2 resp = (r45.dk2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiEnd: errType");
        sb6.append(i17);
        sb6.append(", errCode=");
        sb6.append(i18);
        sb6.append(" pullType: ");
        aq2.a aVar = this.f94652t;
        sb6.append(aVar.f94635a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderNavLiveStream", sb6.toString());
        rq2.d dVar = rq2.d.f480349a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = resp.m75934xbce7f2f(4);
        r45.xw m150576x2b5bc573 = (m1Var == null || (mo47948x7f0c4558 = m1Var.mo47948x7f0c4558()) == null || (mo13821x7f35c2d1 = mo47948x7f0c4558.mo13821x7f35c2d1()) == null) ? null : mo13821x7f35c2d1.m150576x2b5bc573();
        int i19 = aVar.f94635a;
        int i27 = this.f94653u;
        rq2.a b17 = dVar.b(i19, i27);
        if (b17 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onCgiBack: pullType=");
            sb7.append(i19);
            sb7.append(", tabType=");
            sb7.append(i27);
            sb7.append(", preloadType=");
            int i28 = aVar.f94644j;
            sb7.append(i28);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", sb7.toString());
            b17.f480326d = android.os.SystemClock.elapsedRealtime();
            b17.f480332j = m75934xbce7f2f;
            b17.f480343u = m150576x2b5bc573;
            b17.f480334l = i28;
        }
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
            if (m75941xfb821914 != null) {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (it.hasNext()) {
                    java.util.LinkedList linkedList = ((r45.fa2) it.next()).f455662h;
                    if (linkedList != null) {
                        java.util.Iterator it6 = linkedList.iterator();
                        while (it6.hasNext()) {
                            r45.oa2 oa2Var = (r45.oa2) ((r45.ea2) it6.next()).m75936x14adae67(4);
                            if (oa2Var != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) oa2Var.m75936x14adae67(1)) != null && (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) != null) {
                                if (!(m76197x6c03c64c.length() > 0)) {
                                    m76197x6c03c64c = null;
                                }
                                if (m76197x6c03c64c != null && (h32Var = (r45.h32) oa2Var.m75936x14adae67(0)) != null) {
                                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                                    java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
                                    if (m75945x2fec8307 == null) {
                                        m75945x2fec8307 = "";
                                    }
                                    ((b92.d1) zbVar).Ai(m76197x6c03c64c, m75945x2fec8307, h32Var);
                                }
                            }
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = resp.m75934xbce7f2f(20);
            if (m75934xbce7f2f2 != null) {
                cq2.q.f302967g = m75934xbce7f2f2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", "moreLiveObjectsBuffer: update buffer, value=" + m75934xbce7f2f2);
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEARBY_MORE_LIVE_OBJECTS_BUFFER_STRING, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(m75934xbce7f2f2.f273689a));
            }
        }
    }

    public final boolean B() {
        int i17 = this.f94652t.f94635a;
        return i17 == 1 || i17 == 0 || i17 == 3 || i17 == 11 || i17 == 10 || i17 == 9 || i17 == 12 || i17 == 14 || i17 == 15 || i17 == 21;
    }

    @Override // az2.j, com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        jz5.f0 f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cgi real run, pullType: ");
        aq2.a aVar = this.f94652t;
        sb6.append(aVar.f94635a);
        sb6.append(" tabId=");
        int i17 = this.f94653u;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderNavLiveStream", sb6.toString());
        rq2.d dVar = rq2.d.f480349a;
        int i18 = aVar.f94635a;
        java.lang.String a17 = dVar.a(i18, i17);
        if (dVar.c(i18, i17)) {
            rq2.a b17 = dVar.b(i18, i17);
            if (b17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "startCgi: tabType=" + i17 + ", pullType=" + i18);
                b17.f480325c = android.os.SystemClock.elapsedRealtime();
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "startCgi setOutSideStartCgiTsMap tabType=" + i17 + ", pullType=" + i18);
                rq2.d.f480355g.put(dVar.a(i18, i17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "startCgi: remove data, type=" + i17 + " key=" + a17);
            rq2.d.f480354f.remove(a17);
        }
        int i19 = aVar.f94635a;
        if (i19 == 21 || i19 == 10 || i19 == 9) {
            rq2.o.f480380a.c(rq2.b.f480344e, i19, this.f94655w == 1);
        }
        return super.l();
    }

    @Override // az2.j
    public java.util.List s() {
        return kz5.b0.c(new jz5.l("pull_type", java.lang.String.valueOf(this.f94657y.m75939xb282bd08(7))));
    }

    @Override // az2.j, ay1.m
    /* renamed from: x */
    public java.lang.String getF204809h() {
        aq2.a aVar = this.f94652t;
        int i17 = aVar.f94635a;
        if (i17 == 1 || i17 == 21 || i17 == 24 || i17 == 9 || i17 == 10) {
            i17 = 0;
        }
        return super.mo8871xb5884f29() + '+' + i17 + '+' + aVar.f94647m + '+' + aVar.f94636b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(aq2.a userRequest, r45.qt2 qt2Var, im5.b bVar) {
        super(qt2Var, bVar);
        int i17;
        r45.kd1 kd1Var;
        r45.nm1 nm1Var;
        java.util.LinkedList m75941xfb821914;
        r45.dd2 dd2Var;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userRequest, "userRequest");
        this.f94652t = userRequest;
        this.f94653u = 10000;
        this.f94654v = "";
        r45.ck2 ck2Var = new r45.ck2();
        this.f94657y = ck2Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        db2.t4 t4Var = db2.t4.f309704a;
        r45.kv0 a17 = t4Var.a(7312);
        int i19 = userRequest.f94640f;
        a17.set(1, java.lang.Integer.valueOf(i19));
        ck2Var.set(1, a17);
        ck2Var.set(2, userRequest.f94637c);
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        ck2Var.set(3, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        ck2Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        ck2Var.set(5, t4Var.n());
        int i27 = userRequest.f94635a;
        ck2Var.set(7, java.lang.Integer.valueOf(i27));
        ck2Var.set(15, "");
        zl2.q4 q4Var = zl2.q4.f555466a;
        ck2Var.set(16, q4Var.b());
        r45.xo1 xo1Var = new r45.xo1();
        cq2.q qVar = cq2.q.f302961a;
        xo1Var.set(2, java.lang.Integer.valueOf(cq2.q.f302973m));
        xo1Var.set(3, java.lang.Integer.valueOf(cq2.q.f302974n));
        xo1Var.set(4, java.lang.Integer.valueOf(cq2.q.f302975o));
        int i28 = userRequest.f94644j;
        xo1Var.set(5, java.lang.Integer.valueOf(i28));
        xo1Var.set(6, java.lang.Float.valueOf(userRequest.f94645k));
        int i29 = userRequest.f94640f;
        if (i29 == 9500001 || i29 == 9500002 || i29 == 9500004 || i29 == 9500003) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderNavLiveStream", "buildRedDotRequest return for in operation game.");
            i17 = i28;
        } else {
            if (B()) {
                zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
                r45.xs2 Q = nk6.Q("NearbyLiveTab");
                this.f94656x = Q != null;
                boolean z17 = userRequest.f94650p;
                int i37 = userRequest.f94635a;
                i17 = i28;
                if (z17 && (i37 == 10 || i37 == 9)) {
                    xo1Var.set(0, java.lang.Boolean.TRUE);
                    r45.wo1 d17 = qVar.d();
                    xo1Var.set(1, d17 != null ? d17.m75934xbce7f2f(9) : null);
                }
                ck2Var.set(12, new r45.kd1());
                if (!z17 && (kd1Var = (r45.kd1) ck2Var.m75936x14adae67(12)) != null) {
                    if (Q != null) {
                        this.f94655w = Q.m75939xb282bd08(13);
                        this.f94654v = nk6.V0("NearbyLiveTab");
                        kd1Var.set(0, java.lang.Long.valueOf(Q.m75942xfb822ef2(3)));
                        kd1Var.set(1, Q.m75945x2fec8307(8));
                        kd1Var.set(2, Q.m75934xbce7f2f(7));
                        if (c92.g.f121271a.b()) {
                            kd1Var.set(3, "FinderLiveEntrance");
                        } else {
                            kd1Var.set(3, "NearbyEntrance");
                        }
                        if (i37 == 10 || i37 == 9) {
                            xo1Var.set(0, java.lang.Boolean.TRUE);
                            r45.wo1 wo1Var = (r45.wo1) Q.m75936x14adae67(30);
                            xo1Var.set(1, wo1Var != null ? wo1Var.m75934xbce7f2f(5) : null);
                        }
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[buildRedDotRequest] pullType:");
                    sb6.append(i37);
                    sb6.append(" isRedDotRequest=");
                    sb6.append(this.f94656x);
                    sb6.append(" tab_tips_path=");
                    sb6.append(kd1Var.m75945x2fec8307(3));
                    sb6.append("  tabTipsByPassInfo=");
                    sb6.append(kd1Var.m75934xbce7f2f(2) != null);
                    sb6.append(" objectId=");
                    sb6.append(pm0.v.u(kd1Var.m75942xfb822ef2(0)));
                    sb6.append(' ');
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderNavLiveStream", sb6.toString());
                }
            } else {
                i17 = i28;
            }
            ck2Var.set(22, xo1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderNavLiveStream", "preloadInfo: total_preload_cnt=" + xo1Var.m75939xb282bd08(2) + ", total_fail_preload_cnt=" + xo1Var.m75939xb282bd08(3) + ", total_effective_preload_cnt=" + xo1Var.m75939xb282bd08(4) + ", is_preload_request=" + xo1Var.m75933x41a8a7f2(0) + ", preload_type=" + xo1Var.m75939xb282bd08(5) + ", client_predict_score=" + xo1Var.m75938x746dc8a6(6));
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("resetPreloadCnt total_preload_cnt: ");
            sb7.append(cq2.q.f302973m);
            sb7.append(" total_fail_preload_cnt: ");
            sb7.append(cq2.q.f302974n);
            sb7.append(" total_effective_preload_cnt: ");
            sb7.append(cq2.q.f302975o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", sb7.toString());
            cq2.q.f302973m = 0;
            cq2.q.f302974n = 0;
            cq2.q.f302975o = 0;
        }
        if (B()) {
            r45.n40 n40Var = new r45.n40();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4 h4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4.f183754a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            dp2.a aVar = dp2.a.f323716a;
            android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
            com.p314xaae8f345.mm.ui.ah a18 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.System.nanoTime();
            boolean z18 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int i38 = a18.f278668a;
            if (!z18 && i38 > (i18 = a18.f278669b)) {
                i38 = i18;
            }
            n40Var.set(0, java.lang.Integer.valueOf(h4Var.d(context, ((((i38 - com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 36)) / 2) - resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9)) - resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)) - resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn), 12.0f)));
            ck2Var.set(26, n40Var);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("buildClientSpecificConfig: pullType=");
            sb8.append(i27);
            sb8.append(", recommend_reason_len=");
            r45.n40 n40Var2 = (r45.n40) ck2Var.m75936x14adae67(26);
            sb8.append(n40Var2 != null ? java.lang.Integer.valueOf(n40Var2.m75939xb282bd08(0)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderNavLiveStream", sb8.toString());
        }
        ck2Var.set(11, 0);
        ck2Var.set(24, userRequest.f94638d);
        ck2Var.set(18, java.lang.Long.valueOf(userRequest.f94641g));
        ck2Var.set(17, java.lang.Integer.valueOf(userRequest.f94636b));
        ck2Var.m75941xfb821914(19).addAll(userRequest.f94639e);
        ck2Var.set(6, zl2.q4.d(q4Var, null, new java.util.LinkedList(((b92.m2) ((zy2.n8) i95.n0.c(zy2.n8.class))).wi("FinderNavLiveStream")), 1, null));
        ck2Var.set(21, userRequest.f94642h);
        ck2Var.set(20, userRequest.f94643i);
        ck2Var.set(23, userRequest.f94648n);
        ck2Var.set(25, userRequest.f94649o);
        ck2Var.set(27, userRequest.f94651q);
        lVar.f152197a = ck2Var;
        r45.dk2 dk2Var = new r45.dk2();
        dk2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) dk2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = dk2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findernavlivestream";
        lVar.f152200d = 7312;
        r45.dd2 dd2Var2 = userRequest.f94643i;
        int m75939xb282bd08 = dd2Var2 != null ? dd2Var2.m75939xb282bd08(0) : 10000;
        this.f94653u = m75939xb282bd08;
        p(lVar.a());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[CgiFinderNavLiveStream#init] commentScene=");
        sb9.append(i19);
        sb9.append(", from_comment_scene=");
        sb9.append(ck2Var.m75945x2fec8307(24));
        sb9.append(", pullType=");
        sb9.append(i27);
        sb9.append(", preloadType=");
        sb9.append(i17);
        sb9.append(", longitude=");
        sb9.append(ck2Var.m75938x746dc8a6(3));
        sb9.append(" latitude=");
        sb9.append(ck2Var.m75938x746dc8a6(4));
        sb9.append(" lastBuffer:");
        sb9.append(ck2Var.m75934xbce7f2f(2));
        sb9.append(",liveTabId: ");
        r45.dd2 dd2Var3 = (r45.dd2) ck2Var.m75936x14adae67(20);
        sb9.append(dd2Var3 != null ? java.lang.Integer.valueOf(dd2Var3.m75939xb282bd08(0)) : null);
        sb9.append(",tabId: ");
        sb9.append(m75939xb282bd08);
        sb9.append(", subTabId: ");
        r45.dd2 dd2Var4 = (r45.dd2) ck2Var.m75936x14adae67(20);
        sb9.append((dd2Var4 == null || (m75941xfb821914 = dd2Var4.m75941xfb821914(6)) == null || (dd2Var = (r45.dd2) kz5.n0.a0(m75941xfb821914, 0)) == null) ? null : java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)));
        sb9.append(",liveReportInfo: ");
        sb9.append((r45.o72) ck2Var.m75936x14adae67(21));
        sb9.append(",speed=");
        r45.om1 om1Var = (r45.om1) ck2Var.m75936x14adae67(16);
        sb9.append((om1Var == null || (nm1Var = (r45.nm1) om1Var.m75936x14adae67(0)) == null) ? null : java.lang.Integer.valueOf(nm1Var.m75939xb282bd08(0)));
        sb9.append(", pre_navlive_more_live_objects_buffer=");
        sb9.append(ck2Var.m75934xbce7f2f(25));
        sb9.append("end_nav_buffer.object_id_list:");
        r45.rk0 rk0Var = (r45.rk0) ck2Var.m75936x14adae67(27);
        sb9.append(rk0Var != null ? rk0Var.m75941xfb821914(0) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderNavLiveStream", sb9.toString());
    }
}
