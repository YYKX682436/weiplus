package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class dc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.bd5 f193783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gc f193784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.i0 f193785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f193786g;

    public dc(r45.bd5 bd5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gc gcVar, cm2.i0 i0Var, android.widget.TextView textView) {
        this.f193783d = bd5Var;
        this.f193784e = gcVar;
        this.f193785f = i0Var;
        this.f193786g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ce0 ce0Var;
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveBulkBuyBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = false;
        r45.bd5 bd5Var = this.f193783d;
        if (bd5Var != null && (m75945x2fec8307 = bd5Var.m75945x2fec8307(7)) != null) {
            if (m75945x2fec8307.length() > 0) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gc gcVar = this.f193784e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(gcVar.f194211e, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cc(gcVar, bd5Var, null), 3, null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBulkBuyBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (bd5Var != null && (ce0Var = (r45.ce0) bd5Var.m75936x14adae67(2)) != null) {
            c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) ce0Var.m75936x14adae67(9);
        }
        if (c19786x6a1e2862 != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = gcVar.f194210d;
            r45.ac4 ac4Var = new r45.ac4();
            ac4Var.set(1, c19786x6a1e2862);
            c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gc.a(gcVar, this.f193785f.f124887v, this.f193786g.getText().toString());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBulkBuyBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
