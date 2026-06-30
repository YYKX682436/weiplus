package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.q0 f239518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 f239519e;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 abstractActivityC17129x6de84683, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.q0 q0Var) {
        this.f239519e = abstractActivityC17129x6de84683;
        this.f239518d = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 abstractActivityC17129x6de84683 = this.f239519e;
        abstractActivityC17129x6de84683.mo73913x2b33b77f();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.q0 q0Var = this.f239518d;
        abstractActivityC17129x6de84683.i7(q0Var.f238497d, abstractActivityC17129x6de84683.f238668f, abstractActivityC17129x6de84683.Q, q0Var);
        if (abstractActivityC17129x6de84683.f238673m == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12689, 12, 1);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12689, 3, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
