package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ec implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.i0 f193929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gc f193930e;

    public ec(cm2.i0 i0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gc gcVar) {
        this.f193929d = i0Var;
        this.f193930e = gcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveBulkBuyBubble$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cm2.i0 i0Var = this.f193929d;
        r45.ce0 ce0Var = (r45.ce0) i0Var.f124887v.m75936x14adae67(15);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gc gcVar = this.f193930e;
        if (ce0Var != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = gcVar.f194210d;
            r45.ac4 ac4Var = new r45.ac4();
            ac4Var.set(1, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) ce0Var.m75936x14adae67(9));
            c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gc.a(gcVar, i0Var.f124887v, "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBulkBuyBubble$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
