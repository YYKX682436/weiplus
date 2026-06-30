package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class y40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 f201946d;

    public y40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var) {
        this.f201946d = q50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.re2 re2Var;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.util.LinkedList m75941xfb8219143;
        java.util.LinkedList m75941xfb8219144;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var = this.f201946d;
        if (q50Var.g0().d()) {
            r45.hn1 hn1Var = q50Var.g0().f411120k;
            re2Var = hn1Var != null ? (r45.re2) hn1Var.m75936x14adae67(2) : null;
        } else {
            re2Var = q50Var.g0().f411123n;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 o40Var = q50Var.f201030l1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 o40Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200786h;
        boolean z17 = o40Var == o40Var2 && q50Var.A1 == o40Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 o40Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200785g;
        boolean z18 = o40Var == o40Var3 && q50Var.A1 == o40Var2;
        boolean z19 = o40Var == o40Var3 && q50Var.A1 == o40Var3;
        q50Var.getClass();
        android.content.Context context = q50Var.f199716e;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6.class);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
        intent.putExtra("KEY_PARAMS_MAX_USER_COUNT", ((mm2.c1) q50Var.H.m56796xbba4bfc0(mm2.c1.class)).f410408r4);
        intent.putExtra("KEY_PARAMS_WHITE_LIST_HIDE_SELECT_FROM_CONTACT_BOOK", true);
        if (z18) {
            intent.putStringArrayListExtra("KEY_PARAMS_FORBID_CHOSEN_WHITE_LIST", (re2Var == null || (m75941xfb8219144 = re2Var.m75941xfb821914(2)) == null) ? null : new java.util.ArrayList<>(m75941xfb8219144));
            intent.putExtra("KEY_PARAMS_SELECT_WHITE_LIST_DISABLE_SEARCH", true);
        } else if (z17) {
            intent.putStringArrayListExtra("KEY_PARAMS_ALLOW_SELECT_WHITE_LIST", (re2Var == null || (m75941xfb8219143 = re2Var.m75941xfb821914(2)) == null) ? null : new java.util.ArrayList<>(m75941xfb8219143));
            intent.putExtra("KEY_PARAMS_SELECT_WHITE_LIST_DISABLE_SEARCH", true);
            intent.putExtra("KEY_PARAMS_WHITE_LIST", q50Var.f201037z1.mo14344x5f01b1f6());
        } else {
            intent.putExtra("KEY_PARAMS_WHITE_LIST", q50Var.f201037z1.mo14344x5f01b1f6());
            intent.putStringArrayListExtra("KEY_PARAMS_CHOSEN_WHITE_LIST", (re2Var == null || (m75941xfb8219142 = re2Var.m75941xfb821914(0)) == null) ? null : new java.util.ArrayList<>(m75941xfb8219142));
            intent.putStringArrayListExtra("KEY_PARAMS_CHOSEN_USER_LIST", (re2Var == null || (m75941xfb821914 = re2Var.m75941xfb821914(1)) == null) ? null : new java.util.ArrayList<>(m75941xfb821914));
        }
        com.p314xaae8f345.mm.ui.vc m78751x5dc77fb5 = activityC21401x6ce6f73f != null ? activityC21401x6ce6f73f.m78751x5dc77fb5(intent) : null;
        if (activityC21401x6ce6f73f != null) {
            activityC21401x6ce6f73f.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
        if (m78751x5dc77fb5 != null) {
            ((com.p314xaae8f345.mm.ui.bd) m78751x5dc77fb5).f279410a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x40(q50Var, z19, re2Var, z17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
