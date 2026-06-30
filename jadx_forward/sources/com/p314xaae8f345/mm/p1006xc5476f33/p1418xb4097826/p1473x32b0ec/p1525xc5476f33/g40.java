package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class g40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h40 f194165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.c0 f194166e;

    public g40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h40 h40Var, cm2.c0 c0Var) {
        this.f194165d = h40Var;
        this.f194166e = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h40 h40Var = this.f194165d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h40Var.f194305i, "close promote");
        bf2.c cVar = bf2.c.f101131a;
        gk2.e eVar = h40Var.f194301e;
        zl2.r4 r4Var = zl2.r4.f555483a;
        cm2.c0 c0Var = this.f194166e;
        bf2.c.c(cVar, eVar, 2, 15, pm0.v.u(r4Var.c0(c0Var.f124867v)), 0, null, 0, 1, null, 0, nd1.y0.f72985x366c91de, null);
        qo0.c cVar2 = h40Var.f194302f;
        qo0.b bVar = qo0.b.O2;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.f52 f52Var = new r45.f52();
        f52Var.set(4, java.lang.Long.valueOf(c0Var.f124918d));
        f52Var.set(0, 20);
        f52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(c0Var.f124867v.mo14344x5f01b1f6()));
        bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
        cVar2.mo46557x60d69242(bVar, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
