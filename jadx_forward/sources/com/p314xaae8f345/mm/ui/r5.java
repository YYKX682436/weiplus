package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class r5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f291130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.s5 f291131e;

    public r5(com.p314xaae8f345.mm.ui.s5 s5Var, int i17) {
        this.f291131e = s5Var;
        this.f291130d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.s5 s5Var = this.f291131e;
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = s5Var.f291308j;
        c21357x5e7365bb.E = true;
        com.p314xaae8f345.mm.ui.C21370x5ce6d0c6 c21370x5ce6d0c6 = (com.p314xaae8f345.mm.ui.C21370x5ce6d0c6) c21357x5e7365bb.f278189w.h("more_tab_game_recommend");
        int i17 = s5Var.f291303e;
        if (i17 == 3) {
            c21370x5ce6d0c6.V = s5Var.f291308j.m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572034wv);
            c21370x5ce6d0c6.W = com.p314xaae8f345.mm.R.C30861xcebc809e.asx;
            s5Var.f291308j.r1(c21370x5ce6d0c6, 0, 8, 8, false, 8, 8, 8, s5Var.f291299a);
            s5Var.f291308j.n1(s5Var.f291304f, 1, s5Var.f291305g, s5Var.f291306h);
        } else if (i17 == 4) {
            c21370x5ce6d0c6.d0(s5Var.f291307i, -1, android.graphics.Color.parseColor("#8c8c8c"));
            s5Var.f291308j.r1(c21370x5ce6d0c6, 8, 8, 0, true, 8, 8, 8, s5Var.f291299a);
            s5Var.f291308j.n1(s5Var.f291304f, 2, s5Var.f291305g, s5Var.f291306h);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, download entrance image failed, msgId:%d, showType:%d", java.lang.Long.valueOf(s5Var.f291304f), java.lang.Integer.valueOf(s5Var.f291303e));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(858L, 12L, 1L, false);
        if (this.f291130d == 2) {
            g0Var.mo68477x336bdfd8(858L, 14L, 1L, false);
        }
    }
}
