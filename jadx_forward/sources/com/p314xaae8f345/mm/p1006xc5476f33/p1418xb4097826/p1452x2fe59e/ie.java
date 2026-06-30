package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class ie implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f188554d;

    public ie(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar) {
        this.f188554d = afVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar = this.f188554d;
        afVar.W = 0;
        afVar.f187794l1 = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", "1003");
        r45.l70 l70Var = afVar.U;
        java.lang.String str2 = "";
        if (l70Var == null || (str = l70Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        hashMap.put("resource_id", str);
        r45.m70 m70Var = afVar.T;
        if (m70Var != null && (m75945x2fec8307 = m70Var.m75945x2fec8307(0)) != null) {
            str2 = m75945x2fec8307;
        }
        hashMap.put("activityId", str2);
        hashMap.put("enter_sence", afVar.P);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.V1, hashMap, afVar.Z, afVar.f187799p0, null, null, false, 112, null);
        afVar.Y6(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
