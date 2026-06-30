package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaTimerService */
/* loaded from: classes15.dex */
public class C3145x9346cf7d implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3536x1681cb9b {
    private static final java.lang.String TAG = "KindaTimerService";

    /* renamed from: interval */
    private float f12121x21ffe4c5;

    /* renamed from: needThrottle */
    private boolean f12122xb48a81e0;

    /* renamed from: throttleTimerHandler */
    private com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f12123x3f18908f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), new com.p314xaae8f345.mm.sdk.p2603x2137b148.a4() { // from class: com.tencent.kinda.framework.app.KindaTimerService.4
        @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
        /* renamed from: onTimerExpired */
        public boolean mo322xdd48fb9f() {
            return true;
        }
    }, true);

    /* renamed from: timeCheckCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12124x260173a0;

    /* renamed from: timerHandler */
    private com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f12125xdf5b2045;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3536x1681cb9b
    /* renamed from: dispatchAfterImpl */
    public void mo25400x9860d2c2(float f17, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        t0Var.getClass();
        t0Var.z(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaTimerService.5
            @Override // java.lang.Runnable
            public void run() {
                abstractC3623x3b485619.mo25801x2e7a5e();
            }
        }, f17, false);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3536x1681cb9b
    /* renamed from: dispatchAsyncInBgThreadImpl */
    public void mo25401x1d9ca9f6(final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaTimerService.6
            @Override // java.lang.Runnable
            public void run() {
                abstractC3623x3b485619.mo25801x2e7a5e();
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3536x1681cb9b
    /* renamed from: dispatchAsyncInMainThreadImpl */
    public void mo25402xc4ee5caa(final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaTimerService.7
            @Override // java.lang.Runnable
            public void run() {
                abstractC3623x3b485619.mo25801x2e7a5e();
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3536x1681cb9b
    /* renamed from: initIntervalAndCheckedCallbackImpl */
    public void mo25403xdacb1a4a(float f17, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        this.f12121x21ffe4c5 = f17;
        this.f12124x260173a0 = abstractC3623x3b485619;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3536x1681cb9b
    public double now() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3536x1681cb9b
    /* renamed from: startTimeCheck */
    public void mo25404xeb8083f9() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f12125xdf5b2045;
        if (b4Var != null && !b4Var.e()) {
            this.f12125xdf5b2045.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), new com.p314xaae8f345.mm.sdk.p2603x2137b148.a4() { // from class: com.tencent.kinda.framework.app.KindaTimerService.1
            @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
            /* renamed from: onTimerExpired */
            public boolean mo322xdd48fb9f() {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3145x9346cf7d.this.f12124x260173a0.mo25801x2e7a5e();
                return true;
            }
        }, true);
        this.f12125xdf5b2045 = b4Var2;
        long j17 = this.f12121x21ffe4c5 * 1000.0f;
        b4Var2.c(j17, j17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3536x1681cb9b
    /* renamed from: stopTimeCheck */
    public void mo25405x88b75459() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f12125xdf5b2045;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3536x1681cb9b
    /* renamed from: throttleImpl */
    public void mo25406xd420bc6a(float f17, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        if (this.f12123x3f18908f == null) {
            this.f12123x3f18908f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), new com.p314xaae8f345.mm.sdk.p2603x2137b148.a4() { // from class: com.tencent.kinda.framework.app.KindaTimerService.2
                @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
                /* renamed from: onTimerExpired */
                public boolean mo322xdd48fb9f() {
                    return true;
                }
            }, true);
        }
        if (this.f12122xb48a81e0) {
            return;
        }
        abstractC3623x3b485619.mo25801x2e7a5e();
        this.f12122xb48a81e0 = true;
        this.f12123x3f18908f.mo50297x7c4d7ca2(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaTimerService.3
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3145x9346cf7d.this.f12122xb48a81e0 = false;
            }
        }, f17);
    }
}
