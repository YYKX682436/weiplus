package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class oy implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f200869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qy f200870e;

    public oy(r45.fr1 fr1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qy qyVar) {
        this.f200869d = fr1Var;
        this.f200870e = qyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameEntranceWidget$mount$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        r45.fr1 fr1Var = this.f200869d;
        ml2.r0.Uj(r0Var, 2, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qy qyVar = this.f200870e;
        if (((mm2.c1) qyVar.f201093f.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) qyVar.f201093f.X0(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
            vVar.a();
            vVar.c(2021);
        }
        qyVar.getClass();
        qo0.c.a(qyVar.f201092e, qo0.b.C2, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameEntranceWidget$mount$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
