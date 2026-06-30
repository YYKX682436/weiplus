package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes9.dex */
public final class k1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f288421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 f288422e;

    public k1(java.util.ArrayList arrayList, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 q1Var) {
        this.f288421d = arrayList;
        this.f288422e = q1Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        boolean z17;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f288421d;
        if (i17 >= arrayList.size() || i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecentForwardListDataItem", "??? position:" + i17 + ", size:" + arrayList.size());
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.w8 w8Var = ((com.p314xaae8f345.mm.ui.p2690x38b72420.v8) arrayList.get(i17)).f288753d;
        int i18 = ((com.p314xaae8f345.mm.ui.p2690x38b72420.v8) arrayList.get(i17)).f288754e;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 q1Var = this.f288422e;
        if (i18 == 1) {
            q1Var.i(!w8Var.f288768e);
            if (w8Var.f288768e) {
                com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.t();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecentForwardListDataItem", "onItemClick() called with: adapter = " + adapter + ", view = " + view + ", position = " + i17 + ", holder = " + holder + ", isDelete=" + w8Var.f288768e + ", isMulti=" + q1Var.f288369e);
        boolean z18 = w8Var.f288768e;
        java.lang.String str = w8Var.f288764a;
        if (z18) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1.g(q1Var, str, i17);
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.r(i17, str);
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f1 f1Var = q1Var.D;
        if (f1Var != null) {
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = ((dk5.w3) ((com.p314xaae8f345.mm.ui.p2690x38b72420.m6) f1Var).f288558a.C).f316509a;
            if (activityC22571x51759e93.E1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "ClickUser=%s", str);
                if (!activityC22571x51759e93.F1.contains(str) && activityC22571x51759e93.c8(true)) {
                    activityC22571x51759e93.Y6();
                    z17 = false;
                    if (z17 && q1Var.f288369e) {
                        w8Var.f288766c = !w8Var.f288766c;
                    }
                    adapter.m8147xed6e4d18(i17);
                }
                activityC22571x51759e93.V7(str, activityC22571x51759e93.f287979d.getHeaderViewsCount());
                activityC22571x51759e93.e8();
                activityC22571x51759e93.b7().notifyDataSetChanged();
            } else {
                activityC22571x51759e93.U1 = activityC22571x51759e93.f287979d.getHeaderViewsCount();
                activityC22571x51759e93.G7(str);
            }
            if (activityC22571x51759e93.H1) {
                com.p314xaae8f345.mm.p959x883644fd.b.b(activityC22571x51759e93.S1, 4);
            }
        }
        z17 = true;
        if (z17) {
            w8Var.f288766c = !w8Var.f288766c;
        }
        adapter.m8147xed6e4d18(i17);
    }
}
