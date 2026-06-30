package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r f195220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.h0 f195221e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r rVar, cm2.h0 h0Var) {
        this.f195220d = rVar;
        this.f195221e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r rVar = this.f195220d;
        java.lang.String str = rVar.f195598i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close promote, id:");
        cm2.h0 h0Var = this.f195221e;
        sb6.append(h0Var.f124881v.m75942xfb822ef2(0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        bf2.c cVar = bf2.c.f101131a;
        gk2.e eVar = rVar.f195594e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        bf2.c.c(cVar, eVar, 2, 4, pm0.v.u(h0Var.f124882w), h0Var.D, null, 0, 0, null, 0, 992, null);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.f4 f4Var = ml2.f4.f408972o;
        java.lang.String u17 = pm0.v.u(h0Var.f124882w);
        r45.n3 n3Var = h0Var.f124883x;
        java.lang.String str2 = (n3Var == null || (m75945x2fec8307 = n3Var.m75945x2fec8307(3)) == null) ? "" : m75945x2fec8307;
        java.lang.String u18 = pm0.v.u(h0Var.f124882w);
        java.lang.String str3 = h0Var.C;
        ml2.r0.Dj(r0Var, f4Var, null, u17, str2, u18, str3 == null ? "" : str3, h0Var.D, h0Var.E, null, null, null, null, false, null, 16128, null);
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(4, java.lang.Long.valueOf(h0Var.f124918d));
            f52Var.set(0, 4);
            f52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(h0Var.f124881v.mo14344x5f01b1f6()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
            k0Var.mo46557x60d69242(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
