package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaShakeCheckingManager */
/* loaded from: classes13.dex */
public class C3142xff72e75a implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3410x4cc4fa76 {

    /* renamed from: CONTINUE_SHAKE_INTERVAL */
    private static final int f12088x4dd5a096 = 80;

    /* renamed from: FIRST_SHAKE_INTERVAL */
    private static final int f12089x86a1338d = 1200;

    /* renamed from: SENSITIVITY_MAX_VALUE */
    private static final float f12090x3113fcd6 = 3.6f;

    /* renamed from: SENSITIVITY_MIN_VALUE */
    private static final float f12091x5f1f1344 = 0.3f;

    /* renamed from: delayNotifyCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12094xaa1e711;

    /* renamed from: lastShakeTime */
    private long f12099x2ace38fd;

    /* renamed from: shakeCallBack */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12101x42e8e18b;

    /* renamed from: shakeSensor */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3 f12102x2bd8b260;
    private final java.lang.String TAG = "KindaShakeCheckingManager";

    /* renamed from: isStartShake */
    private boolean f12098x22f8048e = false;

    /* renamed from: isInvokeCallback */
    private boolean f12097x754458a7 = false;

    /* renamed from: isInForeground */
    private boolean f12096xe1dada92 = true;

    /* renamed from: needSetThreshold */
    private boolean f12100xb15bc1df = false;

    /* renamed from: thresholdValue */
    private float f12103x6d2cc7c6 = 0.0f;

    /* renamed from: delayNotifyMs */
    private int f12095xb45dd72 = 3000;

    /* renamed from: delayNofiyRunnable */
    private java.lang.Runnable f12093x6456102f = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaShakeCheckingManager.1
        @Override // java.lang.Runnable
        public void run() {
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.this.f12097x754458a7 || com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.this.f12094xaa1e711 == null) {
                return;
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.this.f12094xaa1e711.mo25801x2e7a5e();
        }
    };

    /* renamed from: appLifecycle */
    private final com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.WeakLifecycleCallback f12092x53ec6249 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.WeakLifecycleCallback(new java.lang.ref.WeakReference(this));

    /* renamed from: com.tencent.kinda.framework.app.KindaShakeCheckingManager$WeakLifecycleCallback */
    /* loaded from: classes13.dex */
    public static class WeakLifecycleCallback extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

        /* renamed from: weakManager */
        private final java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a> f12106xc5563115;

        public WeakLifecycleCallback(java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a> weakReference) {
            this.f12106xc5563115 = weakReference;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
        /* renamed from: onEnterForeground */
        public void mo8896x832bee5c() {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a c3142xff72e75a = this.f12106xc5563115.get();
            if (c3142xff72e75a == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaShakeCheckingManager", "onEnterForeground() - app in foreground, enable shake response");
            c3142xff72e75a.f12096xe1dada92 = true;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
        /* renamed from: onExitForeground */
        public void mo8897xa55158c0() {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a c3142xff72e75a = this.f12106xc5563115.get();
            if (c3142xff72e75a == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaShakeCheckingManager", "onExitForeground() - app in background, disable shake response");
            c3142xff72e75a.f12096xe1dada92 = false;
        }
    }

    /* renamed from: isValueOutOfRange */
    public boolean m25366x4e68843f(float f17, float f18, float f19, float f27) {
        return f17 < f18 - f27 || f17 > f19 + f27;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3410x4cc4fa76
    /* renamed from: playShakeMatch */
    public void mo25367x53a504b3(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), com.p314xaae8f345.mm.R.C30867xcad56011.j2u);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), com.p314xaae8f345.mm.R.C30867xcad56011.f574652j34);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3410x4cc4fa76
    /* renamed from: playShakeSound */
    public void mo25368x53fff3fd() {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get() != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), com.p314xaae8f345.mm.R.C30867xcad56011.j3j);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaShakeCheckingManager", "[playShakeSound] KindaContext.get() == null");
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3410x4cc4fa76
    /* renamed from: setDelayNotifyCallBackImpl */
    public void mo25369x74737e2f(com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, int i17) {
        this.f12094xaa1e711 = abstractC3623x3b485619;
        this.f12095xb45dd72 = i17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3410x4cc4fa76
    /* renamed from: setOnShakeCallBackImpl */
    public void mo25370x2e22626a(com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        this.f12101x42e8e18b = abstractC3623x3b485619;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3410x4cc4fa76
    /* renamed from: setShakeSensitivity */
    public void mo25371xf56ff43b(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaShakeCheckingManager", "[setShakeSensitivity] Need Set value: %s", java.lang.Float.valueOf(f17));
        if (m25366x4e68843f(f17, f12091x5f1f1344, f12090x3113fcd6, 1.0E-4f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaShakeCheckingManager", "[setShakeSensitivity] value is not range ignore");
        } else {
            this.f12100xb15bc1df = true;
            this.f12103x6d2cc7c6 = f17;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3410x4cc4fa76
    /* renamed from: startCheck */
    public void mo25372xa0ab9dc6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaShakeCheckingManager", "startCheck() called");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(this.f12092x53ec6249);
        this.f12102x2bd8b260 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get());
        if (this.f12100xb15bc1df) {
            int m25390xb7af0ea0 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener.m25390xb7af0ea0();
            int round = java.lang.Math.round(m25390xb7af0ea0 * this.f12103x6d2cc7c6);
            this.f12102x2bd8b260.m25384xffa31629(round);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaShakeCheckingManager", "startCheck() set threshold: default=%s, sensitivity=%s, newThreshold=%s", java.lang.Integer.valueOf(m25390xb7af0ea0), java.lang.Float.valueOf(this.f12103x6d2cc7c6), java.lang.Integer.valueOf(round));
            this.f12100xb15bc1df = false;
        }
        this.f12102x2bd8b260.m25385x84386cc9(new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener() { // from class: com.tencent.kinda.framework.app.KindaShakeCheckingManager.2
            @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener
            /* renamed from: onRelease */
            public void mo25374x90a72928() {
            }

            @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3.ShakeSensorListener
            /* renamed from: onShake */
            public void mo25375xb04b2467(boolean z17) {
                if (!com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.this.f12096xe1dada92) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaShakeCheckingManager", "onShake ignored - app in background");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaShakeCheckingManager", "onShake - app in foreground");
                long j17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.this.f12099x2ace38fd;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.this.f12098x22f8048e) {
                    if (elapsedRealtime < 80) {
                        return;
                    }
                } else if (elapsedRealtime < 1200) {
                    return;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.this.f12099x2ace38fd = android.os.SystemClock.elapsedRealtime();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.this.f12098x22f8048e = true;
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.this.f12101x42e8e18b != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.this.f12097x754458a7 = true;
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3142xff72e75a.this.f12101x42e8e18b.mo25801x2e7a5e();
                }
            }
        });
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f12099x2ace38fd = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f12093x6456102f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f12093x6456102f, this.f12095xb45dd72);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3410x4cc4fa76
    /* renamed from: stopCheck */
    public void mo25373x5f999e26() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaShakeCheckingManager", "stopCheck() called");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(this.f12092x53ec6249);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3143xa2c7c4f3 c3143xa2c7c4f3 = this.f12102x2bd8b260;
        if (c3143xa2c7c4f3 != null) {
            c3143xa2c7c4f3.m25386xa30a7869();
            this.f12102x2bd8b260 = null;
        }
        this.f12097x754458a7 = false;
        this.f12098x22f8048e = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f12093x6456102f);
    }
}
