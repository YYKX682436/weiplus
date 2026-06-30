package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class xe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f192591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f192592e;

    public xe(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f192591d = afVar;
        this.f192592e = c19786x6a1e2862;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showTicket$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar = this.f192591d;
        android.app.Activity m80379x76847179 = afVar.m80379x76847179();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo = this.f192592e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpInfo, "$jumpInfo");
        c61.yb.nd(ybVar, m80379x76847179, jumpInfo, null, 0, null, 24, null);
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
        i95.m c18 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb.T8((zy2.zb) c18, ml2.t1.X1, hashMap, afVar.Z, "311", null, null, false, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showTicket$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
