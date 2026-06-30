package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 f260902d;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5) {
        this.f260902d = activityC19082x760c9ba5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5 = this.f260902d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o(activityC19082x760c9ba5.mo55332x76847179());
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = calendar.get(1);
        int i18 = calendar.get(2) + 1;
        int i19 = calendar.get(5);
        oVar.d(i17, i18, i19);
        int i27 = i17 + org.p3343x72743996.net.InterfaceC29524x4f65168b.f73913x76158116;
        if (i27 < 1) {
            i27 = 1;
        }
        oVar.f(i27, 1, 1);
        oVar.e(i17, i18, i19);
        oVar.f293840n = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.d2(this, oVar);
        java.lang.String str = (java.lang.String) activityC19082x760c9ba5.A.f261007v.mo3195x754a37bb();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.length() >= 10) {
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str.substring(0, 4), 0);
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str.substring(5, 7), 0);
            int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str.substring(9, 10), 0);
            if (P > 0 && P2 > 0 && P3 > 0) {
                oVar.d(P, P2, P3);
            }
        }
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
