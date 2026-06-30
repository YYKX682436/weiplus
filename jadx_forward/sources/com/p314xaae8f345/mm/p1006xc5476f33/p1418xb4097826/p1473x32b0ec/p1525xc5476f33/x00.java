package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class x00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f196542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f196543e;

    public x00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f10Var, android.view.ViewGroup viewGroup) {
        this.f196542d = f10Var;
        this.f196543e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveNewVisitorPostPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f10Var = this.f196542d;
        boolean z17 = true;
        if (((mm2.e0) f10Var.P0(mm2.e0.class)).P6()) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10.t1(f10Var)) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
                bundle.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", f10Var.f194018u);
                bundle.putInt("PARAM_FINDER_LIVE_INPUT_SOURCE", 1);
                f10Var.f194013p.mo46557x60d69242(qo0.b.W, bundle);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f10Var.f194014q, "[input-auto-wording] text = " + f10Var.f194018u);
            }
        } else if (!((mm2.c1) f10Var.P0(mm2.c1.class)).f410417t || !((mm2.c1) f10Var.P0(mm2.c1.class)).f410429v) {
            java.lang.String str = ((mm2.c1) f10Var.P0(mm2.c1.class)).f410423u;
            if (str == null || str.length() == 0) {
                java.lang.String str2 = ((mm2.c1) f10Var.P0(mm2.c1.class)).f410441x;
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                string = !z17 ? ((mm2.c1) f10Var.P0(mm2.c1.class)).f410441x : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eby);
            } else {
                string = ((mm2.c1) f10Var.P0(mm2.c1.class)).f410423u;
            }
            db5.t7.g(this.f196543e.getContext(), string);
        } else if (!((mm2.c1) f10Var.P0(mm2.c1.class)).f410435w || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f10Var.f194016s.getText(), f10Var.f194023z)) {
            zl2.q4 q4Var = zl2.q4.f555466a;
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            q4Var.P(string2);
        } else {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
            bundle2.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", f10Var.f194018u);
            bundle2.putInt("PARAM_FINDER_LIVE_INPUT_SOURCE", 1);
            f10Var.f194013p.mo46557x60d69242(qo0.b.W, bundle2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f10Var.f194014q, "[input-auto-wording] loc2 text = " + f10Var.f194018u);
        }
        if (((mm2.c1) f10Var.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) f10Var.X0(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
            vVar.a();
            vVar.c(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46368x75a8a97d);
        }
        f10Var.f194018u = "";
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNewVisitorPostPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
