package df2;

/* loaded from: classes3.dex */
public final class rv implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.sv f312804d;

    public rv(df2.sv svVar) {
        this.f312804d = svVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ta4 e17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveVipPermissionController$setPayBtnInfo$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.A2, null, null, null, null, null, false, 126, null);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        df2.sv svVar = this.f312804d;
        long j17 = currentTimeMillis - svVar.f312908n;
        r0Var.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6466x94846399 c6466x94846399 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6466x94846399();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        c6466x94846399.q(b17);
        c6466x94846399.r("205");
        c6466x94846399.p("205");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        im2.t6 a17 = ml2.s0.a();
        jSONObject.put("is_scan", (a17 == null || !a17.f374097q) ? 0 : 1);
        jSONObject.put("stayTime", java.lang.String.valueOf(j17));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6466x94846399.s(r26.i0.t(jSONObject2, ",", ";", false));
        c6466x94846399.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report22947, contextid = " + c6466x94846399.f138103i + ", page_id = " + c6466x94846399.f138099e + ", commentScene = " + c6466x94846399.f138107m + ", pg_udf_kv = " + c6466x94846399.f138106l);
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        if (nVar != null && (e17 = nVar.e()) != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(e17.m75939xb282bd08(14));
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.intValue();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0 wg0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0) svVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0.class);
                if (wg0Var != null) {
                    wg0Var.u1(true);
                }
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5486xe114820a().e();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveVipPermissionController$setPayBtnInfo$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0 wg0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0) svVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0.class);
        if (wg0Var2 != null) {
            wg0Var2.u1(true);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_member_inlet_source", 9);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String authorFinderUsername = ((mm2.c1) svVar.m56788xbba4bfc0(mm2.c1.class)).f410385o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Kk(context, intent, authorFinderUsername);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveVipPermissionController$setPayBtnInfo$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
