package fi3;

/* loaded from: classes10.dex */
public class n extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public volatile int f344578e;

    /* renamed from: f, reason: collision with root package name */
    public int f344579f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f344580g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f344581h = new java.lang.Object();

    public n(fi3.o oVar, fi3.m mVar) {
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MediaCodecFFMpegTranscoder_Encoder";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f344579f == -1) {
            this.f344579f = android.os.Process.myTid();
            android.os.Process.setThreadPriority(android.os.Process.myTid(), -2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxX264Encoder", "encodeTid: %s", java.lang.Integer.valueOf(this.f344579f));
        }
        this.f344578e = 0;
        synchronized (this.f344581h) {
            while (!this.f344580g) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxX264Encoder", "try trigger encode");
                int m66902x1263a403 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66902x1263a403(java.lang.Math.max(0, this.f344578e), false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxX264Encoder", "ing: trigger encode use %dms, Encode index[%d, %d), threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(this.f344578e), java.lang.Integer.valueOf(m66902x1263a403), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                if (m66902x1263a403 == this.f344578e) {
                    try {
                        java.lang.Thread.sleep(10L);
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRemuxX264Encoder", "thread sleep error");
                    }
                }
                this.f344578e = m66902x1263a403;
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            this.f344578e = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66902x1263a403(this.f344578e, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxX264Encoder", "end: trigger encode use %dms, curEncode index %d, threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Integer.valueOf(this.f344578e), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        }
    }
}
