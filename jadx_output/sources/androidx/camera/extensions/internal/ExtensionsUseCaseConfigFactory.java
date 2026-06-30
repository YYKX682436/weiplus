package androidx.camera.extensions.internal;

/* loaded from: classes14.dex */
public final class ExtensionsUseCaseConfigFactory implements androidx.camera.core.impl.UseCaseConfigFactory {
    private final androidx.camera.extensions.internal.ImageAnalysisConfigProvider mImageAnalysisConfigProvider;
    private final androidx.camera.extensions.internal.ImageCaptureConfigProvider mImageCaptureConfigProvider;
    private final androidx.camera.extensions.internal.PreviewConfigProvider mPreviewConfigProvider;

    /* renamed from: androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType;

        static {
            int[] iArr = new int[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.values().length];
            $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType = iArr;
            try {
                iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public ExtensionsUseCaseConfigFactory(androidx.camera.extensions.internal.VendorExtender vendorExtender) {
        this.mImageCaptureConfigProvider = new androidx.camera.extensions.internal.ImageCaptureConfigProvider(vendorExtender);
        this.mPreviewConfigProvider = new androidx.camera.extensions.internal.PreviewConfigProvider(vendorExtender);
        this.mImageAnalysisConfigProvider = new androidx.camera.extensions.internal.ImageAnalysisConfigProvider(vendorExtender);
    }

    private boolean isImageAnalysisSupported(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
        if (list == null) {
            return false;
        }
        for (android.util.Pair<java.lang.Integer, android.util.Size[]> pair : list) {
            int intValue = ((java.lang.Integer) pair.first).intValue();
            android.util.Size[] sizeArr = (android.util.Size[]) pair.second;
            if (intValue == 35 && sizeArr != null && sizeArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    public androidx.camera.core.impl.Config getConfig(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType, int i17) {
        androidx.camera.core.impl.MutableOptionsBundle from;
        int i18 = androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[captureType.ordinal()];
        if (i18 == 1) {
            from = androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) this.mImageCaptureConfigProvider.getConfig());
        } else if (i18 == 2) {
            from = androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) this.mPreviewConfigProvider.getConfig());
        } else {
            if (i18 != 3) {
                if (i18 != 4) {
                    return null;
                }
                throw new java.lang.IllegalArgumentException("Should not go here. VideoCapture is supported by recording the preview stream when Extension is enabled.");
            }
            androidx.camera.core.impl.ImageAnalysisConfig config = this.mImageAnalysisConfigProvider.getConfig();
            if (!isImageAnalysisSupported(config.getSupportedResolutions(null))) {
                throw new java.lang.IllegalArgumentException("ImageAnalysis is not supported when Extension is enabled on this device. Check ExtensionsManager.isImageAnalysisSupported before binding the ImageAnalysis use case.");
            }
            from = androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) config);
        }
        from.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.TRUE);
        return androidx.camera.core.impl.OptionsBundle.from(from);
    }
}
