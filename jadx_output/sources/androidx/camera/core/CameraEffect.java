package androidx.camera.core;

/* loaded from: classes14.dex */
public abstract class CameraEffect {
    public static final int IMAGE_CAPTURE = 4;
    public static final int OUTPUT_OPTION_ONE_FOR_ALL_TARGETS = 0;
    public static final int OUTPUT_OPTION_ONE_FOR_EACH_TARGET = 1;
    public static final int PREVIEW = 1;
    private static final java.util.List<java.lang.Integer> SURFACE_PROCESSOR_TARGETS = java.util.Arrays.asList(1, 2, 3, 7);
    public static final int TRANSFORMATION_ARBITRARY = 0;
    public static final int TRANSFORMATION_CAMERA_AND_SURFACE_ROTATION = 1;
    public static final int TRANSFORMATION_PASSTHROUGH = 2;
    public static final int VIDEO_CAPTURE = 2;
    private final m3.a mErrorListener;
    private final java.util.concurrent.Executor mExecutor;
    private final androidx.camera.core.ImageProcessor mImageProcessor;
    private final int mOutputOption;
    private final androidx.camera.core.SurfaceProcessor mSurfaceProcessor;
    private final int mTargets;
    private final int mTransformation;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Formats {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface OutputOptions {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Targets {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Transformations {
    }

    public CameraEffect(int i17, java.util.concurrent.Executor executor, androidx.camera.core.ImageProcessor imageProcessor, m3.a aVar) {
        m3.h.b(i17 == 4, "Currently ImageProcessor can only target IMAGE_CAPTURE.");
        this.mTargets = i17;
        this.mTransformation = 0;
        this.mOutputOption = 0;
        this.mExecutor = executor;
        this.mSurfaceProcessor = null;
        this.mImageProcessor = imageProcessor;
        this.mErrorListener = aVar;
    }

    public androidx.camera.core.processing.SurfaceProcessorInternal createSurfaceProcessorInternal() {
        return new androidx.camera.core.processing.SurfaceProcessorWithExecutor(this);
    }

    public m3.a getErrorListener() {
        return this.mErrorListener;
    }

    public java.util.concurrent.Executor getExecutor() {
        return this.mExecutor;
    }

    public androidx.camera.core.ImageProcessor getImageProcessor() {
        return this.mImageProcessor;
    }

    public int getOutputOption() {
        return this.mOutputOption;
    }

    public androidx.camera.core.SurfaceProcessor getSurfaceProcessor() {
        return this.mSurfaceProcessor;
    }

    public int getTargets() {
        return this.mTargets;
    }

    public int getTransformation() {
        return this.mTransformation;
    }

    public CameraEffect(int i17, int i18, java.util.concurrent.Executor executor, androidx.camera.core.SurfaceProcessor surfaceProcessor, m3.a aVar) {
        this(i17, 0, i18, executor, surfaceProcessor, aVar);
    }

    public CameraEffect(int i17, int i18, int i19, java.util.concurrent.Executor executor, androidx.camera.core.SurfaceProcessor surfaceProcessor, m3.a aVar) {
        androidx.camera.core.processing.TargetUtils.checkSupportedTargets(SURFACE_PROCESSOR_TARGETS, i17);
        this.mTargets = i17;
        this.mOutputOption = i18;
        this.mTransformation = i19;
        this.mExecutor = executor;
        this.mSurfaceProcessor = surfaceProcessor;
        this.mImageProcessor = null;
        this.mErrorListener = aVar;
    }

    public CameraEffect(int i17, java.util.concurrent.Executor executor, androidx.camera.core.SurfaceProcessor surfaceProcessor, m3.a aVar) {
        this(i17, 0, 0, executor, surfaceProcessor, aVar);
    }
}
