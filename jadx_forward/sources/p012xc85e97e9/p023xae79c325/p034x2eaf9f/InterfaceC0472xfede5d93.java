package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.CameraInfo */
/* loaded from: classes14.dex */
public interface InterfaceC0472xfede5d93 {

    /* renamed from: IMPLEMENTATION_TYPE_CAMERA2 */
    public static final java.lang.String f851x21a6ed15 = "androidx.camera.camera2";

    /* renamed from: IMPLEMENTATION_TYPE_CAMERA2_LEGACY */
    public static final java.lang.String f852xfaab0633 = "androidx.camera.camera2.legacy";

    /* renamed from: IMPLEMENTATION_TYPE_FAKE */
    public static final java.lang.String f853xeec288ed = "androidx.camera.fake";

    /* renamed from: IMPLEMENTATION_TYPE_UNKNOWN */
    public static final java.lang.String f854xefedf792 = "<unknown>";

    /* renamed from: INTRINSIC_ZOOM_RATIO_UNKNOWN */
    public static final float f855x6cc6d604 = 1.0f;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.CameraInfo$ImplementationType */
    /* loaded from: classes6.dex */
    public @interface ImplementationType {
    }

    /* renamed from: mustPlayShutterSound */
    static boolean m4274xb8a6029f() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0847x459eadf7.m6163xb8a6029f();
    }

    /* renamed from: getCameraSelector */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 mo3282xed62f31a();

    /* renamed from: getCameraState */
    p012xc85e97e9.p093xedfae76a.g0 mo3163x53e98736();

    /* renamed from: getExposureState */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa mo3165xd68c2014();

    /* renamed from: getImplementationType */
    java.lang.String mo3166xb8d8e802();

    /* renamed from: getIntrinsicZoomRatio */
    default float mo3167x8e79fe69() {
        return 1.0f;
    }

    /* renamed from: getLensFacing */
    default int mo3168x5f62de6e() {
        return -1;
    }

    /* renamed from: getPhysicalCameraInfos */
    default java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> mo3170x521734d3() {
        return java.util.Collections.emptySet();
    }

    /* renamed from: getSensorRotationDegrees */
    int mo3172x3b4734f9();

    /* renamed from: getSensorRotationDegrees */
    int mo3173x3b4734f9(int i17);

    /* renamed from: getSupportedFrameRateRanges */
    default java.util.Set<android.util.Range<java.lang.Integer>> mo3175x2d0d240b() {
        return java.util.Collections.emptySet();
    }

    /* renamed from: getTorchState */
    p012xc85e97e9.p093xedfae76a.g0 mo3181x56c2d5eb();

    /* renamed from: getZoomState */
    p012xc85e97e9.p093xedfae76a.g0 mo3182x61488dc8();

    /* renamed from: hasFlashUnit */
    boolean mo3183x7ae1a01a();

    /* renamed from: isFocusMeteringSupported */
    default boolean mo3184xfda814c7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27) {
        return false;
    }

    /* renamed from: isLogicalMultiCameraSupported */
    default boolean mo3185x2594f6af() {
        return false;
    }

    /* renamed from: isPrivateReprocessingSupported */
    default boolean mo3187x90c5da4f() {
        return false;
    }

    /* renamed from: isZslSupported */
    default boolean mo3189xe543bbe5() {
        return false;
    }

    /* renamed from: querySupportedDynamicRanges */
    default java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> mo3191x9cf834cf(java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0705x4adcffd5.m5427xdb7243a(set, java.util.Collections.singleton(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR));
    }
}
