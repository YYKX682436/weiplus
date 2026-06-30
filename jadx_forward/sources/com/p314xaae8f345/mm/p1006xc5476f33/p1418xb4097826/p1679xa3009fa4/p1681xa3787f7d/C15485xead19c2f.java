package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM */
/* loaded from: classes10.dex */
public final class C15485xead19c2f extends pf5.o0 implements com.p314xaae8f345.mm.app.t2, iz2.c {

    /* renamed from: i, reason: collision with root package name */
    public long f218268i;

    /* renamed from: m, reason: collision with root package name */
    public long f218269m;

    /* renamed from: n, reason: collision with root package name */
    public long f218270n;

    /* renamed from: o, reason: collision with root package name */
    public int f218271o;

    /* renamed from: p, reason: collision with root package name */
    public r45.kz2 f218272p;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f218274r;

    /* renamed from: e, reason: collision with root package name */
    public final hy2.o f218264e = new hy2.o();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f218265f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f218266g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public boolean f218267h = true;

    /* renamed from: q, reason: collision with root package name */
    public final hy2.h f218273q = new hy2.h(this);

    public C15485xead19c2f() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f218274r = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5157x6316f13d>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM$authorAgreeChangeListener$1
            {
                this.f39173x3fe91575 = 1690927405;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5157x6316f13d c5157x6316f13d) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5157x6316f13d event = c5157x6316f13d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f c15485xead19c2f = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f.this;
                if (c15485xead19c2f.Q6() && ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dk() && ((uh4.c0) i95.n0.c(uh4.c0.class)).df() != null) {
                    int i17 = event.f135506g.f88818a;
                    if (i17 == 6 || i17 == 11) {
                        c15485xead19c2f.U6(true, "AgreeAuthorization");
                    } else if (i17 == 5 || i17 == 10) {
                        c15485xead19c2f.U6(false, "AgreeAuthorization");
                    }
                }
                return true;
            }
        };
    }

    public static final boolean N6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f c15485xead19c2f, android.app.Activity activity) {
        c15485xead19c2f.getClass();
        boolean z17 = (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14095xead19c0c) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14096xb222a3af)) ? false : true;
        boolean contains = c15485xead19c2f.f218266g.contains(activity.getClass());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "isFinderCountPage: isFinderUI=" + z17 + ", isExtraUi=" + contains + ", activity=" + activity.getClass().getSimpleName());
        return z17 || contains;
    }

    public r45.kz2 O6() {
        if (this.f218272p == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "getTeenModeManageInfo: parse from config storage");
            try {
                r45.kz2 kz2Var = new r45.kz2();
                java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_TEEN_MODE_MANAGE_CONFIG_STRING_SYNC, "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
                if (v17.length() > 0) {
                    kz2Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17));
                    this.f218272p = kz2Var;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderTeenModeLimitVM", th6, "getTeenModeManageInfo: parse teen mode config fail, ", new java.lang.Object[0]);
            }
        }
        r45.kz2 kz2Var2 = this.f218272p;
        return kz2Var2 == null ? new r45.kz2() : kz2Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r4 < 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int P6() {
        /*
            r7 = this;
            r45.kz2 r0 = r7.O6()
            r1 = 1
            int r2 = r0.m75939xb282bd08(r1)
            r3 = 0
            int r0 = r0.m75939xb282bd08(r3)
            if (r0 <= 0) goto L4e
            if (r2 <= 0) goto L4e
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r5 = 5
            r4.set(r5, r1)
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            r6.set(r5, r1)
            r6.set(r1, r0)
            r0 = 2
            r6.set(r0, r2)
            int r2 = r4.get(r1)
            int r5 = r6.get(r1)
            int r2 = r2 - r5
            int r4 = r4.get(r0)
            int r0 = r6.get(r0)
            int r4 = r4 - r0
            r0 = 100
            if (r2 < 0) goto L41
            if (r2 >= r0) goto L41
            goto L42
        L41:
            r1 = r3
        L42:
            if (r1 == 0) goto L49
            if (r4 >= 0) goto L4f
        L46:
            int r2 = r2 + (-1)
            goto L4f
        L49:
            if (r2 != r0) goto L4e
            if (r4 >= 0) goto L4e
            goto L46
        L4e:
            r2 = -1
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f.P6():int");
    }

    public final boolean Q6() {
        boolean z17;
        boolean z18;
        boolean z19;
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
            z18 = false;
        }
        if (z18 && ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209216eg).mo141623x754a37bb()).r()).booleanValue()) {
            return true;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderOpenCheckAntiAddictSwitch", 1) != 1) {
            if (!(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.V7).mo141623x754a37bb()).r()).intValue() == 1)) {
                z19 = false;
                boolean wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "isEnableLimit switch:" + z19 + ", teenModeAndViewAll:" + wi6);
                return z19 && wi6;
            }
        }
        z19 = true;
        boolean wi62 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "isEnableLimit switch:" + z19 + ", teenModeAndViewAll:" + wi62);
        if (z19) {
            return false;
        }
    }

    public final boolean R6() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(c01.id.c());
        int i17 = calendar.get(11);
        hy2.g gVar = hy2.g.f367591a;
        int b17 = gVar.b();
        int a17 = gVar.a();
        int i18 = a17 >= 1 ? a17 - 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "isInDayHour22_6 now hour:" + i17 + ", start:" + b17 + ", end:" + a17 + ", realEnd:" + i18);
        if (!(b17 <= i17 && i17 < 25)) {
            if (!(i17 >= 0 && i17 <= i18)) {
                return false;
            }
        }
        return true;
    }

    public final void S6(boolean z17) {
        if (this.f218267h) {
            ((ku5.t0) ku5.t0.f394148d).B(new hy2.i(this, z17));
        }
    }

    public void T6() {
        if (this.f218269m > 0) {
            this.f218268i += c01.id.c() - this.f218269m;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, java.lang.Long.valueOf(this.f218268i));
            this.f218269m = c01.id.c();
        }
    }

    public final void U6(boolean z17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "startEnjoyFinder: source=" + source + ", isCurFew=" + z17);
        this.f218269m = c01.id.c();
        if (z17) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_IS_CURFEW_CLOSE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_CURFEW_CLOSE_TIME_LONG_SYNC, java.lang.Long.valueOf(this.f218269m));
        }
        this.f218268i = 0L;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, java.lang.Long.valueOf(this.f218268i));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LAST_SHOW_TEENAGER_REST_TIME_LONG_SYNC, 0L);
    }

    public final void V6() {
        hy2.o oVar = this.f218264e;
        java.util.concurrent.Future future = oVar.f367602a;
        boolean z17 = false;
        if (future != null) {
            future.cancel(false);
            oVar.f367602a = null;
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "stopCheckTeenModeTimer enjoyFinderMs" + this.f218268i);
        }
    }

    public void W6(r45.kz2 info, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTeenModeManageConfig: source=");
        sb6.append(source);
        sb6.append(", size=");
        sb6.append(info.m75941xfb821914(2).size());
        sb6.append(", birthY=");
        sb6.append(info.m75939xb282bd08(0));
        sb6.append(", birthM=");
        sb6.append(info.m75939xb282bd08(1));
        sb6.append(", visible_info_flag=");
        long m75942xfb822ef2 = info.m75942xfb822ef2(3);
        r26.a.a(2);
        java.lang.String l17 = java.lang.Long.toString(m75942xfb822ef2, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "toString(...)");
        sb6.append(l17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", sb6.toString());
        this.f218272p = info;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_TEEN_MODE_MANAGE_CONFIG_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(info.mo14344x5f01b1f6()));
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "FinderTeenModeLimitVM onAppBackground");
        V6();
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
    }
}
