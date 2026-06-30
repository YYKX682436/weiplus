package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f185241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f185243f;

    public j1(so2.y0 y0Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f185241d = y0Var;
        this.f185242e = view;
        this.f185243f = abstractC14490x69736cb5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCommentConvert$refreshPromotion$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ly0 m76075xab67e9d6 = this.f185241d.f492236d.u0().m76075xab67e9d6();
        if (m76075xab67e9d6 != null && (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) m76075xab67e9d6.m75936x14adae67(1)) != null) {
            xc2.y2 y2Var = xc2.y2.f534876a;
            android.view.View view2 = this.f185242e;
            android.content.Context context = view2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f185243f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s g17 = y2Var.g(context, abstractC14490x69736cb5, abstractC14490x69736cb5.N0());
            android.content.Context context2 = view2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.R = g17;
            xc2.y2.i(y2Var, context2, p0Var, 0, null, 12, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$refreshPromotion$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
