package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class vy implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz f201642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201643e;

    public vy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz dzVar, android.content.Context context) {
        this.f201642d = dzVar;
        this.f201643e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage$getView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz dzVar = this.f201642d;
        if (dzVar.f199710p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = dzVar.f199713s;
            if (lVar != null) {
                android.content.Context context = this.f201643e;
                ke2.u uVar = new ke2.u(((mm2.e1) lVar.P0(mm2.e1.class)).f410516m, ((mm2.e1) lVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f410518o), ((mm2.e1) lVar.P0(mm2.e1.class)).f410525v, 0, null, false, 112, null);
                az2.j.u(uVar, context, null, 0L, 6, null);
                uVar.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uy(context, dzVar));
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz.i(dzVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage$getView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
