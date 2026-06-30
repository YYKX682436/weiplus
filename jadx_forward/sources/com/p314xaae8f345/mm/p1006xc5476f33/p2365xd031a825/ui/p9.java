package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class p9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f262110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 f262111e;

    public p9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        this.f262111e = activityC19125x69c29dd3;
        this.f262110d = c19091x9511676c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "hy: user clicked on the reset info tv and is balance. ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess3 and finish!");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3 = this.f262111e;
        at4.t tVar = activityC19125x69c29dd3.f261657u;
        if (tVar != null) {
            if ((tVar.f95496b == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f95497c)) ? false : true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13731, 9);
            }
        }
        android.os.Bundle m83105x7498fe14 = activityC19125x69c29dd3.m83105x7498fe14();
        m83105x7498fe14.putInt("key_err_code", 417);
        m83105x7498fe14.putBoolean("key_need_show_switch_phone", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f262110d;
        m83105x7498fe14.putBoolean("key_isbalance", c19091x9511676c == null || c19091x9511676c.v0());
        com.p314xaae8f345.mm.p2802xd031a825.a.d(activityC19125x69c29dd3, m83105x7498fe14);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
