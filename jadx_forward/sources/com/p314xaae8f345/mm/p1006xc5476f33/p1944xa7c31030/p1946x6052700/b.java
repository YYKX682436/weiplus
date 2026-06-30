package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.ServiceC16798xc23ab7f3 f234532d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.ServiceC16798xc23ab7f3 serviceC16798xc23ab7f3) {
        this.f234532d = serviceC16798xc23ab7f3;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.ServiceC16798xc23ab7f3.f234528d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.ServiceC16798xc23ab7f3 serviceC16798xc23ab7f3 = this.f234532d;
        serviceC16798xc23ab7f3.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.a.f234529a;
        final int o17 = o4Var.o("JV_KEY_CRASH_TIMES_INT", 0);
        com.p314xaae8f345.mm.app.C5000x71a2fa35.W.f(new java.util.concurrent.Callable() { // from class: com.tencent.mm.plugin.performance.jectl.JeVersion$JeService$$a
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.ServiceC16798xc23ab7f3.f234528d;
                return "JeService crashed for " + (o17 + 1) + " times";
            }
        });
        com.p314xaae8f345.mm.app.i4.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.c(serviceC16798xc23ab7f3));
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JeVersion", th6, "JeCtl.version", new java.lang.Object[0]);
            str = "Exception";
        }
        if (o4Var.o("JV_KEY_CRASH_TIMES_INT", 0) > 3) {
            o4Var.D("JV_KEY_LAST_JE_VERSION_STRING", "CrashTooManyTimes");
            o4Var.D("JV_KEY_LAST_FINGERPRINT_STRING", android.os.Build.FINGERPRINT);
            serviceC16798xc23ab7f3.stopSelf();
        } else {
            str = fp.q.b("xperf") ? com.p314xaae8f345.p552xbf8d97c1.p570x31b1d387.C4693x94e9f347.c() : "no_xperf";
            o4Var.D("JV_KEY_LAST_JE_VERSION_STRING", str);
            o4Var.D("JV_KEY_LAST_FINGERPRINT_STRING", android.os.Build.FINGERPRINT);
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.a.b(str);
            serviceC16798xc23ab7f3.stopSelf();
        }
    }
}
