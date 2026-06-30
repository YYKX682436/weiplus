package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class z1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 f238287b;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94, int i17) {
        this.f238287b = activityC17121x70367c94;
        this.f238286a = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a0
    /* renamed from: onCancel */
    public void mo25075x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "mVerifyNameTv onCancel()");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94 = this.f238287b;
        activityC17121x70367c94.mo48674x36654fab();
        activityC17121x70367c94.m83136xb67ebaa8();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a0
    /* renamed from: onINputName */
    public void mo25076x67bff276(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "mVerifyNameTv onINputName() name:%s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94 = this.f238287b;
        activityC17121x70367c94.mo48674x36654fab();
        int i17 = this.f238286a;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94.f238145y0;
        activityC17121x70367c94.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "do check name: %s", java.lang.Integer.valueOf(i17));
        activityC17121x70367c94.m83099x5406100e(new sw3.b(i17, activityC17121x70367c94.f238147d, activityC17121x70367c94.f238148e, str, activityC17121x70367c94.f238158q, i17 == 2 ? activityC17121x70367c94.U : ""), true);
    }
}
