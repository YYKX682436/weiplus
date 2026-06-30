package androidx.camera.extensions.internal;

/* loaded from: classes14.dex */
public class BasicVendorExtender implements androidx.camera.extensions.internal.VendorExtender {
    private static final java.lang.String TAG = "BasicVendorExtender";
    static final java.util.List<android.hardware.camera2.CaptureRequest.Key> sBaseSupportedKeys;
    private android.hardware.camera2.CameraCharacteristics mCameraCharacteristics;
    private java.lang.String mCameraId;
    private androidx.camera.core.impl.CameraInfoInternal mCameraInfo;
    private androidx.camera.extensions.impl.ImageCaptureExtenderImpl mImageCaptureExtenderImpl;
    private androidx.camera.extensions.impl.PreviewExtenderImpl mPreviewExtenderImpl;
    private final androidx.camera.extensions.internal.compat.workaround.ExtensionDisabledValidator mExtensionDisabledValidator = new androidx.camera.extensions.internal.compat.workaround.ExtensionDisabledValidator();
    private androidx.camera.extensions.internal.compat.workaround.AvailableKeysRetriever mAvailableKeysRetriever = new androidx.camera.extensions.internal.compat.workaround.AvailableKeysRetriever();

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS, android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS, android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS, android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, android.hardware.camera2.CaptureRequest.FLASH_MODE, android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
        sBaseSupportedKeys = arrayList;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            arrayList.add(android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO);
        }
    }

    public BasicVendorExtender(int i17) {
        this.mPreviewExtenderImpl = null;
        this.mImageCaptureExtenderImpl = null;
        try {
            if (i17 == 1) {
                this.mPreviewExtenderImpl = new androidx.camera.extensions.impl.BokehPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new androidx.camera.extensions.impl.BokehImageCaptureExtenderImpl();
                return;
            }
            if (i17 == 2) {
                this.mPreviewExtenderImpl = new androidx.camera.extensions.impl.HdrPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new androidx.camera.extensions.impl.HdrImageCaptureExtenderImpl();
                return;
            }
            if (i17 == 3) {
                this.mPreviewExtenderImpl = new androidx.camera.extensions.impl.NightPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new androidx.camera.extensions.impl.NightImageCaptureExtenderImpl();
            } else if (i17 == 4) {
                this.mPreviewExtenderImpl = new androidx.camera.extensions.impl.BeautyPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new androidx.camera.extensions.impl.BeautyImageCaptureExtenderImpl();
            } else {
                if (i17 == 5) {
                    this.mPreviewExtenderImpl = new androidx.camera.extensions.impl.AutoPreviewExtenderImpl();
                    this.mImageCaptureExtenderImpl = new androidx.camera.extensions.impl.AutoImageCaptureExtenderImpl();
                    return;
                }
                throw new java.lang.IllegalArgumentException("Should not activate ExtensionMode.NONE");
            }
        } catch (java.lang.NoClassDefFoundError unused) {
            androidx.camera.core.Logger.e(TAG, "OEM implementation for extension mode " + i17 + "does not exist!");
        }
    }

    private int getCaptureInputImageFormat() {
        androidx.camera.extensions.impl.ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.mImageCaptureExtenderImpl;
        return (imageCaptureExtenderImpl == null || imageCaptureExtenderImpl.getCaptureProcessor() == null) ? 256 : 35;
    }

    private android.util.Size[] getOutputSizes(int i17) {
        return ((android.hardware.camera2.params.StreamConfigurationMap) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(i17);
    }

    private int getPreviewInputImageFormat() {
        androidx.camera.extensions.impl.PreviewExtenderImpl previewExtenderImpl = this.mPreviewExtenderImpl;
        return (previewExtenderImpl == null || previewExtenderImpl.getProcessorType() != androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) ? 34 : 35;
    }

    private java.util.List<android.hardware.camera2.CaptureRequest.Key> getSupportedParameterKeys(android.content.Context context) {
        if (!androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(androidx.camera.extensions.internal.Version.VERSION_1_3)) {
            return java.util.Collections.unmodifiableList(sBaseSupportedKeys);
        }
        try {
            java.util.List<android.hardware.camera2.CaptureRequest.Key> availableCaptureRequestKeys = this.mAvailableKeysRetriever.getAvailableCaptureRequestKeys(this.mImageCaptureExtenderImpl, this.mCameraId, this.mCameraCharacteristics, context);
            if (availableCaptureRequestKeys != null) {
                return java.util.Collections.unmodifiableList(availableCaptureRequestKeys);
            }
        } catch (java.lang.Exception e17) {
            androidx.camera.core.Logger.e(TAG, "ImageCaptureExtenderImpl.getAvailableCaptureRequestKeys throws exceptions", e17);
        }
        return java.util.Collections.emptyList();
    }

    private java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedResolutionsOfFormat(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Pair<java.lang.Integer, android.util.Size[]> pair : list) {
            if (((java.lang.Integer) pair.first).intValue() == i17) {
                arrayList.add(new android.util.Pair(java.lang.Integer.valueOf(i17), (android.util.Size[]) pair.second));
                return arrayList;
            }
        }
        for (android.util.Pair<java.lang.Integer, android.util.Size[]> pair2 : list) {
            if (((java.lang.Integer) pair2.first).intValue() == i18) {
                arrayList.add(new android.util.Pair(java.lang.Integer.valueOf(i17), (android.util.Size[]) pair2.second));
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new java.lang.IllegalArgumentException("Supported resolution should contain " + i17 + " format.");
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public androidx.camera.core.impl.SessionProcessor createSessionProcessor(android.content.Context context) {
        m3.h.d(this.mCameraInfo, "VendorExtender#init() must be called first");
        return new androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor(this.mPreviewExtenderImpl, this.mImageCaptureExtenderImpl, getSupportedParameterKeys(context), this, context);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public android.util.Range<java.lang.Long> getEstimatedCaptureLatencyRange(android.util.Size size) {
        m3.h.d(this.mCameraInfo, "VendorExtender#init() must be called first");
        if (this.mImageCaptureExtenderImpl == null || androidx.camera.extensions.internal.ExtensionVersion.getRuntimeVersion().compareTo(androidx.camera.extensions.internal.Version.VERSION_1_2) < 0) {
            return null;
        }
        try {
            return this.mImageCaptureExtenderImpl.getEstimatedCaptureLatencyRange(size);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedCaptureOutputResolutions() {
        m3.h.d(this.mCameraInfo, "VendorExtender#init() must be called first");
        if (this.mImageCaptureExtenderImpl != null && androidx.camera.extensions.internal.ExtensionVersion.getRuntimeVersion().compareTo(androidx.camera.extensions.internal.Version.VERSION_1_1) >= 0) {
            try {
                java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> supportedResolutions = this.mImageCaptureExtenderImpl.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return this.mImageCaptureExtenderImpl.getCaptureProcessor() != null ? getSupportedResolutionsOfFormat(supportedResolutions, 35, 256) : supportedResolutions;
                }
            } catch (java.lang.NoSuchMethodError unused) {
            }
        }
        int captureInputImageFormat = getCaptureInputImageFormat();
        return java.util.Arrays.asList(new android.util.Pair(java.lang.Integer.valueOf(captureInputImageFormat), getOutputSizes(captureInputImageFormat)));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public java.util.List<android.hardware.camera2.CaptureResult.Key> getSupportedCaptureResultKeys() {
        if (androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(androidx.camera.extensions.internal.Version.VERSION_1_3)) {
            try {
                java.util.List availableCaptureResultKeys = this.mImageCaptureExtenderImpl.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys != null) {
                    return java.util.Collections.unmodifiableList(availableCaptureResultKeys);
                }
            } catch (java.lang.Exception e17) {
                androidx.camera.core.Logger.e(TAG, "ImageCaptureExtenderImpl.getAvailableCaptureResultKeys throws exceptions", e17);
            }
        }
        return java.util.Collections.emptyList();
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> getSupportedPostviewResolutions(android.util.Size size) {
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        if (!androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) || !androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return java.util.Collections.emptyMap();
        }
        java.util.List<android.util.Pair> supportedPostviewResolutions = this.mImageCaptureExtenderImpl.getSupportedPostviewResolutions(size);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (android.util.Pair pair : supportedPostviewResolutions) {
            hashMap.put(java.lang.Integer.valueOf(((java.lang.Integer) pair.first).intValue()), java.util.Arrays.asList((android.util.Size[]) pair.second));
        }
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedPreviewOutputResolutions() {
        m3.h.d(this.mCameraInfo, "VendorExtender#init() must be called first");
        if (this.mPreviewExtenderImpl != null && androidx.camera.extensions.internal.ExtensionVersion.getRuntimeVersion().compareTo(androidx.camera.extensions.internal.Version.VERSION_1_1) >= 0) {
            try {
                java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> supportedResolutions = this.mPreviewExtenderImpl.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return getSupportedResolutionsOfFormat(supportedResolutions, 34, 35);
                }
            } catch (java.lang.NoSuchMethodError unused) {
            }
        }
        return java.util.Arrays.asList(new android.util.Pair(34, getOutputSizes(getPreviewInputImageFormat())));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public android.util.Size[] getSupportedYuvAnalysisResolutions() {
        m3.h.d(this.mCameraInfo, "VendorExtender#init() must be called first");
        return new android.util.Size[0];
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public void init(androidx.camera.core.CameraInfo cameraInfo) {
        androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = (androidx.camera.core.impl.CameraInfoInternal) cameraInfo;
        this.mCameraInfo = cameraInfoInternal;
        if (this.mPreviewExtenderImpl == null || this.mImageCaptureExtenderImpl == null) {
            return;
        }
        this.mCameraId = cameraInfoInternal.getCameraId();
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = (android.hardware.camera2.CameraCharacteristics) this.mCameraInfo.getCameraCharacteristics();
        this.mCameraCharacteristics = cameraCharacteristics;
        this.mPreviewExtenderImpl.init(this.mCameraId, cameraCharacteristics);
        this.mImageCaptureExtenderImpl.init(this.mCameraId, this.mCameraCharacteristics);
        androidx.camera.core.Logger.d(TAG, "PreviewExtender processorType= " + this.mPreviewExtenderImpl.getProcessorType());
        androidx.camera.core.Logger.d(TAG, "ImageCaptureExtender processor= " + this.mImageCaptureExtenderImpl.getCaptureProcessor());
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isCaptureProcessProgressAvailable() {
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.mImageCaptureExtenderImpl.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isExtensionAvailable(java.lang.String str, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> map) {
        if (this.mExtensionDisabledValidator.shouldDisableExtension() || this.mPreviewExtenderImpl == null || this.mImageCaptureExtenderImpl == null) {
            return false;
        }
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = map.get(str);
        return this.mPreviewExtenderImpl.isExtensionAvailable(str, cameraCharacteristics) && this.mImageCaptureExtenderImpl.isExtensionAvailable(str, cameraCharacteristics);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isExtensionStrengthAvailable() {
        return false;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isPostviewAvailable() {
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.mImageCaptureExtenderImpl.isPostviewAvailable();
        }
        return false;
    }

    public BasicVendorExtender(androidx.camera.extensions.impl.ImageCaptureExtenderImpl imageCaptureExtenderImpl, androidx.camera.extensions.impl.PreviewExtenderImpl previewExtenderImpl) {
        this.mPreviewExtenderImpl = null;
        this.mImageCaptureExtenderImpl = null;
        this.mPreviewExtenderImpl = previewExtenderImpl;
        this.mImageCaptureExtenderImpl = imageCaptureExtenderImpl;
    }
}
