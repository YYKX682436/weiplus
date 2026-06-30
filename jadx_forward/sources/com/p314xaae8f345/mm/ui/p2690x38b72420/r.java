package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment f288679d;

    public r(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment) {
        this.f288679d = addressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Process.setThreadPriority(10);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment = this.f288679d;
        int i17 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment.Y;
        synchronized (addressUIFragment) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            addressUIFragment.z0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddressUI", "KEVIN updateBlockList() LAST" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (addressUIFragment.f287842q != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2690x38b72420.n(addressUIFragment));
            }
            if (addressUIFragment.f287843r != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2690x38b72420.o(addressUIFragment));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddressUI", "KEVIN doRefresh() LAST" + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
        }
    }
}
