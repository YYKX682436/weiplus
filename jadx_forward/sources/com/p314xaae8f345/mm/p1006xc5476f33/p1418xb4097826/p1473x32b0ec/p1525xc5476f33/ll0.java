package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ll0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements vd2.j5 {

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.RelativeLayout f194944p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f194945q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f194946r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f194947s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.p314xaae8f345.mm.R.id.c8q);
        this.f194944p = relativeLayout;
        this.f194945q = root.findViewById(com.p314xaae8f345.mm.R.id.c8r);
        this.f194946r = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.c8s);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.c8p);
        this.f194947s = findViewById;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hl0(this));
        relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.il0(this));
    }

    @Override // vd2.j5
    public void C4() {
        K0(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // vd2.j5
    public java.lang.String Q() {
        return "FinderLiveVisitorCommonBubblePlugin";
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
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        df2.pv pvVar = (df2.pv) U0(df2.pv.class);
        if (pvVar != null) {
            pvVar.b7(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(int r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.Class<mm2.c1> r0 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r6.P0(r0)
            mm2.c1 r0 = (mm2.c1) r0
            boolean r0 = r0.T
            if (r0 != 0) goto Le2
            java.lang.Class<mm2.n0> r0 = mm2.n0.class
            androidx.lifecycle.c1 r0 = r6.P0(r0)
            mm2.n0 r0 = (mm2.n0) r0
            boolean r0 = r0.f410806r
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1c
            r0 = r2
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 == 0) goto L21
            goto Le2
        L21:
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.r60> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60.class
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r6.X0(r0)
            com.tencent.mm.plugin.finder.live.plugin.r60 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60) r0
            if (r0 == 0) goto L33
            int r0 = r0.w0()
            if (r0 != 0) goto L33
            r0 = r2
            goto L34
        L33:
            r0 = r1
        L34:
            java.lang.String r3 = "FinderLiveVisitorCommonBubblePlugin"
            if (r0 == 0) goto L3e
            java.lang.String r7 = "FinderLivePromoteBubblePlugin is showing, return "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r7)
            return
        L3e:
            if (r7 != 0) goto L5d
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_VR_TIP_GUIDE_BOOLEAN_SYNC
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.m(r4, r5)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Boolean"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5e
        L5d:
            r1 = r2
        L5e:
            java.lang.Class<df2.pv> r0 = df2.pv.class
            if (r1 == 0) goto Lbe
            if (r7 != 0) goto L8b
            gm0.b0 r2 = gm0.j1.u()
            com.tencent.mm.storage.n3 r2 = r2.c()
            com.tencent.mm.storage.u3 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_VR_TIP_GUIDE_BOOLEAN_SYNC
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r2.x(r4, r5)
            int r2 = r6.w0()
            if (r2 == 0) goto L8b
            java.lang.Class<ml2.r0> r2 = ml2.r0.class
            i95.m r2 = i95.n0.c(r2)
            ml2.r0 r2 = (ml2.r0) r2
            ml2.x4[] r4 = ml2.x4.f409767d
            r4 = 3
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2.Mk(r4)
        L8b:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r6.U0(r0)
            df2.pv r0 = (df2.pv) r0
            if (r0 == 0) goto L96
            r0.d7(r6)
        L96:
            android.widget.TextView r0 = r6.f194946r
            if (r8 == 0) goto L9b
            goto L9d
        L9b:
            java.lang.String r8 = ""
        L9d:
            r0.setText(r8)
            int r8 = r6.w0()
            if (r8 != 0) goto Lb0
            com.tencent.mm.plugin.finder.live.plugin.jl0 r8 = new com.tencent.mm.plugin.finder.live.plugin.jl0
            r8.<init>(r6)
            android.view.ViewGroup r0 = r6.f446856d
            r0.post(r8)
        Lb0:
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.hz> r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hz.class
            com.tencent.mm.plugin.finder.live.plugin.l r8 = r6.X0(r8)
            com.tencent.mm.plugin.finder.live.plugin.hz r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hz) r8
            if (r8 == 0) goto Lc9
            r8.v1()
            goto Lc9
        Lbe:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r8 = r6.U0(r0)
            df2.pv r8 = (df2.pv) r8
            if (r8 == 0) goto Lc9
            r8.b7(r6)
        Lc9:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "showBubbleTip scene:"
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = " showTip:"
            r8.append(r7)
            r8.append(r1)
            java.lang.String r7 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r7)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ll0.u1(int, java.lang.String):void");
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
        c14227x4262fb44.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kl0(this));
    }
}
