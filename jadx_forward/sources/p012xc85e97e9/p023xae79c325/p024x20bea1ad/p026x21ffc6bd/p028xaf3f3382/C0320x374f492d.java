package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.CameraCharacteristicsApi28Impl */
/* loaded from: classes14.dex */
public class C0320x374f492d extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0321x117f35e4 {
    private static final java.lang.String TAG = "CameraCharacteristicsImpl";

    public C0320x374f492d(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        super(cameraCharacteristics);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0321x117f35e4, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595.CameraCharacteristicsCompatImpl
    /* renamed from: getPhysicalCameraIds */
    public java.util.Set<java.lang.String> mo3729xda421586() {
        try {
            return this.f617x43bc1de6.getPhysicalCameraIds();
        } catch (java.lang.Exception e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "CameraCharacteristics.getPhysicalCameraIds throws an exception.", e17);
            return java.util.Collections.emptySet();
        }
    }
}
