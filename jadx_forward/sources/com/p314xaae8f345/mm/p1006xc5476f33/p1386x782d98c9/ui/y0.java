package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes15.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a f181258d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a) {
        this.f181258d = activityC13462x5ea70b8a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a = this.f181258d;
        java.lang.String str = activityC13462x5ea70b8a.f180754n;
        java.lang.String X6 = activityC13462x5ea70b8a.X6();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (X6 == null) {
            X6 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "ssid is null or nil.");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13462x5ea70b8a.f180755o.f416007e) || (str.equals(activityC13462x5ea70b8a.f180755o.f416007e) && !X6.equals(activityC13462x5ea70b8a.f180755o.f416008f))) {
            n32.a W6 = activityC13462x5ea70b8a.W6(activityC13462x5ea70b8a.f180758r, str);
            if (W6 == null) {
                W6 = new n32.a();
                W6.f416007e = str;
                W6.f416006d = activityC13462x5ea70b8a.f180758r;
                activityC13462x5ea70b8a.B.f416009d.add(W6);
            }
            ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r1.a(activityC13462x5ea70b8a.f180758r, str);
            ((zd0.e) hVar).getClass();
            W6.f416008f = xp1.c.h(X6, a17);
        } else if (!activityC13462x5ea70b8a.f180756p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "password hasn't changed, so do not need to save.");
            return;
        }
        java.lang.String str2 = gm0.j1.u().d() + "exdevice_wifi_infos";
        try {
            byte[] mo14344x5f01b1f6 = activityC13462x5ea70b8a.B.mo14344x5f01b1f6();
            com.p314xaae8f345.mm.vfs.w6.S(str2, mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
        } catch (java.io.IOException e17) {
            e17.getMessage();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.ExdeviceConnectWifiUI", e17, "", new java.lang.Object[0]);
        }
    }
}
