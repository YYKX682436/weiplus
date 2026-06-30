package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.co f111087d;

    public xn(com.tencent.mm.plugin.finder.feed.co coVar) {
        this.f111087d = coVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initBottomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.co coVar = this.f111087d;
        int size = coVar.z().f107156e.getSize();
        if (size > 0) {
            if (coVar.A == size) {
                java.util.Iterator it = coVar.z().f107156e.getDataListJustForAdapter().iterator();
                while (it.hasNext()) {
                    so2.j5 j5Var = (so2.j5) it.next();
                    if (j5Var instanceof so2.m4) {
                        ((so2.m4) j5Var).f410482e = false;
                    }
                }
                coVar.o().notifyDataSetChanged();
                coVar.A = 0;
                coVar.Y();
            } else {
                java.util.Iterator it6 = coVar.z().f107156e.getDataListJustForAdapter().iterator();
                while (it6.hasNext()) {
                    so2.j5 j5Var2 = (so2.j5) it6.next();
                    if (j5Var2 instanceof so2.m4) {
                        ((so2.m4) j5Var2).f410482e = true;
                    }
                }
                coVar.o().notifyDataSetChanged();
                coVar.A = size;
                coVar.Y();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initBottomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
