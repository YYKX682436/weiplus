package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f234529a = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("diagnostic_storage");

    /* renamed from: b, reason: collision with root package name */
    public static final long f234530b = java.util.concurrent.TimeUnit.DAYS.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f234531c;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f234531c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5846xa44f96da>(a0Var) { // from class: com.tencent.mm.plugin.performance.jectl.JeVersion$1

            /* renamed from: d, reason: collision with root package name */
            public long f234527d = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.a.f234529a.q("JV_KEY_LAST_REPORT_TIME_MILLIS_LONG", 0);

            {
                this.f39173x3fe91575 = -790196534;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5846xa44f96da c5846xa44f96da) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = currentTimeMillis - this.f234527d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JeVersion", "currentMillis - mLastReportTimeMillis = %s", java.lang.Long.valueOf(j17));
                if (j17 < com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.a.f234530b) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JeVersion", "not report");
                } else {
                    this.f234527d = currentTimeMillis;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.a.f234529a.B("JV_KEY_LAST_REPORT_TIME_MILLIS_LONG", currentTimeMillis);
                    try {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.a.a();
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JeVersion", th6, "", new java.lang.Object[0]);
                    }
                }
                return false;
            }
        };
    }

    public static void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f234529a;
        if (!android.os.Build.FINGERPRINT.equalsIgnoreCase(o4Var.u("JV_KEY_LAST_FINGERPRINT_STRING", ""))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JeVersion", "finger print changed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JeVersion", "reportJeVersionHard");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startService(new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.ServiceC16798xc23ab7f3.class));
            return;
        }
        java.lang.String u17 = o4Var.u("JV_KEY_LAST_JE_VERSION_STRING", "");
        if (!android.text.TextUtils.isEmpty(u17)) {
            b(u17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JeVersion", "lastVersion is empty");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JeVersion", "reportJeVersionHard");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startService(new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.ServiceC16798xc23ab7f3.class));
    }

    public static void b(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1446, 20, 1));
        int i17 = str.startsWith("5.1.0") ? 21 : str.startsWith("5.0.1") ? 22 : str.startsWith("4.4.0") ? 23 : str.startsWith("4.") ? 24 : str.startsWith("3.") ? 25 : str.startsWith("64-bit") ? 26 : str.startsWith("Error") ? 27 : str.startsWith("Exception") ? 28 : str.startsWith("CrashTooManyTimes") ? 29 : 30;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JeVersion", "je version = %s", str);
        arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1446, i17, 1));
        jx3.f.INSTANCE.b(arrayList, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JeVersion", "report done");
    }
}
