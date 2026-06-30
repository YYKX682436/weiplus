package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class c9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 f197763d;

    public c9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 c14340xe0508cb3) {
        this.f197763d = c14340xe0508cb3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.nt2 nt2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$recordFinishView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.j0 j0Var = (ml2.j0) c17;
        mm2.f6 f6Var = (mm2.f6) dk2.ef.f314905a.i(mm2.f6.class);
        ml2.j0.Qj(j0Var, 6, (f6Var == null || (nt2Var = f6Var.E) == null) ? 0 : nt2Var.m75939xb282bd08(1), 0L, 0, 12, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 c14340xe0508cb3 = this.f197763d;
        android.content.Context context = c14340xe0508cb3.f197608f;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(c14340xe0508cb3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e6q));
        u1Var.a(true);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.e6p);
        u1Var.k(c14340xe0508cb3.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        u1Var.j(c14340xe0508cb3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e6o));
        u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.b9(c14340xe0508cb3));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$recordFinishView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
