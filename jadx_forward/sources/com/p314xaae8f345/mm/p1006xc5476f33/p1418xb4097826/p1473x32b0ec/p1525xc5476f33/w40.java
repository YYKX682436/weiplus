package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class w40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 f196404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.d0 f196405e;

    public w40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 z40Var, cm2.d0 d0Var) {
        this.f196404d = z40Var;
        this.f196405e = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 z40Var = this.f196404d;
        int i17 = z40Var.f196814d.getResources().getConfiguration().orientation;
        cm2.d0 d0Var = this.f196405e;
        if (i17 == 2) {
            qo0.c cVar = z40Var.f196816f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
            if (k0Var != null && (r60Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60.class)) != null) {
                java.lang.String str = z40Var.f196828u;
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.String str2 = z40Var.f196829v;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) d0Var.f124868v.m75936x14adae67(5);
                bundle.putByteArray(str2, c19786x6a1e2862 != null ? c19786x6a1e2862.mo14344x5f01b1f6() : null);
                r60Var.p1(str, bundle);
            }
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) d0Var.f124868v.m75936x14adae67(5);
            if (c19786x6a1e28622 != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                android.content.Context context = z40Var.f196814d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                xc2.y2 y2Var = xc2.y2.f534876a;
                xc2.p0 p0Var = new xc2.p0(c19786x6a1e28622);
                p0Var.f534785n = 0;
                xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
