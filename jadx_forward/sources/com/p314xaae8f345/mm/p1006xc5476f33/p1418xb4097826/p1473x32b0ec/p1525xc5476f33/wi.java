package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wi extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14317x707a09f7 f196473p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f196474q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f196475r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f196476s;

    /* renamed from: t, reason: collision with root package name */
    public ik2.e f196477t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f196478u;

    /* renamed from: v, reason: collision with root package name */
    public int f196479v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f196480w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f196481x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14317x707a09f7 gameInfoView, qo0.c statusMonitor) {
        super(gameInfoView, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameInfoView, "gameInfoView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196473p = gameInfoView;
        this.f196474q = "MicroMsg.FinderLiveGameInfoPlugin";
        this.f196475r = true;
        this.f196476s = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public void I0() {
        hq0.e0 e0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f196474q, "pause");
        ik2.e eVar = this.f196473p.surfaceMgr;
        if (eVar != null && (e0Var = eVar.f373420c) != null) {
            e0Var.f();
        }
        this.f196480w = true;
    }

    @Override // qo0.a
    public void J0() {
        hq0.e0 e0Var;
        ik2.e eVar = this.f196473p.surfaceMgr;
        if (eVar != null && (e0Var = eVar.f373420c) != null) {
            e0Var.j();
        }
        this.f196480w = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (((mm2.c1) P0(mm2.c1.class)).a8() || i17 != 0) {
            super.K0(i17);
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) ((je2.n) P0(je2.n.class)).f380782m).e(java.lang.Boolean.valueOf(i17 == 0));
        } else {
            dk2.xf W0 = W0();
            if (W0 != null) {
                ((dk2.r4) W0).n(this.f196473p, i17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            android.view.View view = this.f196478u;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                v1(iArr[1], view, 0);
                return;
            }
            return;
        }
        if (ordinal == 123) {
            t1();
        } else if (ordinal == 210) {
            u1(true);
        } else {
            if (ordinal != 211) {
                return;
            }
            u1(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f196474q, "unMount");
        super.O0();
        w1();
        this.f196473p.f197448v = false;
        ik2.e eVar = this.f196477t;
        if (eVar != null) {
            eVar.b();
        }
        this.f196478u = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        r45.uq1 uq1Var = ((mm2.c1) P0(mm2.c1.class)).Q2;
        return !(uq1Var != null && uq1Var.m75939xb282bd08(0) == 1) || x0();
    }

    public final void t1() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_show_game_info_view_android, 1);
        if (this.f196476s) {
            this.f196476s = false;
            if (Ni != 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1740, 0);
            }
        }
        java.lang.String str = this.f196474q;
        if (Ni == 0) {
            K0(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "show_game_info_view is 0, hide gameInfo entrance");
            return;
        }
        if (x0()) {
            K0(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "now not support landscape, hide gameInfo entrance");
            return;
        }
        if (this.f196480w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "paused, return");
            return;
        }
        r45.uq1 uq1Var = ((mm2.c1) P0(mm2.c1.class)).Q2;
        if (uq1Var == null) {
            K0(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "liveGameData is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1740, 5);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "liveGameData visibility:%d", java.lang.Integer.valueOf(uq1Var.m75939xb282bd08(0)));
        ik2.e eVar = this.f196477t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14317x707a09f7 c14317x707a09f7 = this.f196473p;
        c14317x707a09f7.m57332x9dd36c2d(eVar);
        if (uq1Var.m75939xb282bd08(0) == 0) {
            K0(8);
            return;
        }
        if (w0() != 0) {
            K0(0);
            u1(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "show game data");
            c14317x707a09f7.m57333x6843a7d((mm2.c1) S0().a(mm2.c1.class));
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = uq1Var.m75934xbce7f2f(1);
        java.lang.String h17 = m75934xbce7f2f != null ? m75934xbce7f2f.h(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) : null;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14317x707a09f7.f197447u, h17) && h17 != null) {
            c14317x707a09f7.f197447u = h17;
            c14317x707a09f7.g(h17);
        }
        if (this.f196475r) {
            oe0.t tVar = (oe0.t) i95.n0.c(oe0.t.class);
            ((oe0.t) i95.n0.c(oe0.t.class)).getClass();
            ((ne0.r) tVar).getClass();
            yg4.a.f543861a.b("portrait_game_outfits_data_available");
            this.f196475r = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1740, 10);
        }
    }

    public final void u1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14317x707a09f7 c14317x707a09f7 = this.f196473p;
        android.view.ViewGroup.LayoutParams layoutParams = c14317x707a09f7.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        android.view.ViewGroup viewGroup = this.f446856d;
        if (z17) {
            layoutParams2.bottomMargin = viewGroup.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br);
            c14317x707a09f7.m57332x9dd36c2d(this.f196477t);
            c14317x707a09f7.m57333x6843a7d((mm2.c1) S0().a(mm2.c1.class));
        } else {
            layoutParams2.bottomMargin = viewGroup.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        }
        c14317x707a09f7.setLayoutParams(layoutParams2);
    }

    public final void v1(int i17, android.view.View preview, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preview, "preview");
        if (x0()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14317x707a09f7 c14317x707a09f7 = this.f196473p;
        android.view.ViewGroup.LayoutParams layoutParams = c14317x707a09f7.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        if (i18 > 0) {
            layoutParams2.topMargin = i17 + i18;
            this.f196479v = i18;
        } else {
            int i19 = this.f196479v;
            if (i19 > 0) {
                layoutParams2.topMargin = i19 + i17;
            } else {
                layoutParams2.topMargin = preview.getHeight() + i17;
            }
        }
        c14317x707a09f7.setLayoutParams(layoutParams2);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(preview.getHeight()), java.lang.Integer.valueOf(layoutParams2.topMargin), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)};
        java.lang.String str = this.f196474q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "y:%d, preview.height:%d, topMargin:%d， topMarginPreviewParent:%d, previewHeight:%d", objArr);
        if (this.f196478u == null) {
            this.f196478u = preview;
        }
        w1();
        this.f196481x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vi(this);
        c14317x707a09f7.getViewTreeObserver().addOnGlobalLayoutListener(this.f196481x);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "gameInfoLayoutListener:" + this.f196481x + " attach");
    }

    public final void w1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f196474q, "gameInfoLayoutListener:" + this.f196481x + " deAttach");
        android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f196481x;
        if (onGlobalLayoutListener != null) {
            this.f196473p.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.f196481x = null;
    }
}
