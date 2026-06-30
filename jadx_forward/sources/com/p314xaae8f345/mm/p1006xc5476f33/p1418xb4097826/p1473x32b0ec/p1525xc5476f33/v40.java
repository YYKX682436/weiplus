package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class v40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 f196191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.d0 f196192e;

    public v40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 z40Var, cm2.d0 d0Var) {
        this.f196191d = z40Var;
        this.f196192e = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f196191d.f196818h, "close promote");
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            cm2.d0 d0Var = this.f196192e;
            f52Var.set(4, java.lang.Long.valueOf(d0Var.f124918d));
            f52Var.set(0, 13);
            f52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(d0Var.f124868v.mo14344x5f01b1f6()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
            bundle.putBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_VISITOR_CLICK_CLOSE", true);
            k0Var.mo46557x60d69242(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
