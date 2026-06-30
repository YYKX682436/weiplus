package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class v0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 f226440d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var) {
        this.f226440d = x1Var;
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
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$13", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var = this.f226440d;
        if (-1 == x1Var.f226465t.f226293f) {
            x1Var.s(true);
            x1Var.y(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.w1.COLLAPSED);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.c0 c0Var = x1Var.f226465t;
        c0Var.f226293f = i17;
        c0Var.notifyDataSetChanged();
        if (i17 >= 0 && i17 < x1Var.f226465t.getCount()) {
            x1Var.Z = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16286x1df9f586 c16286x1df9f586 = x1Var.I1;
            if (c16286x1df9f586 != null && za3.w.STAND == c16286x1df9f586.B) {
                c16286x1df9f586.B = za3.w.SIT;
                c16286x1df9f586.f226172q.reverse();
                c16286x1df9f586.f226173r.reverse();
                c16286x1df9f586.f226174s.reverse();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 item = x1Var.f226465t.getItem(i17);
            if (item.f226311d == x1Var.G && item.f226310c == x1Var.H) {
                x1Var.f226467v.setSelected(true);
            } else {
                x1Var.f226467v.setSelected(false);
            }
            x1Var.f226468w.h1(item.f226322o, item.f226323p);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f226322o)) {
                x1Var.f226443e.mo1001x8873d7af().mo990x42ab093c(item.f226311d, item.f226310c, 15);
            } else {
                x1Var.f226443e.mo1001x8873d7af().mo990x42ab093c(item.f226311d, item.f226310c, 18);
            }
            if (x1Var.k().getBooleanExtra("key_geo_coder_four_level", false)) {
                u60.h hVar = new u60.h(item.f226311d, item.f226310c);
                hVar.f506404d = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f226322o) ? 1 : 0;
                hVar.f506405e = item.f226323p;
                hVar.f506407g = true;
                ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).b(hVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.u0(this, item));
            }
            java.util.Map map = x1Var.J1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16286x1df9f586 c16286x1df9f5862 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16286x1df9f586) ((java.util.HashMap) map).get(item.f226311d + "" + item.f226310c);
            if (c16286x1df9f5862 == null) {
                c16286x1df9f5862 = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16286x1df9f586(x1Var.f226442d, x1Var.f226443e);
                c16286x1df9f5862.m65946xa32537ab(i17);
                c16286x1df9f5862.m65945xa8446699(x1Var.H1);
                ((java.util.HashMap) map).put(item.f226311d + "" + item.f226310c, c16286x1df9f5862);
                c16286x1df9f5862.b(item.f226311d, item.f226310c, true);
            } else {
                c16286x1df9f5862.c();
            }
            x1Var.I1 = c16286x1df9f5862;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6610x8c4aeff0 c6610x8c4aeff0 = x1Var.f226455l1;
            c6610x8c4aeff0.f139641g = i17 + 1;
            c6610x8c4aeff0.f139640f = 1;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$13", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
