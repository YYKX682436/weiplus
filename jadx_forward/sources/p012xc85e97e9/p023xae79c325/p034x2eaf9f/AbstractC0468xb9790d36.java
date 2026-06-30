package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.CameraEffect */
/* loaded from: classes14.dex */
public abstract class AbstractC0468xb9790d36 {

    /* renamed from: IMAGE_CAPTURE */
    public static final int f827xb0f84022 = 4;

    /* renamed from: OUTPUT_OPTION_ONE_FOR_ALL_TARGETS */
    public static final int f828x330124c9 = 0;

    /* renamed from: OUTPUT_OPTION_ONE_FOR_EACH_TARGET */
    public static final int f829xe12f3a34 = 1;

    /* renamed from: PREVIEW */
    public static final int f830x17d46fa8 = 1;

    /* renamed from: SURFACE_PROCESSOR_TARGETS */
    private static final java.util.List<java.lang.Integer> f831xdfc1f6e3 = java.util.Arrays.asList(1, 2, 3, 7);

    /* renamed from: TRANSFORMATION_ARBITRARY */
    public static final int f832x8720101c = 0;

    /* renamed from: TRANSFORMATION_CAMERA_AND_SURFACE_ROTATION */
    public static final int f833x97e8a91c = 1;

    /* renamed from: TRANSFORMATION_PASSTHROUGH */
    public static final int f834x9717453e = 2;

    /* renamed from: VIDEO_CAPTURE */
    public static final int f835x4fa08b42 = 2;

    /* renamed from: mErrorListener */
    private final m3.a f836x761b7b6f;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f837x9ec3a060;

    /* renamed from: mImageProcessor */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597 f838xa1f32344;

    /* renamed from: mOutputOption */
    private final int f839x88c521e3;

    /* renamed from: mSurfaceProcessor */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685 f840x3eca3cf2;

    /* renamed from: mTargets */
    private final int f841x426873d5;

    /* renamed from: mTransformation */
    private final int f842xa3181cd6;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.CameraEffect$Formats */
    /* loaded from: classes6.dex */
    public @interface Formats {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.CameraEffect$OutputOptions */
    /* loaded from: classes6.dex */
    public @interface OutputOptions {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.CameraEffect$Targets */
    /* loaded from: classes6.dex */
    public @interface Targets {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.CameraEffect$Transformations */
    /* loaded from: classes6.dex */
    public @interface Transformations {
    }

    public AbstractC0468xb9790d36(int i17, java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597 interfaceC0535x5f86e597, m3.a aVar) {
        m3.h.b(i17 == 4, "Currently ImageProcessor can only target IMAGE_CAPTURE.");
        this.f841x426873d5 = i17;
        this.f842xa3181cd6 = 0;
        this.f839x88c521e3 = 0;
        this.f837x9ec3a060 = executor;
        this.f840x3eca3cf2 = null;
        this.f838xa1f32344 = interfaceC0535x5f86e597;
        this.f836x761b7b6f = aVar;
    }

    /* renamed from: createSurfaceProcessorInternal */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62 m4258x44d9f95e() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0924x100952de(this);
    }

    /* renamed from: getErrorListener */
    public m3.a m4259xd86d2f26() {
        return this.f836x761b7b6f;
    }

    /* renamed from: getExecutor */
    public java.util.concurrent.Executor m4260xf5a03649() {
        return this.f837x9ec3a060;
    }

    /* renamed from: getImageProcessor */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597 m4261x89d7e66d() {
        return this.f838xa1f32344;
    }

    /* renamed from: getOutputOption */
    public int m4262x52229b4c() {
        return this.f839x88c521e3;
    }

    /* renamed from: getSurfaceProcessor */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685 m4263xc08ad9db() {
        return this.f840x3eca3cf2;
    }

    /* renamed from: getTargets */
    public int m4264xe21cfccc() {
        return this.f841x426873d5;
    }

    /* renamed from: getTransformation */
    public int m4265x8afcdfff() {
        return this.f842xa3181cd6;
    }

    public AbstractC0468xb9790d36(int i17, int i18, java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685 interfaceC0568xe676b685, m3.a aVar) {
        this(i17, 0, i18, executor, interfaceC0568xe676b685, aVar);
    }

    public AbstractC0468xb9790d36(int i17, int i18, int i19, java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685 interfaceC0568xe676b685, m3.a aVar) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0927xe69ca980.m6382xa6199d9c(f831xdfc1f6e3, i17);
        this.f841x426873d5 = i17;
        this.f839x88c521e3 = i18;
        this.f842xa3181cd6 = i19;
        this.f837x9ec3a060 = executor;
        this.f840x3eca3cf2 = interfaceC0568xe676b685;
        this.f838xa1f32344 = null;
        this.f836x761b7b6f = aVar;
    }

    public AbstractC0468xb9790d36(int i17, java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685 interfaceC0568xe676b685, m3.a aVar) {
        this(i17, 0, 0, executor, interfaceC0568xe676b685, aVar);
    }
}
