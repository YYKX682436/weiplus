package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class xe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f111058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f111059e;

    public xe(com.tencent.mm.plugin.finder.feed.af afVar, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f111058d = afVar;
        this.f111059e = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showTicket$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        com.tencent.mm.plugin.finder.feed.af afVar = this.f111058d;
        android.app.Activity context = afVar.getContext();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo = this.f111059e;
        kotlin.jvm.internal.o.f(jumpInfo, "$jumpInfo");
        c61.yb.nd(ybVar, context, jumpInfo, null, 0, null, 24, null);
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
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.T8((zy2.zb) c18, ml2.t1.X1, hashMap, afVar.Z, "311", null, null, false, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showTicket$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
