package hr3;

/* loaded from: classes10.dex */
public final class fd implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d f365085d;

    public fd(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d) {
        this.f365085d = activityC16867xd9c62d0d;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        if (menuItem.getItemId() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d = this.f365085d;
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
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("infrequentcontactsortpage_delete_ack", "view_clk", kz5.c1.k(new jz5.l("contacts_max_limit_sort_sessionid", activityC16867xd9c62d0d.W6()), new jz5.l("infrequentcontactsortpage_sessionid", activityC16867xd9c62d0d.f235338y), new jz5.l("infrequentcontactsortpage_recommend_user_cnt", java.lang.Integer.valueOf(activityC16867xd9c62d0d.f235331r.size())), new jz5.l("delete_user_cnt", java.lang.Integer.valueOf(arrayList4.size())), new jz5.l("delete_user_list", kz5.n0.g0(arrayList4, "#", null, null, 0, null, null, 62, null))), 32337);
            fr3.f fVar = activityC16867xd9c62d0d.f235339z;
            java.util.List list2 = activityC16867xd9c62d0d.f235332s.f534544d;
            if (list2 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list2) {
                    if (((xb5.a) obj2).f534541f) {
                        arrayList5.add(obj2);
                    }
                }
                arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList5, 10));
                java.util.Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(((xb5.a) it6.next()).f534539d);
                }
            } else {
                arrayList2 = null;
            }
            fVar.O6(new fr3.g(arrayList2));
        }
    }
}
