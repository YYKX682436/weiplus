package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class xg implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f192598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f192599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f192600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f192601g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f192602h;

    public xg(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, zy2.i5 i5Var, zy2.i5 i5Var2) {
        this.f192598d = h0Var;
        this.f192599e = i17;
        this.f192600f = abstractActivityC21394xb3d2c0cf;
        this.f192601g = i5Var;
        this.f192602h = i5Var2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        gm0.j1.d().q(6276, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f192598d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) h0Var.f391656d;
        if ((u3Var2 != null && u3Var2.isShowing()) && (u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) h0Var.f391656d) != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f192600f;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh jhVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188634a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d = 0;
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wg(i18, abstractActivityC21394xb3d2c0cf, this.f192602h));
            return;
        }
        java.lang.String string = this.f192599e == 1 ? abstractActivityC21394xb3d2c0cf.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eb9) : abstractActivityC21394xb3d2c0cf.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eb7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        db5.t7.m(abstractActivityC21394xb3d2c0cf.mo55332x76847179(), string);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh jhVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188634a;
        tx2.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188635b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188635b = null;
        if (i0Var != null) {
            i0Var.a();
        }
        this.f192601g.a(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d));
    }
}
