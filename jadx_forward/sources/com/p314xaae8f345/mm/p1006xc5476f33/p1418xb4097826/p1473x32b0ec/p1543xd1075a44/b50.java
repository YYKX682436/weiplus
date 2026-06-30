package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class b50 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 f199367d;

    public b50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var) {
        this.f199367d = q50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.re2 re2Var;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.util.LinkedList m75941xfb8219143;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var = this.f199367d;
        if (q50Var.g0().d()) {
            r45.hn1 hn1Var = q50Var.g0().f411120k;
            re2Var = hn1Var != null ? (r45.re2) hn1Var.m75936x14adae67(2) : null;
        } else {
            re2Var = q50Var.g0().f411123n;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 o40Var = q50Var.f201030l1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 o40Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200786h;
        boolean z17 = false;
        boolean z18 = o40Var == o40Var2 && q50Var.A1 == o40Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 o40Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200785g;
        boolean z19 = o40Var == o40Var3 && q50Var.A1 == o40Var2;
        if (o40Var == o40Var3 && q50Var.A1 == o40Var3) {
            z17 = true;
        }
        q50Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingWhiteListPanel", "goto select group");
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = q50Var.f199716e;
        intent.setClassName(context, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        intent.putExtra("key_select_label_click_more_to_contact_list", true);
        intent.putExtra("option_button_wording_res_id_zero", com.p314xaae8f345.mm.R.C30867xcad56011.nwk);
        intent.putExtra("option_button_wording_res_id_more_format", com.p314xaae8f345.mm.R.C30867xcad56011.nwj);
        r45.re2 re2Var2 = q50Var.f201037z1;
        if (z19) {
            intent.putExtra("key_select_label_hide_search_bar", true);
            intent.putStringArrayListExtra("contact_forbid_select_label_id_list", (re2Var == null || (m75941xfb8219143 = re2Var.m75941xfb821914(4)) == null) ? null : new java.util.ArrayList<>(m75941xfb8219143));
            intent.putExtra("contact_forbid_select_wording_res_id", com.p314xaae8f345.mm.R.C30867xcad56011.f575271ov0);
        } else if (z18) {
            intent.putStringArrayListExtra("label_id", new java.util.ArrayList<>(re2Var2.m75941xfb821914(4)));
            intent.putStringArrayListExtra("contact_label_id_custom_data_list", (re2Var == null || (m75941xfb8219142 = re2Var.m75941xfb821914(4)) == null) ? null : new java.util.ArrayList<>(m75941xfb8219142));
            intent.putExtra("key_select_label_hide_search_bar", true);
        } else {
            intent.putStringArrayListExtra("label_id", new java.util.ArrayList<>(re2Var2.m75941xfb821914(4)));
            intent.putStringArrayListExtra("contact_forbid_unselect_label_id_list", (re2Var == null || (m75941xfb821914 = re2Var.m75941xfb821914(4)) == null) ? null : new java.util.ArrayList<>(m75941xfb821914));
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
        com.p314xaae8f345.mm.ui.vc m78751x5dc77fb5 = activityC21401x6ce6f73f != null ? activityC21401x6ce6f73f.m78751x5dc77fb5(intent) : null;
        if (m78751x5dc77fb5 != null) {
            ((com.p314xaae8f345.mm.ui.bd) m78751x5dc77fb5).f279410a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a50(q50Var, z17, re2Var, z18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
