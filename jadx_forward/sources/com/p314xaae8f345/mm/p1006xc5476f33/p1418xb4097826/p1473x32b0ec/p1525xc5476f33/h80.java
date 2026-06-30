package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class h80 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i80 f194320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.f0 f194321e;

    public h80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i80 i80Var, cm2.f0 f0Var) {
        this.f194320d = i80Var;
        this.f194321e = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bf2.c cVar = bf2.c.f101131a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i80 i80Var = this.f194320d;
        bf2.c.c(cVar, i80Var.f194471e, 2, 7, null, 0, null, 0, 0, null, 0, 1016, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i80Var.f194475i, "close promote");
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            cm2.f0 f0Var = this.f194321e;
            f52Var.set(4, java.lang.Long.valueOf(f0Var.f124918d));
            f52Var.set(0, 7);
            f52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(f0Var.f124875v.mo14344x5f01b1f6()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
            k0Var.mo46557x60d69242(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
