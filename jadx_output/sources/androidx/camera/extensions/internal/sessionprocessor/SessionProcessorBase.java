package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
abstract class SessionProcessorBase implements androidx.camera.core.impl.SessionProcessor, androidx.camera.extensions.CameraExtensionsInfo, androidx.camera.extensions.CameraExtensionsControl {
    protected static final int EXTENSION_STRENGTH_UNKNOWN = -1;
    private static final java.lang.String TAG = "SessionProcessorBase";
    private java.lang.String mCameraId;
    private android.os.HandlerThread mImageReaderHandlerThread;
    private final java.util.Set<java.lang.Integer> mSupportedCameraOperations;
    private final java.util.Map<java.lang.Integer, android.media.ImageReader> mImageReaderMap = new java.util.HashMap();
    private final java.util.Map<java.lang.Integer, androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> mOutputConfigMap = new java.util.HashMap();
    private final java.util.List<androidx.camera.core.impl.DeferrableSurface> mSurfacesList = new java.util.ArrayList();
    protected final java.lang.Object mLock = new java.lang.Object();
    protected int mExtensionStrength = -1;

    /* loaded from: classes14.dex */
    public static class ImageRefHolder implements androidx.camera.extensions.internal.sessionprocessor.ImageReference {
        private final android.media.Image mImage;
        private final java.lang.Object mImageLock = new java.lang.Object();
        private int mRefCount = 1;

        public ImageRefHolder(android.media.Image image) {
            this.mImage = image;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public boolean decrement() {
            synchronized (this.mImageLock) {
                int i17 = this.mRefCount;
                if (i17 <= 0) {
                    return false;
                }
                int i18 = i17 - 1;
                this.mRefCount = i18;
                if (i18 <= 0) {
                    this.mImage.close();
                }
                return true;
            }
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public android.media.Image get() {
            return this.mImage;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public boolean increment() {
            synchronized (this.mImageLock) {
                int i17 = this.mRefCount;
                if (i17 <= 0) {
                    return false;
                }
                this.mRefCount = i17 + 1;
                return true;
            }
        }
    }

    public SessionProcessorBase(java.util.List<android.hardware.camera2.CaptureRequest.Key> list) {
        this.mSupportedCameraOperations = getSupportedCameraOperations(list);
    }

    private static androidx.camera.core.impl.SessionProcessorSurface createOutputConfigSurface(androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig camera2OutputConfig, java.util.Map<java.lang.Integer, android.media.ImageReader> map) {
        if (camera2OutputConfig instanceof androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig) {
            return new androidx.camera.core.impl.SessionProcessorSurface(((androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig) camera2OutputConfig).getSurface(), camera2OutputConfig.getId());
        }
        if (!(camera2OutputConfig instanceof androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig)) {
            if (camera2OutputConfig instanceof androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig) {
                throw new java.lang.UnsupportedOperationException("MultiResolutionImageReader not supported yet");
            }
            throw new java.lang.UnsupportedOperationException("Unsupported Camera2OutputConfig:" + camera2OutputConfig);
        }
        androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig imageReaderOutputConfig = (androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig) camera2OutputConfig;
        final android.media.ImageReader newInstance = android.media.ImageReader.newInstance(imageReaderOutputConfig.getSize().getWidth(), imageReaderOutputConfig.getSize().getHeight(), imageReaderOutputConfig.getImageFormat(), imageReaderOutputConfig.getMaxImages());
        map.put(java.lang.Integer.valueOf(camera2OutputConfig.getId()), newInstance);
        androidx.camera.core.impl.SessionProcessorSurface sessionProcessorSurface = new androidx.camera.core.impl.SessionProcessorSurface(newInstance.getSurface(), camera2OutputConfig.getId());
        sessionProcessorSurface.getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase$$a
            @Override // java.lang.Runnable
            public final void run() {
                newInstance.close();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        return sessionProcessorSurface;
    }

    private java.util.Set<java.lang.Integer> getSupportedCameraOperations(java.util.List<android.hardware.camera2.CaptureRequest.Key> list) {
        java.util.HashSet hashSet = new java.util.HashSet();
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO) || list.contains(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION)) {
                hashSet.add(0);
            }
        } else if (list.contains(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION)) {
            hashSet.add(0);
        }
        if (list.containsAll(java.util.Arrays.asList(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE))) {
            hashSet.add(1);
        }
        if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS)) {
            hashSet.add(2);
        }
        if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS)) {
            hashSet.add(3);
        }
        if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS)) {
            hashSet.add(4);
        }
        if (list.containsAll(java.util.Arrays.asList(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER))) {
            hashSet.add(5);
        }
        if (list.containsAll(java.util.Arrays.asList(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, android.hardware.camera2.CaptureRequest.FLASH_MODE))) {
            hashSet.add(6);
        }
        if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)) {
            hashSet.add(7);
        }
        if (i17 >= 34 && list.contains(android.hardware.camera2.CaptureRequest.EXTENSION_STRENGTH)) {
            hashSet.add(8);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setImageProcessor$1(androidx.camera.extensions.internal.sessionprocessor.ImageProcessor imageProcessor, int i17, java.lang.String str, android.media.ImageReader imageReader) {
        try {
            android.media.Image acquireNextImage = imageReader.acquireNextImage();
            imageProcessor.onNextImageAvailable(i17, acquireNextImage.getTimestamp(), new androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase.ImageRefHolder(acquireNextImage), str);
        } catch (java.lang.IllegalStateException e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to acquire next image.", e17);
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final void deInitSession() {
        androidx.camera.core.Logger.e(TAG, "deInitSession: cameraId=" + this.mCameraId);
        deInitSessionInternal();
        synchronized (this.mLock) {
            java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = this.mSurfacesList.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.mSurfacesList.clear();
            this.mImageReaderMap.clear();
            this.mOutputConfigMap.clear();
            this.mExtensionStrength = -1;
        }
        android.os.HandlerThread handlerThread = this.mImageReaderHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.mImageReaderHandlerThread = null;
        }
    }

    public abstract void deInitSessionInternal();

    @Override // androidx.camera.core.impl.SessionProcessor
    public final androidx.camera.core.impl.SessionConfig initSession(androidx.camera.core.CameraInfo cameraInfo, androidx.camera.core.impl.OutputSurfaceConfiguration outputSurfaceConfiguration) {
        androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = (androidx.camera.core.impl.CameraInfoInternal) cameraInfo;
        androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig initSessionInternal = initSessionInternal(cameraInfoInternal.getCameraId(), androidx.camera.extensions.internal.ExtensionsUtils.getCameraCharacteristicsMap(cameraInfoInternal), outputSurfaceConfiguration);
        androidx.camera.core.impl.SessionConfig.Builder builder = new androidx.camera.core.impl.SessionConfig.Builder();
        synchronized (this.mLock) {
            for (androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig camera2OutputConfig : initSessionInternal.getOutputConfigs()) {
                androidx.camera.core.impl.SessionProcessorSurface createOutputConfigSurface = createOutputConfigSurface(camera2OutputConfig, this.mImageReaderMap);
                this.mSurfacesList.add(createOutputConfigSurface);
                this.mOutputConfigMap.put(java.lang.Integer.valueOf(camera2OutputConfig.getId()), camera2OutputConfig);
                androidx.camera.core.impl.SessionConfig.OutputConfig.Builder surfaceGroupId = androidx.camera.core.impl.SessionConfig.OutputConfig.builder(createOutputConfigSurface).setPhysicalCameraId(camera2OutputConfig.getPhysicalCameraId()).setSurfaceGroupId(camera2OutputConfig.getSurfaceGroupId());
                java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> surfaceSharingOutputConfigs = camera2OutputConfig.getSurfaceSharingOutputConfigs();
                if (surfaceSharingOutputConfigs != null && !surfaceSharingOutputConfigs.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig camera2OutputConfig2 : surfaceSharingOutputConfigs) {
                        this.mOutputConfigMap.put(java.lang.Integer.valueOf(camera2OutputConfig2.getId()), camera2OutputConfig2);
                        arrayList.add(createOutputConfigSurface(camera2OutputConfig2, this.mImageReaderMap));
                    }
                    surfaceGroupId.setSharedSurfaces(arrayList);
                }
                builder.addOutputConfig(surfaceGroupId.build());
            }
        }
        androidx.camera.extensions.internal.RequestOptionConfig.Builder builder2 = new androidx.camera.extensions.internal.RequestOptionConfig.Builder();
        for (android.hardware.camera2.CaptureRequest.Key<?> key : initSessionInternal.getSessionParameters().keySet()) {
            builder2.setCaptureRequestOption(key, initSessionInternal.getSessionParameters().get(key));
        }
        builder.setImplementationOptions(builder2.build());
        builder.setTemplateType(initSessionInternal.getSessionTemplateId());
        builder.setSessionType(initSessionInternal.getSessionType());
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CameraX-extensions_image_reader");
        this.mImageReaderHandlerThread = handlerThread;
        handlerThread.start();
        this.mCameraId = cameraInfoInternal.getCameraId();
        androidx.camera.core.Logger.d(TAG, "initSession: cameraId=" + this.mCameraId);
        return builder.build();
    }

    public abstract androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig initSessionInternal(java.lang.String str, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> map, androidx.camera.core.impl.OutputSurfaceConfiguration outputSurfaceConfiguration);

    public void setImageProcessor(final int i17, final androidx.camera.extensions.internal.sessionprocessor.ImageProcessor imageProcessor) {
        android.media.ImageReader imageReader;
        final java.lang.String physicalCameraId;
        synchronized (this.mLock) {
            imageReader = this.mImageReaderMap.get(java.lang.Integer.valueOf(i17));
            androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig camera2OutputConfig = this.mOutputConfigMap.get(java.lang.Integer.valueOf(i17));
            physicalCameraId = camera2OutputConfig == null ? null : camera2OutputConfig.getPhysicalCameraId();
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new android.media.ImageReader.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase$$b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(android.media.ImageReader imageReader2) {
                    androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase.lambda$setImageProcessor$1(androidx.camera.extensions.internal.sessionprocessor.ImageProcessor.this, i17, physicalCameraId, imageReader2);
                }
            }, new android.os.Handler(this.mImageReaderHandlerThread.getLooper()));
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public java.util.Set<java.lang.Integer> getSupportedCameraOperations() {
        return this.mSupportedCameraOperations;
    }
}
