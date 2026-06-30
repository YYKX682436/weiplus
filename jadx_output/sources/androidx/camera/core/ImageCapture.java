package androidx.camera.core;

/* loaded from: classes14.dex */
public final class ImageCapture extends androidx.camera.core.UseCase {
    public static final int CAPTURE_MODE_MAXIMIZE_QUALITY = 0;
    public static final int CAPTURE_MODE_MINIMIZE_LATENCY = 1;
    public static final int CAPTURE_MODE_ZERO_SHUTTER_LAG = 2;
    private static final int DEFAULT_CAPTURE_MODE = 1;
    private static final int DEFAULT_FLASH_MODE = 2;
    public static final int ERROR_CAMERA_CLOSED = 3;
    public static final int ERROR_CAPTURE_FAILED = 2;
    public static final int ERROR_FILE_IO = 1;
    public static final int ERROR_INVALID_CAMERA = 4;
    public static final int ERROR_UNKNOWN = 0;
    public static final int FLASH_MODE_AUTO = 0;
    public static final int FLASH_MODE_OFF = 2;
    public static final int FLASH_MODE_ON = 1;
    public static final int FLASH_MODE_SCREEN = 3;
    private static final int FLASH_MODE_UNKNOWN = -1;
    public static final int FLASH_TYPE_ONE_SHOT_FLASH = 0;
    public static final int FLASH_TYPE_USE_TORCH_AS_FLASH = 1;
    private static final byte JPEG_QUALITY_MAXIMIZE_QUALITY_MODE = 100;
    private static final byte JPEG_QUALITY_MINIMIZE_LATENCY_MODE = 95;
    private static final int MAX_IMAGES = 2;
    public static final int OUTPUT_FORMAT_JPEG = 0;
    public static final int OUTPUT_FORMAT_JPEG_ULTRA_HDR = 1;
    public static final long SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS = 3;
    private static final java.lang.String TAG = "ImageCapture";
    private final int mCaptureMode;
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener mCloseableErrorListener;
    private final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener mClosingListener;
    private android.util.Rational mCropAspectRatio;
    private int mFlashMode;
    private final int mFlashType;
    private final androidx.camera.core.imagecapture.ImageCaptureControl mImageCaptureControl;
    private androidx.camera.core.imagecapture.ImagePipeline mImagePipeline;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Integer> mLockedFlashMode;
    private androidx.camera.core.internal.ScreenFlashWrapper mScreenFlashWrapper;
    androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;
    private androidx.camera.core.imagecapture.TakePictureManager mTakePictureManager;
    public static final androidx.camera.core.ImageCapture.Defaults DEFAULT_CONFIG = new androidx.camera.core.ImageCapture.Defaults();
    static final androidx.camera.core.internal.compat.workaround.ExifRotationAvailability EXIF_ROTATION_AVAILABILITY = new androidx.camera.core.internal.compat.workaround.ExifRotationAvailability();

    /* loaded from: classes14.dex */
    public static final class Builder implements androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.core.ImageCapture, androidx.camera.core.impl.ImageCaptureConfig, androidx.camera.core.ImageCapture.Builder>, androidx.camera.core.impl.ImageOutputConfig.Builder<androidx.camera.core.ImageCapture.Builder>, androidx.camera.core.internal.IoConfig.Builder<androidx.camera.core.ImageCapture.Builder>, androidx.camera.core.impl.ImageInputConfig.Builder<androidx.camera.core.ImageCapture.Builder> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(androidx.camera.core.impl.MutableOptionsBundle.create());
        }

        public static androidx.camera.core.ImageCapture.Builder fromConfig(androidx.camera.core.impl.Config config) {
            return new androidx.camera.core.ImageCapture.Builder(androidx.camera.core.impl.MutableOptionsBundle.from(config));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public androidx.camera.core.ImageCapture.Builder setBufferFormat(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT, java.lang.Integer.valueOf(i17));
            return this;
        }

        public androidx.camera.core.ImageCapture.Builder setCaptureMode(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE, java.lang.Integer.valueOf(i17));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setCustomOrderedResolutions(java.util.List list) {
            return setCustomOrderedResolutions((java.util.List<android.util.Size>) list);
        }

        public androidx.camera.core.ImageCapture.Builder setFlashMode(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_FLASH_MODE, java.lang.Integer.valueOf(i17));
            return this;
        }

        public androidx.camera.core.ImageCapture.Builder setFlashType(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_FLASH_TYPE, java.lang.Integer.valueOf(i17));
            return this;
        }

        public androidx.camera.core.ImageCapture.Builder setImageReaderProxyProvider(androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        public androidx.camera.core.ImageCapture.Builder setJpegQuality(int i17) {
            m3.h.c(i17, 1, 100, "jpegQuality");
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY, java.lang.Integer.valueOf(i17));
            return this;
        }

        public androidx.camera.core.ImageCapture.Builder setOutputFormat(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT, java.lang.Integer.valueOf(i17));
            return this;
        }

        public androidx.camera.core.ImageCapture.Builder setPostviewEnabled(boolean z17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_POSTVIEW_ENABLED, java.lang.Boolean.valueOf(z17));
            return this;
        }

        public androidx.camera.core.ImageCapture.Builder setPostviewResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_POSTVIEW_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        public androidx.camera.core.ImageCapture.Builder setScreenFlash(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_SCREEN_FLASH, screenFlash);
            return this;
        }

        public androidx.camera.core.ImageCapture.Builder setSoftwareJpegEncoderRequested(boolean z17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, java.lang.Boolean.valueOf(z17));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setSupportedResolutions(java.util.List list) {
            return setSupportedResolutions((java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>) list);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public /* bridge */ /* synthetic */ java.lang.Object setTargetClass(java.lang.Class cls) {
            return setTargetClass((java.lang.Class<androidx.camera.core.ImageCapture>) cls);
        }

        private Builder(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            java.lang.Class cls = (java.lang.Class) mutableOptionsBundle.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(androidx.camera.core.ImageCapture.class)) {
                throw new java.lang.IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE);
            setTargetClass(androidx.camera.core.ImageCapture.class);
        }

        public static androidx.camera.core.ImageCapture.Builder fromConfig(androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig) {
            return new androidx.camera.core.ImageCapture.Builder(androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) imageCaptureConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.core.ImageCapture build() {
            java.lang.Integer num = (java.lang.Integer) getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num != null) {
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, num);
            } else if (androidx.camera.core.ImageCapture.isOutputFormatUltraHdr(getMutableConfig())) {
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 4101);
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, androidx.camera.core.DynamicRange.UNSPECIFIED);
            } else {
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 256);
            }
            androidx.camera.core.impl.ImageCaptureConfig useCaseConfig = getUseCaseConfig();
            androidx.camera.core.impl.ImageOutputConfig.validateConfig(useCaseConfig);
            androidx.camera.core.ImageCapture imageCapture = new androidx.camera.core.ImageCapture(useCaseConfig);
            android.util.Size size = (android.util.Size) getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION, null);
            if (size != null) {
                imageCapture.setCropAspectRatio(new android.util.Rational(size.getWidth(), size.getHeight()));
            }
            m3.h.d((java.util.concurrent.Executor) getMutableConfig().retrieveOption(androidx.camera.core.internal.IoConfig.OPTION_IO_EXECUTOR, androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor()), "The IO executor can't be null");
            androidx.camera.core.impl.MutableConfig mutableConfig = getMutableConfig();
            androidx.camera.core.impl.Config.Option<java.lang.Integer> option = androidx.camera.core.impl.ImageCaptureConfig.OPTION_FLASH_MODE;
            if (mutableConfig.containsOption(option)) {
                java.lang.Integer num2 = (java.lang.Integer) getMutableConfig().retrieveOption(option);
                if (num2 != null && (num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    if (num2.intValue() == 3 && getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_SCREEN_FLASH, null) == null) {
                        throw new java.lang.IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                    }
                } else {
                    throw new java.lang.IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
            }
            return imageCapture;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.impl.ImageCaptureConfig getUseCaseConfig() {
            return new androidx.camera.core.impl.ImageCaptureConfig(androidx.camera.core.impl.OptionsBundle.from(this.mMutableConfig));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setCustomOrderedResolutions(java.util.List<android.util.Size> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setDefaultResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setHighResolutionDisabled(boolean z17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, java.lang.Boolean.valueOf(z17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.IoConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setIoExecutor(java.util.concurrent.Executor executor) {
            getMutableConfig().insertOption(androidx.camera.core.internal.IoConfig.OPTION_IO_EXECUTOR, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setMaxResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setMirrorMode(int i17) {
            throw new java.lang.UnsupportedOperationException("setMirrorMode is not supported.");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setSupportedResolutions(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setSurfaceOccupancyPriority(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @java.lang.Deprecated
        public androidx.camera.core.ImageCapture.Builder setTargetAspectRatio(int i17) {
            if (i17 == -1) {
                i17 = 0;
            }
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, java.lang.Integer.valueOf(i17));
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setTargetClass(java.lang.Class<androidx.camera.core.ImageCapture> cls) {
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + java.util.UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setTargetName(java.lang.String str) {
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @java.lang.Deprecated
        public androidx.camera.core.ImageCapture.Builder setTargetResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setTargetRotation(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public androidx.camera.core.ImageCapture.Builder setZslDisabled(boolean z17) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.valueOf(z17));
            return this;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface CaptureMode {
    }

    /* loaded from: classes14.dex */
    public static final class Defaults implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.ImageCaptureConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final androidx.camera.core.impl.ImageCaptureConfig DEFAULT_CONFIG;
        private static final androidx.camera.core.DynamicRange DEFAULT_DYNAMIC_RANGE;
        private static final int DEFAULT_OUTPUT_FORMAT = 0;
        private static final androidx.camera.core.resolutionselector.ResolutionSelector DEFAULT_RESOLUTION_SELECTOR;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 4;

        static {
            androidx.camera.core.resolutionselector.ResolutionSelector build = new androidx.camera.core.resolutionselector.ResolutionSelector.Builder().setAspectRatioStrategy(androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(androidx.camera.core.resolutionselector.ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY).build();
            DEFAULT_RESOLUTION_SELECTOR = build;
            androidx.camera.core.DynamicRange dynamicRange = androidx.camera.core.DynamicRange.SDR;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            DEFAULT_CONFIG = new androidx.camera.core.ImageCapture.Builder().setSurfaceOccupancyPriority(4).setTargetAspectRatio(0).setResolutionSelector(build).setOutputFormat(0).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public androidx.camera.core.impl.ImageCaptureConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface FlashMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface FlashType {
    }

    /* loaded from: classes14.dex */
    public static class ImageCaptureCapabilitiesImpl implements androidx.camera.core.ImageCaptureCapabilities {
        private final androidx.camera.core.CameraInfo mCameraInfo;

        public ImageCaptureCapabilitiesImpl(androidx.camera.core.CameraInfo cameraInfo) {
            this.mCameraInfo = cameraInfo;
        }

        private boolean isUltraHdrSupported() {
            androidx.camera.core.CameraInfo cameraInfo = this.mCameraInfo;
            if (cameraInfo instanceof androidx.camera.core.impl.CameraInfoInternal) {
                return ((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).getSupportedOutputFormats().contains(4101);
            }
            return false;
        }

        @Override // androidx.camera.core.ImageCaptureCapabilities
        public java.util.Set<java.lang.Integer> getSupportedOutputFormats() {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(0);
            if (isUltraHdrSupported()) {
                hashSet.add(1);
            }
            return hashSet;
        }

        @Override // androidx.camera.core.ImageCaptureCapabilities
        public boolean isCaptureProcessProgressSupported() {
            androidx.camera.core.CameraInfo cameraInfo = this.mCameraInfo;
            if (cameraInfo instanceof androidx.camera.core.impl.CameraInfoInternal) {
                return ((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).isCaptureProcessProgressSupported();
            }
            return false;
        }

        @Override // androidx.camera.core.ImageCaptureCapabilities
        public boolean isPostviewSupported() {
            androidx.camera.core.CameraInfo cameraInfo = this.mCameraInfo;
            if (cameraInfo instanceof androidx.camera.core.impl.CameraInfoInternal) {
                return ((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).isPostviewSupported();
            }
            return false;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ImageCaptureError {
    }

    /* loaded from: classes13.dex */
    public static final class Metadata {
        private boolean mIsReversedHorizontal;
        private boolean mIsReversedHorizontalSet = false;
        private boolean mIsReversedVertical;
        private android.location.Location mLocation;

        public android.location.Location getLocation() {
            return this.mLocation;
        }

        public boolean isReversedHorizontal() {
            return this.mIsReversedHorizontal;
        }

        public boolean isReversedHorizontalSet() {
            return this.mIsReversedHorizontalSet;
        }

        public boolean isReversedVertical() {
            return this.mIsReversedVertical;
        }

        public void setLocation(android.location.Location location) {
            this.mLocation = location;
        }

        public void setReversedHorizontal(boolean z17) {
            this.mIsReversedHorizontal = z17;
            this.mIsReversedHorizontalSet = true;
        }

        public void setReversedVertical(boolean z17) {
            this.mIsReversedVertical = z17;
        }

        public java.lang.String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.mIsReversedHorizontal + ", mIsReversedVertical=" + this.mIsReversedVertical + ", mLocation=" + this.mLocation + "}";
        }
    }

    /* loaded from: classes14.dex */
    public static abstract class OnImageCapturedCallback {
        public void onCaptureProcessProgressed(int i17) {
        }

        public void onCaptureStarted() {
        }

        public void onCaptureSuccess(androidx.camera.core.ImageProxy imageProxy) {
        }

        public void onError(androidx.camera.core.ImageCaptureException imageCaptureException) {
        }

        public void onPostviewBitmapAvailable(android.graphics.Bitmap bitmap) {
        }
    }

    /* loaded from: classes14.dex */
    public interface OnImageSavedCallback {
        default void onCaptureProcessProgressed(int i17) {
        }

        default void onCaptureStarted() {
        }

        void onError(androidx.camera.core.ImageCaptureException imageCaptureException);

        void onImageSaved(androidx.camera.core.ImageCapture.OutputFileResults outputFileResults);

        default void onPostviewBitmapAvailable(android.graphics.Bitmap bitmap) {
        }
    }

    /* loaded from: classes13.dex */
    public static final class OutputFileOptions {
        private final android.content.ContentResolver mContentResolver;
        private final android.content.ContentValues mContentValues;
        private final java.io.File mFile;
        private final androidx.camera.core.ImageCapture.Metadata mMetadata;
        private final java.io.OutputStream mOutputStream;
        private final android.net.Uri mSaveCollection;

        public OutputFileOptions(java.io.File file, android.content.ContentResolver contentResolver, android.net.Uri uri, android.content.ContentValues contentValues, java.io.OutputStream outputStream, androidx.camera.core.ImageCapture.Metadata metadata) {
            this.mFile = file;
            this.mContentResolver = contentResolver;
            this.mSaveCollection = uri;
            this.mContentValues = contentValues;
            this.mOutputStream = outputStream;
            this.mMetadata = metadata == null ? new androidx.camera.core.ImageCapture.Metadata() : metadata;
        }

        public android.content.ContentResolver getContentResolver() {
            return this.mContentResolver;
        }

        public android.content.ContentValues getContentValues() {
            return this.mContentValues;
        }

        public java.io.File getFile() {
            return this.mFile;
        }

        public androidx.camera.core.ImageCapture.Metadata getMetadata() {
            return this.mMetadata;
        }

        public java.io.OutputStream getOutputStream() {
            return this.mOutputStream;
        }

        public android.net.Uri getSaveCollection() {
            return this.mSaveCollection;
        }

        public java.lang.String toString() {
            return "OutputFileOptions{mFile=" + this.mFile + ", mContentResolver=" + this.mContentResolver + ", mSaveCollection=" + this.mSaveCollection + ", mContentValues=" + this.mContentValues + ", mOutputStream=" + this.mOutputStream + ", mMetadata=" + this.mMetadata + "}";
        }

        /* loaded from: classes13.dex */
        public static final class Builder {
            private android.content.ContentResolver mContentResolver;
            private android.content.ContentValues mContentValues;
            private java.io.File mFile;
            private androidx.camera.core.ImageCapture.Metadata mMetadata;
            private java.io.OutputStream mOutputStream;
            private android.net.Uri mSaveCollection;

            public Builder(java.io.File file) {
                this.mFile = file;
            }

            public androidx.camera.core.ImageCapture.OutputFileOptions build() {
                return new androidx.camera.core.ImageCapture.OutputFileOptions(this.mFile, this.mContentResolver, this.mSaveCollection, this.mContentValues, this.mOutputStream, this.mMetadata);
            }

            public androidx.camera.core.ImageCapture.OutputFileOptions.Builder setMetadata(androidx.camera.core.ImageCapture.Metadata metadata) {
                this.mMetadata = metadata;
                return this;
            }

            public Builder(android.content.ContentResolver contentResolver, android.net.Uri uri, android.content.ContentValues contentValues) {
                this.mContentResolver = contentResolver;
                this.mSaveCollection = uri;
                this.mContentValues = contentValues;
            }

            public Builder(java.io.OutputStream outputStream) {
                this.mOutputStream = outputStream;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class OutputFileResults {
        private final android.net.Uri mSavedUri;

        public OutputFileResults(android.net.Uri uri) {
            this.mSavedUri = uri;
        }

        public android.net.Uri getSavedUri() {
            return this.mSavedUri;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface OutputFormat {
    }

    /* loaded from: classes14.dex */
    public interface ScreenFlash {
        void apply(long j17, androidx.camera.core.ImageCapture.ScreenFlashListener screenFlashListener);

        void clear();
    }

    /* loaded from: classes14.dex */
    public interface ScreenFlashListener {
        void onCompleted();
    }

    public ImageCapture(androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        this.mClosingListener = new androidx.camera.core.ImageCapture$$a();
        this.mLockedFlashMode = new java.util.concurrent.atomic.AtomicReference<>(null);
        this.mFlashMode = -1;
        this.mCropAspectRatio = null;
        this.mImageCaptureControl = new androidx.camera.core.imagecapture.ImageCaptureControl() { // from class: androidx.camera.core.ImageCapture.1
            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            public void lockFlashMode() {
                androidx.camera.core.ImageCapture.this.lockFlashMode();
            }

            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            public wa.a submitStillCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list) {
                return androidx.camera.core.ImageCapture.this.submitStillCaptureRequest(list);
            }

            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            public void unlockFlashMode() {
                androidx.camera.core.ImageCapture.this.unlockFlashMode();
            }
        };
        androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig2 = (androidx.camera.core.impl.ImageCaptureConfig) getCurrentConfig();
        if (imageCaptureConfig2.containsOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE)) {
            this.mCaptureMode = imageCaptureConfig2.getCaptureMode();
        } else {
            this.mCaptureMode = 1;
        }
        this.mFlashType = imageCaptureConfig2.getFlashType(0);
        this.mScreenFlashWrapper = androidx.camera.core.internal.ScreenFlashWrapper.from(imageCaptureConfig2.getScreenFlash());
    }

    private void abortImageCaptureRequests() {
        this.mScreenFlashWrapper.completePendingTasks();
        androidx.camera.core.imagecapture.TakePictureManager takePictureManager = this.mTakePictureManager;
        if (takePictureManager != null) {
            takePictureManager.abortRequests();
        }
    }

    private void clearPipeline() {
        clearPipeline(false);
    }

    public static android.graphics.Rect computeDispatchCropRect(android.graphics.Rect rect, android.util.Rational rational, int i17, android.util.Size size, int i18) {
        if (rect != null) {
            return androidx.camera.core.internal.utils.ImageUtil.computeCropRectFromDispatchInfo(rect, i17, size, i18);
        }
        if (rational != null) {
            if (i18 % 180 != 0) {
                rational = new android.util.Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (androidx.camera.core.internal.utils.ImageUtil.isAspectRatioValid(size, rational)) {
                android.graphics.Rect computeCropRectFromAspectRatio = androidx.camera.core.internal.utils.ImageUtil.computeCropRectFromAspectRatio(size, rational);
                java.util.Objects.requireNonNull(computeCropRectFromAspectRatio);
                return computeCropRectFromAspectRatio;
            }
        }
        return new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.camera.core.impl.SessionConfig.Builder createPipeline(java.lang.String r17, androidx.camera.core.impl.ImageCaptureConfig r18, androidx.camera.core.impl.StreamSpec r19) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageCapture.createPipeline(java.lang.String, androidx.camera.core.impl.ImageCaptureConfig, androidx.camera.core.impl.StreamSpec):androidx.camera.core.impl.SessionConfig$Builder");
    }

    private int getCameraLens() {
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        if (camera != null) {
            return camera.getCameraInfo().getLensFacing();
        }
        return -1;
    }

    public static int getError(java.lang.Throwable th6) {
        if (th6 instanceof androidx.camera.core.CameraClosedException) {
            return 3;
        }
        if (th6 instanceof androidx.camera.core.ImageCaptureException) {
            return ((androidx.camera.core.ImageCaptureException) th6).getImageCaptureError();
        }
        return 0;
    }

    public static androidx.camera.core.ImageCaptureCapabilities getImageCaptureCapabilities(androidx.camera.core.CameraInfo cameraInfo) {
        return new androidx.camera.core.ImageCapture.ImageCaptureCapabilitiesImpl(cameraInfo);
    }

    private int getJpegQualityInternal() {
        androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig = (androidx.camera.core.impl.ImageCaptureConfig) getCurrentConfig();
        if (imageCaptureConfig.containsOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY)) {
            return imageCaptureConfig.getJpegQuality();
        }
        int i17 = this.mCaptureMode;
        if (i17 == 0) {
            return 100;
        }
        if (i17 == 1 || i17 == 2) {
            return 95;
        }
        throw new java.lang.IllegalStateException("CaptureMode " + this.mCaptureMode + " is invalid");
    }

    private androidx.camera.core.impl.SessionProcessor getSessionProcessor() {
        return getCamera().getExtendedConfig().getSessionProcessor(null);
    }

    private android.graphics.Rect getTakePictureCropRect() {
        android.graphics.Rect viewPortCropRect = getViewPortCropRect();
        android.util.Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        java.util.Objects.requireNonNull(attachedSurfaceResolution);
        if (viewPortCropRect != null) {
            return viewPortCropRect;
        }
        if (!androidx.camera.core.internal.utils.ImageUtil.isAspectRatioValid(this.mCropAspectRatio)) {
            return new android.graphics.Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        java.util.Objects.requireNonNull(camera);
        int relativeRotation = getRelativeRotation(camera);
        android.util.Rational rational = new android.util.Rational(this.mCropAspectRatio.getDenominator(), this.mCropAspectRatio.getNumerator());
        if (!androidx.camera.core.impl.utils.TransformUtils.is90or270(relativeRotation)) {
            rational = this.mCropAspectRatio;
        }
        android.graphics.Rect computeCropRectFromAspectRatio = androidx.camera.core.internal.utils.ImageUtil.computeCropRectFromAspectRatio(attachedSurfaceResolution, rational);
        java.util.Objects.requireNonNull(computeCropRectFromAspectRatio);
        return computeCropRectFromAspectRatio;
    }

    private static boolean isImageFormatSupported(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list, int i17) {
        if (list == null) {
            return false;
        }
        java.util.Iterator<android.util.Pair<java.lang.Integer, android.util.Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.Integer) it.next().first).equals(java.lang.Integer.valueOf(i17))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isOutputFormatUltraHdr(androidx.camera.core.impl.MutableConfig mutableConfig) {
        return java.util.Objects.equals(mutableConfig.retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT, null), 1);
    }

    private boolean isSessionProcessorEnabledInCurrentCamera() {
        return (getCamera() == null || getCamera().getExtendedConfig().getSessionProcessor(null) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$createPipeline$3(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
        if (getCamera() == null) {
            return;
        }
        this.mTakePictureManager.pause();
        clearPipeline(true);
        java.lang.String cameraId = getCameraId();
        androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig = (androidx.camera.core.impl.ImageCaptureConfig) getCurrentConfig();
        androidx.camera.core.impl.StreamSpec attachedStreamSpec = getAttachedStreamSpec();
        attachedStreamSpec.getClass();
        androidx.camera.core.impl.SessionConfig.Builder createPipeline = createPipeline(cameraId, imageCaptureConfig, attachedStreamSpec);
        this.mSessionConfigBuilder = createPipeline;
        java.lang.Object[] objArr = {createPipeline.build()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(java.util.Collections.unmodifiableList(arrayList));
        notifyReset();
        this.mTakePictureManager.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        try {
            androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            try {
                java.util.Objects.toString(acquireLatestImage);
                if (acquireLatestImage != null) {
                    acquireLatestImage.close();
                }
            } finally {
            }
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Void lambda$submitStillCaptureRequest$4(java.util.List list) {
        return null;
    }

    private void sendInvalidCameraError(java.util.concurrent.Executor executor, androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback, androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        androidx.camera.core.ImageCaptureException imageCaptureException = new androidx.camera.core.ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null);
        if (onImageCapturedCallback != null) {
            onImageCapturedCallback.onError(imageCaptureException);
        } else {
            if (onImageSavedCallback == null) {
                throw new java.lang.IllegalArgumentException("Must have either in-memory or on-disk callback.");
            }
            onImageSavedCallback.onError(imageCaptureException);
        }
    }

    private void setScreenFlashToCameraControl() {
        setScreenFlashToCameraControl(this.mScreenFlashWrapper);
    }

    private void takePictureInternal(java.util.concurrent.Executor executor, androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback, androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (getFlashMode() == 3 && this.mScreenFlashWrapper.getScreenFlash() == null) {
            throw new java.lang.IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        if (camera == null) {
            sendInvalidCameraError(executor, onImageCapturedCallback, onImageSavedCallback);
            return;
        }
        androidx.camera.core.imagecapture.TakePictureManager takePictureManager = this.mTakePictureManager;
        java.util.Objects.requireNonNull(takePictureManager);
        takePictureManager.offerRequest(androidx.camera.core.imagecapture.TakePictureRequest.of(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, getTakePictureCropRect(), getSensorToBufferTransformMatrix(), getRelativeRotation(camera), getJpegQualityInternal(), getCaptureMode(), this.mSessionConfigBuilder.getSingleCameraCaptureCallbacks()));
    }

    private void trySetFlashModeToCameraControl() {
        synchronized (this.mLockedFlashMode) {
            if (this.mLockedFlashMode.get() != null) {
                return;
            }
            getCameraControl().setFlashMode(getFlashMode());
        }
    }

    public boolean enforceSoftwareJpegConstraints(androidx.camera.core.impl.MutableConfig mutableConfig) {
        boolean z17;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        androidx.camera.core.impl.Config.Option<java.lang.Boolean> option = androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER;
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        boolean z18 = false;
        if (bool.equals(mutableConfig.retrieveOption(option, bool2))) {
            if (isSessionProcessorEnabledInCurrentCamera()) {
                androidx.camera.core.Logger.w(TAG, "Software JPEG cannot be used with Extensions.");
                z17 = false;
            } else {
                z17 = true;
            }
            java.lang.Integer num = (java.lang.Integer) mutableConfig.retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num == null || num.intValue() == 256) {
                z18 = z17;
            } else {
                androidx.camera.core.Logger.w(TAG, "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z18) {
                androidx.camera.core.Logger.w(TAG, "Unable to support software JPEG. Disabling.");
                mutableConfig.insertOption(option, bool2);
            }
        }
        return z18;
    }

    public int getCaptureMode() {
        return this.mCaptureMode;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean z17, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        androidx.camera.core.ImageCapture.Defaults defaults = DEFAULT_CONFIG;
        androidx.camera.core.impl.Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), getCaptureMode());
        if (z17) {
            config = androidx.camera.core.impl.Config.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getFlashMode() {
        int i17;
        synchronized (this.mLockedFlashMode) {
            i17 = this.mFlashMode;
            if (i17 == -1) {
                i17 = ((androidx.camera.core.impl.ImageCaptureConfig) getCurrentConfig()).getFlashMode(2);
            }
        }
        return i17;
    }

    public androidx.camera.core.imagecapture.ImagePipeline getImagePipeline() {
        return this.mImagePipeline;
    }

    public int getJpegQuality() {
        return getJpegQualityInternal();
    }

    public int getOutputFormat() {
        java.lang.Integer num = (java.lang.Integer) getCurrentConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT, 0);
        num.getClass();
        return num.intValue();
    }

    public androidx.camera.core.resolutionselector.ResolutionSelector getPostviewResolutionSelector() {
        return (androidx.camera.core.resolutionselector.ResolutionSelector) getCurrentConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_POSTVIEW_RESOLUTION_SELECTOR, null);
    }

    public androidx.camera.core.ImageCaptureLatencyEstimate getRealtimeCaptureLatencyEstimate() {
        android.util.Pair<java.lang.Long, java.lang.Long> realtimeCaptureLatency;
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        if (camera != null && (realtimeCaptureLatency = camera.getExtendedConfig().getSessionProcessor().getRealtimeCaptureLatency()) != null) {
            return new androidx.camera.core.ImageCaptureLatencyEstimate(((java.lang.Long) realtimeCaptureLatency.first).longValue(), ((java.lang.Long) realtimeCaptureLatency.second).longValue());
        }
        return androidx.camera.core.ImageCaptureLatencyEstimate.UNDEFINED_IMAGE_CAPTURE_LATENCY;
    }

    public androidx.camera.core.ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.ResolutionInfo getResolutionInfoInternal() {
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        android.util.Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        if (camera == null || attachedSurfaceResolution == null) {
            return null;
        }
        android.graphics.Rect viewPortCropRect = getViewPortCropRect();
        android.util.Rational rational = this.mCropAspectRatio;
        if (viewPortCropRect == null) {
            viewPortCropRect = rational != null ? androidx.camera.core.internal.utils.ImageUtil.computeCropRectFromAspectRatio(attachedSurfaceResolution, rational) : new android.graphics.Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        int relativeRotation = getRelativeRotation(camera);
        java.util.Objects.requireNonNull(viewPortCropRect);
        return new androidx.camera.core.ResolutionInfo(attachedSurfaceResolution, viewPortCropRect, relativeRotation);
    }

    public androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector() {
        return ((androidx.camera.core.impl.ImageOutputConfig) getCurrentConfig()).getResolutionSelector(null);
    }

    public androidx.camera.core.ImageCapture.ScreenFlash getScreenFlash() {
        return this.mScreenFlashWrapper.getScreenFlash();
    }

    @Override // androidx.camera.core.UseCase
    public java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public androidx.camera.core.imagecapture.TakePictureManager getTakePictureManager() {
        androidx.camera.core.imagecapture.TakePictureManager takePictureManager = this.mTakePictureManager;
        java.util.Objects.requireNonNull(takePictureManager);
        return takePictureManager;
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(androidx.camera.core.impl.Config config) {
        return androidx.camera.core.ImageCapture.Builder.fromConfig(config);
    }

    public boolean isPostviewEnabled() {
        return ((java.lang.Boolean) getCurrentConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_POSTVIEW_ENABLED, java.lang.Boolean.FALSE)).booleanValue();
    }

    public boolean isProcessingPipelineEnabled() {
        return (this.mImagePipeline == null || this.mTakePictureManager == null) ? false : true;
    }

    public void lockFlashMode() {
        synchronized (this.mLockedFlashMode) {
            if (this.mLockedFlashMode.get() != null) {
                return;
            }
            this.mLockedFlashMode.set(java.lang.Integer.valueOf(getFlashMode()));
        }
    }

    @Override // androidx.camera.core.UseCase
    public void onBind() {
        m3.h.d(getCamera(), "Attached camera cannot be null");
        if (getFlashMode() == 3 && getCameraLens() != 0) {
            throw new java.lang.IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // androidx.camera.core.UseCase
    public void onCameraControlReady() {
        androidx.camera.core.Logger.d(TAG, "onCameraControlReady");
        trySetFlashModeToCameraControl();
        setScreenFlashToCameraControl();
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder) {
        if (cameraInfoInternal.getCameraQuirks().contains(androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk.class)) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            androidx.camera.core.impl.MutableConfig mutableConfig = builder.getMutableConfig();
            androidx.camera.core.impl.Config.Option<java.lang.Boolean> option = androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER;
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            if (bool.equals(mutableConfig.retrieveOption(option, bool2))) {
                androidx.camera.core.Logger.w(TAG, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                androidx.camera.core.Logger.i(TAG, "Requesting software JPEG due to device quirk.");
                builder.getMutableConfig().insertOption(option, bool2);
            }
        }
        boolean enforceSoftwareJpegConstraints = enforceSoftwareJpegConstraints(builder.getMutableConfig());
        java.lang.Integer num = (java.lang.Integer) builder.getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
        if (num != null) {
            m3.h.b(!isSessionProcessorEnabledInCurrentCamera() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, java.lang.Integer.valueOf(enforceSoftwareJpegConstraints ? 35 : num.intValue()));
        } else if (isOutputFormatUltraHdr(builder.getMutableConfig())) {
            builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 4101);
            builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, androidx.camera.core.DynamicRange.UNSPECIFIED);
        } else if (enforceSoftwareJpegConstraints) {
            builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 35);
        } else {
            java.util.List list = (java.util.List) builder.getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
            if (list == null) {
                builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 256);
            } else if (isImageFormatSupported(list, 256)) {
                builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 256);
            } else if (isImageFormatSupported(list, 35)) {
                builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 35);
            }
        }
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public void onStateDetached() {
        abortImageCaptureRequests();
    }

    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(androidx.camera.core.impl.Config config) {
        this.mSessionConfigBuilder.addImplementationOptions(config);
        java.lang.Object[] objArr = {this.mSessionConfigBuilder.build()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(java.util.Collections.unmodifiableList(arrayList));
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    public androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        androidx.camera.core.impl.SessionConfig.Builder createPipeline = createPipeline(getCameraId(), (androidx.camera.core.impl.ImageCaptureConfig) getCurrentConfig(), streamSpec);
        this.mSessionConfigBuilder = createPipeline;
        java.lang.Object[] objArr = {createPipeline.build()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(java.util.Collections.unmodifiableList(arrayList));
        notifyActive();
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
        abortImageCaptureRequests();
        clearPipeline();
        setScreenFlashToCameraControl(null);
    }

    public void setCropAspectRatio(android.util.Rational rational) {
        this.mCropAspectRatio = rational;
    }

    public void setFlashMode(int i17) {
        androidx.camera.core.Logger.d(TAG, "setFlashMode: flashMode = " + i17);
        if (i17 != 0 && i17 != 1 && i17 != 2) {
            if (i17 != 3) {
                throw new java.lang.IllegalArgumentException("Invalid flash mode: " + i17);
            }
            if (this.mScreenFlashWrapper.getScreenFlash() == null) {
                throw new java.lang.IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (getCamera() != null && getCameraLens() != 0) {
                throw new java.lang.IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (this.mLockedFlashMode) {
            this.mFlashMode = i17;
            trySetFlashModeToCameraControl();
        }
    }

    public void setScreenFlash(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        this.mScreenFlashWrapper = androidx.camera.core.internal.ScreenFlashWrapper.from(screenFlash);
        setScreenFlashToCameraControl();
    }

    public void setTargetRotation(int i17) {
        int targetRotation = getTargetRotation();
        if (!setTargetRotationInternal(i17) || this.mCropAspectRatio == null) {
            return;
        }
        this.mCropAspectRatio = androidx.camera.core.internal.utils.ImageUtil.getRotatedAspectRatio(java.lang.Math.abs(androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(i17) - androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(targetRotation)), this.mCropAspectRatio);
    }

    public wa.a submitStillCaptureRequest(java.util.List<androidx.camera.core.impl.CaptureConfig> list) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return androidx.camera.core.impl.utils.futures.Futures.transform(getCameraControl().submitStillCaptureRequests(list, this.mCaptureMode, this.mFlashType), new androidx.camera.core.ImageCapture$$c(), androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    /* renamed from: takePicture, reason: merged with bridge method [inline-methods] */
    public void lambda$takePicture$1(final java.util.concurrent.Executor executor, final androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback) {
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageCapture$$e
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.ImageCapture.this.lambda$takePicture$1(executor, onImageCapturedCallback);
                }
            });
        } else {
            takePictureInternal(executor, onImageCapturedCallback, null, null);
        }
    }

    public java.lang.String toString() {
        return "ImageCapture:" + getName();
    }

    public void unlockFlashMode() {
        synchronized (this.mLockedFlashMode) {
            java.lang.Integer andSet = this.mLockedFlashMode.getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (andSet.intValue() != getFlashMode()) {
                trySetFlashModeToCameraControl();
            }
        }
    }

    private void clearPipeline(boolean z17) {
        androidx.camera.core.imagecapture.TakePictureManager takePictureManager;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        androidx.camera.core.imagecapture.ImagePipeline imagePipeline = this.mImagePipeline;
        if (imagePipeline != null) {
            imagePipeline.close();
            this.mImagePipeline = null;
        }
        if (z17 || (takePictureManager = this.mTakePictureManager) == null) {
            return;
        }
        takePictureManager.abortRequests();
        this.mTakePictureManager = null;
    }

    private void setScreenFlashToCameraControl(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        getCameraControl().setScreenFlash(screenFlash);
    }

    /* renamed from: takePicture, reason: merged with bridge method [inline-methods] */
    public void lambda$takePicture$2(final androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, final java.util.concurrent.Executor executor, final androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageCapture$$b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.ImageCapture.this.lambda$takePicture$2(outputFileOptions, executor, onImageSavedCallback);
                }
            });
        } else {
            takePictureInternal(executor, null, onImageSavedCallback, outputFileOptions);
        }
    }
}
