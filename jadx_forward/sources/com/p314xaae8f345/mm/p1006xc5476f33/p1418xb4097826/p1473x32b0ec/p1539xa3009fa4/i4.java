package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k4 f198675d;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k4 k4Var) {
        this.f198675d = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveGiftWallTopFirstDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.Z1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k4 k4Var = this.f198675d;
        r45.kv1 kv1Var = k4Var.f198722h;
        if (kv1Var == null || (str = kv1Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        jSONObject.put("gift_id", str);
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k4Var.f198723i, "[modSwitch]");
        r45.hx0 e17 = ek2.r1.f335057u.e(true);
        gk2.e eVar = dk2.ef.I;
        long m75942xfb822ef2 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
        gk2.e eVar2 = dk2.ef.I;
        ek2.r1 r1Var = new ek2.r1(m75942xfb822ef2, eVar2 != null ? ((mm2.e1) eVar2.a(mm2.e1.class)).f410516m : 0L, 1, e17);
        az2.j.u(r1Var, k4Var.f199914d, null, 0L, 6, null);
        r1Var.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.j4(k4Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveGiftWallTopFirstDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
