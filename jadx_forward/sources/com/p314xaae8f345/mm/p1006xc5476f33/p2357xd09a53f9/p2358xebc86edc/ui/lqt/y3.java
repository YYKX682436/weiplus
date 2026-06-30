package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 f259984d;

    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936) {
        this.f259984d = activityC19014x45f83936;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936 = this.f259984d;
        if (activityC19014x45f83936.f259531w.isShown()) {
            activityC19014x45f83936.mo73823x964575a5();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanAddUI", "click btn");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936.Z6(activityC19014x45f83936);
        if (!activityC19014x45f83936.f259528t.isEnabled()) {
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r45.be5 be5Var = activityC19014x45f83936.H;
        if (be5Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(be5Var.f452242d)) {
            if (activityC19014x45f83936.C == 1) {
                activityC19014x45f83936.d7(0);
            } else {
                activityC19014x45f83936.d7(4);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC19014x45f83936.mo55332x76847179(), 1, 3);
        z2Var.m(activityC19014x45f83936.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571906t6), activityC19014x45f83936.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571540i9));
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.v3 v3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.v3(activityC19014x45f83936, z2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.w3 w3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.w3(activityC19014x45f83936, z2Var);
        z2Var.D = v3Var;
        z2Var.E = w3Var;
        android.view.View inflate = android.view.View.inflate(activityC19014x45f83936.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bt7, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.iu7);
        textView.setText(activityC19014x45f83936.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpw));
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        z2Var.s(inflate);
        android.view.View inflate2 = android.view.View.inflate(activityC19014x45f83936.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bt6, null);
        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.iu6);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        java.lang.String string = activityC19014x45f83936.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpv, activityC19014x45f83936.H.f452242d);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(textView2, string, 0, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(activityC19014x45f83936, string).length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.x3(activityC19014x45f83936), true), activityC19014x45f83936.mo55332x76847179());
        z2Var.j(inflate2);
        z2Var.C();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
