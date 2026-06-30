package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class sh extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f104554a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.th f104555b;

    public sh(com.tencent.mm.plugin.finder.convert.th thVar) {
        this.f104555b = thVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        android.view.View O6;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            if (k3Var instanceof in5.s0) {
                java.lang.Object obj = ((in5.s0) k3Var).f293125i;
                if (obj instanceof so2.j1) {
                    java.util.HashSet hashSet = this.f104554a;
                    so2.j1 j1Var = (so2.j1) obj;
                    if (!hashSet.contains(java.lang.Long.valueOf(j1Var.getItemId()))) {
                        hashSet.add(java.lang.Long.valueOf(j1Var.getItemId()));
                        linkedList.add(obj);
                    }
                }
            }
        }
        com.tencent.mm.plugin.finder.convert.th thVar = this.f104555b;
        com.tencent.mm.plugin.finder.convert.th.n(thVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onChildExposeChanged] exposed=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            arrayList.add(pm0.v.u(((so2.j1) it6.next()).getItemId()));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("FinderFeedLiveListConvert", sb6.toString());
        if (!linkedList.isEmpty()) {
            pm0.v.O("FinderFeedLiveListExpose", new com.tencent.mm.plugin.finder.convert.rh(linkedList, thVar));
        }
        if (!exposedHolders.isEmpty()) {
            com.tencent.mm.plugin.finder.feed.k8 k8Var = thVar.f104613e;
            com.tencent.mm.plugin.finder.feed.pz pzVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = pzVar != null ? pzVar.f108756h : null;
            if (!(finderHomeTabFragment instanceof androidx.fragment.app.Fragment)) {
                finderHomeTabFragment = null;
            }
            if (finderHomeTabFragment != null) {
                com.tencent.mm.plugin.finder.viewmodel.component.qh qhVar = (com.tencent.mm.plugin.finder.viewmodel.component.qh) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.qh.class);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("hideTips， ");
                android.view.View O62 = qhVar.O6();
                sb7.append(O62 != null && O62.getVisibility() == 0);
                com.tencent.mars.xlog.Log.i("FinderFriendsLeftSlideGuideUIC", sb7.toString());
                android.view.View O63 = qhVar.O6();
                if (!(O63 != null && O63.getVisibility() == 0) || (O6 = qhVar.O6()) == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(O6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC", "hideTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                O6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(O6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC", "hideTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                qhVar.P6();
                com.tencent.mm.plugin.finder.viewmodel.component.qh.f135707m = null;
                qhVar.f135714i = false;
            }
        }
    }
}
