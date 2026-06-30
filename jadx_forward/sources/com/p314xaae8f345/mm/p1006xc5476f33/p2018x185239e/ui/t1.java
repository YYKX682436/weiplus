package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358 f239479d;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358 activityC17130xb547a358) {
        this.f239479d = activityC17130xb547a358;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358 activityC17130xb547a358 = this.f239479d;
        if (activityC17130xb547a358.F == 65) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "mPayScene == WalletConstantsProtocal.MMPAY_PAY_SCENE_PERSONAL_PAYMENT_PROCESS,do not doNetSceneBusiF2fSucpage");
            return;
        }
        int i17 = activityC17130xb547a358.N + 1;
        activityC17130xb547a358.N = i17;
        activityC17130xb547a358.m83098x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r(activityC17130xb547a358.U, activityC17130xb547a358.G, activityC17130xb547a358.M.f469935d, i17 - 1, java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "retryFetchData() mRetryTime:%s mBusiF2FFaultConfig.succpage_retry_waiting_ms", java.lang.Integer.valueOf(activityC17130xb547a358.N), java.lang.Integer.valueOf(activityC17130xb547a358.M.f469938g));
        if (activityC17130xb547a358.M.f469937f <= activityC17130xb547a358.N) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(activityC17130xb547a358.T, r1.f469938g);
    }
}
