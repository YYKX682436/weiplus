package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskTimerTaskHelper */
/* loaded from: classes16.dex */
public class C27919xc5f18064 {

    /* renamed from: callback */
    private final com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27919xc5f18064.TimerTaskCallback f62328xf5bc2045;

    /* renamed from: interval */
    private long f62330x21ffe4c5;

    /* renamed from: taskRunnable */
    private java.lang.Runnable f62332xd20917c2;

    /* renamed from: isRunning */
    private boolean f62331x39e05d35 = false;

    /* renamed from: handler */
    private final android.os.Handler f62329x294b574a = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskTimerTaskHelper$TimerTaskCallback */
    /* loaded from: classes16.dex */
    public interface TimerTaskCallback {
        /* renamed from: onTick */
        void m121032xc39fcc1c();
    }

    public C27919xc5f18064(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27919xc5f18064.TimerTaskCallback timerTaskCallback, long j17) {
        this.f62328xf5bc2045 = timerTaskCallback;
        this.f62330x21ffe4c5 = j17;
    }

    /* renamed from: setInterval */
    public void m121029x98928347(long j17) {
        this.f62330x21ffe4c5 = j17;
    }

    /* renamed from: start */
    public void m121030x68ac462() {
        if (this.f62331x39e05d35) {
            return;
        }
        this.f62331x39e05d35 = true;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskTimerTaskHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27919xc5f18064.this.f62331x39e05d35 || com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27919xc5f18064.this.f62328xf5bc2045 == null) {
                    return;
                }
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27919xc5f18064.this.f62328xf5bc2045.m121032xc39fcc1c();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27919xc5f18064.this.f62329x294b574a.postDelayed(this, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27919xc5f18064.this.f62330x21ffe4c5);
            }
        };
        this.f62332xd20917c2 = runnable;
        this.f62329x294b574a.postDelayed(runnable, this.f62330x21ffe4c5);
    }

    /* renamed from: stop */
    public void m121031x360802() {
        if (this.f62331x39e05d35) {
            this.f62331x39e05d35 = false;
            this.f62329x294b574a.removeCallbacks(this.f62332xd20917c2);
        }
    }
}
