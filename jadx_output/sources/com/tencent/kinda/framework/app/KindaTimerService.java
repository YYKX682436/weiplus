package com.tencent.kinda.framework.app;

/* loaded from: classes15.dex */
public class KindaTimerService implements com.tencent.kinda.gen.KTimerService {
    private static final java.lang.String TAG = "KindaTimerService";
    private float interval;
    private boolean needThrottle;
    private com.tencent.mm.sdk.platformtools.b4 throttleTimerHandler = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), new com.tencent.mm.sdk.platformtools.a4() { // from class: com.tencent.kinda.framework.app.KindaTimerService.4
        @Override // com.tencent.mm.sdk.platformtools.a4
        public boolean onTimerExpired() {
            return true;
        }
    }, true);
    private com.tencent.kinda.gen.VoidCallback timeCheckCallback;
    private com.tencent.mm.sdk.platformtools.b4 timerHandler;

    @Override // com.tencent.kinda.gen.KTimerService
    public void dispatchAfterImpl(float f17, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        t0Var.getClass();
        t0Var.z(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaTimerService.5
            @Override // java.lang.Runnable
            public void run() {
                voidCallback.call();
            }
        }, f17, false);
    }

    @Override // com.tencent.kinda.gen.KTimerService
    public void dispatchAsyncInBgThreadImpl(final com.tencent.kinda.gen.VoidCallback voidCallback) {
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaTimerService.6
            @Override // java.lang.Runnable
            public void run() {
                voidCallback.call();
            }
        });
    }

    @Override // com.tencent.kinda.gen.KTimerService
    public void dispatchAsyncInMainThreadImpl(final com.tencent.kinda.gen.VoidCallback voidCallback) {
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaTimerService.7
            @Override // java.lang.Runnable
            public void run() {
                voidCallback.call();
            }
        });
    }

    @Override // com.tencent.kinda.gen.KTimerService
    public void initIntervalAndCheckedCallbackImpl(float f17, com.tencent.kinda.gen.VoidCallback voidCallback) {
        this.interval = f17;
        this.timeCheckCallback = voidCallback;
    }

    @Override // com.tencent.kinda.gen.KTimerService
    public double now() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.kinda.gen.KTimerService
    public void startTimeCheck() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.timerHandler;
        if (b4Var != null && !b4Var.e()) {
            this.timerHandler.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), new com.tencent.mm.sdk.platformtools.a4() { // from class: com.tencent.kinda.framework.app.KindaTimerService.1
            @Override // com.tencent.mm.sdk.platformtools.a4
            public boolean onTimerExpired() {
                com.tencent.kinda.framework.app.KindaTimerService.this.timeCheckCallback.call();
                return true;
            }
        }, true);
        this.timerHandler = b4Var2;
        long j17 = this.interval * 1000.0f;
        b4Var2.c(j17, j17);
    }

    @Override // com.tencent.kinda.gen.KTimerService
    public void stopTimeCheck() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.timerHandler;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // com.tencent.kinda.gen.KTimerService
    public void throttleImpl(float f17, com.tencent.kinda.gen.VoidCallback voidCallback) {
        if (this.throttleTimerHandler == null) {
            this.throttleTimerHandler = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), new com.tencent.mm.sdk.platformtools.a4() { // from class: com.tencent.kinda.framework.app.KindaTimerService.2
                @Override // com.tencent.mm.sdk.platformtools.a4
                public boolean onTimerExpired() {
                    return true;
                }
            }, true);
        }
        if (this.needThrottle) {
            return;
        }
        voidCallback.call();
        this.needThrottle = true;
        this.throttleTimerHandler.postDelayed(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaTimerService.3
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.kinda.framework.app.KindaTimerService.this.needThrottle = false;
            }
        }, f17);
    }
}
