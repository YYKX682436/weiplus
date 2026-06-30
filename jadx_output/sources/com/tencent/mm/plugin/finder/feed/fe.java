package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class fe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f106739d;

    public fe(com.tencent.mm.plugin.finder.feed.af afVar) {
        this.f106739d = afVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.af afVar = this.f106739d;
        com.tencent.mm.plugin.finder.feed.af.O6(afVar, true);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", "1003");
        r45.m70 m70Var = afVar.T;
        java.lang.String str2 = "";
        if (m70Var == null || (str = m70Var.getString(0)) == null) {
            str = "";
        }
        hashMap.put("activityId", str);
        r45.l70 l70Var = afVar.U;
        if (l70Var != null && (string = l70Var.getString(0)) != null) {
            str2 = string;
        }
        hashMap.put("resource_id", str2);
        hashMap.put("enter_sence", afVar.P);
        hashMap.put("share_content_type", "2");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.W1, hashMap, afVar.Z, afVar.f106266p0, null, null, false, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
