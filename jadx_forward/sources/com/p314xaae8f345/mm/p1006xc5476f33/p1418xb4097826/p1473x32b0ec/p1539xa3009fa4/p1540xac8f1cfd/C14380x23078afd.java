package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd;

/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC */
/* loaded from: classes3.dex */
public final class C14380x23078afd extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f198514d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f198515e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f198516f;

    /* renamed from: g, reason: collision with root package name */
    public dk2.x4 f198517g;

    /* renamed from: h, reason: collision with root package name */
    public long f198518h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f198519i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f198520m;

    /* renamed from: n, reason: collision with root package name */
    public int f198521n;

    /* renamed from: o, reason: collision with root package name */
    public int f198522o;

    /* renamed from: p, reason: collision with root package name */
    public wa2.n0 f198523p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f198524q;

    /* renamed from: r, reason: collision with root package name */
    public int f198525r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f198526s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f198527t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14380x23078afd(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198514d = "FinderLiveExitAnimateOp@" + hashCode() + '}';
        this.f198525r = 1;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f198526s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC$voipCallEvent$1
            {
                this.f39173x3fe91575 = -797557590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba event = c6231x4f3054ba;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (!gm0.j1.a() || event.f136478g.f89948b != 3) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd.this.f198516f = true;
                return true;
            }
        };
        this.f198527t = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5471xc77af86e>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC$interceptEvent$1
            {
                this.f39173x3fe91575 = 1375150718;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5471xc77af86e c5471xc77af86e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5471xc77af86e event = c5471xc77af86e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.gb gbVar = event.f135809g;
                if (gbVar == null) {
                    return false;
                }
                boolean z17 = gbVar.f88285a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd c14380x23078afd = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd.this;
                c14380x23078afd.f198520m = z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14380x23078afd.f198514d, "receive FinderFluentSwitchInterceptEvent isEventIntercept: " + c14380x23078afd.f198520m);
                return true;
            }
        };
    }

    public final void O6(java.lang.String str) {
        ig2.m.f372926a.d();
        P6(str);
    }

    public final void P6(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198514d, "notifyFinish source: " + str + " start finish");
        this.f198515e = true;
        m158354x19263085().finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x057f, code lost:
    
        if (r6 == null) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0a84, code lost:
    
        if (r2 == null) goto L499;
     */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6() {
        /*
            Method dump skipped, instructions count: 2822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd.Q6():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        this.f198524q = true;
        dk2.ef efVar = dk2.ef.f314905a;
        java.lang.Integer num = dk2.ef.G;
        if (num != null) {
            if (!(num.intValue() > 0)) {
                num = null;
            }
            if (num != null) {
                num.intValue();
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c17;
                android.app.Activity m80379x76847179 = m80379x76847179();
                ml2.e4 e4Var = ml2.e4.f408918q;
                km2.n nVar = dk2.ef.H;
                ml2.r0.Ck(r0Var, m80379x76847179, e4Var, nVar != null ? nVar.f390693l : null, false, null, 24, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198514d, "#onBackPressed exit reportQuitLive CloseTypeSystemBackButton");
            }
        }
        return super.mo2274xbdc3c5dc();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        super.mo2275x62f76871(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198514d, "onBeforeFinish feedId: " + this.f198518h);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5439x752a578e c5439x752a578e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5439x752a578e();
        c5439x752a578e.f135781g.f88079a = this.f198518h;
        c5439x752a578e.e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5482xc842f1ea c5482xc842f1ea = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5482xc842f1ea();
        c5482xc842f1ea.f135818g.f89144a = this.f198518h;
        c5482xc842f1ea.e();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        dk2.x4 x4Var;
        this.f198517g = dk2.x4.C.a(m158359x1e885992());
        this.f198518h = m158359x1e885992().getLongExtra("CURRENT_FEED_ID", 0L);
        wa2.n0 n0Var = (wa2.n0) m158354x19263085().getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.tct);
        this.f198523p = n0Var;
        if (n0Var != null) {
            n0Var.m173383x71eb6f8a(new im2.f(this));
        }
        if (this.f198518h == 0 && (x4Var = this.f198517g) != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = x4Var.f315857r;
            long m76784x5db1b11 = c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L;
            this.f198518h = m76784x5db1b11;
            if (m76784x5db1b11 == 0 && x4Var.f315851l.size() > 0) {
                this.f198518h = ((com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e) x4Var.f315851l.get(0)).f150082s;
            }
        }
        ug5.v a17 = ug5.v.f509188g.a(java.lang.String.valueOf(this.f198518h));
        this.f198522o = a17 != null ? a17.hashCode() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198514d, "onCreate currentFeedId: " + this.f198518h + " performerDirectorHashCode: " + this.f198522o);
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.gd9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f198519i = (android.view.ViewGroup) findViewById;
        this.f198526s.mo48813x58998cd();
        this.f198527t.mo48813x58998cd();
        ig2.m mVar = ig2.m.f372926a;
        ig2.m.f372928c = false;
        ig2.m.f372929d = false;
        ig2.m.f372931f = false;
        ig2.m.f372930e = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198514d, "onDestroy");
        this.f198526s.mo48814x2efc64();
        this.f198527t.mo48814x2efc64();
        ig2.m.f372929d = true;
        ig2.m.f372931f = false;
        pm0.v.V(1000L, new im2.e(this));
    }
}
