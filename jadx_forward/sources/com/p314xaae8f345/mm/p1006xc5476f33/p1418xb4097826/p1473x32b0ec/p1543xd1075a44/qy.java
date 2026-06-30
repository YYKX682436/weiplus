package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class qy extends xt2.m6 implements jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f201091d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f201092e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f201093f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f201094g;

    public qy(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f201091d = root;
        this.f201092e = statusMonitor;
        this.f201093f = basePlugin;
        root.setVisibility(8);
    }

    @Override // jf2.l
    public void F(int i17) {
        k();
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f201091d;
        if (viewGroup.getVisibility() != 0) {
            k();
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80130xc2db942c), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f573288e50));
    }

    @Override // jf2.m
    public void e(int i17) {
        this.f201091d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f201091d.findViewById(com.p314xaae8f345.mm.R.id.gp8);
    }

    @Override // jf2.o
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var;
        this.f201091d.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 ai0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0) this.f201093f.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0.class);
        if (ai0Var == null || (m10Var = ai0Var.f193424s) == null) {
            return;
        }
        m10Var.k(false);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f201091d;
    }

    @Override // jf2.o
    public boolean i() {
        java.lang.Boolean bool;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f201093f;
        if (zl2.r4.F1(lVar.S0()) || (bool = (java.lang.Boolean) ((mm2.c1) lVar.P0(mm2.c1.class)).f410338f6.mo3195x754a37bb()) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f201091d.findViewById(com.p314xaae8f345.mm.R.id.gp9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final void k() {
        r45.fr1 fr1Var = ((mm2.c1) this.f201093f.P0(mm2.c1.class)).M2;
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Uj((ml2.r0) c17, 1, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 11;
    }
}
