package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes9.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.q f237082d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.q qVar) {
        this.f237082d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!fp.i.b()) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        et3.b bVar = (et3.b) view.getTag();
        boolean k07 = o72.x1.k0(bVar.f338123a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.q qVar = this.f237082d;
        if (k07) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OtherViewWrapper", "same song, do release");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8 c6773x3bf523d8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8();
            c6773x3bf523d8.f140989j = 2L;
            c6773x3bf523d8.f140990k = 16L;
            zy2.oc.b(c6773x3bf523d8);
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).pj();
            if (!qVar.f237088d) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = qVar.f237087c;
                n3Var.mo50309x6d91b823(n3Var.mo50289x733c63a2(1));
            }
        } else {
            qVar.f237088d = true;
            r45.gp0 gp0Var = bVar.f338123a;
            o72.x1.u0(gp0Var, gp0Var.J1.f457886d.f458778w, java.lang.Boolean.TRUE, qVar.H().f106955d, qVar.G(bVar.f338124b), java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f237092h)), qVar.f237090f, qVar.f237089e);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8 c6773x3bf523d82 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8();
            c6773x3bf523d82.f140989j = 1L;
            c6773x3bf523d82.f140990k = 16L;
            zy2.oc.b(c6773x3bf523d82);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
