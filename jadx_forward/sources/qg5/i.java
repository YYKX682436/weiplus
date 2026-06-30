package qg5;

/* loaded from: classes8.dex */
public final class i implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.p f444545d;

    public i(qg5.p pVar) {
        this.f444545d = pVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        ct.k3 k3Var = (ct.k3) ((jz5.n) this.f444545d.f444658g).mo141623x754a37bb();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f444545d.b());
        qg5.e3 e3Var = (qg5.e3) k3Var;
        if (valueOf == null) {
            e3Var.getClass();
            return;
        }
        e3Var.getClass();
        qg5.r rVar = (qg5.r) ((qg5.l0) ((ct.q2) i95.n0.c(ct.q2.class))).f444591t.get();
        java.util.List list = rVar == null ? kz5.p0.f395529d : rVar.f444685c;
        qg5.r rVar2 = (qg5.r) ((qg5.l0) ((ct.q2) i95.n0.c(ct.q2.class))).f444591t.get();
        if (rVar2 == null || (z3Var = rVar2.f444684b) == null) {
            z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        }
        java.lang.String d17 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        java.util.Map mj6 = e3Var.mj(d17, "journey_analyze");
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("share_type", 8);
        qg5.l0 l0Var = (qg5.l0) ((ct.q2) i95.n0.c(ct.q2.class));
        synchronized (l0Var.f444593v) {
            if (l0Var.f444594w == null) {
                qg5.r rVar3 = (qg5.r) l0Var.f444591t.get();
                java.lang.Iterable iterable = rVar3 == null ? kz5.p0.f395529d : rVar3.f444685c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = ((c01.ob) it.next()).f118906a;
                    if (f9Var != null) {
                        arrayList.add(f9Var);
                    }
                }
                l0Var.f444594w = kz5.n0.g0(arrayList, "#", null, null, 0, null, tb5.h0.f498586d, 30, null);
            }
        }
        java.lang.String str = l0Var.f444594w;
        if (str == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("selected_msg_list", str);
        lVarArr[2] = new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(list.size()));
        java.util.Map m17 = kz5.c1.m(mj6, kz5.c1.k(lVarArr));
        e3Var.sj("journey_analyze", m17);
        e3Var.rj("journey_analyze", kz5.b1.e(new jz5.l("yuanbao_msg_analytics_view_type", valueOf.booleanValue() ? "2" : "1")));
        ((cy1.a) e3Var.ij()).Hj("multi_select_record_preview", "view_exp", kz5.c1.m(m17, kz5.b1.e(new jz5.l("yuanbao_msg_analytics_view_type", java.lang.Integer.valueOf(valueOf.booleanValue() ? 2 : 1)))), 35480);
    }
}
