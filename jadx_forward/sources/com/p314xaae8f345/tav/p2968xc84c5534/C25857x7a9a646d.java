package com.p314xaae8f345.tav.p2968xc84c5534;

/* renamed from: com.tencent.tav.report.TimePrinter */
/* loaded from: classes10.dex */
public class C25857x7a9a646d {
    private java.lang.String TAG = "TimeDebug";

    /* renamed from: currentSyncTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48799xf29ab4a1;

    /* renamed from: currentTimeUs */
    private long f48800x86cdc924;

    /* renamed from: printerMap */
    private static java.util.Map<java.lang.String, com.p314xaae8f345.tav.p2968xc84c5534.C25857x7a9a646d> f48798x89a36e2 = new java.util.HashMap();

    /* renamed from: constMap */
    private static java.util.Map<java.lang.String, com.p314xaae8f345.tav.p2968xc84c5534.C25857x7a9a646d> f48797xde2796f9 = new java.util.HashMap();

    public C25857x7a9a646d(java.lang.String str) {
        this.TAG += "-" + str;
    }

    /* renamed from: print */
    public static synchronized void m98332x65fb2ad(java.lang.String str, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        synchronized (com.p314xaae8f345.tav.p2968xc84c5534.C25857x7a9a646d.class) {
            com.p314xaae8f345.tav.p2968xc84c5534.C25857x7a9a646d c25857x7a9a646d = f48798x89a36e2.get(str);
            if (c25857x7a9a646d == null) {
                c25857x7a9a646d = new com.p314xaae8f345.tav.p2968xc84c5534.C25857x7a9a646d(str);
                f48798x89a36e2.put(str, c25857x7a9a646d);
            }
            c25857x7a9a646d.m98334x65fb2ad(c25736x76b98a57);
        }
    }

    /* renamed from: printCons */
    public static synchronized void m98333x94dcb77e(java.lang.String str) {
        synchronized (com.p314xaae8f345.tav.p2968xc84c5534.C25857x7a9a646d.class) {
            com.p314xaae8f345.tav.p2968xc84c5534.C25857x7a9a646d c25857x7a9a646d = f48797xde2796f9.get(str);
            if (c25857x7a9a646d == null) {
                f48797xde2796f9.put(str, new com.p314xaae8f345.tav.p2968xc84c5534.C25857x7a9a646d(str, java.lang.System.nanoTime() / 1000));
            } else {
                c25857x7a9a646d.m98335x94dcb77e();
                f48797xde2796f9.remove(str);
            }
        }
    }

    public C25857x7a9a646d(java.lang.String str, long j17) {
        this.TAG += "-" + str;
        this.f48800x86cdc924 = j17;
    }

    /* renamed from: print */
    public void m98334x65fb2ad(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = this.f48799xf29ab4a1;
        if (c25736x76b98a572 == null) {
            this.f48799xf29ab4a1 = c25736x76b98a57;
        } else {
            c25736x76b98a57.sub(c25736x76b98a572).m97232x31040141();
            this.f48799xf29ab4a1 = c25736x76b98a57;
        }
    }

    /* renamed from: printCons */
    public void m98335x94dcb77e() {
        long nanoTime = java.lang.System.nanoTime() / 1000;
    }
}
