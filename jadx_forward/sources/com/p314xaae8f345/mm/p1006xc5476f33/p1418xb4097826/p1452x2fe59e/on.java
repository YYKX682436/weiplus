package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class on extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn f190201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar) {
        super(1);
        this.f190201d = rnVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar = this.f190201d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar = rnVar.f190462e;
        hnVar.f188468g = null;
        hnVar.g(false, 1);
        if (rnVar.f190462e.f188469h.size() == 0 && (findViewById = rnVar.f190461d.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "startLoadingByInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "startLoadingByInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = rnVar.f190463f;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc00.setVisibility(8);
            android.view.View findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.lbi);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "startLoadingByInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "startLoadingByInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
