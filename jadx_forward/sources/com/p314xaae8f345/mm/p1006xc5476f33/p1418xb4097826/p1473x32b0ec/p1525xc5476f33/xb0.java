package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class xb0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 f196601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.mb0 f196602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f196603f;

    public xb0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var, bw5.mb0 mb0Var, cm2.g0 g0Var) {
        this.f196601d = dc0Var;
        this.f196602e = mb0Var;
        this.f196603f = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var = this.f196601d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dc0Var.f193791h, "close promote");
        bf2.c cVar = bf2.c.f101131a;
        gk2.e eVar = dc0Var.f193788e;
        bw5.mb0 mb0Var = this.f196602e;
        java.lang.String b17 = mb0Var != null ? mb0Var.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        bf2.c.c(cVar, eVar, 2, 12, b17, 0, null, 0, 1, null, 0, nd1.y0.f72985x366c91de, null);
        qo0.c cVar2 = dc0Var.f193789f;
        qo0.b bVar = qo0.b.O2;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.f52 f52Var = new r45.f52();
        cm2.g0 g0Var = this.f196603f;
        f52Var.set(4, java.lang.Long.valueOf(g0Var.f124918d));
        f52Var.set(0, 19);
        f52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(g0Var.f124879v.mo14344x5f01b1f6()));
        bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
        cVar2.mo46557x60d69242(bVar, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
