package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hn f202277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.q f202278e;

    public o(r45.hn hnVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.q qVar) {
        this.f202277d = hnVar;
        this.f202278e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget$addBoardEventEntryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.hn hnVar = this.f202277d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) hnVar.m75936x14adae67(2);
        if (c19786x6a1e2862 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishAnchorPanelWidget", "board event entry clicked: " + hnVar.m75945x2fec8307(0));
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.q qVar = this.f202278e;
            if (b6Var != null) {
                android.content.Context context = qVar.f199914d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                xc2.y2 y2Var = xc2.y2.f534876a;
                xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
                p0Var.f534785n = 0;
                xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            }
            qVar.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget$addBoardEventEntryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
