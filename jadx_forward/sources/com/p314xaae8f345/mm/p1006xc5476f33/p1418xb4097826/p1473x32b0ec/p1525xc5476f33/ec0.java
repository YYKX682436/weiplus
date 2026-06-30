package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ec0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 f193931d;

    public ec0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var) {
        this.f193931d = nd0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var = this.f193931d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0.t1(nd0Var);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        boolean D1 = nd0Var.D1();
        r0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("jump_type", D1 ? "mmbiz_profile" : "findervideo_profile");
        ml2.r0.hj(r0Var, ml2.b4.V, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        if (((mm2.c1) nd0Var.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) nd0Var.X0(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
            vVar.a();
            vVar.c(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
