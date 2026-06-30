package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes15.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a f181233f;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a, java.lang.String str, java.lang.String str2) {
        this.f181233f = activityC13462x5ea70b8a;
        this.f181231d = str;
        this.f181232e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a = this.f181233f;
        activityC13462x5ea70b8a.F.acquire();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Start AirKiss result (%d). input ssid = %s", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55028x6ef26b0c(this.f181231d, this.f181232e, activityC13462x5ea70b8a.f180759s, 60000L, activityC13462x5ea70b8a.f180760t, activityC13462x5ea70b8a.f180761u)), this.f181232e);
    }
}
