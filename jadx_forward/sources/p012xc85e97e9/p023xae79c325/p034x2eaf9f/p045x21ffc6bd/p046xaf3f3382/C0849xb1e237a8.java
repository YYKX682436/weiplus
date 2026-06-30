package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382;

/* renamed from: androidx.camera.core.internal.compat.MediaActionSoundCompatBaseImpl */
/* loaded from: classes14.dex */
class C0849xb1e237a8 {

    /* renamed from: SAMPLE_CAMERA_ID */
    private static final int f2098xf010020 = 0;

    private C0849xb1e237a8() {
    }

    /* renamed from: mustPlayShutterSound */
    public static boolean m6165xb8a6029f() {
        if (android.hardware.Camera.getNumberOfCameras() < 1) {
            return false;
        }
        try {
            android.hardware.Camera.getCameraInfo(0, new android.hardware.Camera.CameraInfo());
            return !r0.canDisableShutterSound;
        } catch (java.lang.RuntimeException unused) {
            return false;
        }
    }
}
