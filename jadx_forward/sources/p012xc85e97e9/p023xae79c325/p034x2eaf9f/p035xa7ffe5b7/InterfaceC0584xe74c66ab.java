package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7;

/* renamed from: androidx.camera.core.concurrent.CameraCoordinator */
/* loaded from: classes14.dex */
public interface InterfaceC0584xe74c66ab {

    /* renamed from: CAMERA_OPERATING_MODE_CONCURRENT */
    public static final int f1291x4c1ab61b = 2;

    /* renamed from: CAMERA_OPERATING_MODE_SINGLE */
    public static final int f1292x9bc62eac = 1;

    /* renamed from: CAMERA_OPERATING_MODE_UNSPECIFIED */
    public static final int f1293x7e51c733 = 0;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.concurrent.CameraCoordinator$CameraOperatingMode */
    /* loaded from: classes6.dex */
    public @interface CameraOperatingMode {
    }

    /* renamed from: androidx.camera.core.concurrent.CameraCoordinator$ConcurrentCameraModeListener */
    /* loaded from: classes14.dex */
    public interface ConcurrentCameraModeListener {
        /* renamed from: onCameraOperatingModeUpdated */
        void mo4867x24f4559b(int i17, int i18);
    }

    /* renamed from: addListener */
    void mo4119x162a7075(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab.ConcurrentCameraModeListener concurrentCameraModeListener);

    /* renamed from: getActiveConcurrentCameraInfos */
    java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> mo4120xe2d68a8d();

    /* renamed from: getCameraOperatingMode */
    int mo4121x7ef94829();

    /* renamed from: getConcurrentCameraSelectors */
    java.util.List<java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244>> mo4122xa5910962();

    /* renamed from: getPairedConcurrentCameraId */
    java.lang.String mo4123xe5cebc46(java.lang.String str);

    /* renamed from: removeListener */
    void mo4124xf1335d58(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab.ConcurrentCameraModeListener concurrentCameraModeListener);

    /* renamed from: setActiveConcurrentCameraInfos */
    void mo4125xeaee9601(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> list);

    /* renamed from: setCameraOperatingMode */
    void mo4126xcd3e079d(int i17);

    /* renamed from: shutdown */
    void mo4127xf5e80656();
}
