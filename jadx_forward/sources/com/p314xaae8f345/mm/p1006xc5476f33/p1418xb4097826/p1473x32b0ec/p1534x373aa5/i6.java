package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class i6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 f197913d;

    public i6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 r6Var) {
        this.f197913d = r6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.s6 s6Var = this.f197913d.f198165b;
        if (s6Var != null) {
            df2.t2 t2Var = (df2.t2) s6Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterController", "onMicClick");
            boolean z17 = pm0.v.z(t2Var.d7(), 16);
            android.content.Context O6 = t2Var.O6();
            if (z17) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.nh9);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f79803x14181d5f);
                e4Var.c();
            } else {
                boolean z18 = ((mm2.c1) t2Var.m56788xbba4bfc0(mm2.c1.class)).O4;
                boolean z19 = !z18;
                ((mm2.c1) t2Var.m56788xbba4bfc0(mm2.c1.class)).n9(z19);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", z19);
                t2Var.X6(qo0.b.f446934p4, bundle);
                fj2.s sVar = fj2.s.f344716a;
                sVar.e(ml2.q4.f409386f, !z18 ? ml2.r4.f409444f : ml2.r4.f409443e);
                if (z18) {
                    int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
                    e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.d4e);
                    e4Var2.b(com.p314xaae8f345.mm.R.raw.f79805xc851170e);
                    e4Var2.c();
                    sVar.b(ml2.n4.f409290x);
                } else {
                    int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
                    e4Var3.d(com.p314xaae8f345.mm.R.C30867xcad56011.f572993d52);
                    e4Var3.b(com.p314xaae8f345.mm.R.raw.f79803x14181d5f);
                    e4Var3.c();
                    sVar.b(ml2.n4.f409287u);
                }
                df2.t2.g7(t2Var, kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n6.f198049d), false, 2, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
