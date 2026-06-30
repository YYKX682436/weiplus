package androidx.camera.core.streamsharing;

/* loaded from: classes14.dex */
public class VirtualCameraControl extends androidx.camera.core.impl.ForwardingCameraControl {
    private static final int DEFAULT_JPEG_QUALITY = 100;
    private static final int DEFAULT_ROTATION_DEGREES = 0;
    private final androidx.camera.core.streamsharing.StreamSharing.Control mStreamSharingControl;

    public VirtualCameraControl(androidx.camera.core.impl.CameraControlInternal cameraControlInternal, androidx.camera.core.streamsharing.StreamSharing.Control control) {
        super(cameraControlInternal);
        this.mStreamSharingControl = control;
    }

    private int getJpegQuality(androidx.camera.core.impl.CaptureConfig captureConfig) {
        java.lang.Integer num = (java.lang.Integer) captureConfig.getImplementationOptions().retrieveOption(androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY, 100);
        java.util.Objects.requireNonNull(num);
        return num.intValue();
    }

    private int getRotationDegrees(androidx.camera.core.impl.CaptureConfig captureConfig) {
        java.lang.Integer num = (java.lang.Integer) captureConfig.getImplementationOptions().retrieveOption(androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION, 0);
        java.util.Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wa.a lambda$submitStillCaptureRequests$0(wa.a aVar, androidx.camera.core.imagecapture.CameraCapturePipeline cameraCapturePipeline) {
        return ((androidx.camera.core.imagecapture.CameraCapturePipeline) aVar.get()).invokePreCapture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wa.a lambda$submitStillCaptureRequests$1(java.util.List list, java.lang.Void r47) {
        return this.mStreamSharingControl.jpegSnapshot(getJpegQuality((androidx.camera.core.impl.CaptureConfig) list.get(0)), getRotationDegrees((androidx.camera.core.impl.CaptureConfig) list.get(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wa.a lambda$submitStillCaptureRequests$2(wa.a aVar, java.lang.Void r17) {
        return ((androidx.camera.core.imagecapture.CameraCapturePipeline) aVar.get()).invokePostCapture();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    public wa.a submitStillCaptureRequests(final java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i17, int i18) {
        m3.h.b(list.size() == 1, "Only support one capture config.");
        final wa.a cameraCapturePipelineAsync = getCameraCapturePipelineAsync(i17, i18);
        return androidx.camera.core.impl.utils.futures.Futures.allAsList(java.util.Collections.singletonList(androidx.camera.core.impl.utils.futures.FutureChain.from(cameraCapturePipelineAsync).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.core.streamsharing.VirtualCameraControl$$a
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final wa.a apply(java.lang.Object obj) {
                wa.a lambda$submitStillCaptureRequests$0;
                lambda$submitStillCaptureRequests$0 = androidx.camera.core.streamsharing.VirtualCameraControl.lambda$submitStillCaptureRequests$0(wa.a.this, (androidx.camera.core.imagecapture.CameraCapturePipeline) obj);
                return lambda$submitStillCaptureRequests$0;
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.core.streamsharing.VirtualCameraControl$$b
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final wa.a apply(java.lang.Object obj) {
                wa.a lambda$submitStillCaptureRequests$1;
                lambda$submitStillCaptureRequests$1 = androidx.camera.core.streamsharing.VirtualCameraControl.this.lambda$submitStillCaptureRequests$1(list, (java.lang.Void) obj);
                return lambda$submitStillCaptureRequests$1;
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.core.streamsharing.VirtualCameraControl$$c
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final wa.a apply(java.lang.Object obj) {
                wa.a lambda$submitStillCaptureRequests$2;
                lambda$submitStillCaptureRequests$2 = androidx.camera.core.streamsharing.VirtualCameraControl.lambda$submitStillCaptureRequests$2(wa.a.this, (java.lang.Void) obj);
                return lambda$submitStillCaptureRequests$2;
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor())));
    }
}
