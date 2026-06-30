package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.CameraManagerCompatApi29Impl */
/* loaded from: classes14.dex */
public class C0337xb0654077 extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0336xb05728f6 {
    public C0337xb0654077(android.content.Context context) {
        super(context);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0336xb05728f6, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: getCameraCharacteristics */
    public android.hardware.camera2.CameraCharacteristics mo3769x9b962a9d(java.lang.String str) {
        try {
            return this.f636x4030095b.getCameraCharacteristics(str);
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468.m3699x3d80510d(e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0336xb05728f6, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: openCamera */
    public void mo3773xf86b760f(java.lang.String str, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
        try {
            android.hardware.camera2.CameraManager cameraManager = this.f636x4030095b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(stateCallback);
            arrayList.add(executor);
            arrayList.add(str);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(cameraManager, arrayList.toArray(), "androidx/camera/camera2/internal/compat/CameraManagerCompatApi29Impl", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V");
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468.m3699x3d80510d(e17);
        }
    }
}
