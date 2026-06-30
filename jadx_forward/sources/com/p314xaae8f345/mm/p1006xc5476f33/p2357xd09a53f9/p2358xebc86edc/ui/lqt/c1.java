package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class c1 implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259646a;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b) {
        this.f259646a = activityC19013x23c3e97b;
    }

    @Override // h45.i
    /* renamed from: onKindaBusinessCallback */
    public void mo24858x44dbb8f3(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("dataSource");
        java.lang.String stringExtra2 = intent.getStringExtra("cmdWord");
        if (stringExtra.equals("LQTRedeemUseCase")) {
            if (!stringExtra2.equals("onAlertResetPwd")) {
                stringExtra2.equals("updateWalletLQTBalance");
                return;
            }
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b.R1;
            com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
            ((h45.q) i95.n0.c(h45.q.class)).mo24828x975e1547(this.f259646a, null);
        }
    }
}
