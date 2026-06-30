package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes15.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a f181250d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a) {
        this.f181250d = activityC13462x5ea70b8a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a = this.f181250d;
        try {
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(gm0.j1.u().d() + "exdevice_wifi_infos", 0, Integer.MAX_VALUE);
            if (N != null) {
                activityC13462x5ea70b8a.B.mo11468x92b714fd(N);
                activityC13462x5ea70b8a.V6();
            }
        } catch (java.lang.Exception e17) {
            e17.getMessage();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.ExdeviceConnectWifiUI", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.w0(this), 500L);
    }
}
