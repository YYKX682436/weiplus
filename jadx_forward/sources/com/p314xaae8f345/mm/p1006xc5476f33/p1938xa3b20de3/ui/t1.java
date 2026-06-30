package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234253d;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38) {
        this.f234253d = activityC16764xd1ab6b38;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "click jump info layout");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14515, 6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = this.f234253d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.u3 u3Var = activityC16764xd1ab6b38.S;
        if (u3Var.f234270f == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u3Var.f234267c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "jump to tinyapp, username : %s", activityC16764xd1ab6b38.S.f234267c);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.u3 u3Var2 = activityC16764xd1ab6b38.S;
            java.lang.String str = u3Var2.f234267c;
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = str;
            java.lang.String str2 = u3Var2.f234268d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f89000b = str2;
            nxVar.f89002d = 1137;
            nxVar.f89001c = 0;
            c6113xa3727625.e();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.u3 u3Var3 = activityC16764xd1ab6b38.S;
            if (u3Var3.f234270f == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u3Var3.f234269e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "jump to h5 : %s", activityC16764xd1ab6b38.S.f234269e);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(activityC16764xd1ab6b38.mo55332x76847179(), activityC16764xd1ab6b38.S.f234269e, false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
