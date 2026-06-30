package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f149266d;

    public t3(long j17) {
        this.f149266d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatchVoipInterrupted: ");
        long j18 = this.f149266d;
        sb6.append(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FeatureService", sb6.toString());
        int h17 = dr0.a3.f323936d.a().h();
        dr0.p1 a17 = dr0.p1.f324022d.a();
        java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        android.app.ApplicationExitInfo b17 = a17.b(PROCESS_MAIN, h17);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("voipIdList", kz5.b0.c(java.lang.Long.valueOf(j18)));
        if (b17 != null) {
            new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.s3(linkedHashMap).mo149xb9724478(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29, b17);
            j17 = java.lang.System.currentTimeMillis() - b17.getTimestamp();
            i17 = b17.getReason();
            str = dr0.t3.a(b17);
        } else {
            j17 = -1;
            i17 = -1;
            str = "NotSupported";
        }
        java.lang.String[] strArr = new java.lang.String[4];
        strArr[0] = java.lang.String.valueOf(j17 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
        strArr[1] = java.lang.String.valueOf(i17);
        strArr[2] = str;
        if (b17 == null || (str2 = b17.getDescription()) == null) {
            str2 = "";
        }
        strArr[3] = str2;
        ap.a.a(1, "voipInterruptErr2", null, linkedHashMap, strArr);
    }
}
