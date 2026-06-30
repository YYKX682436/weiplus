package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class v6 extends xt2.m6 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f201572d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f201573e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f201574f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f201575g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f201576h;

    /* renamed from: i, reason: collision with root package name */
    public pk2.o9 f201577i;

    public v6(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f201572d = root;
        this.f201573e = basePlugin;
        this.f201574f = true;
        this.f201575g = root.findViewById(com.p314xaae8f345.mm.R.id.jrm);
        this.f201576h = "anchorlive.bottom.tools";
        root.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t6(this));
        ll2.e eVar = ll2.e.f400666a;
        java.lang.Object context = root.getContext();
        eVar.k(context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, "anchorlive.bottom.tools", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u6(this));
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f201572d.findViewById(com.p314xaae8f345.mm.R.id.jrj);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f201572d;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f201572d.findViewById(com.p314xaae8f345.mm.R.id.jrl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final void k(r45.rq1 rq1Var) {
        pk2.d9 d9Var;
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f409533x0, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        if (this.f201577i == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 U0 = this.f201573e.U0(df2.ox.class);
            android.content.Context context = this.f201572d.getContext();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            if (U0 != null && abstractActivityC21394xb3d2c0cf != null) {
                pk2.o9 o9Var = new pk2.o9((df2.ox) U0, abstractActivityC21394xb3d2c0cf);
                this.f201577i = o9Var;
                qk2.a aVar = new qk2.a(o9Var, null);
                pk2.d9 d9Var2 = o9Var.f437615f;
                if (d9Var2 != null) {
                    pk2.o9 o9Var2 = d9Var2.f437213w;
                    o9Var2.f437619h = aVar;
                    pk2.t9 t9Var = pk2.t9.f437802a;
                    java.util.List menuConfigs = d9Var2.f437206p;
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context2 = o9Var2.f437611d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuConfigs, "menuConfigs");
                    ((java.util.ArrayList) menuConfigs).clear();
                    t9Var.a(menuConfigs, aVar, 1, kz5.c0.i(new pk2.e8(o9Var2, 0), new pk2.v2(o9Var2, 0), new pk2.n2(o9Var2, 0), new pk2.j1(o9Var2, 0), new pk2.o2(o9Var2, 0), new pk2.q(o9Var2, 0)), null, "");
                    java.util.List i17 = kz5.c0.i(new pk2.r(o9Var2, 0), new pk2.t(o9Var2, 0, o9Var2.X, 5), new pk2.f4(o9Var2, 0), new pk2.l2(o9Var2, 0), new pk2.s1(o9Var2, 0), new pk2.t1(o9Var2, 0));
                    java.lang.String string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575297oz2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    t9Var.a(menuConfigs, aVar, 2, i17, null, string);
                    java.util.List i18 = kz5.c0.i(new pk2.t(o9Var2, 0, o9Var2.f437628l0, 24), new pk2.t(o9Var2, 0, o9Var2.Z, 18), new pk2.t(o9Var2, 0, o9Var2.Y, 21), new pk2.t(o9Var2, 0, o9Var2.W, 12), new pk2.g0(o9Var2, 0), new pk2.t(o9Var2, 0, o9Var2.f437606a0, 11), new pk2.t(o9Var2, 0, o9Var2.f437608b0, 16), new pk2.t(o9Var2, 0, o9Var2.f437610c0, 6), new pk2.t(o9Var2, 0, o9Var2.f437612d0, 8), new pk2.p2(o9Var2, 0), new pk2.t(o9Var2, 0, o9Var2.P, 2), new pk2.z0(o9Var2, 0), new pk2.u4(o9Var2, 0), new pk2.e3(o9Var2, 0), new pk2.r2(o9Var2, 0));
                    java.lang.String string2 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575300oz5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    t9Var.a(menuConfigs, aVar, 3, i18, null, string2);
                    java.util.List i19 = kz5.c0.i(new pk2.x1(o9Var2, 0), new pk2.c3(o9Var2, 0), new pk2.e0(o9Var2, 0), new pk2.c1(o9Var2, 0));
                    java.lang.String string3 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozg);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                    t9Var.a(menuConfigs, aVar, 4, i19, null, string3);
                    if (zl2.q4.f555466a.E() && ((java.lang.Number) ae2.in.f85221a.T().r()).intValue() == 1) {
                        t9Var.a(menuConfigs, aVar, 5, kz5.c0.i(new pk2.u9(o9Var2, 0), new pk2.r4(o9Var2, 0), new pk2.q4(o9Var2, 0)), null, "调试(内部)");
                    }
                    aVar.m();
                }
            }
        }
        pk2.o9 o9Var3 = this.f201577i;
        if (o9Var3 != null) {
            o9Var3.f437621i = rq1Var;
        }
        if (o9Var3 != null && (d9Var = o9Var3.f437615f) != null) {
            d9Var.e();
        }
        if (this.f201575g.getVisibility() == 0) {
            ll2.e.b(ll2.e.f400666a, this.f201576h, false, false, 6, null);
        }
    }
}
