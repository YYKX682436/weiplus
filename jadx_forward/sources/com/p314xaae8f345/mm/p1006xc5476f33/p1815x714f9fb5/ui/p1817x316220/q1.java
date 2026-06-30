package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 f226407d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var) {
        this.f226407d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var = this.f226407d;
        double d17 = x1Var.G;
        double d18 = x1Var.H;
        if (x1Var.G == -85.0d || x1Var.H == -1000.0d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPoiMapUI", "invalid lat lng");
            yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (x1Var.f226453J) {
            x1Var.f226443e.mo1001x8873d7af().mo989x42ab093c(x1Var.G, x1Var.H);
            x1Var.f226467v.setSelected(true);
            x1Var.y(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.w1.COLLAPSED);
        } else {
            x1Var.f226443e.mo1001x8873d7af().mo989x42ab093c(x1Var.G, x1Var.H);
            double d19 = x1Var.G;
            x1Var.E = d19;
            double d27 = x1Var.H;
            x1Var.F = d27;
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16296x40c45249 c16296x40c45249 = x1Var.f226457n;
            boolean booleanExtra = x1Var.k().getBooleanExtra("key_geo_coder_four_level", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 c16293xe2a3baf2 = x1Var.f226468w;
            c16296x40c45249.b(d19, d27, booleanExtra, c16293xe2a3baf2.f226229m2, c16293xe2a3baf2.f226230n2, c16293xe2a3baf2.f226231o2);
            x1Var.f226467v.setSelected(true);
            x1Var.Z = false;
            x1Var.f226464s.f226293f = 0;
            x1Var.f226458o.setSelection(0);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6610x8c4aeff0 c6610x8c4aeff0 = x1Var.f226455l1;
            c6610x8c4aeff0.f139641g = 0L;
            c6610x8c4aeff0.f139640f = 5;
            x1Var.w(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
