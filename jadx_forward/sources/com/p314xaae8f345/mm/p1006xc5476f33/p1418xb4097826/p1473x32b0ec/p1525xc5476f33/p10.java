package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class p10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 f195348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.y f195349e;

    public p10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 z10Var, cm2.y yVar) {
        this.f195348d = z10Var;
        this.f195349e = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 z10Var = this.f195348d;
        java.lang.String str = z10Var.f196793i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close promote, id:");
        cm2.y yVar = this.f195349e;
        sb6.append(yVar.f124941v.m75945x2fec8307(4));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        bf2.c cVar = bf2.c.f101131a;
        gk2.e eVar = z10Var.f196789e;
        java.lang.String m75945x2fec8307 = yVar.f124941v.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String str2 = m75945x2fec8307;
        r45.ov2 a17 = zl2.t.a(yVar.f124941v);
        bf2.c.c(cVar, eVar, 2, 1, str2, 0, a17 != null ? a17.m75945x2fec8307(1) : null, 0, 0, null, 0, sb1.a.f76732x366c91de, null);
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(4, java.lang.Long.valueOf(yVar.f124918d));
            f52Var.set(0, 1);
            f52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(yVar.f124941v.mo14344x5f01b1f6()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
            k0Var.mo46557x60d69242(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
