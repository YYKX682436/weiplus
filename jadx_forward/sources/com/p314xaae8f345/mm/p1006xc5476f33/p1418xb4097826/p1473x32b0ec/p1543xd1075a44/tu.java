package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class tu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f201442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vu f201443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn2.d f201444f;

    public tu(r45.yx1 yx1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vu vuVar, hn2.d dVar) {
        this.f201442d = yx1Var;
        this.f201443e = vuVar;
        this.f201444f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Request, name ");
        r45.yx1 yx1Var = this.f201442d;
        sb6.append(yx1Var.f472999o.f452676d.f451884e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSingingSongWidget", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vu vuVar = this.f201443e;
        boolean q76 = vuVar.f201623b.q7(6);
        hn2.d dVar = this.f201444f;
        if (!q76) {
            sf2.d3 d3Var = vuVar.f201623b;
            d3Var.f488639p = dVar;
            d3Var.f488640q = 2;
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = vuVar.f201631j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22627xa933f8e4, "<get-btnProgress>(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c22627xa933f8e4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22627xa933f8e4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c22627xa933f8e4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = vuVar.f201632k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22661xa3a2b3c0, "<get-btnRequestSong>(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c22661xa3a2b3c0, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22661xa3a2b3c0.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c22661xa3a2b3c0, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        vuVar.c(2, bm2.y8.f103995e, 1, yx1Var.f472999o.f452676d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(vuVar.f201623b, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.su(vuVar, dVar, yx1Var, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
