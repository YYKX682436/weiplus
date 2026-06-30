package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class o7 implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154294a;

    public o7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda) {
        this.f154294a = activityC11355x7bcfecda;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public void mo48650xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "onClick() mBottomTipTv");
        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = this.f154294a;
        if (!qVar.mo24838x4e268286(activityC11355x7bcfecda)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_scene_balance_manager", 0);
            j45.l.j(activityC11355x7bcfecda, "wallet", ".balance.ui.WalletBalanceManagerUI", intent, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 4, 4, java.lang.Integer.valueOf(activityC11355x7bcfecda.R));
    }
}
