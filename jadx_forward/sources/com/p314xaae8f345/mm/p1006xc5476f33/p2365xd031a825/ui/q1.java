package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7 f262113d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7 activityC19107x609745b7) {
        this.f262113d = activityC19107x609745b7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7 activityC19107x609745b7 = this.f262113d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindCardResultUI", "click tiny app, userName: %s, path: %s, version: %s", activityC19107x609745b7.f261408g, activityC19107x609745b7.f261409h, java.lang.Integer.valueOf(activityC19107x609745b7.f261410i));
        activityC19107x609745b7.V6(2);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        java.lang.String str = activityC19107x609745b7.f261408g;
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f88999a = str;
        java.lang.String str2 = activityC19107x609745b7.f261409h;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f89000b = str2;
        nxVar.f89002d = 1034;
        nxVar.f89001c = 0;
        int i17 = activityC19107x609745b7.f261410i;
        if (i17 > 0) {
            nxVar.f89007i = i17;
        }
        c6113xa3727625.e();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19107x609745b7.f261405d.f261155s.f95504e) || activityC19107x609745b7.f261405d.f261153q.f95508a <= 0) {
            activityC19107x609745b7.B = false;
        } else {
            activityC19107x609745b7.B = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
