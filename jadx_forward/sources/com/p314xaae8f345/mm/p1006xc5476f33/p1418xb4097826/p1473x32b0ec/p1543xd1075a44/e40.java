package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class e40 extends xt2.m6 implements android.view.View.OnClickListener, jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f199757d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f199758e;

    public e40(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f199757d = root;
        this.f199758e = basePlugin;
        root.setOnClickListener(this);
    }

    @Override // jf2.l
    public void F(int i17) {
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.x4[] x4VarArr = ml2.x4.f409767d;
        r0Var.Mk(java.lang.String.valueOf(1));
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f199757d;
        if (viewGroup.getVisibility() != 0) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.x4[] x4VarArr = ml2.x4.f409767d;
            r0Var.Mk(java.lang.String.valueOf(1));
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80353xfee9da14), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.miu));
    }

    @Override // jf2.m
    public void e(int i17) {
        k();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f199757d.findViewById(com.p314xaae8f345.mm.R.id.fqk);
    }

    @Override // jf2.o
    public void g() {
        this.f199757d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f199757d;
    }

    @Override // jf2.o
    public boolean i() {
        return (((mm2.c1) this.f199758e.P0(mm2.c1.class)).T || (((mm2.n0) this.f199758e.P0(mm2.n0.class)).f410806r) || !((mm2.c1) this.f199758e.P0(mm2.c1.class)).g8()) ? false : true;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f199757d.findViewById(com.p314xaae8f345.mm.R.id.fql);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 x80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80) this.f199758e.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80.class);
        if (x80Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80.A1(x80Var, java.lang.Boolean.TRUE, null, 2, null);
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.x4[] x4VarArr = ml2.x4.f409767d;
        r0Var.Mk(java.lang.String.valueOf(2));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorVrEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.p_k) {
            k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorVrEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 17;
    }
}
