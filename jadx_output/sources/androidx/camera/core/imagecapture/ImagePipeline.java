package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
public class ImagePipeline {
    static final androidx.camera.core.internal.compat.workaround.ExifRotationAvailability EXIF_ROTATION_AVAILABILITY = new androidx.camera.core.internal.compat.workaround.ExifRotationAvailability();
    static final byte JPEG_QUALITY_MAX_QUALITY = 100;
    static final byte JPEG_QUALITY_MIN_LATENCY = 95;
    private static int sNextRequestId;
    private final androidx.camera.core.impl.CaptureConfig mCaptureConfig;
    private final androidx.camera.core.imagecapture.CaptureNode mCaptureNode;
    private final androidx.camera.core.imagecapture.CaptureNode.In mPipelineIn;
    private final androidx.camera.core.imagecapture.ProcessingNode mProcessingNode;
    private final androidx.camera.core.impl.ImageCaptureConfig mUseCaseConfig;

    public ImagePipeline(androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig, android.util.Size size) {
        this(imageCaptureConfig, size, null, false, null, 35);
    }

    private androidx.camera.core.imagecapture.CameraRequest createCameraRequest(int i17, androidx.camera.core.impl.CaptureBundle captureBundle, androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest, androidx.camera.core.imagecapture.TakePictureCallback takePictureCallback) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String valueOf = java.lang.String.valueOf(captureBundle.hashCode());
        java.util.List<androidx.camera.core.impl.CaptureStage> captureStages = captureBundle.getCaptureStages();
        java.util.Objects.requireNonNull(captureStages);
        for (androidx.camera.core.impl.CaptureStage captureStage : captureStages) {
            androidx.camera.core.impl.CaptureConfig.Builder builder = new androidx.camera.core.impl.CaptureConfig.Builder();
            builder.setTemplateType(this.mCaptureConfig.getTemplateType());
            builder.addImplementationOptions(this.mCaptureConfig.getImplementationOptions());
            builder.addAllCameraCaptureCallbacks(takePictureRequest.getSessionConfigCameraCaptureCallbacks());
            builder.addSurface(this.mPipelineIn.getSurface());
            builder.setPostviewEnabled(shouldEnablePostview());
            if (androidx.camera.core.internal.utils.ImageUtil.isJpegFormats(this.mPipelineIn.getInputFormat())) {
                if (EXIF_ROTATION_AVAILABILITY.isRotationOptionSupported()) {
                    builder.addImplementationOption(androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION, java.lang.Integer.valueOf(takePictureRequest.getRotationDegrees()));
                }
                builder.addImplementationOption(androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY, java.lang.Integer.valueOf(getCameraRequestJpegQuality(takePictureRequest)));
            }
            builder.addImplementationOptions(captureStage.getCaptureConfig().getImplementationOptions());
            builder.addTag(valueOf, java.lang.Integer.valueOf(captureStage.getId()));
            builder.setId(i17);
            builder.addCameraCaptureCallback(this.mPipelineIn.getCameraCaptureCallback());
            arrayList.add(builder.build());
        }
        return new androidx.camera.core.imagecapture.CameraRequest(arrayList, takePictureCallback);
    }

    private androidx.camera.core.impl.CaptureBundle createCaptureBundle() {
        androidx.camera.core.impl.CaptureBundle captureBundle = this.mUseCaseConfig.getCaptureBundle(androidx.camera.core.CaptureBundles.singleDefaultCaptureBundle());
        java.util.Objects.requireNonNull(captureBundle);
        return captureBundle;
    }

    private androidx.camera.core.imagecapture.ProcessingRequest createProcessingRequest(int i17, androidx.camera.core.impl.CaptureBundle captureBundle, androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest, androidx.camera.core.imagecapture.TakePictureCallback takePictureCallback, wa.a aVar) {
        return new androidx.camera.core.imagecapture.ProcessingRequest(captureBundle, takePictureRequest.getOutputFileOptions(), takePictureRequest.getCropRect(), takePictureRequest.getRotationDegrees(), takePictureRequest.getJpegQuality(), takePictureRequest.getSensorToBufferTransform(), takePictureCallback, aVar, i17);
    }

    private int getOutputFormat() {
        java.lang.Integer num = (java.lang.Integer) this.mUseCaseConfig.retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
        if (num != null) {
            return num.intValue();
        }
        java.lang.Integer num2 = (java.lang.Integer) this.mUseCaseConfig.retrieveOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, null);
        return (num2 == null || num2.intValue() != 4101) ? 256 : 4101;
    }

    private boolean shouldEnablePostview() {
        return this.mPipelineIn.getPostviewSurface() != null;
    }

    public void close() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mCaptureNode.release();
        this.mProcessingNode.release();
    }

    public m3.d createRequests(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest, androidx.camera.core.imagecapture.TakePictureCallback takePictureCallback, wa.a aVar) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.impl.CaptureBundle createCaptureBundle = createCaptureBundle();
        int i17 = sNextRequestId;
        sNextRequestId = i17 + 1;
        return new m3.d(createCameraRequest(i17, createCaptureBundle, takePictureRequest, takePictureCallback), createProcessingRequest(i17, createCaptureBundle, takePictureRequest, takePictureCallback, aVar));
    }

    public androidx.camera.core.impl.SessionConfig.Builder createSessionConfigBuilder(android.util.Size size) {
        androidx.camera.core.impl.SessionConfig.Builder createFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(this.mUseCaseConfig, size);
        createFrom.addNonRepeatingSurface(this.mPipelineIn.getSurface());
        if (this.mPipelineIn.getPostviewSurface() != null) {
            createFrom.setPostviewSurface(this.mPipelineIn.getPostviewSurface());
        }
        return createFrom;
    }

    public boolean expectsMetadata() {
        return this.mCaptureNode.getSafeCloseImageReaderProxy().getImageReaderProxy() instanceof androidx.camera.core.MetadataImageReader;
    }

    public int getCameraRequestJpegQuality(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest) {
        return ((takePictureRequest.getOnDiskCallback() != null) && androidx.camera.core.impl.utils.TransformUtils.hasCropping(takePictureRequest.getCropRect(), this.mPipelineIn.getSize())) ? takePictureRequest.getCaptureMode() == 0 ? 100 : 95 : takePictureRequest.getJpegQuality();
    }

    public int getCapacity() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.mCaptureNode.getCapacity();
    }

    public androidx.camera.core.imagecapture.CaptureNode getCaptureNode() {
        return this.mCaptureNode;
    }

    public android.util.Size getPostviewSize() {
        return this.mPipelineIn.getPostviewSize();
    }

    public androidx.camera.core.imagecapture.ProcessingNode getProcessingNode() {
        return this.mProcessingNode;
    }

    public void notifyCaptureError(androidx.camera.core.imagecapture.TakePictureManager.CaptureError captureError) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mPipelineIn.getErrorEdge().accept(captureError);
    }

    public void setOnImageCloseListener(androidx.camera.core.ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mCaptureNode.setOnImageCloseListener(onImageCloseListener);
    }

    public void submitProcessingRequest(androidx.camera.core.imagecapture.ProcessingRequest processingRequest) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mPipelineIn.getRequestEdge().accept(processingRequest);
    }

    public ImagePipeline(androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig, android.util.Size size, androidx.camera.core.CameraEffect cameraEffect, boolean z17) {
        this(imageCaptureConfig, size, cameraEffect, z17, null, 35);
    }

    public ImagePipeline(androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig, android.util.Size size, androidx.camera.core.CameraEffect cameraEffect, boolean z17, android.util.Size size2, int i17) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mUseCaseConfig = imageCaptureConfig;
        this.mCaptureConfig = androidx.camera.core.impl.CaptureConfig.Builder.createFrom(imageCaptureConfig).build();
        androidx.camera.core.imagecapture.CaptureNode captureNode = new androidx.camera.core.imagecapture.CaptureNode();
        this.mCaptureNode = captureNode;
        java.util.concurrent.Executor ioExecutor = imageCaptureConfig.getIoExecutor(androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor());
        java.util.Objects.requireNonNull(ioExecutor);
        androidx.camera.core.imagecapture.ProcessingNode processingNode = new androidx.camera.core.imagecapture.ProcessingNode(ioExecutor, cameraEffect != null ? new androidx.camera.core.processing.InternalImageProcessor(cameraEffect) : null);
        this.mProcessingNode = processingNode;
        androidx.camera.core.imagecapture.CaptureNode.In of6 = androidx.camera.core.imagecapture.CaptureNode.In.of(size, imageCaptureConfig.getInputFormat(), getOutputFormat(), z17, imageCaptureConfig.getImageReaderProxyProvider(), size2, i17);
        this.mPipelineIn = of6;
        processingNode.transform(captureNode.transform(of6));
    }
}
