package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17116x472c8308 f238232d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17116x472c8308 activityC17116x472c8308) {
        this.f238232d = activityC17116x472c8308;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17116x472c8308 activityC17116x472c8308 = this.f238232d;
        if (activityC17116x472c8308.f238096d.mo7958x54496c8e() == 0 && !activityC17116x472c8308.f238103n.f238257d && activityC17116x472c8308.f238102m.y() + 1 == activityC17116x472c8308.f238103n.mo1894x7e414b06()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "first screen refresh data!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "doFetchHistoryRecord() mLastId:%s", activityC17116x472c8308.f238099g);
            activityC17116x472c8308.m83099x5406100e(new sw3.f(activityC17116x472c8308.f238099g, activityC17116x472c8308.f238098f), false);
        }
    }
}
