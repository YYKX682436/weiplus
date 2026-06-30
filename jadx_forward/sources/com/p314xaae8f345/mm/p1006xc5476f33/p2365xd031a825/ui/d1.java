package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514 f261765d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514 activityC19106xf6056514) {
        this.f261765d = activityC19106xf6056514;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11353, 1, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514 activityC19106xf6056514 = this.f261765d;
        if (activityC19106xf6056514.m83108x2b5a5a39() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.WalletInputCardIDUI", "WalletBankcardIdUI doNext, process is null");
        } else {
            java.lang.String string = activityC19106xf6056514.m83108x2b5a5a39().f295334c.getString("kreq_token");
            int i17 = activityC19106xf6056514.m83105x7498fe14().getInt("entry_scene", -1);
            int i18 = activityC19106xf6056514.m83105x7498fe14().getInt("real_name_verify_mode") == 4 ? 1 : 0;
            if (activityC19106xf6056514.f261396h != null) {
                ss4.z zVar = new ss4.z(activityC19106xf6056514.m83107xcc3330f3(), null, (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) activityC19106xf6056514.m83105x7498fe14().getParcelable("key_pay_info"), string, activityC19106xf6056514.f261399n, i17, i18);
                zVar.f493683g = activityC19106xf6056514.f261396h.f69223x58802fcb;
                activityC19106xf6056514.m83105x7498fe14().putParcelable("key_history_bankcard", activityC19106xf6056514.f261396h);
                activityC19106xf6056514.m83098x5406100e(zVar);
            } else if (activityC19106xf6056514.U6()) {
                activityC19106xf6056514.m83098x5406100e(new ss4.z(activityC19106xf6056514.m83107xcc3330f3(), activityC19106xf6056514.f261393e.m83183xfb85ada3(), (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) activityC19106xf6056514.m83105x7498fe14().getParcelable("key_pay_info"), string, activityC19106xf6056514.f261399n, i17, i18));
            } else {
                db5.e1.i(activityC19106xf6056514, com.p314xaae8f345.mm.R.C30867xcad56011.krm, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
