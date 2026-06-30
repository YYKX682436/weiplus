package com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e;

/* renamed from: com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker */
/* loaded from: classes14.dex */
public abstract class AbstractC27954x5371a703 {
    private static final java.lang.String TAG = "CloudFaceCountDownTimer";

    /* renamed from: mCancelled */
    private volatile boolean f62569x971f7364 = false;

    /* renamed from: mCountdownInterval */
    private final long f62570xc8b86529;

    /* renamed from: mMillisInFuture */
    private final long f62571xba67b97b;

    /* renamed from: mStopTimeInFuture */
    private long f62572x6d2224e4;

    /* renamed from: mTimer */
    private volatile java.util.Timer f62573xbed152d8;

    /* renamed from: mTimerTask */
    private volatile java.util.TimerTask f62574x7de3d07d;

    public AbstractC27954x5371a703(long j17, long j18) {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "[TimerWorker.TimerWorker] mCountDownTimer");
        this.f62571xba67b97b = j17;
        this.f62570xc8b86529 = j18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: continueTimerJudge */
    public void m121205xdd8cded9() {
        if (this.f62569x971f7364) {
            return;
        }
        long elapsedRealtime = this.f62572x6d2224e4 - android.os.SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            m121206xae7a2e7a();
            mo121072x42fe6352();
        } else {
            if (elapsedRealtime < this.f62570xc8b86529) {
                return;
            }
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            mo121073xc39fcc1c(elapsedRealtime);
            long elapsedRealtime3 = (elapsedRealtime2 + this.f62570xc8b86529) - android.os.SystemClock.elapsedRealtime();
            while (elapsedRealtime3 < 0) {
                elapsedRealtime3 += this.f62570xc8b86529;
            }
        }
    }

    /* renamed from: cancel */
    public final synchronized void m121206xae7a2e7a() {
        this.f62569x971f7364 = true;
        if (this.f62573xbed152d8 != null) {
            this.f62573xbed152d8.cancel();
            this.f62573xbed152d8 = null;
        }
        if (this.f62574x7de3d07d != null) {
            this.f62574x7de3d07d.cancel();
            this.f62574x7de3d07d = null;
        }
    }

    /* renamed from: onFinish */
    public abstract void mo121072x42fe6352();

    /* renamed from: onTick */
    public abstract void mo121073xc39fcc1c(long j17);

    /* renamed from: start */
    public final synchronized com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.AbstractC27954x5371a703 m121207x68ac462() {
        this.f62569x971f7364 = false;
        if (this.f62571xba67b97b <= 0) {
            mo121072x42fe6352();
            return this;
        }
        this.f62572x6d2224e4 = android.os.SystemClock.elapsedRealtime() + this.f62571xba67b97b;
        this.f62573xbed152d8 = new java.util.Timer();
        this.f62574x7de3d07d = new java.util.TimerTask() { // from class: com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.AbstractC27954x5371a703.this.f62569x971f7364) {
                    return;
                }
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.AbstractC27954x5371a703.this.m121205xdd8cded9();
            }
        };
        this.f62573xbed152d8.schedule(this.f62574x7de3d07d, 0L, this.f62570xc8b86529);
        return this;
    }
}
