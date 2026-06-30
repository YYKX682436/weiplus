package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class oh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qh f195286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.m70 f195287f;

    public oh(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qh qhVar, r45.m70 m70Var) {
        this.f195285d = str;
        this.f195286e = qhVar;
        this.f195287f = m70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveConcertTicketPlugin$tryToShowTicket$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).jk(2, this.f195285d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qh qhVar = this.f195286e;
        ((mm2.d1) qhVar.P0(mm2.d1.class)).f410484f = this.f195287f;
        if (qhVar.x0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.s1(this.f195286e, "PORTRAIT_ACTION_GOTO_TICKET", null, 0, 6, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qh.t1(qhVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveConcertTicketPlugin$tryToShowTicket$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
