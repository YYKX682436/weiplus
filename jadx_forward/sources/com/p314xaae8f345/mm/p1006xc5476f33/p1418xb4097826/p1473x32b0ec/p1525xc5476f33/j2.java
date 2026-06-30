package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.eg1 f194582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f194583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f194584f;

    public j2(r45.eg1 eg1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var, java.lang.String str) {
        this.f194582d = eg1Var;
        this.f194583e = v3Var;
        this.f194584f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertMilestoneInfoPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) this.f194582d.m75936x14adae67(1);
        if (c19786x6a1e2862 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertMilestoneInfoPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f194583e;
        android.content.Context context = v3Var.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.l34 l34Var = new r45.l34();
        l34Var.set(1, java.lang.Boolean.TRUE);
        xc2.y2 y2Var = xc2.y2.f534876a;
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        p0Var.f534771c = l34Var;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.t1 t1Var = ml2.t1.f409509p2;
        java.lang.String str = ((mm2.c1) v3Var.P0(mm2.c1.class)).f410385o;
        long m75942xfb822ef2 = ((mm2.e1) v3Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("milestone", this.f194584f);
        r0Var.mk(t1Var, str, m75942xfb822ef2, hashMap);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertMilestoneInfoPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
