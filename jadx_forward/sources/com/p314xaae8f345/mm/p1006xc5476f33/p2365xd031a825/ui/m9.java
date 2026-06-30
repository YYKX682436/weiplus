package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class m9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f262034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 f262035e;

    public m9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        this.f262035e = activityC19125x69c29dd3;
        this.f262034d = c19091x9511676c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "hy: user clicked on the reset info tv and is balance. ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess and finish!");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3 = this.f262035e;
        android.os.Bundle m83105x7498fe14 = activityC19125x69c29dd3.m83105x7498fe14();
        m83105x7498fe14.putInt("key_err_code", 417);
        boolean z17 = true;
        m83105x7498fe14.putBoolean("key_need_show_switch_phone", true);
        activityC19125x69c29dd3.m83105x7498fe14().putBoolean("key_block_bind_new_card", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f262034d;
        if (c19091x9511676c != null && !c19091x9511676c.v0()) {
            z17 = false;
        }
        m83105x7498fe14.putBoolean("key_isbalance", z17);
        com.p314xaae8f345.mm.p2802xd031a825.a.d(activityC19125x69c29dd3, m83105x7498fe14);
        activityC19125x69c29dd3.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
