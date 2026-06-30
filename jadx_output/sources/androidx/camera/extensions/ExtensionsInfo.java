package androidx.camera.extensions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class ExtensionsInfo {
    private static final java.lang.String EXTENDED_CAMERA_CONFIG_PROVIDER_ID_PREFIX = ":camera:camera-extensions-";
    private final androidx.camera.core.CameraProvider mCameraProvider;
    private androidx.camera.extensions.VendorExtenderFactory mVendorExtenderFactory = new androidx.camera.extensions.ExtensionsInfo$$a();

    /* renamed from: androidx.camera.extensions.ExtensionsInfo$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass1 implements androidx.camera.extensions.internal.VendorExtender {
    }

    public ExtensionsInfo(androidx.camera.core.CameraProvider cameraProvider) {
        this.mCameraProvider = cameraProvider;
    }

    private static java.lang.String getExtendedCameraConfigProviderId(int i17) {
        if (i17 == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i17 == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i17 == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i17 == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i17 == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i17 == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new java.lang.IllegalArgumentException("Invalid extension mode!");
    }

    private androidx.camera.core.CameraFilter getFilter(int i17) {
        return new androidx.camera.extensions.ExtensionCameraFilter(getExtendedCameraConfigProviderId(i17), this.mVendorExtenderFactory.createVendorExtender(i17));
    }

    public static androidx.camera.extensions.internal.VendorExtender getVendorExtender(int i17) {
        return isAdvancedExtenderSupported() ? new androidx.camera.extensions.internal.AdvancedVendorExtender(i17) : new androidx.camera.extensions.internal.BasicVendorExtender(i17);
    }

    private void injectExtensionCameraConfig(final int i17) {
        final androidx.camera.core.impl.Identifier create = androidx.camera.core.impl.Identifier.create(getExtendedCameraConfigProviderId(i17));
        if (androidx.camera.core.impl.ExtendedCameraConfigProviderStore.getConfigProvider(create) == androidx.camera.core.impl.CameraConfigProvider.EMPTY) {
            androidx.camera.core.impl.ExtendedCameraConfigProviderStore.addConfig(create, new androidx.camera.core.impl.CameraConfigProvider() { // from class: androidx.camera.extensions.ExtensionsInfo$$b
                @Override // androidx.camera.core.impl.CameraConfigProvider
                public final androidx.camera.core.impl.CameraConfig getConfig(androidx.camera.core.CameraInfo cameraInfo, android.content.Context context) {
                    androidx.camera.core.impl.CameraConfig lambda$injectExtensionCameraConfig$1;
                    lambda$injectExtensionCameraConfig$1 = androidx.camera.extensions.ExtensionsInfo.this.lambda$injectExtensionCameraConfig$1(i17, create, cameraInfo, context);
                    return lambda$injectExtensionCameraConfig$1;
                }
            });
        }
    }

    private static boolean isAdvancedExtenderSupported() {
        androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_1;
        if (androidx.camera.extensions.internal.ClientVersion.isMaximumCompatibleVersion(version) || androidx.camera.extensions.internal.ExtensionVersion.isMaximumCompatibleVersion(version)) {
            return false;
        }
        return androidx.camera.extensions.internal.ExtensionVersion.isAdvancedExtenderSupported();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ androidx.camera.core.impl.CameraConfig lambda$injectExtensionCameraConfig$1(int i17, androidx.camera.core.impl.Identifier identifier, androidx.camera.core.CameraInfo cameraInfo, android.content.Context context) {
        androidx.camera.extensions.internal.VendorExtender createVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i17);
        createVendorExtender.init(cameraInfo);
        androidx.camera.extensions.ExtensionsConfig.Builder useCaseCombinationRequiredRule = new androidx.camera.extensions.ExtensionsConfig.Builder().setExtensionMode(i17).setUseCaseConfigFactory((androidx.camera.core.impl.UseCaseConfigFactory) new androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory(createVendorExtender)).setCompatibilityId(identifier).setZslDisabled(true).setPostviewSupported(createVendorExtender.isPostviewAvailable()).setCaptureProcessProgressSupported(createVendorExtender.isCaptureProcessProgressAvailable()).setUseCaseCombinationRequiredRule(1);
        androidx.camera.core.impl.SessionProcessor createSessionProcessor = createVendorExtender.createSessionProcessor(context);
        if (createSessionProcessor != null) {
            useCaseCombinationRequiredRule.setSessionProcessor(createSessionProcessor);
        }
        return useCaseCombinationRequiredRule.build();
    }

    public android.util.Range<java.lang.Long> getEstimatedCaptureLatencyRange(androidx.camera.core.CameraSelector cameraSelector, int i17, android.util.Size size) {
        java.util.List<androidx.camera.core.CameraInfo> filter = androidx.camera.core.CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i17)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (filter.isEmpty()) {
            return null;
        }
        androidx.camera.core.CameraInfo cameraInfo = filter.get(0);
        if (androidx.camera.extensions.internal.ExtensionVersion.getRuntimeVersion().compareTo(androidx.camera.extensions.internal.Version.VERSION_1_2) < 0) {
            return null;
        }
        try {
            androidx.camera.extensions.internal.VendorExtender createVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i17);
            createVendorExtender.init(cameraInfo);
            return createVendorExtender.getEstimatedCaptureLatencyRange(size);
        } catch (java.lang.NoSuchMethodError unused) {
            return null;
        }
    }

    public androidx.camera.core.CameraSelector getExtensionCameraSelectorAndInjectCameraConfig(androidx.camera.core.CameraSelector cameraSelector, int i17) {
        if (!isExtensionAvailable(cameraSelector, i17)) {
            throw new java.lang.IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        java.util.Iterator<androidx.camera.core.CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof androidx.camera.extensions.ExtensionCameraFilter) {
                throw new java.lang.IllegalArgumentException("An extension is already applied to the base CameraSelector.");
            }
        }
        injectExtensionCameraConfig(i17);
        androidx.camera.core.CameraSelector.Builder fromSelector = androidx.camera.core.CameraSelector.Builder.fromSelector(cameraSelector);
        fromSelector.addCameraFilter(getFilter(i17));
        return fromSelector.build();
    }

    public boolean isExtensionAvailable(androidx.camera.core.CameraSelector cameraSelector, int i17) {
        androidx.camera.core.CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i17));
        return !r1.build().filter(this.mCameraProvider.getAvailableCameraInfos()).isEmpty();
    }

    public boolean isImageAnalysisSupported(androidx.camera.core.CameraSelector cameraSelector, int i17) {
        java.util.List<androidx.camera.core.CameraInfo> filter = androidx.camera.core.CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i17)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (filter.isEmpty()) {
            return false;
        }
        androidx.camera.core.CameraInfo cameraInfo = filter.get(0);
        androidx.camera.extensions.internal.VendorExtender createVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i17);
        createVendorExtender.init(cameraInfo);
        android.util.Size[] supportedYuvAnalysisResolutions = createVendorExtender.getSupportedYuvAnalysisResolutions();
        return supportedYuvAnalysisResolutions != null && supportedYuvAnalysisResolutions.length > 0;
    }

    public void setVendorExtenderFactory(androidx.camera.extensions.VendorExtenderFactory vendorExtenderFactory) {
        this.mVendorExtenderFactory = vendorExtenderFactory;
    }
}
