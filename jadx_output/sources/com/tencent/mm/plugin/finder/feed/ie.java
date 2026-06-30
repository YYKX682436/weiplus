package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ie implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f107021d;

    public ie(com.tencent.mm.plugin.finder.feed.af afVar) {
        this.f107021d = afVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.af afVar = this.f107021d;
        afVar.W = 0;
        afVar.f106261l1 = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", "1003");
        r45.l70 l70Var = afVar.U;
        java.lang.String str2 = "";
        if (l70Var == null || (str = l70Var.getString(0)) == null) {
            str = "";
        }
        hashMap.put("resource_id", str);
        r45.m70 m70Var = afVar.T;
        if (m70Var != null && (string = m70Var.getString(0)) != null) {
            str2 = string;
        }
        hashMap.put("activityId", str2);
        hashMap.put("enter_sence", afVar.P);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.V1, hashMap, afVar.Z, afVar.f106266p0, null, null, false, 112, null);
        afVar.Y6(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
