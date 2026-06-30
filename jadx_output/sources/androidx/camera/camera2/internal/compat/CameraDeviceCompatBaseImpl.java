package androidx.camera.camera2.internal.compat;

/* loaded from: classes14.dex */
class CameraDeviceCompatBaseImpl implements androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl {
    final android.hardware.camera2.CameraDevice mCameraDevice;
    final java.lang.Object mImplParams;

    /* loaded from: classes14.dex */
    public static class CameraDeviceCompatParamsApi21 {
        final android.os.Handler mCompatHandler;

        public CameraDeviceCompatParamsApi21(android.os.Handler handler) {
            this.mCompatHandler = handler;
        }
    }

    public CameraDeviceCompatBaseImpl(android.hardware.camera2.CameraDevice cameraDevice, java.lang.Object obj) {
        cameraDevice.getClass();
        this.mCameraDevice = cameraDevice;
        this.mImplParams = obj;
    }

    private static void checkPhysicalCameraIdValid(android.hardware.camera2.CameraDevice cameraDevice, java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> list) {
        java.lang.String id6 = cameraDevice.getId();
        java.util.Iterator<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String physicalCameraId = it.next().getPhysicalCameraId();
            if (physicalCameraId != null && !physicalCameraId.isEmpty()) {
                androidx.camera.core.Logger.w("CameraDeviceCompat", "Camera " + id6 + ": Camera doesn't support physicalCameraId " + physicalCameraId + ". Ignoring.");
            }
        }
    }

    public static void checkPreconditions(android.hardware.camera2.CameraDevice cameraDevice, androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat sessionConfigurationCompat) {
        cameraDevice.getClass();
        sessionConfigurationCompat.getClass();
        sessionConfigurationCompat.getStateCallback().getClass();
        java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> outputConfigurations = sessionConfigurationCompat.getOutputConfigurations();
        if (outputConfigurations == null) {
            throw new java.lang.IllegalArgumentException("Invalid output configurations");
        }
        if (sessionConfigurationCompat.getExecutor() == null) {
            throw new java.lang.IllegalArgumentException("Invalid executor");
        }
        checkPhysicalCameraIdValid(cameraDevice, outputConfigurations);
    }

    public static androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl create(android.hardware.camera2.CameraDevice cameraDevice, android.os.Handler handler) {
        return new androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl(cameraDevice, new androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21(handler));
    }

    public static java.util.List<android.view.Surface> unpackSurfaces(java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSurface());
        }
        return arrayList;
    }

    public void createBaseCaptureSession(android.hardware.camera2.CameraDevice cameraDevice, java.util.List<android.view.Surface> list, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback, android.os.Handler handler) {
        try {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e17);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public void createCaptureSession(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat sessionConfigurationCompat) {
        checkPreconditions(this.mCameraDevice, sessionConfigurationCompat);
        if (sessionConfigurationCompat.getInputConfiguration() != null) {
            throw new java.lang.IllegalArgumentException("Reprocessing sessions not supported until API 23");
        }
        if (sessionConfigurationCompat.getSessionType() == 1) {
            throw new java.lang.IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper(sessionConfigurationCompat.getExecutor(), sessionConfigurationCompat.getStateCallback());
        createBaseCaptureSession(this.mCameraDevice, unpackSurfaces(sessionConfigurationCompat.getOutputConfigurations()), stateCallbackExecutorWrapper, ((androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21) this.mImplParams).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public android.hardware.camera2.CameraDevice unwrap() {
        return this.mCameraDevice;
    }
}
