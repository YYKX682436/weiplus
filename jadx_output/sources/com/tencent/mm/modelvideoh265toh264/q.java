package com.tencent.mm.modelvideoh265toh264;

/* loaded from: classes10.dex */
public class q extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public volatile int f71719e;

    /* renamed from: f, reason: collision with root package name */
    public int f71720f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f71721g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f71722h = new java.lang.Object();

    public q(com.tencent.mm.modelvideoh265toh264.r rVar, com.tencent.mm.modelvideoh265toh264.n nVar) {
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "MediaCodecFFMpegTranscoder_Encoder";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f71720f == -1) {
            this.f71720f = android.os.Process.myTid();
            android.os.Process.setThreadPriority(android.os.Process.myTid(), -2);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "encodeTid: %s", java.lang.Integer.valueOf(this.f71720f));
        }
        this.f71719e = 0;
        synchronized (this.f71722h) {
            while (!this.f71721g) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "try trigger encode");
                int triggerEncodeForSegmentLock = com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.triggerEncodeForSegmentLock(java.lang.Math.max(0, this.f71719e), false);
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "ing: trigger encode use %dms, Encode index[%d, %d), threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(this.f71719e), java.lang.Integer.valueOf(triggerEncodeForSegmentLock), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                if (triggerEncodeForSegmentLock == this.f71719e) {
                    try {
                        java.lang.Thread.sleep(5L);
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.VideoTranscoder", "thread sleep error");
                    }
                }
                this.f71719e = triggerEncodeForSegmentLock;
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            this.f71719e = com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.triggerEncodeForSegmentLock(this.f71719e, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "end: trigger encode use %dms, curEncode index %d, threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Integer.valueOf(this.f71719e), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        }
    }
}
