package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class z30 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f196811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40 f196812e;

    public z30(cm2.b0 b0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40 c40Var) {
        this.f196811d = b0Var;
        this.f196812e = c40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOtherBubble$refreshView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cm2.b0 b0Var = this.f196811d;
        java.lang.Integer g17 = b0Var.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40 c40Var = this.f196812e;
        if (g17 != null) {
            int intValue = g17.intValue();
            bf2.c cVar = bf2.c.f101131a;
            gk2.e eVar = c40Var.f193642e;
            java.lang.String m76501xf2fd2296 = b0Var.f124864v.m76501xf2fd2296();
            if (m76501xf2fd2296 == null) {
                m76501xf2fd2296 = "";
            }
            bf2.c.c(cVar, eVar, 2, intValue, m76501xf2fd2296, 0, null, 0, 0, null, 0, 1008, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c40Var.f193645h, "close promote");
        qo0.c cVar2 = c40Var.f193643f;
        qo0.b bVar = qo0.b.O2;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.f52 f52Var = new r45.f52();
        f52Var.set(4, java.lang.Long.valueOf(b0Var.f124918d));
        f52Var.set(0, java.lang.Integer.valueOf(b0Var.f124865w));
        f52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(b0Var.f124864v.mo14344x5f01b1f6()));
        bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
        cVar2.mo46557x60d69242(bVar, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOtherBubble$refreshView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
