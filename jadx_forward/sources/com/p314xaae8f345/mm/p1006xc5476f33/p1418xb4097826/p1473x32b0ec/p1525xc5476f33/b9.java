package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class b9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f193519p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f193520q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f193521r;

    /* renamed from: s, reason: collision with root package name */
    public int f193522s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f193523t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f193524u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f193525v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193519p = statusMonitor;
        this.f193520q = "Finder.FinderLiveAnchorPauseRecoveryPlugin";
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.cjv);
        this.f193521r = textView;
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f568112lq3);
        this.f193522s = 3;
        root.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u8.f196067d);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        this.f193525v = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a9(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 201) {
            this.f193523t = false;
            t1();
        } else {
            if (ordinal != 216) {
                return;
            }
            this.f193523t = true;
            t1();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.f193525v).mo141623x754a37bb()).d();
        this.f193524u = false;
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
        java.lang.String str = this.f193520q;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, "show onlyShowView:" + this.f193523t, new java.lang.Object[0]);
        if (this.f193523t && this.f193524u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onlyShowView and showing resume, ignore");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57627xbbf42674(R0(), false, 1, null);
            return;
        }
        this.f193522s = 3;
        this.f193521r.setText(java.lang.String.valueOf(3));
        this.f193524u = true;
        jz5.g gVar = this.f193525v;
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) gVar).mo141623x754a37bb()).d();
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) gVar).mo141623x754a37bb()).c(1000L, 1000L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57627xbbf42674(R0(), false, 1, null);
        K0(0);
    }
}
