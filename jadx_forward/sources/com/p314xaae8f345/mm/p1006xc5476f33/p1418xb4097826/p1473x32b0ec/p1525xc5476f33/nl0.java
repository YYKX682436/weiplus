package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class nl0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pl0 f195180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.z f195181e;

    public nl0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pl0 pl0Var, cm2.z zVar) {
        this.f195180d = pl0Var;
        this.f195181e = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pl0 pl0Var = this.f195180d;
        java.lang.String str = pl0Var.f195445i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close promote, data:");
        cm2.z zVar = this.f195181e;
        sb6.append(pm0.b0.b(zVar.f124942v));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        bf2.c.c(bf2.c.f101131a, pl0Var.f195441e, 2, 3, null, 0, null, 0, 0, null, 0, 1016, null);
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(4, java.lang.Long.valueOf(zVar.f124918d));
            f52Var.set(0, 3);
            f52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(zVar.f124942v.mo14344x5f01b1f6()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
            k0Var.mo46557x60d69242(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
