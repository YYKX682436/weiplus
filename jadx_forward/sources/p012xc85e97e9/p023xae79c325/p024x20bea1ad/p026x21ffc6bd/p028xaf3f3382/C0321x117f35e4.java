package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.CameraCharacteristicsBaseImpl */
/* loaded from: classes14.dex */
public class C0321x117f35e4 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595.CameraCharacteristicsCompatImpl {

    /* renamed from: mCameraCharacteristics */
    protected final android.hardware.camera2.CameraCharacteristics f617x43bc1de6;

    public C0321x117f35e4(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        this.f617x43bc1de6 = cameraCharacteristics;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595.CameraCharacteristicsCompatImpl
    public <T> T get(android.hardware.camera2.CameraCharacteristics.Key<T> key) {
        return (T) this.f617x43bc1de6.get(key);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595.CameraCharacteristicsCompatImpl
    /* renamed from: getPhysicalCameraIds */
    public java.util.Set<java.lang.String> mo3729xda421586() {
        return java.util.Collections.emptySet();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595.CameraCharacteristicsCompatImpl
    /* renamed from: unwrap */
    public android.hardware.camera2.CameraCharacteristics mo3730xcdecea63() {
        return this.f617x43bc1de6;
    }
}
