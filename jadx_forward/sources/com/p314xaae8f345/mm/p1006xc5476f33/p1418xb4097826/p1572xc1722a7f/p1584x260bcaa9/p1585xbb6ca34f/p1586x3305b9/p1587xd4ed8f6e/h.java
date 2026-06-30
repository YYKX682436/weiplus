package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t f203229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp2.c f203230f;

    public h(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t tVar, vp2.c cVar) {
        this.f203228d = s0Var;
        this.f203229e = tVar;
        this.f203230f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ne1 ne1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert$bindAggregationCardContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f203228d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.lqa)).mo7946xf939df19();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = null;
        up2.e eVar = mo7946xf939df19 instanceof up2.e ? (up2.e) mo7946xf939df19 : null;
        vp2.c cVar = this.f203230f;
        if (eVar != null) {
            vp2.f fVar = (vp2.f) ((in5.c) kz5.n0.a0(eVar.I, eVar.F0(cVar.f520445f)));
            if (fVar != null && (ne1Var = fVar.f520452d) != null) {
                gVar = ne1Var.f462840e;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t.n(this.f203229e, s0Var, cVar, gVar);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert$bindAggregationCardContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
