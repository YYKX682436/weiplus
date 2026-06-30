package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class xn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co f192620d;

    public xn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co coVar) {
        this.f192620d = coVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initBottomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co coVar = this.f192620d;
        int m56393xfb854877 = coVar.z().f188689e.m56393xfb854877();
        if (m56393xfb854877 > 0) {
            if (coVar.A == m56393xfb854877) {
                java.util.Iterator it = coVar.z().f188689e.m56388xcaeb60d0().iterator();
                while (it.hasNext()) {
                    so2.j5 j5Var = (so2.j5) it.next();
                    if (j5Var instanceof so2.m4) {
                        ((so2.m4) j5Var).f492015e = false;
                    }
                }
                coVar.o().m8146xced61ae5();
                coVar.A = 0;
                coVar.Y();
            } else {
                java.util.Iterator it6 = coVar.z().f188689e.m56388xcaeb60d0().iterator();
                while (it6.hasNext()) {
                    so2.j5 j5Var2 = (so2.j5) it6.next();
                    if (j5Var2 instanceof so2.m4) {
                        ((so2.m4) j5Var2).f492015e = true;
                    }
                }
                coVar.o().m8146xced61ae5();
                coVar.A = m56393xfb854877;
                coVar.Y();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initBottomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
