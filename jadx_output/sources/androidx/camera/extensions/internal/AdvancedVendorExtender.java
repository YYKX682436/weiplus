package androidx.camera.extensions.internal;

/* loaded from: classes14.dex */
public class AdvancedVendorExtender implements androidx.camera.extensions.internal.VendorExtender {
    private static final java.lang.String TAG = "AdvancedVendorExtender";
    private final androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl mAdvancedExtenderImpl;
    private java.lang.String mCameraId;
    private final androidx.camera.extensions.internal.compat.workaround.ExtensionDisabledValidator mExtensionDisabledValidator;
    private final int mMode;

    public AdvancedVendorExtender(int i17) {
        this.mExtensionDisabledValidator = new androidx.camera.extensions.internal.compat.workaround.ExtensionDisabledValidator();
        try {
            if (i17 == 1) {
                this.mAdvancedExtenderImpl = new androidx.camera.extensions.impl.advanced.BokehAdvancedExtenderImpl();
            } else if (i17 == 2) {
                this.mAdvancedExtenderImpl = new androidx.camera.extensions.impl.advanced.HdrAdvancedExtenderImpl();
            } else if (i17 == 3) {
                this.mAdvancedExtenderImpl = new androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl();
            } else if (i17 == 4) {
                this.mAdvancedExtenderImpl = new androidx.camera.extensions.impl.advanced.BeautyAdvancedExtenderImpl();
            } else if (i17 == 5) {
                this.mAdvancedExtenderImpl = new androidx.camera.extensions.impl.advanced.AutoAdvancedExtenderImpl();
            } else {
                throw new java.lang.IllegalArgumentException("Should not active ExtensionMode.NONE");
            }
            this.mMode = i17;
        } catch (java.lang.NoClassDefFoundError unused) {
            throw new java.lang.IllegalArgumentException("AdvancedExtenderImpl does not exist");
        }
    }

    private java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> convertResolutionMapToList(java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Integer num : map.keySet()) {
            arrayList.add(new android.util.Pair(num, (android.util.Size[]) map.get(num).toArray(new android.util.Size[0])));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    private java.util.List<android.hardware.camera2.CaptureRequest.Key> getSupportedParameterKeys() {
        java.util.List<android.hardware.camera2.CaptureRequest.Key> emptyList = java.util.Collections.emptyList();
        if (androidx.camera.extensions.internal.ExtensionVersion.getRuntimeVersion().compareTo(androidx.camera.extensions.internal.Version.VERSION_1_3) < 0) {
            return emptyList;
        }
        try {
            return java.util.Collections.unmodifiableList(this.mAdvancedExtenderImpl.getAvailableCaptureRequestKeys());
        } catch (java.lang.Exception e17) {
            androidx.camera.core.Logger.e(TAG, "AdvancedExtenderImpl.getAvailableCaptureRequestKeys throws exceptions", e17);
            return emptyList;
        }
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public androidx.camera.core.impl.SessionProcessor createSessionProcessor(android.content.Context context) {
        m3.h.d(this.mCameraId, "VendorExtender#init() must be called first");
        return new androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor(this.mAdvancedExtenderImpl.createSessionProcessor(), getSupportedParameterKeys(), this, context, this.mMode);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public android.util.Range<java.lang.Long> getEstimatedCaptureLatencyRange(android.util.Size size) {
        m3.h.d(this.mCameraId, "VendorExtender#init() must be called first");
        try {
            return this.mAdvancedExtenderImpl.getEstimatedCaptureLatencyRange(this.mCameraId, size, 256);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedCaptureOutputResolutions() {
        m3.h.d(this.mCameraId, "VendorExtender#init() must be called first");
        return convertResolutionMapToList(this.mAdvancedExtenderImpl.getSupportedCaptureOutputResolutions(this.mCameraId));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public java.util.List<android.hardware.camera2.CaptureResult.Key> getSupportedCaptureResultKeys() {
        java.util.List<android.hardware.camera2.CaptureResult.Key> emptyList = java.util.Collections.emptyList();
        if (androidx.camera.extensions.internal.ExtensionVersion.getRuntimeVersion().compareTo(androidx.camera.extensions.internal.Version.VERSION_1_3) < 0) {
            return emptyList;
        }
        try {
            return java.util.Collections.unmodifiableList(this.mAdvancedExtenderImpl.getAvailableCaptureResultKeys());
        } catch (java.lang.Exception e17) {
            androidx.camera.core.Logger.e(TAG, "AdvancedExtenderImpl.getAvailableCaptureResultKeys throws exceptions", e17);
            return emptyList;
        }
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> getSupportedPostviewResolutions(android.util.Size size) {
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        return (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) ? java.util.Collections.unmodifiableMap(this.mAdvancedExtenderImpl.getSupportedPostviewResolutions(size)) : java.util.Collections.emptyMap();
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedPreviewOutputResolutions() {
        m3.h.d(this.mCameraId, "VendorExtender#init() must be called first");
        return convertResolutionMapToList(this.mAdvancedExtenderImpl.getSupportedPreviewOutputResolutions(this.mCameraId));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public android.util.Size[] getSupportedYuvAnalysisResolutions() {
        m3.h.d(this.mCameraId, "VendorExtender#init() must be called first");
        return new android.util.Size[0];
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public void init(androidx.camera.core.CameraInfo cameraInfo) {
        androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = (androidx.camera.core.impl.CameraInfoInternal) cameraInfo;
        this.mCameraId = cameraInfoInternal.getCameraId();
        this.mAdvancedExtenderImpl.init(this.mCameraId, androidx.camera.extensions.internal.ExtensionsUtils.getCameraCharacteristicsMap(cameraInfoInternal));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isCaptureProcessProgressAvailable() {
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.mAdvancedExtenderImpl.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isCurrentExtensionModeAvailable() {
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version) && android.os.Build.VERSION.SDK_INT >= 34) {
            return getSupportedCaptureResultKeys().contains(android.hardware.camera2.CaptureResult.EXTENSION_CURRENT_TYPE);
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isExtensionAvailable(java.lang.String str, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> map) {
        if (this.mExtensionDisabledValidator.shouldDisableExtension()) {
            return false;
        }
        return this.mAdvancedExtenderImpl.isExtensionAvailable(str, map);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isExtensionStrengthAvailable() {
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version) && android.os.Build.VERSION.SDK_INT >= 34) {
            return getSupportedParameterKeys().contains(android.hardware.camera2.CaptureRequest.EXTENSION_STRENGTH);
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isPostviewAvailable() {
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_4;
        if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.mAdvancedExtenderImpl.isPostviewAvailable();
        }
        return false;
    }

    public AdvancedVendorExtender(androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl advancedExtenderImpl) {
        this.mExtensionDisabledValidator = new androidx.camera.extensions.internal.compat.workaround.ExtensionDisabledValidator();
        this.mAdvancedExtenderImpl = advancedExtenderImpl;
        this.mMode = 0;
    }
}
