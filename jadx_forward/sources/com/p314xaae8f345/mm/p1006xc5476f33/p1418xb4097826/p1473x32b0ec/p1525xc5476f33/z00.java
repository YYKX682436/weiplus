package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class z00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f196783d;

    public z00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f10Var) {
        this.f196783d = f10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveNewVisitorPostPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f10Var = this.f196783d;
        if (!((mm2.e0) f10Var.P0(mm2.e0.class)).P6()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
            bundle.putBoolean("PARAM_IS_ENTERING_EMOJI", true);
            bundle.putInt("PARAM_FINDER_LIVE_INPUT_SOURCE", 1);
            f10Var.f194013p.mo46557x60d69242(qo0.b.W, bundle);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f10Var.f194014q, "[click-emoji-icon] inputSource:1");
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10.t1(f10Var)) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
            bundle2.putBoolean("PARAM_IS_ENTERING_EMOJI", true);
            bundle2.putInt("PARAM_FINDER_LIVE_INPUT_SOURCE", 1);
            f10Var.f194013p.mo46557x60d69242(qo0.b.W, bundle2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f10Var.f194014q, "[click-emoji-icon-box] inputSource:1");
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(2, 6, kz5.b1.e(new jz5.l(ya.b.f77502x92235c1b, "1")));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNewVisitorPostPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
