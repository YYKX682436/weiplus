package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class g50 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 f199940d;

    public g50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var) {
        this.f199940d = q50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList G2;
        java.util.ArrayList arrayList;
        r45.re2 re2Var;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var = this.f199940d;
        if (q50Var.g0().d()) {
            r45.hn1 hn1Var = q50Var.g0().f411120k;
            if (hn1Var != null && (re2Var = (r45.re2) hn1Var.m75936x14adae67(2)) != null) {
                G2 = re2Var.m75941xfb821914(3);
            }
            G2 = null;
        } else {
            java.util.List list = q50Var.g0().f411113d;
            if (list != null) {
                G2 = zl2.r4.f555483a.G2(list, null);
            }
            G2 = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 o40Var = q50Var.f201030l1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 o40Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200786h;
        boolean z17 = o40Var == o40Var2 && q50Var.A1 == o40Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 o40Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200785g;
        boolean z18 = o40Var == o40Var3 && q50Var.A1 == o40Var2;
        boolean z19 = o40Var == o40Var3 && q50Var.A1 == o40Var3;
        q50Var.getClass();
        android.content.Context context = q50Var.f199716e;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14047x4c222b89.class);
        java.util.LinkedList m75941xfb821914 = q50Var.f201037z1.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getAudience_list(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        java.util.Iterator it = m75941xfb821914.iterator();
        while (it.hasNext()) {
            arrayList3.add(((r45.il1) it.next()).mo14344x5f01b1f6());
        }
        if (G2 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(G2, 10));
            java.util.Iterator it6 = G2.iterator();
            while (it6.hasNext()) {
                arrayList.add(((r45.il1) it6.next()).mo14344x5f01b1f6());
            }
        } else {
            arrayList = null;
        }
        if (z18) {
            java.util.List list2 = q50Var.g0().f411112c;
            intent.putExtra("KEY_PARAMS_WHITE_LIST", list2 instanceof java.io.Serializable ? (java.io.Serializable) list2 : null);
            if (!(arrayList instanceof java.io.Serializable)) {
                arrayList = null;
            }
            intent.putExtra("KEY_PARAMS_FORBID_SELECT_WHITE_LIST", arrayList);
        } else if (z17) {
            if (!(arrayList instanceof java.io.Serializable)) {
                arrayList = null;
            }
            intent.putExtra("KEY_PARAMS_WHITE_LIST", arrayList);
            intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList3);
        } else {
            java.util.List list3 = q50Var.g0().f411112c;
            intent.putExtra("KEY_PARAMS_WHITE_LIST", list3 instanceof java.io.Serializable ? (java.io.Serializable) list3 : null);
            intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList3);
            if (!(arrayList instanceof java.io.Serializable)) {
                arrayList = null;
            }
            intent.putExtra("KEY_PARAMS_FORBID_UNSELECT_WHITE_LIST", arrayList);
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
        com.p314xaae8f345.mm.ui.vc m78751x5dc77fb5 = activityC21401x6ce6f73f != null ? activityC21401x6ce6f73f.m78751x5dc77fb5(intent) : null;
        if (m78751x5dc77fb5 != null) {
            ((com.p314xaae8f345.mm.ui.bd) m78751x5dc77fb5).f279410a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f50(q50Var, z19, G2, z17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
