package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes9.dex */
public final class t7 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15271xc6bc8c7d f214624d;

    public t7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15271xc6bc8c7d c15271xc6bc8c7d) {
        this.f214624d = c15271xc6bc8c7d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderContactSortView$init$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (j17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15271xc6bc8c7d c15271xc6bc8c7d = this.f214624d;
            if (j17 < c15271xc6bc8c7d.m79353x744cac53().size()) {
                android.content.Intent intent = new android.content.Intent();
                java.lang.Object obj = c15271xc6bc8c7d.m79353x744cac53().get((int) j17).f342431b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.api.LocalFinderContact");
                intent.putExtra("finder_username", ((ya2.b2) obj).D0());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
                android.content.Context context = c15271xc6bc8c7d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                iyVar.c(context, intent);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                android.content.Context context2 = c15271xc6bc8c7d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                i0Var.mk(context2, intent);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderContactSortView$init$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
