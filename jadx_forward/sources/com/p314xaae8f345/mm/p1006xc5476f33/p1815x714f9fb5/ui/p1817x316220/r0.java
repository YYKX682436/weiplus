package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class r0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 f226423d;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var) {
        this.f226423d = x1Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var = this.f226423d;
            if (i17 < x1Var.f226464s.getCount()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 item = x1Var.f226464s.getItem(i17);
                if (item.f226320m == 0) {
                    x1Var.f226467v.setSelected(false);
                } else {
                    x1Var.f226467v.setSelected(true);
                }
                x1Var.E = item.f226311d;
                x1Var.F = item.f226310c;
                x1Var.f226468w.h1(item.f226322o, item.f226323p);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f226322o)) {
                    x1Var.f226443e.mo1001x8873d7af().mo990x42ab093c(item.f226311d, item.f226310c, 15);
                } else {
                    x1Var.f226443e.mo1001x8873d7af().mo990x42ab093c(item.f226311d, item.f226310c, 18);
                }
                if (x1Var.k().getBooleanExtra("key_geo_coder_four_level", false)) {
                    u60.h hVar = new u60.h(x1Var.E, x1Var.F);
                    hVar.f506404d = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f226322o) ? 1 : 0;
                    hVar.f506405e = item.f226323p;
                    hVar.f506407g = true;
                    ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).b(hVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q0(this, item));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.c0 c0Var = x1Var.f226464s;
                c0Var.f226293f = i17;
                c0Var.notifyDataSetChanged();
                x1Var.Z = false;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109) x1Var.f226443e).announceForAccessibility(x1Var.f226442d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggv));
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6610x8c4aeff0 c6610x8c4aeff0 = x1Var.f226455l1;
                c6610x8c4aeff0.f139641g = i17 + 1;
                c6610x8c4aeff0.f139640f = 4;
                yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPoiMapUI", "wrong position");
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
