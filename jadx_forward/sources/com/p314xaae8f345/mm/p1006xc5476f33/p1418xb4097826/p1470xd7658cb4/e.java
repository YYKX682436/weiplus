package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4;

/* loaded from: classes2.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.h f192961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d f192962e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d dVar) {
        this.f192961d = hVar;
        this.f192962e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.n) this.f192961d.f192967e;
        nVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d highlight = this.f192962e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(highlight, "highlight");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p pVar = nVar.f192985a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.m mVar = pVar.f192988b;
        r45.gb1 gb1Var = highlight.f192960d;
        if (mVar != null) {
            in5.s0 s0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.t) mVar).f193000a.f193001d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = s0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k) : null;
            if (c15196x85976f5f != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.Z(c15196x85976f5f, gb1Var.m75939xb282bd08(0) * 1000, 3, 0.0f, false, null, 28, null);
            }
            if (c15196x85976f5f != null) {
                c15196x85976f5f.b0(true);
            }
        }
        pVar.a(gb1Var, "view_clk");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
