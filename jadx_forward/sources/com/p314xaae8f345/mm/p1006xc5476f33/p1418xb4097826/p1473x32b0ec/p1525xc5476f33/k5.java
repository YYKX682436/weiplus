package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class k5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f194724p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f194725q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f194726r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f194727s;

    /* renamed from: t, reason: collision with root package name */
    public final db5.t4 f194728t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(android.view.ViewGroup root, qo0.c statueMonitor) {
        super(root, statueMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statueMonitor, "statueMonitor");
        this.f194724p = statueMonitor;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.igy);
        this.f194725q = findViewById;
        com.p314xaae8f345.mm.ui.bl.c(root.getContext());
        this.f194728t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g5(this, root);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f5(this));
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (x0() && root.getLayoutParams() != null && (root.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            int u07 = u0();
            if (u07 == 1) {
                android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(com.p314xaae8f345.mm.ui.bl.c(root.getContext()));
            } else if (u07 == 3) {
                android.view.ViewGroup.LayoutParams layoutParams2 = root.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 16));
            }
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        zl2.r4.b(r4Var, root, this, false, false, 8, null);
        if (r4Var.w1()) {
            return;
        }
        r4Var.d(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void J0() {
        android.view.ViewGroup viewGroup = this.f446856d;
        if (com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext()) == 0) {
            com.p314xaae8f345.mm.ui.zk.a(viewGroup.getContext(), 16);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            if (ordinal == 7) {
                K0(0);
                return;
            }
            if (ordinal == 8) {
                if (!this.f194727s) {
                    df2.y yVar = (df2.y) U0(df2.y.class);
                    if (yVar != null) {
                        yVar.Z6();
                        return;
                    }
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                android.view.ViewGroup viewGroup = this.f446856d;
                arrayList.add(viewGroup.getContext().getResources().getString(((mm2.c1) P0(mm2.c1.class)).Y4 ? com.p314xaae8f345.mm.R.C30867xcad56011.e3l : com.p314xaae8f345.mm.R.C30867xcad56011.e_k));
                arrayList2.add(2);
                if (((mm2.c1) P0(mm2.c1.class)).f410358j3 && !((mm2.c1) P0(mm2.c1.class)).Y4) {
                    arrayList.add(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gdu));
                    arrayList2.add(0);
                }
                if (this.f194726r == null) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(viewGroup.getContext(), 1, true);
                    this.f194726r = k0Var;
                    k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i5(this, arrayList, arrayList2);
                    k0Var.f293414s = this.f194728t;
                    k0Var.p(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j5(this));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f194726r;
                if (k0Var2 != null) {
                    k0Var2.v();
                    return;
                }
                return;
            }
            if (ordinal != 27 && ordinal != 28) {
                return;
            }
        }
        K0(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k5 k5Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorClosePlugin", "anchorCloseLive");
        if (!x0()) {
            u1(this.f194724p);
            return;
        }
        df2.te teVar = (df2.te) U0(df2.te.class);
        if (teVar != null) {
            if (teVar.U6()) {
                teVar.f372634g = new df2.re(teVar);
                ((mm2.c1) teVar.m56788xbba4bfc0(mm2.c1.class)).A2 = true;
                teVar.a7();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = teVar.f372632e;
                if (ubVar == null || (k5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k5) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k5.class)) == null) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar2 = teVar.f372632e;
                k5Var.u1(ubVar2 instanceof qo0.c ? (qo0.c) ubVar2 : null);
            }
        }
    }

    public final void u1(qo0.c cVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", true);
        bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_IF_CLOSE_LIVE", true);
        if (cVar != null) {
            cVar.mo46557x60d69242(qo0.b.H, bundle);
        }
        boolean z17 = this.f194727s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8 u8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184132a;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b = 0;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183996d, 1130L);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorFlowStats", "reportSecondaryManualClose but not record live!");
            }
            u8Var.b(S0(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.z.f34666x366c91de, 0, "secondaryManualClose", "0-vBitrate:" + hn0.v.f363975c);
            return;
        }
        if (((mm2.c1) P0(mm2.c1.class)).Y4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b = 0;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183996d, 1140L);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorFlowStats", "reportExternalManualClose but not record live!");
            }
            u8Var.b(S0(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.u.f34954x366c91de, 0, "externalManualClose", "0-vBitrate:" + hn0.v.f363975c);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183996d, 1120L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorFlowStats", "reportAnchorManualClose but not record live!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184137f = c01.id.a();
        u8Var.b(S0(), 1120, 0, "anchorManualClose", "0-vBitrate:" + hn0.v.f363975c);
    }
}
