package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q7 f194424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f194425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f194426f;

    public i2(r45.q7 q7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f194424d = q7Var;
        this.f194425e = v3Var;
        this.f194426f = c19786x6a1e2862;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertCommonInfoPanel$1$4$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.q7 q7Var = this.f194424d;
        int m75939xb282bd08 = q7Var.m75939xb282bd08(0);
        ml2.t1 t1Var = m75939xb282bd08 != 1 ? m75939xb282bd08 != 2 ? null : ml2.t1.f409521t2 : ml2.t1.f409509p2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f194425e;
        if (t1Var != null) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).kk(t1Var, ((mm2.c1) v3Var.P0(mm2.c1.class)).f410385o, ((mm2.e1) v3Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), q7Var.m75945x2fec8307(1));
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = v3Var.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo = this.f194426f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpInfo, "$jumpInfo");
        r45.l34 l34Var = new r45.l34();
        l34Var.set(1, java.lang.Boolean.TRUE);
        xc2.y2 y2Var = xc2.y2.f534876a;
        xc2.p0 p0Var = new xc2.p0(jumpInfo);
        p0Var.f534771c = l34Var;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertCommonInfoPanel$1$4$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
