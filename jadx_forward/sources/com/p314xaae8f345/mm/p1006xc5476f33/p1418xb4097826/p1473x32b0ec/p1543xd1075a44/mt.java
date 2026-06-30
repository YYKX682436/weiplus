package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class mt implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f200652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pt f200653e;

    public mt(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pt ptVar) {
        this.f200652d = c1163xf1deaba4;
        this.f200653e = ptVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveQcPollBottomSheetWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f200652d.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.widget.FinderLiveQcPollBottomSheetWidget.RecyclerViewAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ht htVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ht) mo7946xf939df19;
        java.util.Set x17 = htVar.x();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x17, "<this>");
        boolean z17 = !x17.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pt ptVar = this.f200653e;
        if (z17) {
            java.util.Set x18 = htVar.x();
            java.util.List list = ptVar.H.f315116e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (x18.contains(((dk2.ic) obj).f315155a)) {
                    arrayList2.add(obj);
                }
            }
            ptVar.f200961J.mo149xb9724478(ptVar.H, arrayList2);
            ptVar.N = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(ptVar, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveQcPollBottomSheetWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
