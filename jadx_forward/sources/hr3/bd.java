package hr3;

/* loaded from: classes10.dex */
public final class bd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d f364960d;

    public bd(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d) {
        this.f364960d = activityC16867xd9c62d0d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d.A;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d = this.f364960d;
        activityC16867xd9c62d0d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendDeleteContactUI", "showDeleteTipsBottomSheet() called");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC16867xd9c62d0d.mo55332x76847179(), 1, true);
        k0Var.f293405n = new hr3.ed(activityC16867xd9c62d0d, 1);
        k0Var.q(activityC16867xd9c62d0d.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mf_), 17);
        k0Var.f293414s = new hr3.fd(1, activityC16867xd9c62d0d);
        k0Var.v();
        java.util.List list = activityC16867xd9c62d0d.f235332s.f534544d;
        if (list != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((xb5.a) obj).f534541f) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(((xb5.a) it.next()).f534539d);
            }
        } else {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList4 = arrayList;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("infrequentcontactsortpage_delete_button", "view_clk", kz5.c1.k(new jz5.l("contacts_max_limit_sort_sessionid", activityC16867xd9c62d0d.W6()), new jz5.l("infrequentcontactsortpage_sessionid", activityC16867xd9c62d0d.f235338y), new jz5.l("infrequentcontactsortpage_recommend_user_cnt", java.lang.Integer.valueOf(activityC16867xd9c62d0d.f235331r.size())), new jz5.l("delete_user_cnt", java.lang.Integer.valueOf(arrayList4.size())), new jz5.l("delete_user_list", kz5.n0.g0(arrayList4, "#", null, null, 0, null, null, 62, null))), 32337);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
