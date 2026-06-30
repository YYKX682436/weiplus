package com.p314xaae8f345.p373xbe494963.p412x5cbde8c5;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer2.SystemNotificationMonitor */
/* loaded from: classes14.dex */
public class C3851xabf4cf20 extends android.view.OrientationEventListener implements com.tencent.liteav.base.util.t.a {

    /* renamed from: SENSOR_ROTATION_DETECTION_THRESHOLD */
    private static final int f15101xab0e4715 = 30;

    /* renamed from: mDisplayRotation */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k f15102x860ada33;

    /* renamed from: mLastOrientation */
    private int f15103xfc3fe12d;

    /* renamed from: mListenerPtr */
    private volatile long f15104xf9bcdaed;

    /* renamed from: mSensorRotation */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k f15105xbbdc7725;

    /* renamed from: mTimer */
    private volatile com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.t f15106xbed152d8;

    /* renamed from: com.tencent.liteav.videoproducer2.SystemNotificationMonitor$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128706a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.m29578xcee59d22().length];
            f128706a = iArr;
            try {
                iArr[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128706a[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f128706a[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f128706a[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public C3851xabf4cf20() {
        super(com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035());
        this.f15103xfc3fe12d = -1;
        this.f15106xbed152d8 = null;
        this.f15104xf9bcdaed = 0L;
        this.f15105xbbdc7725 = null;
        this.f15102x860ada33 = null;
    }

    /* renamed from: getSensorRotationByDisplayRotation */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31575xcb9685b(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar) {
        if (kVar == null) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL;
        }
        int i17 = com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3851xabf4cf20.AnonymousClass1.f128706a[kVar.ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90 : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_180 : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270;
    }

    /* renamed from: getSensorRotationCorrection */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31576x90632c4c() {
        if (this.f15104xf9bcdaed == 0) {
            return null;
        }
        int m31577xaeb6ab85 = m31577xaeb6ab85(this.f15104xf9bcdaed);
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.b(m31577xaeb6ab85)) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(m31577xaeb6ab85);
        }
        return null;
    }

    /* renamed from: nativeGetGravitySensorRotationCorrection */
    private static native synchronized int m31577xaeb6ab85(long j17);

    /* renamed from: nativeSensorChanged */
    private static native void m31578xa3f6dec3(long j17, int i17, int i18);

    /* renamed from: notifyOrientationChanged */
    private synchronized void m31579xd1014ded() {
        int i17;
        if (this.f15104xf9bcdaed == 0) {
            return;
        }
        if (m31576x90632c4c() != null) {
            i17 = m31576x90632c4c().f14773xbee9dd04;
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar = this.f15105xbbdc7725;
            i17 = kVar != null ? kVar.f14773xbee9dd04 : 0;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar2 = this.f15102x860ada33;
        m31578xa3f6dec3(this.f15104xf9bcdaed, i17, kVar2 != null ? kVar2.f14773xbee9dd04 : 0);
    }

    /* renamed from: initialize */
    public synchronized void m31580x33ebcb90(long j17) {
        this.f15104xf9bcdaed = j17;
        if (this.f15106xbed152d8 != null) {
            return;
        }
        super.enable();
        this.f15106xbed152d8 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.t(android.os.Looper.getMainLooper(), this);
        this.f15106xbed152d8.a(1000);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onOrientationChanged(int r3) {
        /*
            r2 = this;
            r0 = -1
            if (r3 != r0) goto L4
            return
        L4:
            int r1 = r2.f15103xfc3fe12d
            if (r1 == r0) goto L13
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            r1 = 30
            if (r0 > r1) goto L13
            return
        L13:
            r2.f15103xfc3fe12d = r3
            r0 = 45
            if (r3 <= r0) goto L2e
            r0 = 135(0x87, float:1.89E-43)
            if (r3 > r0) goto L20
            com.tencent.liteav.base.util.k r3 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90
            goto L30
        L20:
            r0 = 225(0xe1, float:3.15E-43)
            if (r3 > r0) goto L27
            com.tencent.liteav.base.util.k r3 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_180
            goto L30
        L27:
            r0 = 315(0x13b, float:4.41E-43)
            if (r3 > r0) goto L2e
            com.tencent.liteav.base.util.k r3 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270
            goto L30
        L2e:
            com.tencent.liteav.base.util.k r3 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL
        L30:
            com.tencent.liteav.base.util.k r0 = r2.f15105xbbdc7725
            if (r0 == r3) goto L43
            r2.f15105xbbdc7725 = r3
            int r3 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3827xa4fd52c1.m31237xc0808f96()
            com.tencent.liteav.base.util.k r3 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(r3)
            r2.f15102x860ada33 = r3
            r2.m31579xd1014ded()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.C3851xabf4cf20.onOrientationChanged(int):void");
    }

    @Override // com.tencent.liteav.base.util.t.a
    /* renamed from: onTimeout */
    public void mo29580x1554e82() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k a17 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3827xa4fd52c1.m31237xc0808f96());
        if (this.f15102x860ada33 == a17) {
            return;
        }
        this.f15102x860ada33 = a17;
        if (this.f15105xbbdc7725 == null) {
            this.f15105xbbdc7725 = m31575xcb9685b(a17);
        }
        m31579xd1014ded();
    }

    /* renamed from: uninitialize */
    public synchronized void m31581xb2612ee9() {
        super.disable();
        this.f15104xf9bcdaed = 0L;
        if (this.f15106xbed152d8 != null) {
            this.f15106xbed152d8.a();
            this.f15106xbed152d8 = null;
        }
    }
}
