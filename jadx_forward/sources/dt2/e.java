package dt2;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.h f324705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.w94 f324706e;

    public e(dt2.h hVar, r45.w94 w94Var) {
        this.f324705d = hVar;
        this.f324706e = w94Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        at2.y1 y1Var;
        db5.d5 d5Var;
        at2.u1 u1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView$setFragment$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f409306d;
        java.lang.String jSONObject = ml2.z0.b(ml2.z0.f409863a, null, 1, null).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        ((ml2.j0) zbVar).Wj("watch_live_point_play", jSONObject);
        int i17 = dt2.h.f324712h;
        this.f324705d.getClass();
        ws2.u0 u0Var = ws2.k1.f530599r;
        java.lang.Object obj = u0Var.a().f530606e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) obj : null;
        if (k0Var != null && (u1Var = (at2.u1) k0Var.mo57682x2a5e9229(at2.u1.class)) != null) {
            u1Var.w1(this.f324706e.m75939xb282bd08(0), false);
        }
        java.lang.Object obj2 = u0Var.a().f530606e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) obj2 : null;
        if (k0Var2 != null && (y1Var = (at2.y1) k0Var2.mo57682x2a5e9229(at2.y1.class)) != null && (d5Var = y1Var.f95314q.f206462q) != null) {
            d5Var.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView$setFragment$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
