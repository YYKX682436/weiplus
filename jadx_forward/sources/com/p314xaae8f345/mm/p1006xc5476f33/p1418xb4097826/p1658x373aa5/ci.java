package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class ci implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei f213311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f213312e;

    public ci(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei eiVar, android.widget.TextView textView) {
        this.f213311d = eiVar;
        this.f213312e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List list = this.f213311d.f213548j;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.rw4 rw4Var = (r45.rw4) it.next();
            r45.qw4 qw4Var = new r45.qw4();
            qw4Var.set(0, java.lang.Integer.valueOf(rw4Var.m75939xb282bd08(0)));
            qw4Var.set(1, rw4Var.m75945x2fec8307(2));
            arrayList2.add(qw4Var);
            java.lang.String m75945x2fec8307 = rw4Var.m75945x2fec8307(1);
            if (m75945x2fec8307 != null) {
                arrayList3.add(m75945x2fec8307);
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5469x8288cd99 c5469x8288cd99 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5469x8288cd99();
        c5469x8288cd99.f135807g.f88080a = this.f213311d.f213541c;
        c5469x8288cd99.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei eiVar = this.f213311d;
        long j17 = eiVar.f213541c;
        java.lang.String str = eiVar.f213542d;
        android.content.Context context = eiVar.f213540b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        new db2.j0(j17, str, "", 8, 1, nyVar != null ? nyVar.V6() : null, java.lang.Boolean.FALSE, arrayList2).l();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.bi biVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.bi(this.f213311d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(biVar, 200L, false);
        jz5.l[] lVarArr = new jz5.l[1];
        java.lang.String g07 = kz5.n0.g0(arrayList3, "|", null, null, 0, null, null, 62, null);
        if (g07.length() == 0) {
            g07 = "";
        }
        lVarArr[0] = new jz5.l("click_reason", g07);
        java.util.Map l17 = kz5.c1.l(lVarArr);
        java.util.Map map = this.f213311d.f213543e;
        if (map != null) {
            l17.putAll(map);
        }
        hc2.v0.d(this.f213312e, "product_feed_feedback_finish", "view_clk", false, l17, null, 20, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
