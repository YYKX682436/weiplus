package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 f239310d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 abstractActivityC17129x6de84683) {
        this.f239310d = abstractActivityC17129x6de84683;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 abstractActivityC17129x6de84683 = this.f239310d;
        abstractActivityC17129x6de84683.mo48632xd46dd964();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683.I1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(12689, 9, 1);
        int i18 = abstractActivityC17129x6de84683.f238673m;
        if (i18 == 1 || i18 == 6) {
            java.lang.String string = abstractActivityC17129x6de84683.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hyd);
            java.lang.String string2 = abstractActivityC17129x6de84683.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hz8);
            g0Var.d(14074, 1);
            str = string;
            str2 = string2;
        } else {
            java.lang.String string3 = abstractActivityC17129x6de84683.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hyc);
            java.lang.String string4 = abstractActivityC17129x6de84683.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hyh);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            str = string3;
            str2 = string4;
        }
        gt4.l.b(abstractActivityC17129x6de84683, str, abstractActivityC17129x6de84683.H, str2, false, 20, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.e1(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.g1(this));
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
