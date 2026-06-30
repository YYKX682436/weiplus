package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl */
/* loaded from: classes14.dex */
public class C0339x9987b8fb implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl {

    /* renamed from: mCameraManager */
    final android.hardware.camera2.CameraManager f636x4030095b;

    /* renamed from: mObject */
    final java.lang.Object f637x126cca0c;

    /* renamed from: androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl$CameraManagerCompatParamsApi21 */
    /* loaded from: classes14.dex */
    public static final class CameraManagerCompatParamsApi21 {

        /* renamed from: mCompatHandler */
        final android.os.Handler f638xffbc2dfb;

        /* renamed from: mWrapperMap */
        final java.util.Map<android.hardware.camera2.CameraManager.AvailabilityCallback, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.AvailabilityCallbackExecutorWrapper> f639xb6bdf416 = new java.util.HashMap();

        public CameraManagerCompatParamsApi21(android.os.Handler handler) {
            this.f638xffbc2dfb = handler;
        }
    }

    public C0339x9987b8fb(android.content.Context context, java.lang.Object obj) {
        this.f636x4030095b = (android.hardware.camera2.CameraManager) context.getSystemService("camera");
        this.f637x126cca0c = obj;
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb m3780xaf65a0fc(android.content.Context context, android.os.Handler handler) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb(context, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb.CameraManagerCompatParamsApi21(handler));
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: getCameraCharacteristics */
    public android.hardware.camera2.CameraCharacteristics mo3769x9b962a9d(java.lang.String str) {
        try {
            return this.f636x4030095b.getCameraCharacteristics(str);
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468.m3699x3d80510d(e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: getCameraIdList */
    public java.lang.String[] mo3770x174bbe54() {
        try {
            return this.f636x4030095b.getCameraIdList();
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468.m3699x3d80510d(e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: getCameraManager */
    public android.hardware.camera2.CameraManager mo3771xa281bd12() {
        return this.f636x4030095b;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: getConcurrentCameraIds */
    public java.util.Set<java.util.Set<java.lang.String>> mo3772xf4d0e226() {
        return java.util.Collections.emptySet();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: openCamera */
    public void mo3773xf86b760f(java.lang.String str, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
        executor.getClass();
        stateCallback.getClass();
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.StateCallbackExecutorWrapper(executor, stateCallback);
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb.CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb.CameraManagerCompatParamsApi21) this.f637x126cca0c;
        try {
            android.hardware.camera2.CameraManager cameraManager = this.f636x4030095b;
            android.os.Handler handler = cameraManagerCompatParamsApi21.f638xffbc2dfb;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(handler);
            arrayList.add(stateCallbackExecutorWrapper);
            arrayList.add(str);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(cameraManager, arrayList.toArray(), "androidx/camera/camera2/internal/compat/CameraManagerCompatBaseImpl", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468.m3699x3d80510d(e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: registerAvailabilityCallback */
    public void mo3774x1037c203(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper;
        if (executor == null) {
            throw new java.lang.IllegalArgumentException("executor was null");
        }
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb.CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb.CameraManagerCompatParamsApi21) this.f637x126cca0c;
        if (availabilityCallback != null) {
            synchronized (cameraManagerCompatParamsApi21.f639xb6bdf416) {
                availabilityCallbackExecutorWrapper = cameraManagerCompatParamsApi21.f639xb6bdf416.get(availabilityCallback);
                if (availabilityCallbackExecutorWrapper == null) {
                    availabilityCallbackExecutorWrapper = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.AvailabilityCallbackExecutorWrapper(executor, availabilityCallback);
                    cameraManagerCompatParamsApi21.f639xb6bdf416.put(availabilityCallback, availabilityCallbackExecutorWrapper);
                }
            }
        } else {
            availabilityCallbackExecutorWrapper = null;
        }
        this.f636x4030095b.registerAvailabilityCallback(availabilityCallbackExecutorWrapper, cameraManagerCompatParamsApi21.f638xffbc2dfb);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: unregisterAvailabilityCallback */
    public void mo3775x1f76611c(android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper;
        if (availabilityCallback != null) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb.CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb.CameraManagerCompatParamsApi21) this.f637x126cca0c;
            synchronized (cameraManagerCompatParamsApi21.f639xb6bdf416) {
                availabilityCallbackExecutorWrapper = cameraManagerCompatParamsApi21.f639xb6bdf416.remove(availabilityCallback);
            }
        } else {
            availabilityCallbackExecutorWrapper = null;
        }
        if (availabilityCallbackExecutorWrapper != null) {
            availabilityCallbackExecutorWrapper.m3767x86b8d8fe();
        }
        this.f636x4030095b.unregisterAvailabilityCallback(availabilityCallbackExecutorWrapper);
    }
}
