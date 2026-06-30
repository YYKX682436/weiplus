package androidx.camera.camera2.internal.compat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class CameraManagerCompatApi28Impl extends androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl {
    public CameraManagerCompatApi28Impl(android.content.Context context) {
        super(context, null);
    }

    public static androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl create(android.content.Context context) {
        return new androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl(context);
    }

    private boolean isDndFailCase(java.lang.Throwable th6) {
        return android.os.Build.VERSION.SDK_INT == 28 && isDndRuntimeException(th6);
    }

    private static boolean isDndRuntimeException(java.lang.Throwable th6) {
        java.lang.StackTraceElement[] stackTrace;
        if (!th6.getClass().equals(java.lang.RuntimeException.class) || (stackTrace = th6.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private void throwDndException(java.lang.Throwable th6) {
        throw new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat(10001, th6);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String str) {
        try {
            return super.getCameraCharacteristics(str);
        } catch (java.lang.RuntimeException e17) {
            if (isDndFailCase(e17)) {
                throwDndException(e17);
            }
            throw e17;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void openCamera(java.lang.String str, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
        try {
            android.hardware.camera2.CameraManager cameraManager = this.mCameraManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(stateCallback);
            arrayList.add(executor);
            arrayList.add(str);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(cameraManager, arrayList.toArray(), "androidx/camera/camera2/internal/compat/CameraManagerCompatApi28Impl", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V");
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e17);
        } catch (java.lang.IllegalArgumentException e18) {
            throw e18;
        } catch (java.lang.SecurityException e19) {
        } catch (java.lang.RuntimeException e27) {
            if (isDndFailCase(e27)) {
                throwDndException(e27);
            }
            throw e27;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
        this.mCameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
        this.mCameraManager.unregisterAvailabilityCallback(availabilityCallback);
    }
}
