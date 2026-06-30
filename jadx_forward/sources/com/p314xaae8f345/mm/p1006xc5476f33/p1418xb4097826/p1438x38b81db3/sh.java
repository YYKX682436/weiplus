package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class sh extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f186087a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th f186088b;

    public sh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th thVar) {
        this.f186088b = thVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        android.view.View O6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            if (k3Var instanceof in5.s0) {
                java.lang.Object obj = ((in5.s0) k3Var).f374658i;
                if (obj instanceof so2.j1) {
                    java.util.HashSet hashSet = this.f186087a;
                    so2.j1 j1Var = (so2.j1) obj;
                    if (!hashSet.contains(java.lang.Long.valueOf(j1Var.mo2128x1ed62e84()))) {
                        hashSet.add(java.lang.Long.valueOf(j1Var.mo2128x1ed62e84()));
                        linkedList.add(obj);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th thVar = this.f186088b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th.n(thVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onChildExposeChanged] exposed=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            arrayList.add(pm0.v.u(((so2.j1) it6.next()).mo2128x1ed62e84()));
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveListConvert", sb6.toString());
        if (!linkedList.isEmpty()) {
            pm0.v.O("FinderFeedLiveListExpose", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rh(linkedList, thVar));
        }
        if (!exposedHolders.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = thVar.f186146e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = k8Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) k8Var : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = pzVar != null ? pzVar.f190289h : null;
            if (!(abstractC15124x7bae6180 instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670)) {
                abstractC15124x7bae6180 = null;
            }
            if (abstractC15124x7bae6180 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qh qhVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qh) pf5.z.f435481a.b(abstractC15124x7bae6180).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qh.class);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("hideTips， ");
                android.view.View O62 = qhVar.O6();
                sb7.append(O62 != null && O62.getVisibility() == 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFriendsLeftSlideGuideUIC", sb7.toString());
                android.view.View O63 = qhVar.O6();
                if (!(O63 != null && O63.getVisibility() == 0) || (O6 = qhVar.O6()) == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(O6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC", "hideTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                O6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(O6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC", "hideTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                qhVar.P6();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qh.f217240m = null;
                qhVar.f217247i = false;
            }
        }
    }
}
