package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class hz extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements vd2.j5 {

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.RelativeLayout f194412p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f194413q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f194414r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f194415s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f194416t;

    /* renamed from: u, reason: collision with root package name */
    public int f194417u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.p314xaae8f345.mm.R.id.c8q);
        this.f194412p = relativeLayout;
        this.f194413q = root.findViewById(com.p314xaae8f345.mm.R.id.c8r);
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.c8s);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.c8p);
        this.f194414r = findViewById;
        this.f194416t = true;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bz(this));
        relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cz(this));
        textView.setText(root.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573235dz1));
    }

    @Override // vd2.j5
    public void C4() {
        K0(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dz.f193887a[status.ordinal()] == 1) {
            pm0.v.V(100L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gz(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
        this.f194415s = false;
        this.f194416t = true;
    }

    @Override // vd2.j5
    public java.lang.String Q() {
        return "FinderLiveMultiStreamBubblePlugin";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // vd2.j5
    public void o1() {
        K0(8);
    }

    @Override // vd2.j5
    /* renamed from: priority */
    public int mo56972xba8879a4() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r3 != 0) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t1() {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hz.t1():void");
    }

    public final java.lang.String u1() {
        return "MultiStream_" + ((mm2.e1) P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
    }

    public final void v1() {
        df2.pv pvVar = (df2.pv) U0(df2.pv.class);
        if (pvVar != null) {
            pvVar.b7(this);
        }
    }

    public final void w1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMultiStreamBubblePlugin", "markUse hasMarkUse: " + this.f194415s + " key: " + u1());
        v1();
        if (this.f194415s) {
            return;
        }
        this.f194415s = true;
        zl2.r4.f555483a.I0().putInt(u1(), 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        super.z0();
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        if (k0Var == null || (c14227x4262fb44 = k0Var.f380920v) == null) {
            return;
        }
        c14227x4262fb44.f193193d = true;
        c14227x4262fb44.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ez(this));
    }
}
