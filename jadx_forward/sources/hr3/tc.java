package hr3;

/* loaded from: classes10.dex */
public final class tc implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d f365559d;

    public tc(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d) {
        this.f365559d = activityC16867xd9c62d0d;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.ArrayList arrayList;
        fr3.m mVar = (fr3.m) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendDeleteContactUI", "uiStates:" + mVar + ' ');
        boolean z17 = mVar instanceof fr3.k;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d = this.f365559d;
        if (z17) {
            java.util.List<fr3.a> list = ((fr3.k) mVar).f347332a;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d.A;
            activityC16867xd9c62d0d.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendDeleteContactUI", "notifyList() called with: dataList = " + list.size());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (true ^ r26.n0.N(((fr3.a) obj2).f347313a)) {
                    arrayList2.add(obj2);
                }
            }
            boolean isEmpty = arrayList2.isEmpty();
            xb5.b bVar = activityC16867xd9c62d0d.f235332s;
            boolean z18 = false;
            if (isEmpty) {
                android.view.View view = activityC16867xd9c62d0d.f235334u;
                if (view != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "notifyList", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "notifyList", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (fr3.a aVar : list) {
                    xb5.a aVar2 = new xb5.a();
                    java.lang.String str = aVar.f347313a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                    aVar2.f534539d = str;
                    aVar2.f534540e = aVar.f347314b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar.f347315c, "<set-?>");
                    arrayList5.add(aVar2);
                }
                arrayList4.addAll(arrayList5);
                bVar.f534544d = arrayList4;
                android.view.View view2 = activityC16867xd9c62d0d.f235334u;
                if (view2 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "notifyList", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "notifyList", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                q31.n nVar = activityC16867xd9c62d0d.f235333t;
                if (nVar != null) {
                    ((io.g0) nVar).b(bVar);
                }
            }
            boolean X6 = activityC16867xd9c62d0d.X6();
            boolean z19 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16867xd9c62d0d.f235339z.f347327f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendDeleteContactUI", "notifyList() called with: isItemListNotEmpty = " + X6 + " haveNextPage:" + z19);
            if (X6 && z19) {
                z18 = true;
            }
            activityC16867xd9c62d0d.a7(z18);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19640x3c29a739 c19640x3c29a739 = activityC16867xd9c62d0d.f235329p;
            if (c19640x3c29a739 != null) {
                c19640x3c29a739.setVisibility(8);
            }
            activityC16867xd9c62d0d.Z6();
            java.util.List list2 = bVar.f534544d;
            if (list2 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList7.add(((xb5.a) it.next()).f534539d);
                }
                arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = arrayList7.iterator();
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    if (!r26.n0.N((java.lang.String) next)) {
                        arrayList.add(next);
                    }
                }
            } else {
                arrayList = new java.util.ArrayList();
            }
            java.util.HashSet hashSet = activityC16867xd9c62d0d.f235330q;
            hashSet.addAll(arrayList);
            java.util.ArrayList arrayList8 = activityC16867xd9c62d0d.f235331r;
            arrayList8.clear();
            arrayList8.addAll(arrayList);
            java.util.Objects.toString(hashSet);
            java.util.Objects.toString(arrayList8);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            iy1.c cVar = iy1.c.MainUI;
            ((cy1.a) rVar).Gj(50112, "page_in", kz5.c1.k(new jz5.l("contacts_max_limit_sort_sessionid", activityC16867xd9c62d0d.W6()), new jz5.l("infrequentcontactsortpage_sessionid", activityC16867xd9c62d0d.f235338y), new jz5.l("infrequentcontactsortpage_recommend_user_cnt", java.lang.Integer.valueOf(arrayList8.size()))), 32337);
        } else if (mVar instanceof fr3.j) {
            java.util.List list3 = ((fr3.j) mVar).f347331a;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d.A;
            activityC16867xd9c62d0d.T6(list3);
        } else if (mVar instanceof fr3.l) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d.A;
            activityC16867xd9c62d0d.m67644x2b33b77f();
        }
        return jz5.f0.f384359a;
    }
}
