package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.CameraValidator */
/* loaded from: classes14.dex */
public final class C0688xc34dd98d {

    /* renamed from: EXTERNAL_LENS_FACING */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 f1598x6b007c7 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder().m4288xb57049bd(2).m4287x59bc66e();
    private static final java.lang.String TAG = "CameraValidator";

    /* renamed from: androidx.camera.core.impl.CameraValidator$Api34Impl */
    /* loaded from: classes13.dex */
    public static class Api34Impl {
        private Api34Impl() {
        }

        /* renamed from: getDeviceId */
        public static int m5324xbdf72787(android.content.Context context) {
            return context.getDeviceId();
        }
    }

    /* renamed from: androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException */
    /* loaded from: classes14.dex */
    public static class CameraIdListIncorrectException extends java.lang.Exception {

        /* renamed from: mAvailableCameraCount */
        private int f1599xbc3e3e6e;

        public CameraIdListIncorrectException(java.lang.String str, int i17, java.lang.Throwable th6) {
            super(str, th6);
            this.f1599xbc3e3e6e = i17;
        }

        /* renamed from: getAvailableCameraCount */
        public int m5325x1243ed7() {
            return this.f1599xbc3e3e6e;
        }
    }

    private C0688xc34dd98d() {
    }

    /* renamed from: validateCameras */
    public static void m5323x2f49dbf8(android.content.Context context, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0681x1d4cd46f c0681x1d4cd46f, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244) {
        java.lang.Integer m4282x5f62de6e;
        int i17 = 0;
        java.lang.IllegalArgumentException illegalArgumentException = null;
        if (android.os.Build.VERSION.SDK_INT >= 34 && p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0688xc34dd98d.Api34Impl.m5324xbdf72787(context) != 0) {
            java.util.LinkedHashSet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522> m5303x5e8bddb8 = c0681x1d4cd46f.m5303x5e8bddb8();
            if (m5303x5e8bddb8.isEmpty()) {
                throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0688xc34dd98d.CameraIdListIncorrectException("No cameras available", 0, null);
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Virtual device with ID: " + p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0688xc34dd98d.Api34Impl.m5324xbdf72787(context) + " has " + m5303x5e8bddb8.size() + " cameras. Skipping validation.");
            return;
        }
        if (c0475xc311f244 != null) {
            try {
                m4282x5f62de6e = c0475xc311f244.m4282x5f62de6e();
                if (m4282x5f62de6e == null) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (java.lang.IllegalStateException e17) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e17);
                return;
            }
        } else {
            m4282x5f62de6e = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Verifying camera lens facing on " + android.os.Build.DEVICE + ", lensFacingInteger: " + m4282x5f62de6e);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c0475xc311f244 == null || m4282x5f62de6e.intValue() == 1)) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.f856xb0a64c5f.m4284xc9ff34fc(c0681x1d4cd46f.m5303x5e8bddb8());
                i17 = 1;
            }
        } catch (java.lang.IllegalArgumentException e18) {
            illegalArgumentException = e18;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c0475xc311f244 == null || m4282x5f62de6e.intValue() == 0)) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.f857xeb9de779.m4284xc9ff34fc(c0681x1d4cd46f.m5303x5e8bddb8());
                i17++;
            }
        } catch (java.lang.IllegalArgumentException e19) {
            illegalArgumentException = e19;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f1598x6b007c7.m4284xc9ff34fc(c0681x1d4cd46f.m5303x5e8bddb8());
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Found a LENS_FACING_EXTERNAL camera");
            i17++;
        } catch (java.lang.IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Camera LensFacing verification failed, existing cameras: " + c0681x1d4cd46f.m5303x5e8bddb8());
        throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0688xc34dd98d.CameraIdListIncorrectException("Expected camera missing from device.", i17, illegalArgumentException);
    }
}
