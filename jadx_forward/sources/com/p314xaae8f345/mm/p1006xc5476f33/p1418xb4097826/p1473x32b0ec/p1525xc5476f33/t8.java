package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class t8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f195887p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f195888q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f195889r;

    /* renamed from: s, reason: collision with root package name */
    public int f195890s;

    /* renamed from: t, reason: collision with root package name */
    public long f195891t;

    /* renamed from: u, reason: collision with root package name */
    public final long f195892u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f195893v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195887p = statusMonitor;
        this.f195888q = "Finder.FinderLiveAnchorPausePlugin";
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.kqa);
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.kqb);
        this.f195889r = textView2;
        android.widget.TextView textView3 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f568197m21);
        this.f195892u = 10L;
        root.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n8.f195130d);
        textView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o8(this));
        if (x0()) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = i65.a.b(root.getContext(), 120);
            }
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        this.f195893v = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s8(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 191) {
            t1();
            return;
        }
        java.lang.String str = this.f195888q;
        if (ordinal != 200) {
            if (ordinal == 214 && w0() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "anchor verification start, hide pause plugin");
                K0(8);
                u1().d();
                return;
            }
            return;
        }
        boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_ANCHOR_PAUSE_RECOVERY", false) : false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, "resumeLiveLogic showRecoveryView:" + z17, new java.lang.Object[0]);
        K0(8);
        u1().d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57627xbbf42674(R0(), false, 1, null);
        if (z17) {
            qo0.c.a(this.f195887p, qo0.b.f446946s4, null, 2, null);
            return;
        }
        in0.q e17 = dk2.ef.f314905a.e();
        if (e17 != null) {
            e17.r0();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        u1().d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8 h8Var;
        te2.j0 j0Var;
        if (((mm2.c1) P0(mm2.c1.class)).a8() && pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f410340g2, 524288) && !pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f410340g2, 32)) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = ((mm2.c1) P0(mm2.c1.class)).T4;
            this.f195890s = (1L > j17 ? 1 : (1L == j17 ? 0 : -1)) <= 0 && (j17 > elapsedRealtime ? 1 : (j17 == elapsedRealtime ? 0 : -1)) < 0 ? (int) ((elapsedRealtime - ((mm2.c1) P0(mm2.c1.class)).T4) / 1000) : ((mm2.c1) P0(mm2.c1.class)).U4;
            java.lang.String str = this.f195888q;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, "showLivePauseView curTime:" + elapsedRealtime + ", anchorPauseStartTime:" + ((mm2.c1) P0(mm2.c1.class)).T4 + ", anchorPauseTimeCount:" + ((mm2.c1) P0(mm2.c1.class)).U4 + ", remainTime:" + this.f195890s, new java.lang.Object[0]);
            int i17 = this.f195890s;
            android.view.ViewGroup viewGroup = this.f446856d;
            if (i17 < 0) {
                K0(8);
                db5.t7.m123883x26a183b(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e3k), 0).show();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "show pause live error,remain time:" + this.f195890s + " illegal!");
                return;
            }
            this.f195889r.setText(no0.m.f420263a.b(i17, ":"));
            R0().m57645xc03d2e6f(((mm2.c1) P0(mm2.c1.class)).f410385o, true);
            R0().m57766x113b9069();
            K0(0);
            dk2.vg d17 = ((mm2.c1) P0(mm2.c1.class)).Z6().d();
            if (d17 != null && (h8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8.class)) != null && (j0Var = h8Var.f194318q) != null) {
                ((te2.p1) j0Var).i(d17, ((mm2.c1) P0(mm2.c1.class)).Z6().f315408d);
            }
            in0.q e17 = dk2.ef.f314905a.e();
            if (e17 != null) {
                e17.k0();
            }
            u1().d();
            u1().c(1000L, 1000L);
            if (zl2.r4.f555483a.z1(S0())) {
                viewGroup.setBackground(null);
            }
        }
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 u1() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.f195893v).mo141623x754a37bb();
    }
}
