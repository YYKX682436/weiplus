package com.tencent.liteav.videoproducer2;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class SystemNotificationMonitor extends android.view.OrientationEventListener implements com.tencent.liteav.base.util.t.a {
    private static final int SENSOR_ROTATION_DETECTION_THRESHOLD = 30;
    private com.tencent.liteav.base.util.k mDisplayRotation;
    private int mLastOrientation;
    private volatile long mListenerPtr;
    private com.tencent.liteav.base.util.k mSensorRotation;
    private volatile com.tencent.liteav.base.util.t mTimer;

    /* renamed from: com.tencent.liteav.videoproducer2.SystemNotificationMonitor$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47173a;

        static {
            int[] iArr = new int[com.tencent.liteav.base.util.k.values().length];
            f47173a = iArr;
            try {
                iArr[com.tencent.liteav.base.util.k.ROTATION_90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f47173a[com.tencent.liteav.base.util.k.ROTATION_180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f47173a[com.tencent.liteav.base.util.k.ROTATION_270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f47173a[com.tencent.liteav.base.util.k.NORMAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public SystemNotificationMonitor() {
        super(com.tencent.liteav.base.ContextUtils.getApplicationContext());
        this.mLastOrientation = -1;
        this.mTimer = null;
        this.mListenerPtr = 0L;
        this.mSensorRotation = null;
        this.mDisplayRotation = null;
    }

    private com.tencent.liteav.base.util.k getSensorRotationByDisplayRotation(com.tencent.liteav.base.util.k kVar) {
        if (kVar == null) {
            return com.tencent.liteav.base.util.k.NORMAL;
        }
        int i17 = com.tencent.liteav.videoproducer2.SystemNotificationMonitor.AnonymousClass1.f47173a[kVar.ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? com.tencent.liteav.base.util.k.NORMAL : com.tencent.liteav.base.util.k.ROTATION_90 : com.tencent.liteav.base.util.k.ROTATION_180 : com.tencent.liteav.base.util.k.ROTATION_270;
    }

    private com.tencent.liteav.base.util.k getSensorRotationCorrection() {
        if (this.mListenerPtr == 0) {
            return null;
        }
        int nativeGetGravitySensorRotationCorrection = nativeGetGravitySensorRotationCorrection(this.mListenerPtr);
        if (com.tencent.liteav.base.util.k.b(nativeGetGravitySensorRotationCorrection)) {
            return com.tencent.liteav.base.util.k.a(nativeGetGravitySensorRotationCorrection);
        }
        return null;
    }

    private static native synchronized int nativeGetGravitySensorRotationCorrection(long j17);

    private static native void nativeSensorChanged(long j17, int i17, int i18);

    private synchronized void notifyOrientationChanged() {
        int i17;
        if (this.mListenerPtr == 0) {
            return;
        }
        if (getSensorRotationCorrection() != null) {
            i17 = getSensorRotationCorrection().mValue;
        } else {
            com.tencent.liteav.base.util.k kVar = this.mSensorRotation;
            i17 = kVar != null ? kVar.mValue : 0;
        }
        com.tencent.liteav.base.util.k kVar2 = this.mDisplayRotation;
        nativeSensorChanged(this.mListenerPtr, i17, kVar2 != null ? kVar2.mValue : 0);
    }

    public synchronized void initialize(long j17) {
        this.mListenerPtr = j17;
        if (this.mTimer != null) {
            return;
        }
        super.enable();
        this.mTimer = new com.tencent.liteav.base.util.t(android.os.Looper.getMainLooper(), this);
        this.mTimer.a(1000);
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
            int r1 = r2.mLastOrientation
            if (r1 == r0) goto L13
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            r1 = 30
            if (r0 > r1) goto L13
            return
        L13:
            r2.mLastOrientation = r3
            r0 = 45
            if (r3 <= r0) goto L2e
            r0 = 135(0x87, float:1.89E-43)
            if (r3 > r0) goto L20
            com.tencent.liteav.base.util.k r3 = com.tencent.liteav.base.util.k.ROTATION_90
            goto L30
        L20:
            r0 = 225(0xe1, float:3.15E-43)
            if (r3 > r0) goto L27
            com.tencent.liteav.base.util.k r3 = com.tencent.liteav.base.util.k.ROTATION_180
            goto L30
        L27:
            r0 = 315(0x13b, float:4.41E-43)
            if (r3 > r0) goto L2e
            com.tencent.liteav.base.util.k r3 = com.tencent.liteav.base.util.k.ROTATION_270
            goto L30
        L2e:
            com.tencent.liteav.base.util.k r3 = com.tencent.liteav.base.util.k.NORMAL
        L30:
            com.tencent.liteav.base.util.k r0 = r2.mSensorRotation
            if (r0 == r3) goto L43
            r2.mSensorRotation = r3
            int r3 = com.tencent.liteav.videobase.videobase.SystemDisplayInfo.getDisplayRotationDegree()
            com.tencent.liteav.base.util.k r3 = com.tencent.liteav.base.util.k.a(r3)
            r2.mDisplayRotation = r3
            r2.notifyOrientationChanged()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer2.SystemNotificationMonitor.onOrientationChanged(int):void");
    }

    @Override // com.tencent.liteav.base.util.t.a
    public void onTimeout() {
        com.tencent.liteav.base.util.k a17 = com.tencent.liteav.base.util.k.a(com.tencent.liteav.videobase.videobase.SystemDisplayInfo.getDisplayRotationDegree());
        if (this.mDisplayRotation == a17) {
            return;
        }
        this.mDisplayRotation = a17;
        if (this.mSensorRotation == null) {
            this.mSensorRotation = getSensorRotationByDisplayRotation(a17);
        }
        notifyOrientationChanged();
    }

    public synchronized void uninitialize() {
        super.disable();
        this.mListenerPtr = 0L;
        if (this.mTimer != null) {
            this.mTimer.a();
            this.mTimer = null;
        }
    }
}
