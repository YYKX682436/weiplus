package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class fj0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj0 f194096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f194097e;

    public fj0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj0 jj0Var, android.view.ViewGroup viewGroup) {
        this.f194096d = jj0Var;
        this.f194097e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj0 jj0Var = this.f194096d;
        if (jj0Var.f194657w == null) {
            android.content.Context context = this.f194097e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            jj0Var.f194657w = new bl2.k(context, jj0Var.f194656v, jj0Var);
        }
        bl2.k kVar = jj0Var.f194657w;
        if (kVar != null) {
            kVar.w();
        }
        jj0Var.t1();
        r45.rm1 rm1Var = jj0Var.f194651q;
        boolean z17 = false;
        if (rm1Var != null && dk2.q.a(rm1Var)) {
            z17 = true;
        }
        r45.rm1 rm1Var2 = jj0Var.f194651q;
        java.lang.String m75945x2fec8307 = rm1Var2 != null ? rm1Var2.m75945x2fec8307(1) : null;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        jj0Var.u1(2, z17, m75945x2fec8307);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.j3[] j3VarArr = ml2.j3.f409144d;
        r0Var.Kk(1);
        if (((mm2.c1) jj0Var.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) jj0Var.X0(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
            vVar.a();
            vVar.c(2024);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
