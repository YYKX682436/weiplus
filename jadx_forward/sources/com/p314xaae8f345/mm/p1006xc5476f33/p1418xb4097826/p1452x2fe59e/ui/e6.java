package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class e6 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 f191503d;

    public e6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var) {
        this.f191503d = p6Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var = this.f191503d;
        p6Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 a6Var = p6Var.f191932e;
        intent.putExtra("KEY_FAV_QUERY", a6Var.f191193q);
        intent.putExtra("KEY_REQUEST_ID", a6Var.f191194r);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(a6Var.f191195s);
        intent.putExtra("KEY_TAGS", arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        w04.l lVar = w04.l.INSTANCE;
        java.util.ArrayList arrayList2 = a6Var.f191196t;
        int i18 = p6Var.f191934g;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = p6Var.f191931d;
        if (i18 == 2) {
            lVar.b(540999706);
            int a07 = i17 - ((in5.n0) adapter).a0();
            if (a07 < 0 || a07 >= arrayList2.size()) {
                return;
            }
            java.lang.Object obj = arrayList2.get(a07);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            so2.j5 j5Var = (so2.j5) obj;
            if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.InteractionSearchViewCallback", "onClick " + a07 + " id:" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59251x5db1b11() + ", pos:" + a07);
                a6Var.f(i17, j5Var.mo2128x1ed62e84());
                a6Var.g(intent, a07);
                iyVar.c(activityC21401x6ce6f73f, intent);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).fj(activityC21401x6ce6f73f, intent, 10001);
                return;
            }
            return;
        }
        lVar.b(540999705);
        int a08 = i17 - ((in5.n0) adapter).a0();
        if (a08 < 0 || a08 >= arrayList2.size()) {
            return;
        }
        java.lang.Object obj2 = arrayList2.get(a08);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        so2.j5 j5Var2 = (so2.j5) obj2;
        if (j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            a6Var.f(i17, j5Var2.mo2128x1ed62e84());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.InteractionSearchViewCallback", "onClick " + a08 + " id:" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2).getFeedObject().m59251x5db1b11() + ", pos:" + a08);
            a6Var.g(intent, a08);
            iyVar.c(activityC21401x6ce6f73f, intent);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            i0Var.Dj(context, intent);
        }
    }
}
