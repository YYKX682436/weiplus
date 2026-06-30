package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class ZslControlImpl implements androidx.camera.camera2.internal.ZslControl {
    static final int MAX_IMAGES = 9;
    static final int RING_BUFFER_CAPACITY = 3;
    private static final java.lang.String TAG = "ZslControlImpl";
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristicsCompat;
    final androidx.camera.core.internal.utils.ZslRingBuffer mImageRingBuffer;
    private boolean mIsPrivateReprocessingSupported;
    private androidx.camera.core.impl.CameraCaptureCallback mMetadataMatchingCaptureCallback;
    private androidx.camera.core.impl.DeferrableSurface mReprocessingImageDeferrableSurface;
    androidx.camera.core.SafeCloseImageReaderProxy mReprocessingImageReader;
    android.media.ImageWriter mReprocessingImageWriter;
    private boolean mShouldZslDisabledByQuirks;
    private boolean mIsZslDisabledByUseCaseConfig = false;
    private boolean mIsZslDisabledByFlashMode = false;

    public ZslControlImpl(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mIsPrivateReprocessingSupported = false;
        this.mShouldZslDisabledByQuirks = false;
        this.mCameraCharacteristicsCompat = cameraCharacteristicsCompat;
        this.mIsPrivateReprocessingSupported = androidx.camera.camera2.internal.ZslUtil.isCapabilitySupported(cameraCharacteristicsCompat, 4);
        this.mShouldZslDisabledByQuirks = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.class) != null;
        this.mImageRingBuffer = new androidx.camera.core.internal.utils.ZslRingBuffer(3, new androidx.camera.camera2.internal.ZslControlImpl$$c());
    }

    private void cleanup() {
        androidx.camera.core.internal.utils.ZslRingBuffer zslRingBuffer = this.mImageRingBuffer;
        while (!zslRingBuffer.isEmpty()) {
            zslRingBuffer.dequeue().close();
        }
        androidx.camera.core.impl.DeferrableSurface deferrableSurface = this.mReprocessingImageDeferrableSurface;
        if (deferrableSurface != null) {
            androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mReprocessingImageReader;
            if (safeCloseImageReaderProxy != null) {
                deferrableSurface.getTerminationFuture().addListener(new androidx.camera.camera2.internal.ZslControlImpl$$b(safeCloseImageReaderProxy), androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
                this.mReprocessingImageReader = null;
            }
            deferrableSurface.close();
            this.mReprocessingImageDeferrableSurface = null;
        }
        android.media.ImageWriter imageWriter = this.mReprocessingImageWriter;
        if (imageWriter != null) {
            imageWriter.close();
            this.mReprocessingImageWriter = null;
        }
    }

    private java.util.Map<java.lang.Integer, android.util.Size> createReprocessingInputSizeMap(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (java.lang.AssertionError e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to retrieve StreamConfigurationMap, error = " + e17.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new java.util.HashMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 : streamConfigurationMap.getInputFormats()) {
            android.util.Size[] inputSizes = streamConfigurationMap.getInputSizes(i17);
            if (inputSizes != null) {
                java.util.Arrays.sort(inputSizes, new androidx.camera.core.impl.utils.CompareSizesByArea(true));
                hashMap.put(java.lang.Integer.valueOf(i17), inputSizes[0]);
            }
        }
        return hashMap;
    }

    private boolean isJpegValidOutputForInputFormat(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, int i17) {
        int[] validOutputFormatsForInput;
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i17)) == null) {
            return false;
        }
        for (int i18 : validOutputFormatsForInput) {
            if (i18 == 256) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addZslConfig$1(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        try {
            androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                this.mImageRingBuffer.enqueue(acquireLatestImage);
            }
        } catch (java.lang.IllegalStateException e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to acquire latest image IllegalStateException = " + e17.getMessage());
        }
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void addZslConfig(androidx.camera.core.impl.SessionConfig.Builder builder) {
        cleanup();
        if (this.mIsZslDisabledByUseCaseConfig) {
            builder.setTemplateType(1);
            return;
        }
        if (this.mShouldZslDisabledByQuirks) {
            builder.setTemplateType(1);
            return;
        }
        java.util.Map<java.lang.Integer, android.util.Size> createReprocessingInputSizeMap = createReprocessingInputSizeMap(this.mCameraCharacteristicsCompat);
        if (!this.mIsPrivateReprocessingSupported || createReprocessingInputSizeMap.isEmpty() || !createReprocessingInputSizeMap.containsKey(34) || !isJpegValidOutputForInputFormat(this.mCameraCharacteristicsCompat, 34)) {
            builder.setTemplateType(1);
            return;
        }
        android.util.Size size = createReprocessingInputSizeMap.get(34);
        androidx.camera.core.MetadataImageReader metadataImageReader = new androidx.camera.core.MetadataImageReader(size.getWidth(), size.getHeight(), 34, 9);
        this.mMetadataMatchingCaptureCallback = metadataImageReader.getCameraCaptureCallback();
        this.mReprocessingImageReader = new androidx.camera.core.SafeCloseImageReaderProxy(metadataImageReader);
        metadataImageReader.setOnImageAvailableListener(new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.camera2.internal.ZslControlImpl$$a
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                androidx.camera.camera2.internal.ZslControlImpl.this.lambda$addZslConfig$1(imageReaderProxy);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor());
        androidx.camera.core.impl.ImmediateSurface immediateSurface = new androidx.camera.core.impl.ImmediateSurface(this.mReprocessingImageReader.getSurface(), new android.util.Size(this.mReprocessingImageReader.getWidth(), this.mReprocessingImageReader.getHeight()), 34);
        this.mReprocessingImageDeferrableSurface = immediateSurface;
        androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mReprocessingImageReader;
        wa.a terminationFuture = immediateSurface.getTerminationFuture();
        java.util.Objects.requireNonNull(safeCloseImageReaderProxy);
        terminationFuture.addListener(new androidx.camera.camera2.internal.ZslControlImpl$$b(safeCloseImageReaderProxy), androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        builder.addSurface(this.mReprocessingImageDeferrableSurface);
        builder.addCameraCaptureCallback(this.mMetadataMatchingCaptureCallback);
        builder.addSessionStateCallback(new android.hardware.camera2.CameraCaptureSession.StateCallback() { // from class: androidx.camera.camera2.internal.ZslControlImpl.1
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                android.view.Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    androidx.camera.camera2.internal.ZslControlImpl.this.mReprocessingImageWriter = androidx.camera.core.internal.compat.ImageWriterCompat.newInstance(inputSurface, 1);
                }
            }
        });
        builder.setInputConfiguration(new android.hardware.camera2.params.InputConfiguration(this.mReprocessingImageReader.getWidth(), this.mReprocessingImageReader.getHeight(), this.mReprocessingImageReader.getImageFormat()));
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public androidx.camera.core.ImageProxy dequeueImageFromBuffer() {
        try {
            return this.mImageRingBuffer.dequeue();
        } catch (java.util.NoSuchElementException unused) {
            androidx.camera.core.Logger.e(TAG, "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean enqueueImageToImageWriter(androidx.camera.core.ImageProxy imageProxy) {
        android.media.Image image = imageProxy.getImage();
        android.media.ImageWriter imageWriter = this.mReprocessingImageWriter;
        if (imageWriter != null && image != null) {
            try {
                androidx.camera.core.internal.compat.ImageWriterCompat.queueInputImage(imageWriter, image);
                return true;
            } catch (java.lang.IllegalStateException e17) {
                androidx.camera.core.Logger.e(TAG, "enqueueImageToImageWriter throws IllegalStateException = " + e17.getMessage());
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean isZslDisabledByFlashMode() {
        return this.mIsZslDisabledByFlashMode;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean isZslDisabledByUserCaseConfig() {
        return this.mIsZslDisabledByUseCaseConfig;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void setZslDisabledByFlashMode(boolean z17) {
        this.mIsZslDisabledByFlashMode = z17;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void setZslDisabledByUserCaseConfig(boolean z17) {
        this.mIsZslDisabledByUseCaseConfig = z17;
    }
}
