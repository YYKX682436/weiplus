package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl */
/* loaded from: classes14.dex */
public class C0336xb05728f6 extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb {
    public C0336xb05728f6(android.content.Context context) {
        super(context, null);
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0336xb05728f6 m3776xaf65a0fc(android.content.Context context) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0336xb05728f6(context);
    }

    /* renamed from: isDndFailCase */
    private boolean m3777xe3a1d31e(java.lang.Throwable th6) {
        return android.os.Build.VERSION.SDK_INT == 28 && m3778x3608f07(th6);
    }

    /* renamed from: isDndRuntimeException */
    private static boolean m3778x3608f07(java.lang.Throwable th6) {
        java.lang.StackTraceElement[] stackTrace;
        if (!th6.getClass().equals(java.lang.RuntimeException.class) || (stackTrace = th6.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    /* renamed from: throwDndException */
    private void m3779x43e95a5b(java.lang.Throwable th6) {
        throw new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468(10001, th6);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: getCameraCharacteristics */
    public android.hardware.camera2.CameraCharacteristics mo3769x9b962a9d(java.lang.String str) {
        try {
            return super.mo3769x9b962a9d(str);
        } catch (java.lang.RuntimeException e17) {
            if (m3777xe3a1d31e(e17)) {
                m3779x43e95a5b(e17);
            }
            throw e17;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: openCamera */
    public void mo3773xf86b760f(java.lang.String str, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
        try {
            android.hardware.camera2.CameraManager cameraManager = this.f636x4030095b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(stateCallback);
            arrayList.add(executor);
            arrayList.add(str);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(cameraManager, arrayList.toArray(), "androidx/camera/camera2/internal/compat/CameraManagerCompatApi28Impl", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V");
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468.m3699x3d80510d(e17);
        } catch (java.lang.IllegalArgumentException e18) {
            throw e18;
        } catch (java.lang.SecurityException e19) {
        } catch (java.lang.RuntimeException e27) {
            if (m3777xe3a1d31e(e27)) {
                m3779x43e95a5b(e27);
            }
            throw e27;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: registerAvailabilityCallback */
    public void mo3774x1037c203(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
        this.f636x4030095b.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: unregisterAvailabilityCallback */
    public void mo3775x1f76611c(android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
        this.f636x4030095b.unregisterAvailabilityCallback(availabilityCallback);
    }
}
