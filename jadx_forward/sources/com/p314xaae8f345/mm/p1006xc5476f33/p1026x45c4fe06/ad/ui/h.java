package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui;

/* loaded from: classes7.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d f156481d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d activityC11550x40c70d1d) {
        this.f156481d = activityC11550x40c70d1d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 m52174xaf156f4a;
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0> G1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d activityC11550x40c70d1d = this.f156481d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = activityC11550x40c70d1d.f156459e;
        if (o6Var != null && o6Var.x0() != null && activityC11550x40c70d1d.f156459e.x0().m52174xaf156f4a() != null && (G1 = (m52174xaf156f4a = activityC11550x40c70d1d.f156459e.x0().m52174xaf156f4a()).G1()) != null && !G1.isEmpty() && (m52174xaf156f4a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7)) {
            activityC11550x40c70d1d.f156461g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.e(activityC11550x40c70d1d, m52174xaf156f4a, G1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.e eVar = activityC11550x40c70d1d.f156461g;
            eVar.getClass();
            try {
                eVar.f156476b.v();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAdActionSheet", "show exception = %s", e17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ad/ui/AppBrandAdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
