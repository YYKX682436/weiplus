package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class w1 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f250583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f250583d = arrayList;
        arrayList.add(new yc4.u(this));
        arrayList.add(new yc4.z(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ReportUIC", "[" + hashCode() + "]onCreate");
        java.util.Iterator it = this.f250583d.iterator();
        while (it.hasNext()) {
            ((yc4.f) it.next()).b(bundle);
        }
        int intExtra = m158359x1e885992().getIntExtra("sns_unread_count", 0);
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("enter_by_red", false);
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ri(12076, "UnReadMsgCount", java.lang.Integer.valueOf(intExtra));
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ri(12076, "HasNewSnsMsgWhenEntrance", java.lang.Boolean.valueOf(booleanExtra));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        iy1.c cVar = iy1.c.SnsTimeLineUI;
        cy1.a aVar = (cy1.a) ((cy1.a) rVar).ak(m158354x19263085, cVar);
        aVar.Rj(m158354x19263085(), iy1.a.Moments);
        aVar.dk(m158354x19263085(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.w1.class.getSimpleName());
        aVar.Tj(m158354x19263085(), 48, 16, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enterTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (s0Var.f246490j == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        } else {
            if (s0Var.f246474b.isEmpty()) {
                s0Var.f246472a.h(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                s0Var.f246476c.clear();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsReportHelper", "enterTimeLine exposureFeedSize %d", java.lang.Integer.valueOf(s0Var.f246474b.size()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pushEnterSnsTimeLineEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            v30.e eVar = (v30.e) i95.n0.c(v30.e.class);
            e62.e eVar2 = s0Var.f246489i0;
            ((u30.e) eVar).getClass();
            e62.n nVar = e62.n.f331315a;
            if (eVar2 != null) {
                java.util.ArrayList arrayList = e62.n.f331316b;
                if (!arrayList.contains(eVar2)) {
                    arrayList.add(eVar2);
                }
            }
            s0Var.E(1);
            ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.o0(s0Var), "sns_feed_expose_tag");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushEnterSnsTimeLineEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        rc4.e eVar3 = rc4.e.f475669a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        boolean m70939xdec9c05c = m70939xdec9c05c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registerPageReport", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        rc4.e.f475673e.clear();
        rc4.e.f475675g = false;
        rc4.e.f475676h = false;
        rc4.e.f475677i = "";
        if (m70939xdec9c05c) {
            long j17 = rc4.e.f475672d;
            rc4.e.f475674f = j17 == -1 ? new rc4.a(java.lang.System.currentTimeMillis(), 0, 0, null, 10, null, null, 0, 238, null) : new rc4.a(j17, 0, 0, null, 2, null, null, 0, 238, null);
        }
        java.lang.String stringExtra = activity.getIntent().getStringExtra("new_feed_id");
        java.lang.String str = stringExtra != null ? stringExtra : "";
        cy1.a aVar2 = (cy1.a) ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(activity, 32, 28630)).ak(activity, cVar);
        aVar2.gk(activity, kz5.c1.k(new jz5.l("enter_publishid", str), new jz5.l("is_cached_page", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.qj().b() ? 1 : 0)), new jz5.l("timeline_session_id", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni())));
        aVar2.Ai(activity, rc4.c.f475667a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerPageReport", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.lang.String str;
        v52.c g17;
        xc4.p n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ReportUIC", "[" + hashCode() + "]onDestroy");
        java.util.Iterator it = this.f250583d.iterator();
        while (it.hasNext()) {
            ((yc4.f) it.next()).c();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m70934x2b98e6a2().mo7946xf939df19();
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : -1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportWsFoldExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) s0Var.Y;
        for (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6910x5b7ce9c c6910x5b7ce9c : concurrentHashMap.values()) {
            if (c6910x5b7ce9c != null) {
                c6910x5b7ce9c.f142278j = mo1894x7e414b06;
                c6910x5b7ce9c.k();
            }
        }
        concurrentHashMap.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportWsFoldExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.j();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe S6 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.class)).S6();
        rc4.e eVar = rc4.e.f475669a;
        zc4.b bVar = (zc4.b) kz5.n0.Z(S6.f233598o);
        long y07 = (bVar == null || (n17 = bVar.n()) == null) ? -1L : n17.y0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        rc4.e.f475678j.clear();
        rc4.e.f475679k = false;
        rc4.e.f475670b.B("FinderTierManager.UI_KEY", y07);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTierManager", "release snsId:" + ca4.z0.t0(y07));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        xa4.c cVar = xa4.c.f534355a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doTimelineReport", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringFeed25330Reporter", "doTimelineReport");
        java.util.HashMap hashMap = xa4.c.f534356b;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6905xa73db7df c6905xa73db7df = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6905xa73db7df) entry.getValue();
            if (((n30.r) i95.n0.c(n30.r.class)) == null || (g17 = v52.c.g()) == null || (str = g17.d()) == null) {
                str = "";
            }
            c6905xa73db7df.f142233f = c6905xa73db7df.b("sessionID", str, true);
            ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6905xa73db7df) entry.getValue()).k();
        }
        hashMap.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doTimelineReport", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        yc4.b0 b0Var = yc4.b0.f542372a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markExitTimeline", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        ((ku5.t0) ku5.t0.f394148d).q(j0.k5.f377951d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markExitTimeline", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ReportUIC", "[" + hashCode() + "]onPause");
        super.mo2281xb01dfb57();
        java.util.Iterator it = this.f250583d.iterator();
        while (it.hasNext()) {
            ((yc4.f) it.next()).d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ReportUIC", "[" + hashCode() + "]onResume");
        super.mo2284x57429eec();
        java.util.Iterator it = this.f250583d.iterator();
        while (it.hasNext()) {
            ((yc4.f) it.next()).e();
        }
        yc4.b0.f542372a.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEnterScene", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMenuActionReporter", "setEnterScene >> 1");
        ta4.y0.f498397b = 1;
        ta4.y0.f498399d = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnterScene", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j
    /* renamed from: onScrollStateChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo70846x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r9, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x1 r10, int r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r8 = this;
            java.lang.String r0 = "onScrollStateChanged"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r12 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.v1
            if (r2 == 0) goto L1b
            r2 = r12
            com.tencent.mm.plugin.sns.ui.improve.component.v1 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.v1) r2
            int r3 = r2.f250571m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f250571m = r3
            goto L20
        L1b:
            com.tencent.mm.plugin.sns.ui.improve.component.v1 r2 = new com.tencent.mm.plugin.sns.ui.improve.component.v1
            r2.<init>(r8, r12)
        L20:
            java.lang.Object r12 = r2.f250569h
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f250571m
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L5e
            if (r4 == r6) goto L4b
            if (r4 != r5) goto L40
            int r9 = r2.f250568g
            java.lang.Object r10 = r2.f250567f
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r2.f250566e
            com.tencent.mm.plugin.sns.ui.improve.component.x1 r11 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x1) r11
            java.lang.Object r4 = r2.f250565d
            androidx.recyclerview.widget.RecyclerView r4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L80
        L40:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r9
        L4b:
            int r11 = r2.f250568g
            java.lang.Object r9 = r2.f250567f
            r10 = r9
            com.tencent.mm.plugin.sns.ui.improve.component.x1 r10 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x1) r10
            java.lang.Object r9 = r2.f250566e
            androidx.recyclerview.widget.RecyclerView r9 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) r9
            java.lang.Object r4 = r2.f250565d
            com.tencent.mm.plugin.sns.ui.improve.component.w1 r4 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.w1) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L76
        L5e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            r2.f250565d = r8
            r2.f250566e = r9
            r2.f250567f = r10
            r2.f250568g = r11
            r2.f250571m = r6
            java.lang.Object r12 = super.mo70846x4d79408f(r9, r10, r11, r2)
            if (r12 != r3) goto L75
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L75:
            r4 = r8
        L76:
            java.util.ArrayList r12 = r4.f250583d
            java.util.Iterator r12 = r12.iterator()
            r4 = r9
            r9 = r11
            r11 = r10
            r10 = r12
        L80:
            boolean r12 = r10.hasNext()
            jz5.f0 r6 = jz5.f0.f384359a
            if (r12 == 0) goto Lb2
            java.lang.Object r12 = r10.next()
            yc4.f r12 = (yc4.f) r12
            r2.f250565d = r4
            r2.f250566e = r11
            r2.f250567f = r10
            r2.f250568g = r9
            r2.f250571m = r5
            r12.getClass()
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r12)
            java.lang.String r7 = "onScrollStateChanged$suspendImpl"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r12)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r12)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r12)
            if (r6 != r3) goto L80
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        Lb2:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.w1.mo70846x4d79408f(androidx.recyclerview.widget.RecyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j
    /* renamed from: onScrollStateChangedInMain */
    public void mo70847x2ce8b1ed(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x1 struct, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        super.mo70847x2ce8b1ed(recyclerView, struct, i17);
        java.util.Iterator it = this.f250583d.iterator();
        while (it.hasNext()) {
            ((yc4.f) it.next()).f(recyclerView, struct, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }
}
